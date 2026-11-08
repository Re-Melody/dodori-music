package org.bytedeco.javacpp.indexer;

import V0.p;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class FloatBufferIndexer extends FloatIndexer {
    protected FloatBuffer buffer;

    public FloatBufferIndexer(FloatBuffer floatBuffer) {
        this(floatBuffer, new long[]{floatBuffer.limit()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Buffer buffer() {
        return this.buffer;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public float get(long j10) {
        return this.buffer.get((int) j10);
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long j10, float f10) {
        this.buffer.put((int) j10, f10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.buffer = null;
    }

    public FloatBufferIndexer(FloatBuffer floatBuffer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.buffer = floatBuffer;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer get(long j10, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i10 + i12] = this.buffer.get((((int) j10) * ((int) this.strides[0])) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long j10, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put((((int) j10) * ((int) this.strides[0])) + i12, fArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public float get(long j10, long j11) {
        return this.buffer.get((((int) j10) * ((int) this.strides[0])) + ((int) j11));
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long j10, long j11, float f10) {
        this.buffer.put((((int) j10) * ((int) this.strides[0])) + ((int) j11), f10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer get(long j10, long j11, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            FloatBuffer floatBuffer = this.buffer;
            long[] jArr = this.strides;
            fArr[i10 + i12] = floatBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long j10, long j11, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            FloatBuffer floatBuffer = this.buffer;
            long[] jArr = this.strides;
            floatBuffer.put(p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12), fArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public float get(long j10, long j11, long j12) {
        FloatBuffer floatBuffer = this.buffer;
        long[] jArr = this.strides;
        return floatBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12));
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long j10, long j11, long j12, float f10) {
        FloatBuffer floatBuffer = this.buffer;
        long[] jArr = this.strides;
        floatBuffer.put((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12), f10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public float get(long... jArr) {
        return this.buffer.get((int) index(jArr));
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long[] jArr, float f10) {
        this.buffer.put((int) index(jArr), f10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer get(long[] jArr, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i10 + i12] = this.buffer.get(((int) index(jArr)) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long[] jArr, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put(((int) index(jArr)) + i12, fArr[i10 + i12]);
        }
        return this;
    }
}
