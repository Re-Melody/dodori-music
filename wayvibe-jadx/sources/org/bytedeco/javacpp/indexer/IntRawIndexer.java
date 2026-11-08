package org.bytedeco.javacpp.indexer;

import org.bytedeco.javacpp.IntPointer;
import org.bytedeco.javacpp.Pointer;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public class IntRawIndexer extends IntIndexer {
    protected static final Raw RAW = Raw.getInstance();
    final long base;
    protected IntPointer pointer;
    final long size;

    public IntRawIndexer(IntPointer intPointer) {
        this(intPointer, new long[]{intPointer.limit() - intPointer.position()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public int get(long j10) {
        return RAW.getInt((Indexer.checkIndex(j10, this.size) * 4) + this.base);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Pointer pointer() {
        return this.pointer;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long j10, int i10) {
        RAW.putInt((Indexer.checkIndex(j10, this.size) * 4) + this.base, i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.pointer = null;
    }

    public IntRawIndexer(IntPointer intPointer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.pointer = intPointer;
        this.base = (intPointer.position() * 4) + intPointer.address();
        this.size = intPointer.limit() - intPointer.position();
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer get(long j10, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = get((this.strides[0] * j10) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long j10, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            put((this.strides[0] * j10) + ((long) i12), iArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public int get(long j10, long j11) {
        return get((j10 * this.strides[0]) + j11);
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long j10, long j11, int i10) {
        put((j10 * this.strides[0]) + j11, i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer get(long j10, long j11, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr = this.strides;
            iArr[i10 + i12] = get((jArr[1] * j11) + (jArr[0] * j10) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long j10, long j11, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr = this.strides;
            put((jArr[1] * j11) + (jArr[0] * j10) + ((long) i12), iArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public int get(long j10, long j11, long j12) {
        long[] jArr = this.strides;
        return get(b.h(j11, jArr[1], j10 * jArr[0], j12));
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long j10, long j11, long j12, int i10) {
        long[] jArr = this.strides;
        put(b.h(j11, jArr[1], j10 * jArr[0], j12), i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public int get(long... jArr) {
        return get(index(jArr));
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long[] jArr, int i10) {
        put(index(jArr), i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer get(long[] jArr, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = get(index(jArr) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long[] jArr, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            put(index(jArr) + ((long) i12), iArr[i10 + i12]);
        }
        return this;
    }
}
