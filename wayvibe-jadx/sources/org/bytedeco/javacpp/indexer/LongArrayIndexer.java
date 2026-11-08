package org.bytedeco.javacpp.indexer;

import V0.p;

/* JADX INFO: loaded from: classes2.dex */
public class LongArrayIndexer extends LongIndexer {
    protected long[] array;

    public LongArrayIndexer(long[] jArr) {
        this(jArr, new long[]{jArr.length}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public long get(long j10) {
        return this.array[(int) j10];
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long j10, long j11) {
        this.array[(int) j10] = j11;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer, org.bytedeco.javacpp.indexer.Indexer
    public /* bridge */ /* synthetic */ Indexer putDouble(long[] jArr, double d10) {
        return super.putDouble(jArr, d10);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.array = null;
    }

    public LongArrayIndexer(long[] jArr, long[] jArr2, long[] jArr3) {
        super(jArr2, jArr3);
        this.array = jArr;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public long[] array() {
        return this.array;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer get(long j10, long[] jArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            jArr[i10 + i12] = this.array[(((int) j10) * ((int) this.strides[0])) + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long j10, long[] jArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[(((int) j10) * ((int) this.strides[0])) + i12] = jArr[i10 + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public long get(long j10, long j11) {
        return this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)];
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long j10, long j11, long j12) {
        this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)] = j12;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer get(long j10, long j11, long[] jArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr2 = this.array;
            long[] jArr3 = this.strides;
            jArr[i10 + i12] = jArr2[p.A((int) j11, (int) jArr3[1], ((int) j10) * ((int) jArr3[0]), i12)];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long j10, long j11, long[] jArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr2 = this.array;
            long[] jArr3 = this.strides;
            jArr2[p.A((int) j11, (int) jArr3[1], ((int) j10) * ((int) jArr3[0]), i12)] = jArr[i10 + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public long get(long j10, long j11, long j12) {
        long[] jArr = this.array;
        long[] jArr2 = this.strides;
        return jArr[(((int) j11) * ((int) jArr2[1])) + (((int) j10) * ((int) jArr2[0])) + ((int) j12)];
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long j10, long j11, long j12, long j13) {
        long[] jArr = this.array;
        long[] jArr2 = this.strides;
        jArr[(((int) j11) * ((int) jArr2[1])) + (((int) j10) * ((int) jArr2[0])) + ((int) j12)] = j13;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public long get(long... jArr) {
        return this.array[(int) index(jArr)];
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long[] jArr, long j10) {
        this.array[(int) index(jArr)] = j10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer get(long[] jArr, long[] jArr2, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            jArr2[i10 + i12] = this.array[((int) index(jArr)) + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long[] jArr, long[] jArr2, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[((int) index(jArr)) + i12] = jArr2[i10 + i12];
        }
        return this;
    }
}
