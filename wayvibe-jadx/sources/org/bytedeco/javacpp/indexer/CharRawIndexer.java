package org.bytedeco.javacpp.indexer;

import org.bytedeco.javacpp.CharPointer;
import org.bytedeco.javacpp.Pointer;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public class CharRawIndexer extends CharIndexer {
    protected static final Raw RAW = Raw.getInstance();
    final long base;
    protected CharPointer pointer;
    final long size;

    public CharRawIndexer(CharPointer charPointer) {
        this(charPointer, new long[]{charPointer.limit() - charPointer.position()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public char get(long j10) {
        return RAW.getChar((Indexer.checkIndex(j10, this.size) * 2) + this.base);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Pointer pointer() {
        return this.pointer;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long j10, char c3) {
        RAW.putChar((Indexer.checkIndex(j10, this.size) * 2) + this.base, c3);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.pointer = null;
    }

    public CharRawIndexer(CharPointer charPointer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.pointer = charPointer;
        this.base = (charPointer.position() * 2) + charPointer.address();
        this.size = charPointer.limit() - charPointer.position();
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer get(long j10, char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            cArr[i10 + i12] = get((this.strides[0] * j10) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long j10, char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            put((this.strides[0] * j10) + ((long) i12), cArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public char get(long j10, long j11) {
        return get((j10 * this.strides[0]) + j11);
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long j10, long j11, char c3) {
        put((j10 * this.strides[0]) + j11, c3);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer get(long j10, long j11, char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr = this.strides;
            cArr[i10 + i12] = get((jArr[1] * j11) + (jArr[0] * j10) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long j10, long j11, char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr = this.strides;
            put((jArr[1] * j11) + (jArr[0] * j10) + ((long) i12), cArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public char get(long j10, long j11, long j12) {
        long[] jArr = this.strides;
        return get(b.h(j11, jArr[1], j10 * jArr[0], j12));
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long j10, long j11, long j12, char c3) {
        long[] jArr = this.strides;
        put(b.h(j11, jArr[1], j10 * jArr[0], j12), c3);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public char get(long... jArr) {
        return get(index(jArr));
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long[] jArr, char c3) {
        put(index(jArr), c3);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer get(long[] jArr, char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            cArr[i10 + i12] = get(index(jArr) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long[] jArr, char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            put(index(jArr) + ((long) i12), cArr[i10 + i12]);
        }
        return this;
    }
}
