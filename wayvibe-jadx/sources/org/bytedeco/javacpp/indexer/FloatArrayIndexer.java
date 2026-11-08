package org.bytedeco.javacpp.indexer;

import V0.p;

/* JADX INFO: loaded from: classes2.dex */
public class FloatArrayIndexer extends FloatIndexer {
    protected float[] array;

    public FloatArrayIndexer(float[] fArr) {
        this(fArr, new long[]{fArr.length}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public float get(long j10) {
        return this.array[(int) j10];
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long j10, float f10) {
        this.array[(int) j10] = f10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer, org.bytedeco.javacpp.indexer.Indexer
    public /* bridge */ /* synthetic */ Indexer putDouble(long[] jArr, double d10) {
        return super.putDouble(jArr, d10);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.array = null;
    }

    public FloatArrayIndexer(float[] fArr, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.array = fArr;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public float[] array() {
        return this.array;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer get(long j10, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i10 + i12] = this.array[(((int) j10) * ((int) this.strides[0])) + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long j10, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[(((int) j10) * ((int) this.strides[0])) + i12] = fArr[i10 + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public float get(long j10, long j11) {
        return this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)];
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long j10, long j11, float f10) {
        this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)] = f10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer get(long j10, long j11, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            float[] fArr2 = this.array;
            long[] jArr = this.strides;
            fArr[i10 + i12] = fArr2[p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12)];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long j10, long j11, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            float[] fArr2 = this.array;
            long[] jArr = this.strides;
            fArr2[p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12)] = fArr[i10 + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public float get(long j10, long j11, long j12) {
        float[] fArr = this.array;
        long[] jArr = this.strides;
        return fArr[(((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)];
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long j10, long j11, long j12, float f10) {
        float[] fArr = this.array;
        long[] jArr = this.strides;
        fArr[(((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)] = f10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public float get(long... jArr) {
        return this.array[(int) index(jArr)];
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long[] jArr, float f10) {
        this.array[(int) index(jArr)] = f10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer get(long[] jArr, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i10 + i12] = this.array[((int) index(jArr)) + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long[] jArr, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[((int) index(jArr)) + i12] = fArr[i10 + i12];
        }
        return this;
    }
}
