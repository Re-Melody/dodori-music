package org.bytedeco.javacpp;

import V0.p;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class ShortPointer extends Pointer {
    public ShortPointer(short... sArr) {
        this(sArr.length);
        put(sArr);
    }

    private native void allocateArray(long j10);

    public native ShortPointer get(short[] sArr, int i10, int i11);

    public short get() {
        return get(0L);
    }

    public native short get(long j10);

    public native ShortPointer put(long j10, short s8);

    public ShortPointer put(short s8) {
        return put(0L, s8);
    }

    public native ShortPointer put(short[] sArr, int i10, int i11);

    @Override // org.bytedeco.javacpp.Pointer
    public final ShortBuffer asBuffer() {
        return asByteBuffer().asShortBuffer();
    }

    @Override // org.bytedeco.javacpp.Pointer
    public ShortPointer capacity(long j10) {
        return (ShortPointer) super.capacity(j10);
    }

    public ShortPointer get(short[] sArr) {
        return get(sArr, 0, sArr.length);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public ShortPointer limit(long j10) {
        return (ShortPointer) super.limit(j10);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public ShortPointer position(long j10) {
        return (ShortPointer) super.position(j10);
    }

    public ShortPointer put(short... sArr) {
        return put(sArr, 0, sArr.length);
    }

    public ShortPointer(ShortBuffer shortBuffer) {
        super(shortBuffer);
        if (shortBuffer == null || shortBuffer.isDirect() || !shortBuffer.hasArray()) {
            return;
        }
        short[] sArrArray = shortBuffer.array();
        allocateArray(sArrArray.length - shortBuffer.arrayOffset());
        put(sArrArray, shortBuffer.arrayOffset(), sArrArray.length - shortBuffer.arrayOffset());
        position(shortBuffer.position());
        limit(shortBuffer.limit());
    }

    public ShortPointer(long j10) {
        try {
            allocateArray(j10);
            if (j10 > 0 && this.address == 0) {
                throw new OutOfMemoryError("Native allocator returned address == 0");
            }
        } catch (OutOfMemoryError e2) {
            StringBuilder sbS = p.s("Cannot allocate new ShortPointer(", j10, "): totalBytes = ");
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

    public ShortPointer() {
    }

    public ShortPointer(Pointer pointer) {
        super(pointer);
    }
}
