package org.bytedeco.javacpp.indexer;

import V0.p;

/* JADX INFO: loaded from: classes2.dex */
public class CharArrayIndexer extends CharIndexer {
    protected char[] array;

    public CharArrayIndexer(char[] cArr) {
        this(cArr, new long[]{cArr.length}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public char get(long j10) {
        return this.array[(int) j10];
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long j10, char c3) {
        this.array[(int) j10] = c3;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer, org.bytedeco.javacpp.indexer.Indexer
    public /* bridge */ /* synthetic */ Indexer putDouble(long[] jArr, double d10) {
        return super.putDouble(jArr, d10);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.array = null;
    }

    public CharArrayIndexer(char[] cArr, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.array = cArr;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public char[] array() {
        return this.array;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer get(long j10, char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            cArr[i10 + i12] = this.array[(((int) j10) * ((int) this.strides[0])) + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long j10, char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[(((int) j10) * ((int) this.strides[0])) + i12] = cArr[i10 + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public char get(long j10, long j11) {
        return this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)];
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long j10, long j11, char c3) {
        this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)] = c3;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer get(long j10, long j11, char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char[] cArr2 = this.array;
            long[] jArr = this.strides;
            cArr[i10 + i12] = cArr2[p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12)];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long j10, long j11, char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char[] cArr2 = this.array;
            long[] jArr = this.strides;
            cArr2[p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12)] = cArr[i10 + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public char get(long j10, long j11, long j12) {
        char[] cArr = this.array;
        long[] jArr = this.strides;
        return cArr[(((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)];
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long j10, long j11, long j12, char c3) {
        char[] cArr = this.array;
        long[] jArr = this.strides;
        cArr[(((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)] = c3;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public char get(long... jArr) {
        return this.array[(int) index(jArr)];
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long[] jArr, char c3) {
        this.array[(int) index(jArr)] = c3;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer get(long[] jArr, char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            cArr[i10 + i12] = this.array[((int) index(jArr)) + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long[] jArr, char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[((int) index(jArr)) + i12] = cArr[i10 + i12];
        }
        return this;
    }
}
