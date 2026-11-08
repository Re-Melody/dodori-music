package org.bytedeco.javacpp.indexer;

import java.nio.LongBuffer;
import org.bytedeco.javacpp.LongPointer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LongIndexer extends Indexer {
    public static final int VALUE_BYTES = 8;

    public LongIndexer(long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
    }

    public static LongIndexer create(long[] jArr) {
        return new LongArrayIndexer(jArr);
    }

    public abstract long get(long j10);

    public abstract long get(long j10, long j11);

    public abstract long get(long j10, long j11, long j12);

    public abstract long get(long... jArr);

    public abstract LongIndexer get(long j10, long j11, long[] jArr, int i10, int i11);

    public LongIndexer get(long j10, long[] jArr) {
        return get(j10, jArr, 0, jArr.length);
    }

    public abstract LongIndexer get(long j10, long[] jArr, int i10, int i11);

    public abstract LongIndexer get(long[] jArr, long[] jArr2, int i10, int i11);

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public double getDouble(long... jArr) {
        return get(jArr);
    }

    public abstract LongIndexer put(long j10, long j11);

    public abstract LongIndexer put(long j10, long j11, long j12);

    public abstract LongIndexer put(long j10, long j11, long j12, long j13);

    public abstract LongIndexer put(long j10, long j11, long[] jArr, int i10, int i11);

    public LongIndexer put(long j10, long... jArr) {
        return put(j10, jArr, 0, jArr.length);
    }

    public abstract LongIndexer put(long j10, long[] jArr, int i10, int i11);

    public abstract LongIndexer put(long[] jArr, long j10);

    public abstract LongIndexer put(long[] jArr, long[] jArr2, int i10, int i11);

    public static LongIndexer create(LongBuffer longBuffer) {
        return new LongBufferIndexer(longBuffer);
    }

    public LongIndexer get(long j10, long j11, long[] jArr) {
        return get(j10, j11, jArr, 0, jArr.length);
    }

    public LongIndexer put(long j10, long j11, long... jArr) {
        return put(j10, j11, jArr, 0, jArr.length);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public LongIndexer putDouble(long[] jArr, double d10) {
        return put(jArr, (long) d10);
    }

    public static LongIndexer create(LongPointer longPointer) {
        return create(longPointer, new long[]{longPointer.limit() - longPointer.position()}, Indexer.ONE_STRIDE);
    }

    public LongIndexer get(long[] jArr, long[] jArr2) {
        return get(jArr, jArr2, 0, jArr2.length);
    }

    public LongIndexer put(long[] jArr, long... jArr2) {
        return put(jArr, jArr2, 0, jArr2.length);
    }

    public static LongIndexer create(long[] jArr, long[] jArr2, long[] jArr3) {
        return new LongArrayIndexer(jArr, jArr2, jArr3);
    }

    public static LongIndexer create(LongBuffer longBuffer, long[] jArr, long[] jArr2) {
        return new LongBufferIndexer(longBuffer, jArr, jArr2);
    }

    public static LongIndexer create(LongPointer longPointer, long[] jArr, long[] jArr2) {
        return create(longPointer, jArr, jArr2, true);
    }

    public static LongIndexer create(final LongPointer longPointer, long[] jArr, long[] jArr2, boolean z10) {
        if (z10) {
            return Raw.getInstance() != null ? new LongRawIndexer(longPointer, jArr, jArr2) : new LongBufferIndexer(longPointer.asBuffer(), jArr, jArr2);
        }
        final long jPosition = longPointer.position();
        long[] jArr3 = new long[(int) Math.min(longPointer.limit() - jPosition, 2147483647L)];
        longPointer.get(jArr3);
        return new LongArrayIndexer(jArr3, jArr, jArr2) { // from class: org.bytedeco.javacpp.indexer.LongIndexer.1
            @Override // org.bytedeco.javacpp.indexer.LongArrayIndexer, org.bytedeco.javacpp.indexer.Indexer
            public void release() {
                longPointer.position(jPosition).put(this.array);
                super.release();
            }
        };
    }
}
