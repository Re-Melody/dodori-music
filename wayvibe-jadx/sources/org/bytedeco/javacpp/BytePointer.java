package org.bytedeco.javacpp;

import V0.p;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.javacpp.annotation.ValueGetter;
import org.bytedeco.javacpp.annotation.ValueSetter;

/* JADX INFO: loaded from: classes2.dex */
public class BytePointer extends Pointer {
    public BytePointer(String str, String str2) throws UnsupportedEncodingException {
        this(str.getBytes(str2).length + 1);
        putString(str, str2);
    }

    private native void allocateArray(long j10);

    @Cast({"char*"})
    public static native BytePointer strcat(@Cast({"char*"}) BytePointer bytePointer, @Cast({"char*"}) BytePointer bytePointer2);

    @Cast({"char*"})
    public static native BytePointer strchr(@Cast({"char*"}) BytePointer bytePointer, int i10);

    public static native int strcmp(@Cast({"char*"}) BytePointer bytePointer, @Cast({"char*"}) BytePointer bytePointer2);

    public static native int strcoll(@Cast({"char*"}) BytePointer bytePointer, @Cast({"char*"}) BytePointer bytePointer2);

    @Cast({"char*"})
    public static native BytePointer strcpy(@Cast({"char*"}) BytePointer bytePointer, @Cast({"char*"}) BytePointer bytePointer2);

    @Cast({"size_t"})
    public static native long strcspn(@Cast({"char*"}) BytePointer bytePointer, @Cast({"char*"}) BytePointer bytePointer2);

    @Cast({"char*"})
    public static native BytePointer strerror(int i10);

    @Cast({"size_t"})
    public static native long strlen(@Cast({"char*"}) BytePointer bytePointer);

    @Cast({"char*"})
    public static native BytePointer strncat(@Cast({"char*"}) BytePointer bytePointer, @Cast({"char*"}) BytePointer bytePointer2, @Cast({"size_t"}) long j10);

    public static native int strncmp(@Cast({"char*"}) BytePointer bytePointer, @Cast({"char*"}) BytePointer bytePointer2, @Cast({"size_t"}) long j10);

    @Cast({"char*"})
    public static native BytePointer strncpy(@Cast({"char*"}) BytePointer bytePointer, @Cast({"char*"}) BytePointer bytePointer2, @Cast({"size_t"}) long j10);

    @Cast({"char*"})
    public static native BytePointer strpbrk(@Cast({"char*"}) BytePointer bytePointer, @Cast({"char*"}) BytePointer bytePointer2);

    @Cast({"char*"})
    public static native BytePointer strrchr(@Cast({"char*"}) BytePointer bytePointer, int i10);

    @Cast({"size_t"})
    public static native long strspn(@Cast({"char*"}) BytePointer bytePointer, @Cast({"char*"}) BytePointer bytePointer2);

    @Cast({"char*"})
    public static native BytePointer strstr(@Cast({"char*"}) BytePointer bytePointer, @Cast({"char*"}) BytePointer bytePointer2);

    @Cast({"char*"})
    public static native BytePointer strtok(@Cast({"char*"}) BytePointer bytePointer, @Cast({"char*"}) BytePointer bytePointer2);

    @Cast({"size_t"})
    public static native long strxfrm(@Cast({"char*"}) BytePointer bytePointer, @Cast({"char*"}) BytePointer bytePointer2, @Cast({"size_t"}) long j10);

    public byte get() {
        return get(0L);
    }

    public native byte get(long j10);

    public native BytePointer get(byte[] bArr, int i10, int i11);

    public boolean getBool() {
        return getBool(0L);
    }

    @Cast({"bool"})
    @ValueGetter
    public native boolean getBool(long j10);

    public char getChar() {
        return getChar(0L);
    }

    @Cast({"short"})
    @ValueGetter
    public native char getChar(long j10);

    public double getDouble() {
        return getDouble(0L);
    }

    @Cast({"double"})
    @ValueGetter
    public native double getDouble(long j10);

    public float getFloat() {
        return getFloat(0L);
    }

    @Cast({"float"})
    @ValueGetter
    public native float getFloat(long j10);

    public int getInt() {
        return getInt(0L);
    }

    @Cast({"int"})
    @ValueGetter
    public native int getInt(long j10);

    public long getLong() {
        return getLong(0L);
    }

    @Cast({"long long"})
    @ValueGetter
    public native long getLong(long j10);

    public Pointer getPointer() {
        return getPointer(0L);
    }

    @Cast({"void*"})
    @ValueGetter
    public native Pointer getPointer(long j10);

