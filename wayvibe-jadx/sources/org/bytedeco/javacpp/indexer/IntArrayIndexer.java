package org.bytedeco.javacpp.indexer;

import V0.p;

/* JADX INFO: loaded from: classes2.dex */
public class IntArrayIndexer extends IntIndexer {
    protected int[] array;

    public IntArrayIndexer(int[] iArr) {
        this(iArr, new long[]{iArr.length}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public int get(long j10) {
        return this.array[(int) j10];
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long j10, int i10) {
        this.array[(int) j10] = i10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer, org.bytedeco.javacpp.indexer.Indexer
    public /* bridge */ /* synthetic */ Indexer putDouble(long[] jArr, double d10) {
        return super.putDouble(jArr, d10);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.array = null;
    }

    public IntArrayIndexer(int[] iArr, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.array = iArr;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public int[] array() {
        return this.array;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer get(long j10, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = this.array[(((int) j10) * ((int) this.strides[0])) + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long j10, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[(((int) j10) * ((int) this.strides[0])) + i12] = iArr[i10 + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public int get(long j10, long j11) {
        return this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)];
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long j10, long j11, int i10) {
        this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)] = i10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer get(long j10, long j11, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int[] iArr2 = this.array;
            long[] jArr = this.strides;
            iArr[i10 + i12] = iArr2[p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12)];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long j10, long j11, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int[] iArr2 = this.array;
            long[] jArr = this.strides;
            iArr2[p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12)] = iArr[i10 + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public int get(long j10, long j11, long j12) {
        int[] iArr = this.array;
        long[] jArr = this.strides;
        return iArr[(((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)];
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long j10, long j11, long j12, int i10) {
        int[] iArr = this.array;
        long[] jArr = this.strides;
        iArr[(((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)] = i10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public int get(long... jArr) {
        return this.array[(int) index(jArr)];
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long[] jArr, int i10) {
        this.array[(int) index(jArr)] = i10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer get(long[] jArr, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = this.array[((int) index(jArr)) + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long[] jArr, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[((int) index(jArr)) + i12] = iArr[i10 + i12];
        }
        return this;
    }
}
