package org.bytedeco.javacpp.indexer;

import V0.p;

/* JADX INFO: loaded from: classes2.dex */
public class Bfloat16ArrayIndexer extends Bfloat16Indexer {
    protected short[] array;

    public Bfloat16ArrayIndexer(short[] sArr) {
        this(sArr, new long[]{sArr.length}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public float get(long j10) {
        return Bfloat16Indexer.toFloat(this.array[(int) j10]);
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public Bfloat16Indexer put(long j10, float f10) {
        this.array[(int) j10] = (short) Bfloat16Indexer.fromFloat(f10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer, org.bytedeco.javacpp.indexer.Indexer
    public /* bridge */ /* synthetic */ Indexer putDouble(long[] jArr, double d10) {
        return super.putDouble(jArr, d10);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.array = null;
    }

    public Bfloat16ArrayIndexer(short[] sArr, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.array = sArr;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public short[] array() {
        return this.array;
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public Bfloat16Indexer get(long j10, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i10 + i12] = Bfloat16Indexer.toFloat(this.array[(((int) j10) * ((int) this.strides[0])) + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public Bfloat16Indexer put(long j10, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[(((int) j10) * ((int) this.strides[0])) + i12] = (short) Bfloat16Indexer.fromFloat(fArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public float get(long j10, long j11) {
        return Bfloat16Indexer.toFloat(this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)]);
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public Bfloat16Indexer put(long j10, long j11, float f10) {
        this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)] = (short) Bfloat16Indexer.fromFloat(f10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public Bfloat16Indexer get(long j10, long j11, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            short[] sArr = this.array;
            long[] jArr = this.strides;
            fArr[i10 + i12] = Bfloat16Indexer.toFloat(sArr[p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12)]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public Bfloat16Indexer put(long j10, long j11, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            short[] sArr = this.array;
            long[] jArr = this.strides;
            sArr[p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12)] = (short) Bfloat16Indexer.fromFloat(fArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public float get(long j10, long j11, long j12) {
        short[] sArr = this.array;
        long[] jArr = this.strides;
        return Bfloat16Indexer.toFloat(sArr[(((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)]);
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public Bfloat16Indexer put(long j10, long j11, long j12, float f10) {
        short[] sArr = this.array;
        long[] jArr = this.strides;
        sArr[(((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)] = (short) Bfloat16Indexer.fromFloat(f10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public float get(long... jArr) {
        return Bfloat16Indexer.toFloat(this.array[(int) index(jArr)]);
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public Bfloat16Indexer put(long[] jArr, float f10) {
        this.array[(int) index(jArr)] = (short) Bfloat16Indexer.fromFloat(f10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public Bfloat16Indexer get(long[] jArr, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i10 + i12] = Bfloat16Indexer.toFloat(this.array[((int) index(jArr)) + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public Bfloat16Indexer put(long[] jArr, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[((int) index(jArr)) + i12] = (short) Bfloat16Indexer.fromFloat(fArr[i10 + i12]);
        }
        return this;
    }
}