    public short getShort() {
        return getShort(0L);
    }

    @Cast({"short"})
    @ValueGetter
    public native short getShort(long j10);

    public String getString(String str) {
        return new String(getStringBytes(), str);
    }

    public byte[] getStringBytes() {
        long jStrlen = this.limit - this.position;
        if (jStrlen <= 0) {
            jStrlen = strlen(this);
        }
        byte[] bArr = new byte[(int) Math.min(jStrlen, 2147483647L)];
        get(bArr);
        return bArr;
    }

    public BytePointer put(byte b10) {
        return put(0L, b10);
    }

    public native BytePointer put(long j10, byte b10);

    public native BytePointer put(byte[] bArr, int i10, int i11);

    @Cast({"bool"})
    @ValueSetter
    public native BytePointer putBool(long j10, boolean z10);

    public BytePointer putBool(boolean z10) {
        return putBool(0L, z10);
    }

    public BytePointer putChar(char c3) {
        return putChar(0L, c3);
    }

    @Cast({"short"})
    @ValueSetter
    public native BytePointer putChar(long j10, char c3);

    public BytePointer putDouble(double d10) {
        return putDouble(0L, d10);
    }

    @Cast({"double"})
    @ValueSetter
    public native BytePointer putDouble(long j10, double d10);

    public BytePointer putFloat(float f10) {
        return putFloat(0L, f10);
    }

    @Cast({"float"})
    @ValueSetter
    public native BytePointer putFloat(long j10, float f10);

    public BytePointer putInt(int i10) {
        return putInt(0L, i10);
    }

    @Cast({"int"})
    @ValueSetter
    public native BytePointer putInt(long j10, int i10);

    public BytePointer putLong(long j10) {
        return putLong(0L, j10);
    }

    @Cast({"long long"})
    @ValueSetter
    public native BytePointer putLong(long j10, long j11);

    @Cast({"void*"})
    @ValueSetter
    public native BytePointer putPointer(long j10, Pointer pointer);

    public BytePointer putPointer(Pointer pointer) {
        return putPointer(0L, pointer);
    }

    @Cast({"short"})
    @ValueSetter
    public native BytePointer putShort(long j10, short s8);

    public BytePointer putShort(short s8) {
        return putShort(0L, s8);
    }

    public BytePointer putString(String str, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str.getBytes(str2);
        return put(bytes).put(bytes.length, (byte) 0).limit(bytes.length);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public final ByteBuffer asBuffer() {
        return asByteBuffer();
    }

    @Override // org.bytedeco.javacpp.Pointer
    public BytePointer capacity(long j10) {
        return (BytePointer) super.capacity(j10);
    }

    public BytePointer get(byte[] bArr) {
        return get(bArr, 0, bArr.length);
    }

    public String getString() {
        return new String(getStringBytes());
    }

    @Override // org.bytedeco.javacpp.Pointer
    public BytePointer limit(long j10) {
        return (BytePointer) super.limit(j10);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public BytePointer position(long j10) {
        return (BytePointer) super.position(j10);
    }

    public BytePointer put(byte... bArr) {
        return put(bArr, 0, bArr.length);
    }

    public BytePointer(String str) {
        this(str.getBytes().length + 1);
        putString(str);
    }

    public BytePointer putString(String str) {
        byte[] bytes = str.getBytes();
        return put(bytes).put(bytes.length, (byte) 0).limit(bytes.length);
    }

    public BytePointer(byte... bArr) {
        this(bArr.length);
        put(bArr);
    }

    public BytePointer(ByteBuffer byteBuffer) {
        super(byteBuffer);
        if (byteBuffer == null || byteBuffer.isDirect() || !byteBuffer.hasArray()) {
            return;
        }
        byte[] bArrArray = byteBuffer.array();
        allocateArray(bArrArray.length - byteBuffer.arrayOffset());
        put(bArrArray, byteBuffer.arrayOffset(), bArrArray.length - byteBuffer.arrayOffset());
        position(byteBuffer.position());
        limit(byteBuffer.limit());
    }

    public BytePointer(long j10) {
        try {
            allocateArray(j10);
            if (j10 > 0 && this.address == 0) {
                throw new OutOfMemoryError("Native allocator returned address == 0");
            }
        } catch (OutOfMemoryError e2) {
            StringBuilder sbS = p.s("Cannot allocate new BytePointer(", j10, "): totalBytes = ");
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

    public BytePointer() {
    }

    public BytePointer(Pointer pointer) {
        super(pointer);
    }
}
