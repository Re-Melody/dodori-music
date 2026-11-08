package org.bytedeco.javacpp;

import V0.p;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class FloatPointer extends Pointer {
    public FloatPointer(float... fArr) {
        this(fArr.length);
        put(fArr);
    }

    private native void allocateArray(long j10);

    public float get() {
        return get(0L);
    }

    public native float get(long j10);

    public native FloatPointer get(float[] fArr, int i10, int i11);

    public FloatPointer put(float f10) {
        return put(0L, f10);
    }

    public native FloatPointer put(long j10, float f10);

    public native FloatPointer put(float[] fArr, int i10, int i11);

    @Override // org.bytedeco.javacpp.Pointer
    public final FloatBuffer asBuffer() {
        return asByteBuffer().asFloatBuffer();
    }

    @Override // org.bytedeco.javacpp.Pointer
    public FloatPointer capacity(long j10) {
        return (FloatPointer) super.capacity(j10);
    }

    public FloatPointer get(float[] fArr) {
        return get(fArr, 0, fArr.length);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public FloatPointer limit(long j10) {
        return (FloatPointer) super.limit(j10);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public FloatPointer position(long j10) {
        return (FloatPointer) super.position(j10);
    }

    public FloatPointer put(float... fArr) {
        return put(fArr, 0, fArr.length);
    }

    public FloatPointer(FloatBuffer floatBuffer) {
        super(floatBuffer);
        if (floatBuffer == null || floatBuffer.isDirect() || !floatBuffer.hasArray()) {
            return;
        }
        float[] fArrArray = floatBuffer.array();
        allocateArray(fArrArray.length - floatBuffer.arrayOffset());
        put(fArrArray, floatBuffer.arrayOffset(), fArrArray.length - floatBuffer.arrayOffset());
        position(floatBuffer.position());
        limit(floatBuffer.limit());
    }

    public FloatPointer(long j10) {
        try {
            allocateArray(j10);
            if (j10 > 0 && this.address == 0) {
                throw new OutOfMemoryError("Native allocator returned address == 0");
            }
        } catch (OutOfMemoryError e2) {
            StringBuilder sbS = p.s("Cannot allocate new FloatPointer(", j10, "): totalBytes = ");
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

    public FloatPointer() {
    }

    public FloatPointer(Pointer pointer) {
        super(pointer);
    }
}
