package org.bytedeco.javacpp;

import V0.p;
import java.nio.DoubleBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class DoublePointer extends Pointer {
    public DoublePointer(double... dArr) {
        this(dArr.length);
        put(dArr);
    }

    private native void allocateArray(long j10);

    public double get() {
        return get(0L);
    }

    public native double get(long j10);

    public native DoublePointer get(double[] dArr, int i10, int i11);

    public DoublePointer put(double d10) {
        return put(0L, d10);
    }

    public native DoublePointer put(long j10, double d10);

    public native DoublePointer put(double[] dArr, int i10, int i11);

    @Override // org.bytedeco.javacpp.Pointer
    public final DoubleBuffer asBuffer() {
        return asByteBuffer().asDoubleBuffer();
    }

    @Override // org.bytedeco.javacpp.Pointer
    public DoublePointer capacity(long j10) {
        return (DoublePointer) super.capacity(j10);
    }

    public DoublePointer get(double[] dArr) {
        return get(dArr, 0, dArr.length);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public DoublePointer limit(long j10) {
        return (DoublePointer) super.limit(j10);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public DoublePointer position(long j10) {
        return (DoublePointer) super.position(j10);
    }

    public DoublePointer put(double... dArr) {
        return put(dArr, 0, dArr.length);
    }

    public DoublePointer(DoubleBuffer doubleBuffer) {
        super(doubleBuffer);
        if (doubleBuffer == null || doubleBuffer.isDirect() || !doubleBuffer.hasArray()) {
            return;
        }
        double[] dArrArray = doubleBuffer.array();
        allocateArray(dArrArray.length - doubleBuffer.arrayOffset());
        put(dArrArray, doubleBuffer.arrayOffset(), dArrArray.length - doubleBuffer.arrayOffset());
        position(doubleBuffer.position());
        limit(doubleBuffer.limit());
    }

    public DoublePointer(long j10) {
        try {
            allocateArray(j10);
            if (j10 > 0 && this.address == 0) {
                throw new OutOfMemoryError("Native allocator returned address == 0");
            }
        } catch (OutOfMemoryError e2) {
            StringBuilder sbS = p.s("Cannot allocate new DoublePointer(", j10, "): totalBytes = ");
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

    public DoublePointer() {
    }

    public DoublePointer(Pointer pointer) {
        super(pointer);
    }
}
