package org.bytedeco.javacpp.indexer;

import V0.p;

/* JADX INFO: loaded from: classes2.dex */
public class ShortArrayIndexer extends ShortIndexer {
    protected short[] array;

    public ShortArrayIndexer(short[] sArr) {
        this(sArr, new long[]{sArr.length}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public short get(long j10) {
        return this.array[(int) j10];
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public ShortIndexer put(long j10, short s8) {
        this.array[(int) j10] = s8;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer, org.bytedeco.javacpp.indexer.Indexer
    public /* bridge */ /* synthetic */ Indexer putDouble(long[] jArr, double d10) {
        return super.putDouble(jArr, d10);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.array = null;
    }

    public ShortArrayIndexer(short[] sArr, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.array = sArr;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public short[] array() {
        return this.array;
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public ShortIndexer get(long j10, short[] sArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            sArr[i10 + i12] = this.array[(((int) j10) * ((int) this.strides[0])) + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public ShortIndexer put(long j10, short[] sArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[(((int) j10) * ((int) this.strides[0])) + i12] = sArr[i10 + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public short get(long j10, long j11) {
        return this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)];
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public ShortIndexer put(long j10, long j11, short s8) {
        this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)] = s8;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public ShortIndexer get(long j10, long j11, short[] sArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            short[] sArr2 = this.array;
            long[] jArr = this.strides;
            sArr[i10 + i12] = sArr2[p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12)];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public ShortIndexer put(long j10, long j11, short[] sArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            short[] sArr2 = this.array;
            long[] jArr = this.strides;
            sArr2[p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12)] = sArr[i10 + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public short get(long j10, long j11, long j12) {
        short[] sArr = this.array;
        long[] jArr = this.strides;
        return sArr[(((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)];
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public ShortIndexer put(long j10, long j11, long j12, short s8) {
        short[] sArr = this.array;
        long[] jArr = this.strides;
        sArr[(((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)] = s8;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public short get(long... jArr) {
        return this.array[(int) index(jArr)];
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public ShortIndexer put(long[] jArr, short s8) {
        this.array[(int) index(jArr)] = s8;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public ShortIndexer get(long[] jArr, short[] sArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            sArr[i10 + i12] = this.array[((int) index(jArr)) + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public ShortIndexer put(long[] jArr, short[] sArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[((int) index(jArr)) + i12] = sArr[i10 + i12];
        }
        return this;
    }
}
