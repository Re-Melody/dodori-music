package org.bytedeco.javacpp.indexer;

import java.nio.DoubleBuffer;
import org.bytedeco.javacpp.DoublePointer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DoubleIndexer extends Indexer {
    public static final int VALUE_BYTES = 8;

    public DoubleIndexer(long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
    }

    public static DoubleIndexer create(double[] dArr) {
        return new DoubleArrayIndexer(dArr);
    }

    public abstract double get(long j10);

    public abstract double get(long j10, long j11);

    public abstract double get(long j10, long j11, long j12);

    public abstract double get(long... jArr);

    public abstract DoubleIndexer get(long j10, long j11, double[] dArr, int i10, int i11);

    public DoubleIndexer get(long j10, double[] dArr) {
        return get(j10, dArr, 0, dArr.length);
    }

    public abstract DoubleIndexer get(long j10, double[] dArr, int i10, int i11);

    public abstract DoubleIndexer get(long[] jArr, double[] dArr, int i10, int i11);

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public double getDouble(long... jArr) {
        return get(jArr);
    }

    public abstract DoubleIndexer put(long j10, double d10);

    public abstract DoubleIndexer put(long j10, long j11, double d10);

    public abstract DoubleIndexer put(long j10, long j11, long j12, double d10);

    public abstract DoubleIndexer put(long j10, long j11, double[] dArr, int i10, int i11);

    public DoubleIndexer put(long j10, double... dArr) {
        return put(j10, dArr, 0, dArr.length);
    }

    public abstract DoubleIndexer put(long j10, double[] dArr, int i10, int i11);

    public abstract DoubleIndexer put(long[] jArr, double d10);

    public abstract DoubleIndexer put(long[] jArr, double[] dArr, int i10, int i11);

    public static DoubleIndexer create(DoubleBuffer doubleBuffer) {
        return new DoubleBufferIndexer(doubleBuffer);
    }

    public DoubleIndexer get(long j10, long j11, double[] dArr) {
        return get(j10, j11, dArr, 0, dArr.length);
    }

    public DoubleIndexer put(long j10, long j11, double... dArr) {
        return put(j10, j11, dArr, 0, dArr.length);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public DoubleIndexer putDouble(long[] jArr, double d10) {
        return put(jArr, d10);
    }

    public static DoubleIndexer create(DoublePointer doublePointer) {
        return create(doublePointer, new long[]{doublePointer.limit() - doublePointer.position()}, Indexer.ONE_STRIDE);
    }

    public DoubleIndexer get(long[] jArr, double[] dArr) {
        return get(jArr, dArr, 0, dArr.length);
    }

    public DoubleIndexer put(long[] jArr, double... dArr) {
        return put(jArr, dArr, 0, dArr.length);
    }

    public static DoubleIndexer create(double[] dArr, long[] jArr, long[] jArr2) {
        return new DoubleArrayIndexer(dArr, jArr, jArr2);
    }

    public static DoubleIndexer create(DoubleBuffer doubleBuffer, long[] jArr, long[] jArr2) {
        return new DoubleBufferIndexer(doubleBuffer, jArr, jArr2);
    }

    public static DoubleIndexer create(DoublePointer doublePointer, long[] jArr, long[] jArr2) {
        return create(doublePointer, jArr, jArr2, true);
    }

    public static DoubleIndexer create(final DoublePointer doublePointer, long[] jArr, long[] jArr2, boolean z10) {
        if (z10) {
            return Raw.getInstance() != null ? new DoubleRawIndexer(doublePointer, jArr, jArr2) : new DoubleBufferIndexer(doublePointer.asBuffer(), jArr, jArr2);
        }
        final long jPosition = doublePointer.position();
        double[] dArr = new double[(int) Math.min(doublePointer.limit() - jPosition, 2147483647L)];
        doublePointer.get(dArr);
        return new DoubleArrayIndexer(dArr, jArr, jArr2) { // from class: org.bytedeco.javacpp.indexer.DoubleIndexer.1
            @Override // org.bytedeco.javacpp.indexer.DoubleArrayIndexer, org.bytedeco.javacpp.indexer.Indexer
            public void release() {
                doublePointer.position(jPosition).put(this.array);
                super.release();
            }
        };
    }
}
