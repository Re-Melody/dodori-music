package org.bytedeco.javacpp;

import V0.p;
import java.nio.LongBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class LongPointer extends Pointer {
    public LongPointer(long... jArr) {
        this(jArr.length);
        put(jArr);
    }

    private native void allocateArray(long j10);

    public long get() {
        return get(0L);
    }

    public native long get(long j10);

    public native LongPointer get(long[] jArr, int i10, int i11);

    public LongPointer put(long j10) {
        return put(0L, j10);
    }

    public native LongPointer put(long j10, long j11);

    public native LongPointer put(long[] jArr, int i10, int i11);

    @Override // org.bytedeco.javacpp.Pointer
    public final LongBuffer asBuffer() {
        return asByteBuffer().asLongBuffer();
    }

    @Override // org.bytedeco.javacpp.Pointer
    public LongPointer capacity(long j10) {
        return (LongPointer) super.capacity(j10);
    }

    public LongPointer get(long[] jArr) {
        return get(jArr, 0, jArr.length);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public LongPointer limit(long j10) {
        return (LongPointer) super.limit(j10);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public LongPointer position(long j10) {
        return (LongPointer) super.position(j10);
    }

    public LongPointer put(long... jArr) {
        return put(jArr, 0, jArr.length);
    }

    public LongPointer(LongBuffer longBuffer) {
        super(longBuffer);
        if (longBuffer == null || longBuffer.isDirect() || !longBuffer.hasArray()) {
            return;
        }
        long[] jArrArray = longBuffer.array();
        allocateArray(jArrArray.length - longBuffer.arrayOffset());
        put(jArrArray, longBuffer.arrayOffset(), jArrArray.length - longBuffer.arrayOffset());
        position(longBuffer.position());
        limit(longBuffer.limit());
    }

    public LongPointer(long j10) {
        try {
            allocateArray(j10);
            if (j10 > 0 && this.address == 0) {
                throw new OutOfMemoryError("Native allocator returned address == 0");
            }
        } catch (OutOfMemoryError e2) {
            StringBuilder sbS = p.s("Cannot allocate new LongPointer(", j10, "): totalBytes = ");
            sbS.append(Pointer.formatBytes(Pointer.totalBytes()));
            sbS.append(", physicalBytes = ");
            sbS.append(Pointer.formatBytes(Pointer.physicalBytes()));
            OutOfMemoryError outOfMemoryError = new OutOfMemoryError(sbS.toString());
            outOfMemoryError.initCause(e2);
            throw outOfMemoryError;
        } catch (UnsatisfiedLinkError e4) {
            throw new RuntimeException("No native JavaCPP library in memory. (Has Loader.load() been called?)", e4);
        }
    }

    public LongPointer() {
    }

    public LongPointer(Pointer pointer) {
        super(pointer);
    }
}
