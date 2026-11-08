package org.bytedeco.javacpp.indexer;

import org.bytedeco.javacpp.LongPointer;
import org.bytedeco.javacpp.Pointer;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public class LongRawIndexer extends LongIndexer {
    protected static final Raw RAW = Raw.getInstance();
    final long base;
    protected LongPointer pointer;
    final long size;

    public LongRawIndexer(LongPointer longPointer) {
        this(longPointer, new long[]{longPointer.limit() - longPointer.position()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public long get(long j10) {
        return RAW.getLong((Indexer.checkIndex(j10, this.size) * 8) + this.base);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Pointer pointer() {
        return this.pointer;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long j10, long j11) {
        RAW.putLong((Indexer.checkIndex(j10, this.size) * 8) + this.base, j11);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.pointer = null;
    }

    public LongRawIndexer(LongPointer longPointer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.pointer = longPointer;
        this.base = (longPointer.position() * 8) + longPointer.address();
        this.size = longPointer.limit() - longPointer.position();
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer get(long j10, long[] jArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            jArr[i10 + i12] = get((this.strides[0] * j10) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long j10, long[] jArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            put((this.strides[0] * j10) + ((long) i12), jArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public long get(long j10, long j11) {
        return get((j10 * this.strides[0]) + j11);
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long j10, long j11, long j12) {
        put((j10 * this.strides[0]) + j11, j12);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer get(long j10, long j11, long[] jArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr2 = this.strides;
            jArr[i10 + i12] = get((jArr2[1] * j11) + (jArr2[0] * j10) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long j10, long j11, long[] jArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr2 = this.strides;
            put((jArr2[1] * j11) + (jArr2[0] * j10) + ((long) i12), jArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public long get(long j10, long j11, long j12) {
        long[] jArr = this.strides;
        return get(b.h(j11, jArr[1], j10 * jArr[0], j12));
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long j10, long j11, long j12, long j13) {
        long[] jArr = this.strides;
        put(b.h(j11, jArr[1], j10 * jArr[0], j12), j13);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public long get(long... jArr) {
        return get(index(jArr));
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long[] jArr, long j10) {
        put(index(jArr), j10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer get(long[] jArr, long[] jArr2, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            jArr2[i10 + i12] = get(index(jArr) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long[] jArr, long[] jArr2, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            put(index(jArr) + ((long) i12), jArr2[i10 + i12]);
        }
        return this;
    }
}
