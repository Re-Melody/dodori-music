package org.bytedeco.javacpp;

import V0.p;
import org.bytedeco.javacpp.Pointer;

/* JADX INFO: loaded from: classes2.dex */
public class PointerPointer<P extends Pointer> extends Pointer {
    private P[] pointerArray;

    public PointerPointer(String... strArr) {
        this(strArr.length);
        putString(strArr);
    }

    private native void allocateArray(long j10);

    public Pointer get() {
        return get(0L);
    }

    public native P get(Class<P> cls, long j10);

    public String getString(long j10) {
        BytePointer bytePointer = (BytePointer) get(BytePointer.class, j10);
        if (bytePointer != null) {
            return bytePointer.getString();
        }
        return null;
    }

    public native PointerPointer<P> put(long j10, Pointer pointer);

    public PointerPointer<P> putString(String... strArr) {
        this.pointerArray = new BytePointer[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            P[] pArr = this.pointerArray;
            String str = strArr[i10];
            pArr[i10] = str != null ? new BytePointer(str) : null;
        }
        return put(this.pointerArray);
    }

    public PointerPointer(String[] strArr, String str) {
        this(strArr.length);
        putString(strArr, str);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public PointerPointer<P> capacity(long j10) {
        return (PointerPointer) super.capacity(j10);
    }

    public P get(Class<P> cls) {
        return (P) get(cls, 0L);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public PointerPointer<P> limit(long j10) {
        return (PointerPointer) super.limit(j10);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public PointerPointer<P> position(long j10) {
        return (PointerPointer) super.position(j10);
    }

    public PointerPointer<P> put(P... pArr) {
        this.pointerArray = pArr;
        for (int i10 = 0; i10 < pArr.length; i10++) {
            put(i10, pArr[i10]);
        }
        return this;
    }

    public PointerPointer(P... pArr) {
        this(pArr.length);
        put(pArr);
    }

    public Pointer get(long j10) {
        return get(Pointer.class, j10);
    }

    public String getString(long j10, String str) {
        BytePointer bytePointer = (BytePointer) get(BytePointer.class, j10);
        if (bytePointer != null) {
            return bytePointer.getString(str);
        }
        return null;
    }

    public PointerPointer(byte[]... bArr) {
        this(bArr.length);
        put(bArr);
    }

    public PointerPointer(short[]... sArr) {
        this(sArr.length);
        put(sArr);
    }

    public PointerPointer<P> put(byte[]... bArr) {
        this.pointerArray = new BytePointer[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            P[] pArr = this.pointerArray;
            byte[] bArr2 = bArr[i10];
            pArr[i10] = bArr2 != null ? new BytePointer(bArr2) : null;
        }
        return put(this.pointerArray);
    }

    public PointerPointer<P> putString(String[] strArr, String str) {
        this.pointerArray = new BytePointer[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            P[] pArr = this.pointerArray;
            String str2 = strArr[i10];
            pArr[i10] = str2 != null ? new BytePointer(str2, str) : null;
        }
        return put(this.pointerArray);
    }

    public PointerPointer(int[]... iArr) {
        this(iArr.length);
        put(iArr);
    }

    public PointerPointer(long[]... jArr) {
        this(jArr.length);
        put(jArr);
    }

    public PointerPointer(float[]... fArr) {
        this(fArr.length);
        put(fArr);
    }

    public PointerPointer(double[]... dArr) {
        this(dArr.length);
        put(dArr);
    }

    public PointerPointer<P> put(short[]... sArr) {
        this.pointerArray = new ShortPointer[sArr.length];
        for (int i10 = 0; i10 < sArr.length; i10++) {
            P[] pArr = this.pointerArray;
            short[] sArr2 = sArr[i10];
            pArr[i10] = sArr2 != null ? new ShortPointer(sArr2) : null;
        }
        return put(this.pointerArray);
    }

    public PointerPointer(char[]... cArr) {
        this(cArr.length);
        put(cArr);
    }

    public PointerPointer(long j10) {
        try {
            allocateArray(j10);
            if (j10 > 0 && this.address == 0) {
                throw new OutOfMemoryError("Native allocator returned address == 0");
            }
        } catch (OutOfMemoryError e2) {
            StringBuilder sbS = p.s("Cannot allocate new PointerPointer(", j10, "): totalBytes = ");
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

    public PointerPointer<P> put(int[]... iArr) {
        this.pointerArray = new IntPointer[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            P[] pArr = this.pointerArray;
            int[] iArr2 = iArr[i10];
            pArr[i10] = iArr2 != null ? new IntPointer(iArr2) : null;
        }
        return put(this.pointerArray);
    }

    public PointerPointer<P> put(long[]... jArr) {
        this.pointerArray = new LongPointer[jArr.length];
        for (int i10 = 0; i10 < jArr.length; i10++) {
            P[] pArr = this.pointerArray;
            long[] jArr2 = jArr[i10];
            pArr[i10] = jArr2 != null ? new LongPointer(jArr2) : null;
        }
        return put(this.pointerArray);
    }

    public PointerPointer<P> put(float[]... fArr) {
        this.pointerArray = new FloatPointer[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            P[] pArr = this.pointerArray;
            float[] fArr2 = fArr[i10];
            pArr[i10] = fArr2 != null ? new FloatPointer(fArr2) : null;
        }
        return put(this.pointerArray);
    }

    public PointerPointer() {
    }

    public PointerPointer<P> put(double[]... dArr) {
        this.pointerArray = new DoublePointer[dArr.length];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            P[] pArr = this.pointerArray;
            double[] dArr2 = dArr[i10];
            pArr[i10] = dArr2 != null ? new DoublePointer(dArr2) : null;
        }
        return put(this.pointerArray);
    }

    public PointerPointer(Pointer pointer) {
        super(pointer);
    }

    public PointerPointer<P> put(char[]... cArr) {
        this.pointerArray = new CharPointer[cArr.length];
        for (int i10 = 0; i10 < cArr.length; i10++) {
            P[] pArr = this.pointerArray;
            char[] cArr2 = cArr[i10];
            pArr[i10] = cArr2 != null ? new CharPointer(cArr2) : null;
        }
        return put(this.pointerArray);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public PointerPointer<P> put(Pointer pointer) {
        return put(0L, pointer);
    }
}
