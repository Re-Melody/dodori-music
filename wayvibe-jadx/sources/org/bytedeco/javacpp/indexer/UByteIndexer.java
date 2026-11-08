package org.bytedeco.javacpp.indexer;

import java.nio.ByteBuffer;
import org.bytedeco.javacpp.BytePointer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class UByteIndexer extends Indexer {
    public static final int VALUE_BYTES = 1;

    public UByteIndexer(long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
    }

    public static UByteIndexer create(byte[] bArr) {
        return new UByteArrayIndexer(bArr);
    }

    public abstract int get(long j10);

    public abstract int get(long j10, long j11);

    public abstract int get(long j10, long j11, long j12);

    public abstract int get(long... jArr);

    public abstract UByteIndexer get(long j10, long j11, int[] iArr, int i10, int i11);

    public UByteIndexer get(long j10, int[] iArr) {
        return get(j10, iArr, 0, iArr.length);
    }

    public abstract UByteIndexer get(long j10, int[] iArr, int i10, int i11);

    public abstract UByteIndexer get(long[] jArr, int[] iArr, int i10, int i11);

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public double getDouble(long... jArr) {
        return get(jArr);
    }

    public abstract UByteIndexer put(long j10, int i10);

    public abstract UByteIndexer put(long j10, long j11, int i10);

    public abstract UByteIndexer put(long j10, long j11, long j12, int i10);

    public abstract UByteIndexer put(long j10, long j11, int[] iArr, int i10, int i11);

    public UByteIndexer put(long j10, int... iArr) {
        return put(j10, iArr, 0, iArr.length);
    }

    public abstract UByteIndexer put(long j10, int[] iArr, int i10, int i11);

    public abstract UByteIndexer put(long[] jArr, int i10);

    public abstract UByteIndexer put(long[] jArr, int[] iArr, int i10, int i11);

    public static UByteIndexer create(ByteBuffer byteBuffer) {
        return new UByteBufferIndexer(byteBuffer);
    }

    public UByteIndexer get(long j10, long j11, int[] iArr) {
        return get(j10, j11, iArr, 0, iArr.length);
    }

    public UByteIndexer put(long j10, long j11, int... iArr) {
        return put(j10, j11, iArr, 0, iArr.length);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public UByteIndexer putDouble(long[] jArr, double d10) {
        return put(jArr, (int) d10);
    }

    public static UByteIndexer create(BytePointer bytePointer) {
        return create(bytePointer, new long[]{bytePointer.limit() - bytePointer.position()}, Indexer.ONE_STRIDE);
    }

    public UByteIndexer get(long[] jArr, int[] iArr) {
        return get(jArr, iArr, 0, iArr.length);
    }

    public UByteIndexer put(long[] jArr, int... iArr) {
        return put(jArr, iArr, 0, iArr.length);
    }

    public static UByteIndexer create(byte[] bArr, long[] jArr, long[] jArr2) {
        return new UByteArrayIndexer(bArr, jArr, jArr2);
    }

    public static UByteIndexer create(ByteBuffer byteBuffer, long[] jArr, long[] jArr2) {
        return new UByteBufferIndexer(byteBuffer, jArr, jArr2);
    }

    public static UByteIndexer create(BytePointer bytePointer, long[] jArr, long[] jArr2) {
        return create(bytePointer, jArr, jArr2, true);
    }

    public static UByteIndexer create(final BytePointer bytePointer, long[] jArr, long[] jArr2, boolean z10) {
        if (z10) {
            return Raw.getInstance() != null ? new UByteRawIndexer(bytePointer, jArr, jArr2) : new UByteBufferIndexer(bytePointer.asBuffer(), jArr, jArr2);
        }
        final long jPosition = bytePointer.position();
        byte[] bArr = new byte[(int) Math.min(bytePointer.limit() - jPosition, 2147483647L)];
        bytePointer.get(bArr);
        return new UByteArrayIndexer(bArr, jArr, jArr2) { // from class: org.bytedeco.javacpp.indexer.UByteIndexer.1
            @Override // org.bytedeco.javacpp.indexer.UByteArrayIndexer, org.bytedeco.javacpp.indexer.Indexer
            public void release() {
                bytePointer.position(jPosition).put(this.array);
                super.release();
            }
        };
    }
}
