package org.bytedeco.javacpp;

import V0.p;
import java.nio.CharBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class CharPointer extends Pointer {
    public CharPointer(String str) {
        this(str.toCharArray().length + 1);
        putString(str);
    }

    private native void allocateArray(long j10);

    public char get() {
        return get(0L);
    }

    public native char get(long j10);

    public native CharPointer get(char[] cArr, int i10, int i11);

    public String getString() {
        return new String(getStringChars());
    }

    public char[] getStringChars() {
        long j10 = this.limit;
        long j11 = this.position;
        if (j10 > j11) {
            char[] cArr = new char[(int) Math.min(j10 - j11, 2147483647L)];
            get(cArr);
            return cArr;
        }
        char[] cArr2 = new char[16];
        int i10 = 0;
        while (true) {
            char c3 = get(i10);
            cArr2[i10] = c3;
            if (c3 == 0) {
                char[] cArr3 = new char[i10];
                System.arraycopy(cArr2, 0, cArr3, 0, i10);
                return cArr3;
            }
            i10++;
            if (i10 >= cArr2.length) {
                char[] cArr4 = new char[cArr2.length * 2];
                System.arraycopy(cArr2, 0, cArr4, 0, cArr2.length);
                cArr2 = cArr4;
            }
        }
    }

    public CharPointer put(char c3) {
        return put(0L, c3);
    }

    public native CharPointer put(long j10, char c3);

    public native CharPointer put(char[] cArr, int i10, int i11);

    public CharPointer putString(String str) {
        char[] charArray = str.toCharArray();
        return put(charArray).put(charArray.length, (char) 0).limit(charArray.length);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public final CharBuffer asBuffer() {
        return asByteBuffer().asCharBuffer();
    }

    @Override // org.bytedeco.javacpp.Pointer
    public CharPointer capacity(long j10) {
        return (CharPointer) super.capacity(j10);
    }

    public CharPointer get(char[] cArr) {
        return get(cArr, 0, cArr.length);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public CharPointer limit(long j10) {
        return (CharPointer) super.limit(j10);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public CharPointer position(long j10) {
        return (CharPointer) super.position(j10);
    }

    public CharPointer put(char... cArr) {
        return put(cArr, 0, cArr.length);
    }

    public CharPointer(char... cArr) {
        this(cArr.length);
        put(cArr);
    }

    public CharPointer(CharBuffer charBuffer) {
        super(charBuffer);
        if (charBuffer == null || charBuffer.isDirect() || !charBuffer.hasArray()) {
            return;
        }
        char[] cArrArray = charBuffer.array();
        allocateArray(cArrArray.length - charBuffer.arrayOffset());
        put(cArrArray, charBuffer.arrayOffset(), cArrArray.length - charBuffer.arrayOffset());
        position(charBuffer.position());
        limit(charBuffer.limit());
    }

    public CharPointer(long j10) {
        try {
            allocateArray(j10);
            if (j10 > 0 && this.address == 0) {
                throw new OutOfMemoryError("Native allocator returned address == 0");
            }
        } catch (OutOfMemoryError e2) {
            StringBuilder sbS = p.s("Cannot allocate new CharPointer(", j10, "): totalBytes = ");
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

    public CharPointer() {
    }

    public CharPointer(Pointer pointer) {
        super(pointer);
    }
}
