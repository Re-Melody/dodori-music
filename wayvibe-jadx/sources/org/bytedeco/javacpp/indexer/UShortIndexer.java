package org.bytedeco.javacpp.indexer;

import java.nio.ShortBuffer;
import org.bytedeco.javacpp.ShortPointer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class UShortIndexer extends Indexer {
    public static final int VALUE_BYTES = 2;

    public UShortIndexer(long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
    }

    public static UShortIndexer create(short[] sArr) {
        return new UShortArrayIndexer(sArr);
    }

    public abstract int get(long j10);

    public abstract int get(long j10, long j11);

    public abstract int get(long j10, long j11, long j12);

    public abstract int get(long... jArr);

    public abstract UShortIndexer get(long j10, long j11, int[] iArr, int i10, int i11);

    public UShortIndexer get(long j10, int[] iArr) {
        return get(j10, iArr, 0, iArr.length);
    }

    public abstract UShortIndexer get(long j10, int[] iArr, int i10, int i11);

    public abstract UShortIndexer get(long[] jArr, int[] iArr, int i10, int i11);

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public double getDouble(long... jArr) {
        return get(jArr);
    }

    public abstract UShortIndexer put(long j10, int i10);

    public abstract UShortIndexer put(long j10, long j11, int i10);

    public abstract UShortIndexer put(long j10, long j11, long j12, int i10);

    public abstract UShortIndexer put(long j10, long j11, int[] iArr, int i10, int i11);

    public UShortIndexer put(long j10, int... iArr) {
        return put(j10, iArr, 0, iArr.length);
    }

    public abstract UShortIndexer put(long j10, int[] iArr, int i10, int i11);

    public abstract UShortIndexer put(long[] jArr, int i10);

    public abstract UShortIndexer put(long[] jArr, int[] iArr, int i10, int i11);

    public static UShortIndexer create(ShortBuffer shortBuffer) {
        return new UShortBufferIndexer(shortBuffer);
    }

    public UShortIndexer get(long j10, long j11, int[] iArr) {
        return get(j10, j11, iArr, 0, iArr.length);
    }

    public UShortIndexer put(long j10, long j11, int... iArr) {
        return put(j10, j11, iArr, 0, iArr.length);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public UShortIndexer putDouble(long[] jArr, double d10) {
        return put(jArr, (int) d10);
    }

    public static UShortIndexer create(ShortPointer shortPointer) {
        return create(shortPointer, new long[]{shortPointer.limit() - shortPointer.position()}, Indexer.ONE_STRIDE);
    }

    public UShortIndexer get(long[] jArr, int[] iArr) {
        return get(jArr, iArr, 0, iArr.length);
    }

    public UShortIndexer put(long[] jArr, int... iArr) {
        return put(jArr, iArr, 0, iArr.length);
    }

    public static UShortIndexer create(short[] sArr, long[] jArr, long[] jArr2) {
        return new UShortArrayIndexer(sArr, jArr, jArr2);
    }

    public static UShortIndexer create(ShortBuffer shortBuffer, long[] jArr, long[] jArr2) {
        return new UShortBufferIndexer(shortBuffer, jArr, jArr2);
    }

    public static UShortIndexer create(ShortPointer shortPointer, long[] jArr, long[] jArr2) {
        return create(shortPointer, jArr, jArr2, true);
    }

    public static UShortIndexer create(final ShortPointer shortPointer, long[] jArr, long[] jArr2, boolean z10) {
        if (z10) {
            return Raw.getInstance() != null ? new UShortRawIndexer(shortPointer, jArr, jArr2) : new UShortBufferIndexer(shortPointer.asBuffer(), jArr, jArr2);
        }
        final long jPosition = shortPointer.position();
        short[] sArr = new short[(int) Math.min(shortPointer.limit() - jPosition, 2147483647L)];
        shortPointer.get(sArr);
        return new UShortArrayIndexer(sArr, jArr, jArr2) { // from class: org.bytedeco.javacpp.indexer.UShortIndexer.1
            @Override // org.bytedeco.javacpp.indexer.UShortArrayIndexer, org.bytedeco.javacpp.indexer.Indexer
            public void release() {
                shortPointer.position(jPosition).put(this.array);
                super.release();
            }
        };
    }
}
