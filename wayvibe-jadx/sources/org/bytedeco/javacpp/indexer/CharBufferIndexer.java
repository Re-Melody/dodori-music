package org.bytedeco.javacpp.indexer;

import V0.p;
import java.nio.Buffer;
import java.nio.CharBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class CharBufferIndexer extends CharIndexer {
    protected CharBuffer buffer;

    public CharBufferIndexer(CharBuffer charBuffer) {
        this(charBuffer, new long[]{charBuffer.limit()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Buffer buffer() {
        return this.buffer;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public char get(long j10) {
        return this.buffer.get((int) j10);
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long j10, char c3) {
        this.buffer.put((int) j10, c3);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.buffer = null;
    }

    public CharBufferIndexer(CharBuffer charBuffer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.buffer = charBuffer;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer get(long j10, char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            cArr[i10 + i12] = this.buffer.get((((int) j10) * ((int) this.strides[0])) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long j10, char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put((((int) j10) * ((int) this.strides[0])) + i12, cArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public char get(long j10, long j11) {
        return this.buffer.get((((int) j10) * ((int) this.strides[0])) + ((int) j11));
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long j10, long j11, char c3) {
        this.buffer.put((((int) j10) * ((int) this.strides[0])) + ((int) j11), c3);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer get(long j10, long j11, char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            CharBuffer charBuffer = this.buffer;
            long[] jArr = this.strides;
            cArr[i10 + i12] = charBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long j10, long j11, char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            CharBuffer charBuffer = this.buffer;
            long[] jArr = this.strides;
            charBuffer.put(p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12), cArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public char get(long j10, long j11, long j12) {
        CharBuffer charBuffer = this.buffer;
        long[] jArr = this.strides;
        return charBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12));
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long j10, long j11, long j12, char c3) {
        CharBuffer charBuffer = this.buffer;
        long[] jArr = this.strides;
        charBuffer.put((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12), c3);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public char get(long... jArr) {
        return this.buffer.get((int) index(jArr));
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long[] jArr, char c3) {
        this.buffer.put((int) index(jArr), c3);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer get(long[] jArr, char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            cArr[i10 + i12] = this.buffer.get(((int) index(jArr)) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.CharIndexer
    public CharIndexer put(long[] jArr, char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put(((int) index(jArr)) + i12, cArr[i10 + i12]);
        }
        return this;
    }
}
