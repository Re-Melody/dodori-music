package org.bytedeco.javacpp.indexer;

import java.nio.ShortBuffer;
import org.bytedeco.javacpp.ShortPointer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ShortIndexer extends Indexer {
    public static final int VALUE_BYTES = 2;

    public ShortIndexer(long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
    }

    public static ShortIndexer create(short[] sArr) {
        return new ShortArrayIndexer(sArr);
    }

    public abstract ShortIndexer get(long j10, long j11, short[] sArr, int i10, int i11);

    public ShortIndexer get(long j10, short[] sArr) {
        return get(j10, sArr, 0, sArr.length);
    }

    public abstract ShortIndexer get(long j10, short[] sArr, int i10, int i11);

    public abstract ShortIndexer get(long[] jArr, short[] sArr, int i10, int i11);

    public abstract short get(long j10);

    public abstract short get(long j10, long j11);

    public abstract short get(long j10, long j11, long j12);

    public abstract short get(long... jArr);

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public double getDouble(long... jArr) {
        return get(jArr);
    }

    public abstract ShortIndexer put(long j10, long j11, long j12, short s8);

    public abstract ShortIndexer put(long j10, long j11, short s8);

    public abstract ShortIndexer put(long j10, long j11, short[] sArr, int i10, int i11);

    public abstract ShortIndexer put(long j10, short s8);

    public ShortIndexer put(long j10, short... sArr) {
        return put(j10, sArr, 0, sArr.length);
    }

    public abstract ShortIndexer put(long j10, short[] sArr, int i10, int i11);

    public abstract ShortIndexer put(long[] jArr, short s8);

    public abstract ShortIndexer put(long[] jArr, short[] sArr, int i10, int i11);

    public static ShortIndexer create(ShortBuffer shortBuffer) {
        return new ShortBufferIndexer(shortBuffer);
    }

    public ShortIndexer get(long j10, long j11, short[] sArr) {
        return get(j10, j11, sArr, 0, sArr.length);
    }

    public ShortIndexer put(long j10, long j11, short... sArr) {
        return put(j10, j11, sArr, 0, sArr.length);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public ShortIndexer putDouble(long[] jArr, double d10) {
        return put(jArr, (short) d10);
    }

    public static ShortIndexer create(ShortPointer shortPointer) {
        return create(shortPointer, new long[]{shortPointer.limit() - shortPointer.position()}, Indexer.ONE_STRIDE);
    }

    public ShortIndexer get(long[] jArr, short[] sArr) {
        return get(jArr, sArr, 0, sArr.length);
    }

    public ShortIndexer put(long[] jArr, short... sArr) {
        return put(jArr, sArr, 0, sArr.length);
    }

    public static ShortIndexer create(short[] sArr, long[] jArr, long[] jArr2) {
        return new ShortArrayIndexer(sArr, jArr, jArr2);
    }

    public static ShortIndexer create(ShortBuffer shortBuffer, long[] jArr, long[] jArr2) {
        return new ShortBufferIndexer(shortBuffer, jArr, jArr2);
    }

    public static ShortIndexer create(ShortPointer shortPointer, long[] jArr, long[] jArr2) {
        return create(shortPointer, jArr, jArr2, true);
    }

    public static ShortIndexer create(final ShortPointer shortPointer, long[] jArr, long[] jArr2, boolean z10) {
        if (z10) {
            return Raw.getInstance() != null ? new ShortRawIndexer(shortPointer, jArr, jArr2) : new ShortBufferIndexer(shortPointer.asBuffer(), jArr, jArr2);
        }
        final long jPosition = shortPointer.position();
        short[] sArr = new short[(int) Math.min(shortPointer.limit() - jPosition, 2147483647L)];
        shortPointer.get(sArr);
        return new ShortArrayIndexer(sArr, jArr, jArr2) { // from class: org.bytedeco.javacpp.indexer.ShortIndexer.1
            @Override // org.bytedeco.javacpp.indexer.ShortArrayIndexer, org.bytedeco.javacpp.indexer.Indexer
            public void release() {
                shortPointer.position(jPosition).put(this.array);
                super.release();
            }
        };
    }
}
