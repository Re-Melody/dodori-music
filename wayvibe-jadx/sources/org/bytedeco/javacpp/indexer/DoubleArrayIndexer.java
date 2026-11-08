package org.bytedeco.javacpp.indexer;

import V0.p;

/* JADX INFO: loaded from: classes2.dex */
public class DoubleArrayIndexer extends DoubleIndexer {
    protected double[] array;

    public DoubleArrayIndexer(double[] dArr) {
        this(dArr, new long[]{dArr.length}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public double get(long j10) {
        return this.array[(int) j10];
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long j10, double d10) {
        this.array[(int) j10] = d10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer, org.bytedeco.javacpp.indexer.Indexer
    public /* bridge */ /* synthetic */ Indexer putDouble(long[] jArr, double d10) {
        return super.putDouble(jArr, d10);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.array = null;
    }

    public DoubleArrayIndexer(double[] dArr, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.array = dArr;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public double[] array() {
        return this.array;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer get(long j10, double[] dArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            dArr[i10 + i12] = this.array[(((int) j10) * ((int) this.strides[0])) + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long j10, double[] dArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[(((int) j10) * ((int) this.strides[0])) + i12] = dArr[i10 + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public double get(long j10, long j11) {
        return this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)];
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long j10, long j11, double d10) {
        this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)] = d10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer get(long j10, long j11, double[] dArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            double[] dArr2 = this.array;
            long[] jArr = this.strides;
            dArr[i10 + i12] = dArr2[p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12)];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long j10, long j11, double[] dArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            double[] dArr2 = this.array;
            long[] jArr = this.strides;
            dArr2[p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12)] = dArr[i10 + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public double get(long j10, long j11, long j12) {
        double[] dArr = this.array;
        long[] jArr = this.strides;
        return dArr[(((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)];
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long j10, long j11, long j12, double d10) {
        double[] dArr = this.array;
        long[] jArr = this.strides;
        dArr[(((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)] = d10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public double get(long... jArr) {
        return this.array[(int) index(jArr)];
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long[] jArr, double d10) {
        this.array[(int) index(jArr)] = d10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer get(long[] jArr, double[] dArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            dArr[i10 + i12] = this.array[((int) index(jArr)) + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long[] jArr, double[] dArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[((int) index(jArr)) + i12] = dArr[i10 + i12];
        }
        return this;
    }
}
