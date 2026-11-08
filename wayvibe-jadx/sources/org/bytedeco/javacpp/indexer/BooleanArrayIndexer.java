package org.bytedeco.javacpp.indexer;

import V0.p;

/* JADX INFO: loaded from: classes2.dex */
public class BooleanArrayIndexer extends BooleanIndexer {
    protected boolean[] array;

    public BooleanArrayIndexer(boolean[] zArr) {
        this(zArr, new long[]{zArr.length}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public boolean get(long j10) {
        return this.array[(int) j10];
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long j10, boolean z10) {
        this.array[(int) j10] = z10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer, org.bytedeco.javacpp.indexer.Indexer
    public /* bridge */ /* synthetic */ Indexer putDouble(long[] jArr, double d10) {
        return super.putDouble(jArr, d10);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.array = null;
    }

    public BooleanArrayIndexer(boolean[] zArr, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.array = zArr;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public boolean[] array() {
        return this.array;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer get(long j10, boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            zArr[i10 + i12] = this.array[(((int) j10) * ((int) this.strides[0])) + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long j10, boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[(((int) j10) * ((int) this.strides[0])) + i12] = zArr[i10 + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public boolean get(long j10, long j11) {
        return this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)];
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long j10, long j11, boolean z10) {
        this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)] = z10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer get(long j10, long j11, boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            boolean[] zArr2 = this.array;
            long[] jArr = this.strides;
            zArr[i10 + i12] = zArr2[p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12)];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long j10, long j11, boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            boolean[] zArr2 = this.array;
            long[] jArr = this.strides;
            zArr2[p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12)] = zArr[i10 + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public boolean get(long j10, long j11, long j12) {
        boolean[] zArr = this.array;
        long[] jArr = this.strides;
        return zArr[(((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)];
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long j10, long j11, long j12, boolean z10) {
        boolean[] zArr = this.array;
        long[] jArr = this.strides;
        zArr[(((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)] = z10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public boolean get(long... jArr) {
        return this.array[(int) index(jArr)];
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long[] jArr, boolean z10) {
        this.array[(int) index(jArr)] = z10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer get(long[] jArr, boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            zArr[i10 + i12] = this.array[((int) index(jArr)) + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long[] jArr, boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[((int) index(jArr)) + i12] = zArr[i10 + i12];
        }
        return this;
    }
}
