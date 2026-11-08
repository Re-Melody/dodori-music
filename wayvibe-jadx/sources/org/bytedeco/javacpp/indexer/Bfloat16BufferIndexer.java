package org.bytedeco.javacpp.indexer;

import V0.p;
import java.nio.Buffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class Bfloat16BufferIndexer extends Bfloat16Indexer {
    protected ShortBuffer buffer;

    public Bfloat16BufferIndexer(ShortBuffer shortBuffer) {
        this(shortBuffer, new long[]{shortBuffer.limit()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Buffer buffer() {
        return this.buffer;
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public float get(long j10) {
        return Bfloat16Indexer.toFloat(this.buffer.get((int) j10));
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public Bfloat16Indexer put(long j10, float f10) {
        this.buffer.put((int) j10, (short) Bfloat16Indexer.fromFloat(f10));
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.buffer = null;
    }

    public Bfloat16BufferIndexer(ShortBuffer shortBuffer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.buffer = shortBuffer;
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public Bfloat16Indexer get(long j10, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i10 + i12] = Bfloat16Indexer.toFloat(this.buffer.get((((int) j10) * ((int) this.strides[0])) + i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public Bfloat16Indexer put(long j10, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put((((int) j10) * ((int) this.strides[0])) + i12, (short) Bfloat16Indexer.fromFloat(fArr[i10 + i12]));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public float get(long j10, long j11) {
        return Bfloat16Indexer.toFloat(this.buffer.get((((int) j10) * ((int) this.strides[0])) + ((int) j11)));
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public Bfloat16Indexer put(long j10, long j11, float f10) {
        this.buffer.put((((int) j10) * ((int) this.strides[0])) + ((int) j11), (short) Bfloat16Indexer.fromFloat(f10));
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public Bfloat16Indexer get(long j10, long j11, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            ShortBuffer shortBuffer = this.buffer;
            long[] jArr = this.strides;
            fArr[i10 + i12] = Bfloat16Indexer.toFloat(shortBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public Bfloat16Indexer put(long j10, long j11, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            ShortBuffer shortBuffer = this.buffer;
            long[] jArr = this.strides;
            shortBuffer.put(p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12), (short) Bfloat16Indexer.fromFloat(fArr[i10 + i12]));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public float get(long j10, long j11, long j12) {
        ShortBuffer shortBuffer = this.buffer;
        long[] jArr = this.strides;
        return Bfloat16Indexer.toFloat(shortBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)));
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public Bfloat16Indexer put(long j10, long j11, long j12, float f10) {
        ShortBuffer shortBuffer = this.buffer;
        long[] jArr = this.strides;
        shortBuffer.put((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12), (short) Bfloat16Indexer.fromFloat(f10));
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public float get(long... jArr) {
        return Bfloat16Indexer.toFloat(this.buffer.get((int) index(jArr)));
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public Bfloat16Indexer put(long[] jArr, float f10) {
        this.buffer.put((int) index(jArr), (short) Bfloat16Indexer.fromFloat(f10));
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public Bfloat16Indexer get(long[] jArr, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i10 + i12] = Bfloat16Indexer.toFloat(this.buffer.get(((int) index(jArr)) + i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Bfloat16Indexer
    public Bfloat16Indexer put(long[] jArr, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put(((int) index(jArr)) + i12, (short) Bfloat16Indexer.fromFloat(fArr[i10 + i12]));
        }
        return this;
    }
}
