package org.bytedeco.javacpp.indexer;

import java.nio.ByteBuffer;
import org.bytedeco.javacpp.BytePointer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ByteIndexer extends Indexer {
    public static final int VALUE_BYTES = 1;

    public ByteIndexer(long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
    }

    public static ByteIndexer create(byte[] bArr) {
        return new ByteArrayIndexer(bArr);
    }

    public abstract byte get(long j10);

    public abstract byte get(long j10, long j11);

    public abstract byte get(long j10, long j11, long j12);

    public abstract byte get(long... jArr);

    public abstract ByteIndexer get(long j10, long j11, byte[] bArr, int i10, int i11);

    public ByteIndexer get(long j10, byte[] bArr) {
        return get(j10, bArr, 0, bArr.length);
    }

    public abstract ByteIndexer get(long j10, byte[] bArr, int i10, int i11);

    public abstract ByteIndexer get(long[] jArr, byte[] bArr, int i10, int i11);

    public abstract char getChar(long j10);

    public abstract double getDouble(long j10);

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public double getDouble(long... jArr) {
        return get(jArr);
    }

    public abstract float getFloat(long j10);

    public abstract int getInt(long j10);

    public abstract long getLong(long j10);

    public abstract short getShort(long j10);

    public abstract ByteIndexer put(long j10, byte b10);

    public abstract ByteIndexer put(long j10, long j11, byte b10);

    public abstract ByteIndexer put(long j10, long j11, long j12, byte b10);

    public abstract ByteIndexer put(long j10, long j11, byte[] bArr, int i10, int i11);

    public ByteIndexer put(long j10, byte... bArr) {
        return put(j10, bArr, 0, bArr.length);
    }

    public abstract ByteIndexer put(long j10, byte[] bArr, int i10, int i11);

    public abstract ByteIndexer put(long[] jArr, byte b10);

    public abstract ByteIndexer put(long[] jArr, byte[] bArr, int i10, int i11);

    public abstract ByteIndexer putChar(long j10, char c3);

    public abstract ByteIndexer putDouble(long j10, double d10);

    public abstract ByteIndexer putFloat(long j10, float f10);

    public abstract ByteIndexer putInt(long j10, int i10);

    public abstract ByteIndexer putLong(long j10, long j11);

    public abstract ByteIndexer putShort(long j10, short s8);

    public static ByteIndexer create(ByteBuffer byteBuffer) {
        return new ByteBufferIndexer(byteBuffer);
    }

    public ByteIndexer get(long j10, long j11, byte[] bArr) {
        return get(j10, j11, bArr, 0, bArr.length);
    }

    public ByteIndexer put(long j10, long j11, byte... bArr) {
        return put(j10, j11, bArr, 0, bArr.length);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public ByteIndexer putDouble(long[] jArr, double d10) {
        return put(jArr, (byte) d10);
    }

    public static ByteIndexer create(BytePointer bytePointer) {
        return create(bytePointer, new long[]{bytePointer.limit() - bytePointer.position()}, Indexer.ONE_STRIDE);
    }

    public ByteIndexer get(long[] jArr, byte[] bArr) {
        return get(jArr, bArr, 0, bArr.length);
    }

    public ByteIndexer put(long[] jArr, byte... bArr) {
        return put(jArr, bArr, 0, bArr.length);
    }

    public static ByteIndexer create(byte[] bArr, long[] jArr, long[] jArr2) {
        return new ByteArrayIndexer(bArr, jArr, jArr2);
    }

    public static ByteIndexer create(ByteBuffer byteBuffer, long[] jArr, long[] jArr2) {
        return new ByteBufferIndexer(byteBuffer, jArr, jArr2);
    }

    public static ByteIndexer create(BytePointer bytePointer, long[] jArr, long[] jArr2) {
        return create(bytePointer, jArr, jArr2, true);
    }

    public static ByteIndexer create(final BytePointer bytePointer, long[] jArr, long[] jArr2, boolean z10) {
        if (z10) {
            return Raw.getInstance() != null ? new ByteRawIndexer(bytePointer, jArr, jArr2) : new ByteBufferIndexer(bytePointer.asBuffer(), jArr, jArr2);
        }
        final long jPosition = bytePointer.position();
        byte[] bArr = new byte[(int) Math.min(bytePointer.limit() - jPosition, 2147483647L)];
        bytePointer.get(bArr);
        return new ByteArrayIndexer(bArr, jArr, jArr2) { // from class: org.bytedeco.javacpp.indexer.ByteIndexer.1
            @Override // org.bytedeco.javacpp.indexer.ByteArrayIndexer, org.bytedeco.javacpp.indexer.Indexer
            public void release() {
                bytePointer.position(jPosition).put(this.array);
                super.release();
            }
        };
    }
}
