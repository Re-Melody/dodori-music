package org.bytedeco.javacpp.indexer;

import org.bytedeco.javacpp.BooleanPointer;
import org.bytedeco.javacpp.Pointer;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public class BooleanRawIndexer extends BooleanIndexer {
    protected static final Raw RAW = Raw.getInstance();
    final long base;
    protected BooleanPointer pointer;
    final long size;

    public BooleanRawIndexer(BooleanPointer booleanPointer) {
        this(booleanPointer, new long[]{booleanPointer.limit() - booleanPointer.position()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public boolean get(long j10) {
        return RAW.getBoolean(Indexer.checkIndex(j10, this.size) + this.base);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Pointer pointer() {
        return this.pointer;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long j10, boolean z10) {
        RAW.putBoolean(Indexer.checkIndex(j10, this.size) + this.base, z10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.pointer = null;
    }

    public BooleanRawIndexer(BooleanPointer booleanPointer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.pointer = booleanPointer;
        this.base = booleanPointer.position() + booleanPointer.address();
        this.size = booleanPointer.limit() - booleanPointer.position();
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer get(long j10, boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            zArr[i10 + i12] = get((this.strides[0] * j10) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long j10, boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            put((this.strides[0] * j10) + ((long) i12), zArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public boolean get(long j10, long j11) {
        return get((j10 * this.strides[0]) + j11);
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long j10, long j11, boolean z10) {
        put((j10 * this.strides[0]) + j11, z10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer get(long j10, long j11, boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr = this.strides;
            zArr[i10 + i12] = get((jArr[1] * j11) + (jArr[0] * j10) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long j10, long j11, boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr = this.strides;
            put((jArr[1] * j11) + (jArr[0] * j10) + ((long) i12), zArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public boolean get(long j10, long j11, long j12) {
        long[] jArr = this.strides;
        return get(b.h(j11, jArr[1], j10 * jArr[0], j12));
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long j10, long j11, long j12, boolean z10) {
        long[] jArr = this.strides;
        put(b.h(j11, jArr[1], j10 * jArr[0], j12), z10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public boolean get(long... jArr) {
        return get(index(jArr));
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long[] jArr, boolean z10) {
        put(index(jArr), z10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer get(long[] jArr, boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            zArr[i10 + i12] = get(index(jArr) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long[] jArr, boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            put(index(jArr) + ((long) i12), zArr[i10 + i12]);
        }
        return this;
    }
}
