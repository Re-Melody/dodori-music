package org.bytedeco.javacpp.indexer;

import org.bytedeco.javacpp.DoublePointer;
import org.bytedeco.javacpp.Pointer;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public class DoubleRawIndexer extends DoubleIndexer {
    protected static final Raw RAW = Raw.getInstance();
    final long base;
    protected DoublePointer pointer;
    final long size;

    public DoubleRawIndexer(DoublePointer doublePointer) {
        this(doublePointer, new long[]{doublePointer.limit() - doublePointer.position()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public double get(long j10) {
        return RAW.getDouble((Indexer.checkIndex(j10, this.size) * 8) + this.base);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Pointer pointer() {
        return this.pointer;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long j10, double d10) {
        RAW.putDouble((Indexer.checkIndex(j10, this.size) * 8) + this.base, d10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.pointer = null;
    }

    public DoubleRawIndexer(DoublePointer doublePointer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.pointer = doublePointer;
        this.base = (doublePointer.position() * 8) + doublePointer.address();
        this.size = doublePointer.limit() - doublePointer.position();
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer get(long j10, double[] dArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            dArr[i10 + i12] = get((this.strides[0] * j10) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long j10, double[] dArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            put((this.strides[0] * j10) + ((long) i12), dArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public double get(long j10, long j11) {
        return get((j10 * this.strides[0]) + j11);
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long j10, long j11, double d10) {
        put((j10 * this.strides[0]) + j11, d10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer get(long j10, long j11, double[] dArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr = this.strides;
            dArr[i10 + i12] = get((jArr[1] * j11) + (jArr[0] * j10) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long j10, long j11, double[] dArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr = this.strides;
            put((jArr[1] * j11) + (jArr[0] * j10) + ((long) i12), dArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public double get(long j10, long j11, long j12) {
        long[] jArr = this.strides;
        return get(b.h(j11, jArr[1], j10 * jArr[0], j12));
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long j10, long j11, long j12, double d10) {
        long[] jArr = this.strides;
        put(b.h(j11, jArr[1], j10 * jArr[0], j12), d10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public double get(long... jArr) {
        return get(index(jArr));
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long[] jArr, double d10) {
        put(index(jArr), d10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer get(long[] jArr, double[] dArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            dArr[i10 + i12] = get(index(jArr) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long[] jArr, double[] dArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            put(index(jArr) + ((long) i12), dArr[i10 + i12]);
        }
        return this;
    }
}
