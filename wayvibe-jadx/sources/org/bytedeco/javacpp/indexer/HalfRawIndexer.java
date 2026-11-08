package org.bytedeco.javacpp.indexer;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.ShortPointer;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public class HalfRawIndexer extends HalfIndexer {
    protected static final Raw RAW = Raw.getInstance();
    final long base;
    protected ShortPointer pointer;
    final long size;

    public HalfRawIndexer(ShortPointer shortPointer) {
        this(shortPointer, new long[]{shortPointer.limit() - shortPointer.position()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public float get(long j10) {
        return HalfIndexer.toFloat(RAW.getShort((Indexer.checkIndex(j10, this.size) * 2) + this.base));
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Pointer pointer() {
        return this.pointer;
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public HalfIndexer put(long j10, float f10) {
        RAW.putShort((Indexer.checkIndex(j10, this.size) * 2) + this.base, (short) HalfIndexer.fromFloat(f10));
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.pointer = null;
    }

    public HalfRawIndexer(ShortPointer shortPointer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.pointer = shortPointer;
        this.base = (shortPointer.position() * 2) + shortPointer.address();
        this.size = shortPointer.limit() - shortPointer.position();
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public HalfIndexer get(long j10, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i10 + i12] = get((this.strides[0] * j10) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public HalfIndexer put(long j10, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            put((this.strides[0] * j10) + ((long) i12), fArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public float get(long j10, long j11) {
        return get((j10 * this.strides[0]) + j11);
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public HalfIndexer put(long j10, long j11, float f10) {
        put((j10 * this.strides[0]) + j11, f10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public HalfIndexer get(long j10, long j11, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr = this.strides;
            fArr[i10 + i12] = get((jArr[1] * j11) + (jArr[0] * j10) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public HalfIndexer put(long j10, long j11, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr = this.strides;
            put((jArr[1] * j11) + (jArr[0] * j10) + ((long) i12), fArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public float get(long j10, long j11, long j12) {
        long[] jArr = this.strides;
        return get(b.h(j11, jArr[1], j10 * jArr[0], j12));
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public HalfIndexer put(long j10, long j11, long j12, float f10) {
        long[] jArr = this.strides;
        put(b.h(j11, jArr[1], j10 * jArr[0], j12), f10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public float get(long... jArr) {
        return get(index(jArr));
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public HalfIndexer put(long[] jArr, float f10) {
        put(index(jArr), f10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public HalfIndexer get(long[] jArr, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i10 + i12] = get(index(jArr) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public HalfIndexer put(long[] jArr, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            put(index(jArr) + ((long) i12), fArr[i10 + i12]);
        }
        return this;
    }
}
