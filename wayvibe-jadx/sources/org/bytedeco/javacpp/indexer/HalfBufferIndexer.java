package org.bytedeco.javacpp.indexer;

import V0.p;
import java.nio.Buffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class HalfBufferIndexer extends HalfIndexer {
    protected ShortBuffer buffer;

    public HalfBufferIndexer(ShortBuffer shortBuffer) {
        this(shortBuffer, new long[]{shortBuffer.limit()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Buffer buffer() {
        return this.buffer;
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public float get(long j10) {
        return HalfIndexer.toFloat(this.buffer.get((int) j10));
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public HalfIndexer put(long j10, float f10) {
        this.buffer.put((int) j10, (short) HalfIndexer.fromFloat(f10));
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.buffer = null;
    }

    public HalfBufferIndexer(ShortBuffer shortBuffer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.buffer = shortBuffer;
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public HalfIndexer get(long j10, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i10 + i12] = HalfIndexer.toFloat(this.buffer.get((((int) j10) * ((int) this.strides[0])) + i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public HalfIndexer put(long j10, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put((((int) j10) * ((int) this.strides[0])) + i12, (short) HalfIndexer.fromFloat(fArr[i10 + i12]));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public float get(long j10, long j11) {
        return HalfIndexer.toFloat(this.buffer.get((((int) j10) * ((int) this.strides[0])) + ((int) j11)));
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public HalfIndexer put(long j10, long j11, float f10) {
        this.buffer.put((((int) j10) * ((int) this.strides[0])) + ((int) j11), (short) HalfIndexer.fromFloat(f10));
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public HalfIndexer get(long j10, long j11, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            ShortBuffer shortBuffer = this.buffer;
            long[] jArr = this.strides;
            fArr[i10 + i12] = HalfIndexer.toFloat(shortBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public HalfIndexer put(long j10, long j11, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            ShortBuffer shortBuffer = this.buffer;
            long[] jArr = this.strides;
            shortBuffer.put(p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12), (short) HalfIndexer.fromFloat(fArr[i10 + i12]));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public float get(long j10, long j11, long j12) {
        ShortBuffer shortBuffer = this.buffer;
        long[] jArr = this.strides;
        return HalfIndexer.toFloat(shortBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)));
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public HalfIndexer put(long j10, long j11, long j12, float f10) {
        ShortBuffer shortBuffer = this.buffer;
        long[] jArr = this.strides;
        shortBuffer.put((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12), (short) HalfIndexer.fromFloat(f10));
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public float get(long... jArr) {
        return HalfIndexer.toFloat(this.buffer.get((int) index(jArr)));
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public HalfIndexer put(long[] jArr, float f10) {
        this.buffer.put((int) index(jArr), (short) HalfIndexer.fromFloat(f10));
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public HalfIndexer get(long[] jArr, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i10 + i12] = HalfIndexer.toFloat(this.buffer.get(((int) index(jArr)) + i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.HalfIndexer
    public HalfIndexer put(long[] jArr, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put(((int) index(jArr)) + i12, (short) HalfIndexer.fromFloat(fArr[i10 + i12]));
        }
        return this;
    }
}
