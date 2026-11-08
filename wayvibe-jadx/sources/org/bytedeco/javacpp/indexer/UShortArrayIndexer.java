package org.bytedeco.javacpp.indexer;

import V0.p;

/* JADX INFO: loaded from: classes2.dex */
public class UShortArrayIndexer extends UShortIndexer {
    protected short[] array;

    public UShortArrayIndexer(short[] sArr) {
        this(sArr, new long[]{sArr.length}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public int get(long j10) {
        return this.array[(int) j10] & 65535;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public UShortIndexer put(long j10, int i10) {
        this.array[(int) j10] = (short) i10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer, org.bytedeco.javacpp.indexer.Indexer
    public /* bridge */ /* synthetic */ Indexer putDouble(long[] jArr, double d10) {
        return super.putDouble(jArr, d10);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.array = null;
    }

    public UShortArrayIndexer(short[] sArr, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.array = sArr;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public short[] array() {
        return this.array;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public UShortIndexer get(long j10, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = this.array[(((int) j10) * ((int) this.strides[0])) + i12] & 65535;
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public UShortIndexer put(long j10, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[(((int) j10) * ((int) this.strides[0])) + i12] = (short) iArr[i10 + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public int get(long j10, long j11) {
        return this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)] & 65535;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public UShortIndexer put(long j10, long j11, int i10) {
        this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)] = (short) i10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public UShortIndexer get(long j10, long j11, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            short[] sArr = this.array;
            long[] jArr = this.strides;
            iArr[i10 + i12] = sArr[p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12)] & 65535;
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public UShortIndexer put(long j10, long j11, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            short[] sArr = this.array;
            long[] jArr = this.strides;
            sArr[p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12)] = (short) iArr[i10 + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public int get(long j10, long j11, long j12) {
        short[] sArr = this.array;
        long[] jArr = this.strides;
        return sArr[(((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)] & 65535;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public UShortIndexer put(long j10, long j11, long j12, int i10) {
        short[] sArr = this.array;
        long[] jArr = this.strides;
        sArr[(((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)] = (short) i10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public int get(long... jArr) {
        return this.array[(int) index(jArr)] & 65535;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public UShortIndexer put(long[] jArr, int i10) {
        this.array[(int) index(jArr)] = (short) i10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public UShortIndexer get(long[] jArr, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = this.array[((int) index(jArr)) + i12] & 65535;
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public UShortIndexer put(long[] jArr, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[((int) index(jArr)) + i12] = (short) iArr[i10 + i12];
        }
        return this;
    }
}
