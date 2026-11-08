package org.bytedeco.javacpp.indexer;

import V0.p;
import java.nio.Buffer;
import java.nio.LongBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class LongBufferIndexer extends LongIndexer {
    protected LongBuffer buffer;

    public LongBufferIndexer(LongBuffer longBuffer) {
        this(longBuffer, new long[]{longBuffer.limit()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Buffer buffer() {
        return this.buffer;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public long get(long j10) {
        return this.buffer.get((int) j10);
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long j10, long j11) {
        this.buffer.put((int) j10, j11);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.buffer = null;
    }

    public LongBufferIndexer(LongBuffer longBuffer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.buffer = longBuffer;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer get(long j10, long[] jArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            jArr[i10 + i12] = this.buffer.get((((int) j10) * ((int) this.strides[0])) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long j10, long[] jArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put((((int) j10) * ((int) this.strides[0])) + i12, jArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public long get(long j10, long j11) {
        return this.buffer.get((((int) j10) * ((int) this.strides[0])) + ((int) j11));
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long j10, long j11, long j12) {
        this.buffer.put((((int) j10) * ((int) this.strides[0])) + ((int) j11), j12);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer get(long j10, long j11, long[] jArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            LongBuffer longBuffer = this.buffer;
            long[] jArr2 = this.strides;
            jArr[i10 + i12] = longBuffer.get((((int) j11) * ((int) jArr2[1])) + (((int) j10) * ((int) jArr2[0])) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long j10, long j11, long[] jArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            LongBuffer longBuffer = this.buffer;
            long[] jArr2 = this.strides;
            longBuffer.put(p.A((int) j11, (int) jArr2[1], ((int) j10) * ((int) jArr2[0]), i12), jArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public long get(long j10, long j11, long j12) {
        LongBuffer longBuffer = this.buffer;
        long[] jArr = this.strides;
        return longBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12));
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long j10, long j11, long j12, long j13) {
        LongBuffer longBuffer = this.buffer;
        long[] jArr = this.strides;
        longBuffer.put((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12), j13);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public long get(long... jArr) {
        return this.buffer.get((int) index(jArr));
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long[] jArr, long j10) {
        this.buffer.put((int) index(jArr), j10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer get(long[] jArr, long[] jArr2, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            jArr2[i10 + i12] = this.buffer.get(((int) index(jArr)) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.LongIndexer
    public LongIndexer put(long[] jArr, long[] jArr2, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put(((int) index(jArr)) + i12, jArr2[i10 + i12]);
        }
        return this;
    }
}
