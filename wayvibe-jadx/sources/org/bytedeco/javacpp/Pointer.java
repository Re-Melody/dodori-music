package org.bytedeco.javacpp;

import V0.p;
import com.amazon.a.a.o.b;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bytedeco.javacpp.annotation.Name;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.tools.Logger;

/* JADX INFO: loaded from: classes2.dex */
@Platform
public class Pointer implements AutoCloseable {
    static final Thread deallocatorThread;
    private static final Logger logger = Logger.create(Pointer.class);
    static final long maxBytes;
    static final long maxPhysicalBytes;
    static final int maxRetries;
    private static final ReferenceQueue<Pointer> referenceQueue;
    protected long address;
    protected long capacity;
    private Deallocator deallocator;
    protected long limit;
    protected long position;

    public static class CustomDeallocator extends DeallocatorReference implements Deallocator {
        Method method;
        Pointer pointer;

        public CustomDeallocator(Pointer pointer) {
            super(pointer, null);
            this.pointer = null;
            this.method = null;
            this.deallocator = this;
            Class<?> cls = pointer.getClass();
            for (Method method : cls.getDeclaredMethods()) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) && method.getName().equals("deallocate") && parameterTypes.length == 1 && Pointer.class.isAssignableFrom(parameterTypes[0])) {
                    method.setAccessible(true);
                    this.method = method;
                    break;
                }
            }
            if (this.method != null) {
                try {
                    Constructor<?> constructor = cls.getConstructor(Pointer.class);
                    constructor.setAccessible(true);
                    this.pointer = (Pointer) constructor.newInstance(pointer);
                    return;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            throw new RuntimeException(new NoSuchMethodException("static void " + cls.getCanonicalName() + ".deallocate(" + Pointer.class.getCanonicalName() + ")"));
        }

        @Override // org.bytedeco.javacpp.Pointer.Deallocator
        public void deallocate() {
            try {
                this.method.invoke(null, this.pointer);
                this.pointer.setNull();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // org.bytedeco.javacpp.Pointer.DeallocatorReference
        public String toString() {
            return getClass().getName() + "[pointer=" + this.pointer + ",method=" + this.method + "]";
        }
    }

    public interface Deallocator {
        void deallocate();
    }

    public static class DeallocatorReference extends PhantomReference<Pointer> {
        static volatile DeallocatorReference head;
        static volatile long totalBytes;
        long bytes;
        Deallocator deallocator;
        volatile DeallocatorReference next;
        volatile DeallocatorReference prev;

        public DeallocatorReference(Pointer pointer, Deallocator deallocator) {
            super(pointer, Pointer.referenceQueue);
            this.prev = null;
            this.next = null;
            this.deallocator = deallocator;
            this.bytes = pointer.capacity * ((long) pointer.sizeof());
        }

        public final void add() {
            synchronized (DeallocatorReference.class) {
                try {
                    if (head == null) {
                        head = this;
                    } else {
                        this.next = head;
                        DeallocatorReference deallocatorReference = this.next;
                        head = this;
                        deallocatorReference.prev = this;
                    }
                    totalBytes += this.bytes;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.ref.Reference
        public void clear() {
            super.clear();
            if (this.deallocator != null) {
                if (Pointer.logger.isDebugEnabled()) {
                    Pointer.logger.debug("Collecting " + this);
                }
                this.deallocator.deallocate();
                this.deallocator = null;
            }
        }

        public final void remove() {
            synchronized (DeallocatorReference.class) {
                try {
                    if (this.prev == this && this.next == this) {
                        return;
                    }
                    if (this.prev == null) {
                        head = this.next;
                    } else {
                        this.prev.next = this.next;
                    }
                    if (this.next != null) {
                        this.next.prev = this.prev;
                    }
                    this.next = this;
                    this.prev = this;
                    totalBytes -= this.bytes;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public String toString() {
            return getClass().getName() + "[deallocator=" + this.deallocator + "]";
        }
    }

    public static class DeallocatorThread extends Thread {
        public DeallocatorThread() {
            super("JavaCPP Deallocator");
            setPriority(10);
            setDaemon(true);
            start();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    DeallocatorReference deallocatorReference = (DeallocatorReference) Pointer.referenceQueue.remove();
                    deallocatorReference.clear();
                    deallocatorReference.remove();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    public static class NativeDeallocator extends DeallocatorReference implements Deallocator {
        private long deallocatorAddress;
        private long ownerAddress;

        public NativeDeallocator(Pointer pointer, long j10, long j11) {
            super(pointer, null);
            this.deallocator = this;
            this.ownerAddress = j10;
            this.deallocatorAddress = j11;
        }

        private native void deallocate(long j10, long j11);

        @Override // org.bytedeco.javacpp.Pointer.Deallocator
        public void deallocate() {
            long j10 = this.ownerAddress;
            if (j10 != 0) {
                long j11 = this.deallocatorAddress;
                if (j11 != 0) {
                    deallocate(j10, j11);
                    this.deallocatorAddress = 0L;
                    this.ownerAddress = 0L;
                }
            }
        }

        @Override // org.bytedeco.javacpp.Pointer.DeallocatorReference
        public String toString() {
            return getClass().getName() + "[ownerAddress=0x" + Long.toHexString(this.ownerAddress) + ",deallocatorAddress=0x" + Long.toHexString(this.deallocatorAddress) + "]";
        }
    }

    static {
        int i10;
        String lowerCase = System.getProperty("org.bytedeco.javacpp.noPointerGC", System.getProperty("org.bytedeco.javacpp.nopointergc", b.ag).toLowerCase()).toLowerCase();
        if (lowerCase.equals(b.af) || lowerCase.equals("t") || lowerCase.equals("")) {
            referenceQueue = null;
            deallocatorThread = null;
        } else {
            referenceQueue = new ReferenceQueue<>();
            deallocatorThread = new DeallocatorThread();
        }
        long jMaxMemory = Runtime.getRuntime().maxMemory();
        String property = System.getProperty("org.bytedeco.javacpp.maxBytes", System.getProperty("org.bytedeco.javacpp.maxbytes"));
        if (property != null && property.length() > 0) {
            try {
                jMaxMemory = parseBytes(property);
            } catch (NumberFormatException e2) {
                throw new RuntimeException(e2);
            }
        }
        maxBytes = jMaxMemory;
        long jMaxMemory2 = Runtime.getRuntime().maxMemory() * 2;
        String property2 = System.getProperty("org.bytedeco.javacpp.maxPhysicalBytes", System.getProperty("org.bytedeco.javacpp.maxphysicalbytes"));
        if (property2 != null && property2.length() > 0) {
            try {
                jMaxMemory2 = parseBytes(property2);
            } catch (NumberFormatException e4) {
                throw new RuntimeException(e4);
            }
        }
        maxPhysicalBytes = jMaxMemory2;
        String property3 = System.getProperty("org.bytedeco.javacpp.maxRetries", System.getProperty("org.bytedeco.javacpp.maxretries"));
        if (property3 == null || property3.length() <= 0) {
            i10 = 10;
        } else {
            try {
                i10 = Integer.parseInt(property3);
            } catch (NumberFormatException e7) {
                throw new RuntimeException(e7);
            }
        }
        maxRetries = i10;
    }

    public Pointer() {
        this.address = 0L;
        this.position = 0L;
        this.limit = 0L;
        this.capacity = 0L;
        this.deallocator = null;
    }

    private native void allocate(Buffer buffer);

    private native ByteBuffer asDirectBuffer();

    @Name({"JavaCPP_availablePhysicalBytes"})
    public static native long availablePhysicalBytes();

    public static native Pointer calloc(long j10, long j11);

    public static void deallocateReferences() {
        DeallocatorReference deallocatorReference;
        while (true) {
            ReferenceQueue<Pointer> referenceQueue2 = referenceQueue;
            if (referenceQueue2 == null || (deallocatorReference = (DeallocatorReference) referenceQueue2.poll()) == null) {
                return;
            }
            deallocatorReference.clear();
            deallocatorReference.remove();
        }
    }

    public static String formatBytes(long j10) {
        if (j10 < 102400) {
            return j10 + "";
        }
        long j11 = j10 / 1024;
        if (j11 < 102400) {
            return j11 + "K";
        }
        long j12 = j11 / 1024;
        if (j12 < 102400) {
            return j12 + "M";
        }
        long j13 = j12 / 1024;
        if (j13 >= 102400) {
            return p.k(j13 / 1024, "T", new StringBuilder());
        }
        return j13 + "G";
    }

    public static native void free(Pointer pointer);

    public static native Pointer malloc(long j10);

    public static long maxBytes() {
        return maxBytes;
    }

    public static long maxPhysicalBytes() {
        return maxPhysicalBytes;
    }

    public static native Pointer memchr(Pointer pointer, int i10, long j10);

    public static native int memcmp(Pointer pointer, Pointer pointer2, long j10);

    public static native Pointer memcpy(Pointer pointer, Pointer pointer2, long j10);

    public static native Pointer memmove(Pointer pointer, Pointer pointer2, long j10);

    public static native Pointer memset(Pointer pointer, int i10, long j10);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long parseBytes(String str) {
        byte b10 = 1;
        int i10 = 0;
        while (i10 < str.length() && Character.isDigit(str.charAt(i10))) {
            i10++;
        }
        long j10 = Long.parseLong(str.substring(0, i10));
        String lowerCase = str.substring(i10).trim().toLowerCase();
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case 0:
                b10 = !lowerCase.equals("") ? (byte) -1 : (byte) 0;
                break;
            case 103:
                if (!lowerCase.equals("g")) {
                    b10 = -1;
                }
                break;
            case 107:
                b10 = !lowerCase.equals("k") ? (byte) -1 : (byte) 2;
                break;
            case 109:
                b10 = !lowerCase.equals("m") ? (byte) -1 : (byte) 3;
                break;
            case 116:
                b10 = !lowerCase.equals("t") ? (byte) -1 : (byte) 4;
                break;
            case 3291:
                b10 = !lowerCase.equals("gb") ? (byte) -1 : (byte) 5;
                break;
            case 3415:
                b10 = !lowerCase.equals("kb") ? (byte) -1 : (byte) 6;
                break;
            case 3477:
                b10 = !lowerCase.equals("mb") ? (byte) -1 : (byte) 7;
                break;
            case 3694:
                b10 = !lowerCase.equals("tb") ? (byte) -1 : (byte) 8;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return j10;
            case 1:
            case 5:
                j10 *= 1024;
                j10 *= 1024;
                return j10 * 1024;
            case 2:
            case 6:
                return j10 * 1024;
            case 3:
            case 7:
                j10 *= 1024;
                return j10 * 1024;
            case 4:
            case 8:
                j10 *= 1024;
                j10 *= 1024;
                j10 *= 1024;
                return j10 * 1024;
            default:
                throw new NumberFormatException("Cannot parse into bytes: ".concat(str));
        }
    }

    @Name({"JavaCPP_physicalBytes"})
    public static native long physicalBytes();

    public static native Pointer realloc(Pointer pointer, long j10);

    public static long totalBytes() {
        return DeallocatorReference.totalBytes;
    }

    @Name({"JavaCPP_totalPhysicalBytes"})
    public static native long totalPhysicalBytes();

    @Name({"JavaCPP_trimMemory"})
    private static native boolean trimMemory();

    public static <P extends Pointer> P withDeallocator(P p10) {
        return (P) p10.deallocator(new CustomDeallocator(p10));
    }

    public long address() {
        return this.address;
    }

    public Buffer asBuffer() {
        return asByteBuffer();
    }

    public ByteBuffer asByteBuffer() {
        if (isNull()) {
            return null;
        }
        long j10 = this.limit;
        if (j10 > 0 && j10 < this.position) {
            StringBuilder sb = new StringBuilder("limit < position: (");
            sb.append(this.limit);
            sb.append(" < ");
            throw new IllegalArgumentException(p.k(this.position, ")", sb));
        }
        int iSizeof = sizeof();
        Pointer pointer = new Pointer();
        pointer.address = this.address;
        long j11 = iSizeof;
        Pointer pointerPosition = pointer.position(this.position * j11);
        long j12 = this.limit;
        if (j12 <= 0) {
            j12 = 1 + this.position;
        }
        return pointerPosition.capacity(j11 * j12).asDirectBuffer().order(ByteOrder.nativeOrder());
    }

    public long capacity() {
        return this.capacity;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        deallocate();
    }

    public void deallocate() {
        deallocate(true);
    }

    public Deallocator deallocator() {
        return this.deallocator;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return isNull();
        }
        if (obj.getClass() != getClass() && obj.getClass() != Pointer.class && getClass() != Pointer.class) {
            return false;
        }
        Pointer pointer = (Pointer) obj;
        return this.address == pointer.address && this.position == pointer.position;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <P extends Pointer> P fill(int i10) {
        long j10 = this.limit;
        if (j10 > 0 && j10 < this.position) {
            StringBuilder sb = new StringBuilder("limit < position: (");
            sb.append(this.limit);
            sb.append(" < ");
            throw new IllegalArgumentException(p.k(this.position, ")", sb));
        }
        long jSizeof = sizeof();
        long j11 = this.limit;
        long j12 = j11 <= 0 ? 1L : j11 - this.position;
        this.position *= jSizeof;
        memset(this, i10, j12 * jSizeof);
        this.position /= jSizeof;
        return this;
    }

    public int hashCode() {
        return (int) this.address;
    }

    public void init(long j10, long j11, long j12, long j13) {
        this.address = j10;
        this.position = 0L;
        this.limit = j11;
        this.capacity = j11;
        if (j12 == 0 || j13 == 0) {
            return;
        }
        deallocator(new NativeDeallocator(this, j12, j13));
    }

    public boolean isNull() {
        return this.address == 0;
    }

    public long limit() {
        return this.limit;
    }

    public int offsetof(String str) {
        try {
            Class<?> cls = getClass();
            if (cls != Pointer.class) {
                return Loader.offsetof(cls, str);
            }
            return -1;
        } catch (ClassCastException | NullPointerException unused) {
            return -1;
        }
    }

    public long position() {
        return this.position;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <P extends Pointer> P put(Pointer pointer) {
        long j10 = pointer.limit;
        if (j10 > 0 && j10 < pointer.position) {
            StringBuilder sb = new StringBuilder("limit < position: (");
            sb.append(pointer.limit);
            sb.append(" < ");
            throw new IllegalArgumentException(p.k(pointer.position, ")", sb));
        }
        int iSizeof = sizeof();
        long jSizeof = pointer.sizeof();
        long j11 = pointer.limit;
        long j12 = j11 <= 0 ? 1L : j11 - pointer.position;
        long j13 = iSizeof;
        this.position *= j13;
        pointer.position *= jSizeof;
        memcpy(this, pointer, j12 * jSizeof);
        this.position /= j13;
        pointer.position /= jSizeof;
        return this;
    }

    public void setNull() {
        this.address = 0L;
    }

    public int sizeof() {
        Class<?> cls = getClass();
        if (cls == Pointer.class || cls == BytePointer.class) {
            return 1;
        }
        return offsetof("sizeof");
    }

    public String toString() {
        return getClass().getName() + "[address=0x" + Long.toHexString(this.address) + ",position=" + this.position + ",limit=" + this.limit + ",capacity=" + this.capacity + ",deallocator=" + this.deallocator + "]";
    }

    public <P extends Pointer> P zero() {
        return (P) fill(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <P extends Pointer> P capacity(long j10) {
        this.limit = j10;
        this.capacity = j10;
        return this;
    }

    public void deallocate(boolean z10) {
        if (z10 && this.deallocator != null) {
            Logger logger2 = logger;
            if (logger2.isDebugEnabled()) {
                logger2.debug("Deallocating " + this);
            }
            this.deallocator.deallocate();
            this.address = 0L;
        }
        if (!z10 || referenceQueue == null) {
            synchronized (DeallocatorReference.class) {
                try {
                    for (DeallocatorReference deallocatorReference = DeallocatorReference.head; deallocatorReference != null; deallocatorReference = deallocatorReference.next) {
                        if (deallocatorReference.deallocator == this.deallocator) {
                            deallocatorReference.deallocator = null;
                            deallocatorReference.clear();
                            deallocatorReference.remove();
                            break;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <P extends Pointer> P deallocator(Deallocator deallocator) {
        if (this.deallocator != null) {
            Logger logger2 = logger;
            if (logger2.isDebugEnabled()) {
                logger2.debug("Predeallocating " + this);
            }
            this.deallocator.deallocate();
            this.deallocator = null;
        }
        if (deallocator != 0 && !deallocator.equals(null)) {
            this.deallocator = deallocator;
            DeallocatorReference deallocatorReference = deallocator instanceof DeallocatorReference ? (DeallocatorReference) deallocator : new DeallocatorReference(this, deallocator);
            long jPhysicalBytes = maxPhysicalBytes > 0 ? physicalBytes() : 0L;
            synchronized (DeallocatorThread.class) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    try {
                        try {
                            try {
                                if (i10 >= maxRetries) {
                                    break;
                                }
                                long j10 = maxBytes;
                                if (j10 <= 0 || DeallocatorReference.totalBytes + deallocatorReference.bytes <= j10) {
                                    long j11 = maxPhysicalBytes;
                                    if (j11 <= 0 || jPhysicalBytes <= j11) {
                                        break;
                                    }
                                }
                                Logger logger3 = logger;
                                if (logger3.isDebugEnabled()) {
                                    logger3.debug("Calling System.gc() and Pointer.trimMemory() in " + this);
                                }
                                System.gc();
                                Thread.sleep(100L);
                                trimMemory();
                                jPhysicalBytes = maxPhysicalBytes > 0 ? physicalBytes() : 0L;
                                i10 = i11;
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } catch (UnsatisfiedLinkError e2) {
                            Logger logger4 = logger;
                            if (logger4.isDebugEnabled()) {
                                logger4.debug(e2.getMessage());
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long j12 = maxBytes;
                if (j12 > 0 && DeallocatorReference.totalBytes + deallocatorReference.bytes > j12) {
                    deallocate();
                    throw new OutOfMemoryError("Failed to allocate memory within limits: totalBytes (" + formatBytes(DeallocatorReference.totalBytes) + " + " + formatBytes(deallocatorReference.bytes) + ") > maxBytes (" + formatBytes(j12) + ")");
                }
                long j13 = maxPhysicalBytes;
                if (j13 > 0 && jPhysicalBytes > j13) {
                    deallocate();
                    throw new OutOfMemoryError("Physical memory usage is too high: physicalBytes (" + formatBytes(jPhysicalBytes) + ") > maxPhysicalBytes (" + formatBytes(j13) + ")");
                }
                Logger logger5 = logger;
                if (logger5.isDebugEnabled()) {
                    logger5.debug("Registering " + this);
                }
                deallocatorReference.add();
                PointerScope innerScope = PointerScope.getInnerScope();
                if (innerScope != null) {
                    innerScope.attach(this);
                }
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <P extends Pointer> P limit(long j10) {
        this.limit = j10;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <P extends Pointer> P position(long j10) {
        this.position = j10;
        return this;
    }

    public Pointer(final Pointer pointer) {
        this.address = 0L;
        this.position = 0L;
        this.limit = 0L;
        this.capacity = 0L;
        this.deallocator = null;
        if (pointer != null) {
            this.address = pointer.address;
            this.position = pointer.position;
            this.limit = pointer.limit;
            this.capacity = pointer.capacity;
            if (pointer.deallocator != null) {
                this.deallocator = new Deallocator() { // from class: org.bytedeco.javacpp.Pointer.1
                    @Override // org.bytedeco.javacpp.Pointer.Deallocator
                    public void deallocate() {
                        pointer.deallocate();
                    }
                };
            }
        }
    }

    public Pointer(Buffer buffer) {
        this.address = 0L;
        this.position = 0L;
        this.limit = 0L;
        this.capacity = 0L;
        this.deallocator = null;
        if (buffer != null) {
            allocate(buffer);
        }
        if (isNull()) {
            return;
        }
        this.address -= (long) (sizeof() * buffer.position());
        this.position = buffer.position();
        this.limit = buffer.limit();
        this.capacity = buffer.capacity();
        this.deallocator = new Deallocator(buffer) { // from class: org.bytedeco.javacpp.Pointer.2
            Buffer bb;
            final /* synthetic */ Buffer val$b;

            {
                this.val$b = buffer;
                this.bb = buffer;
            }

            @Override // org.bytedeco.javacpp.Pointer.Deallocator
            public void deallocate() {
                this.bb = null;
            }
        };
    }
}
