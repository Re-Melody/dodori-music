package org.bytedeco.javacpp;

import V0.p;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class BooleanPointer extends Pointer {
    public BooleanPointer(boolean... zArr) {
        this(zArr.length);
        put(zArr);
    }

    private native void allocateArray(long j10);

    public native BooleanPointer get(boolean[] zArr, int i10, int i11);

    public boolean get() {
        return get(0L);
    }

    public native boolean get(long j10);

    public native BooleanPointer put(long j10, boolean z10);

    public BooleanPointer put(boolean z10) {
        return put(0L, z10);
    }

    public native BooleanPointer put(boolean[] zArr, int i10, int i11);

    @Override // org.bytedeco.javacpp.Pointer
    public BooleanPointer capacity(long j10) {
        return (BooleanPointer) super.capacity(j10);
    }

    public BooleanPointer get(boolean[] zArr) {
        return get(zArr, 0, zArr.length);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public BooleanPointer limit(long j10) {
        return (BooleanPointer) super.limit(j10);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public BooleanPointer position(long j10) {
        return (BooleanPointer) super.position(j10);
    }

    public BooleanPointer put(boolean... zArr) {
        return put(zArr, 0, zArr.length);
    }

    public BooleanPointer(ByteBuffer byteBuffer) {
        super(byteBuffer);
        if (byteBuffer == null || byteBuffer.isDirect() || !byteBuffer.hasArray()) {
            return;
        }
        byte[] bArrArray = byteBuffer.array();
        allocateArray(bArrArray.length - byteBuffer.arrayOffset());
        for (int iArrayOffset = byteBuffer.arrayOffset(); iArrayOffset < bArrArray.length; iArrayOffset++) {
            put(iArrayOffset - byteBuffer.arrayOffset(), bArrArray[iArrayOffset] != 0);
        }
        position(byteBuffer.position());
        limit(byteBuffer.limit());
    }

    public BooleanPointer(long j10) {
        try {
            allocateArray(j10);
            if (j10 > 0 && this.address == 0) {
                throw new OutOfMemoryError("Native allocator returned address == 0");
            }
        } catch (OutOfMemoryError e2) {
            StringBuilder sbS = p.s("Cannot allocate new BooleanPointer(", j10, "): totalBytes = ");
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

    public BooleanPointer() {
    }

    public BooleanPointer(Pointer pointer) {
        super(pointer);
    }
}
