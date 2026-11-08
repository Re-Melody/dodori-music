package org.bytedeco.javacpp;

import V0.p;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class IntPointer extends Pointer {
    public IntPointer(String str) {
        this(str.length() + 1);
        putString(str);
    }

    private native void allocateArray(long j10);

    public int get() {
        return get(0L);
    }

    public native int get(long j10);

    public native IntPointer get(int[] iArr, int i10, int i11);

    public String getString() {
        int[] stringCodePoints = getStringCodePoints();
        return new String(stringCodePoints, 0, stringCodePoints.length);
    }

    public int[] getStringCodePoints() {
        long j10 = this.limit;
        long j11 = this.position;
        if (j10 > j11) {
            int[] iArr = new int[(int) Math.min(j10 - j11, 2147483647L)];
            get(iArr);
            return iArr;
        }
        int[] iArr2 = new int[16];
        int i10 = 0;
        while (true) {
            int i11 = get(i10);
            iArr2[i10] = i11;
            if (i11 == 0) {
                int[] iArr3 = new int[i10];
                System.arraycopy(iArr2, 0, iArr3, 0, i10);
                return iArr3;
            }
            i10++;
            if (i10 >= iArr2.length) {
                int[] iArr4 = new int[iArr2.length * 2];
                System.arraycopy(iArr2, 0, iArr4, 0, iArr2.length);
                iArr2 = iArr4;
            }
        }
    }

    public IntPointer put(int i10) {
        return put(0L, i10);
    }

    public native IntPointer put(long j10, int i10);

    public native IntPointer put(int[] iArr, int i10, int i11);

    public IntPointer putString(String str) {
        int length = str.length();
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = str.codePointAt(i10);
        }
        long j10 = length;
        return put(iArr).put(j10, 0).limit(j10);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public final IntBuffer asBuffer() {
        return asByteBuffer().asIntBuffer();
    }

    @Override // org.bytedeco.javacpp.Pointer
    public IntPointer capacity(long j10) {
        return (IntPointer) super.capacity(j10);
    }

    public IntPointer get(int[] iArr) {
        return get(iArr, 0, iArr.length);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public IntPointer limit(long j10) {
        return (IntPointer) super.limit(j10);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public IntPointer position(long j10) {
        return (IntPointer) super.position(j10);
    }

    public IntPointer put(int... iArr) {
        return put(iArr, 0, iArr.length);
    }

    public IntPointer(int... iArr) {
        this(iArr.length);
        put(iArr);
    }

    public IntPointer(IntBuffer intBuffer) {
        super(intBuffer);
        if (intBuffer == null || intBuffer.isDirect() || !intBuffer.hasArray()) {
            return;
        }
        int[] iArrArray = intBuffer.array();
        allocateArray(iArrArray.length - intBuffer.arrayOffset());
        put(iArrArray, intBuffer.arrayOffset(), iArrArray.length - intBuffer.arrayOffset());
        position(intBuffer.position());
        limit(intBuffer.limit());
    }

    public IntPointer(long j10) {
        try {
            allocateArray(j10);
            if (j10 > 0 && this.address == 0) {
                throw new OutOfMemoryError("Native allocator returned address == 0");
            }
        } catch (OutOfMemoryError e2) {
            StringBuilder sbS = p.s("Cannot allocate new IntPointer(", j10, "): totalBytes = ");
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

    public IntPointer() {
    }

    public IntPointer(Pointer pointer) {
        super(pointer);
    }
}
