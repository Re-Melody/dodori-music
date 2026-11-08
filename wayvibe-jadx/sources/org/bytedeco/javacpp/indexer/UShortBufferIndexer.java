package org.bytedeco.javacpp.indexer;

import V0.p;
import java.nio.Buffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class UShortBufferIndexer extends UShortIndexer {
    protected ShortBuffer buffer;

    public UShortBufferIndexer(ShortBuffer shortBuffer) {
        this(shortBuffer, new long[]{shortBuffer.limit()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Buffer buffer() {
        return this.buffer;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public int get(long j10) {
        return this.buffer.get((int) j10) & 65535;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public UShortIndexer put(long j10, int i10) {
        this.buffer.put((int) j10, (short) i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.buffer = null;
    }

    public UShortBufferIndexer(ShortBuffer shortBuffer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.buffer = shortBuffer;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public UShortIndexer get(long j10, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = this.buffer.get((((int) j10) * ((int) this.strides[0])) + i12) & 65535;
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public UShortIndexer put(long j10, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put((((int) j10) * ((int) this.strides[0])) + i12, (short) iArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public int get(long j10, long j11) {
        return this.buffer.get((((int) j10) * ((int) this.strides[0])) + ((int) j11)) & 65535;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public UShortIndexer put(long j10, long j11, int i10) {
        this.buffer.put((((int) j10) * ((int) this.strides[0])) + ((int) j11), (short) i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public UShortIndexer get(long j10, long j11, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            ShortBuffer shortBuffer = this.buffer;
            long[] jArr = this.strides;
            iArr[i10 + i12] = shortBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + i12) & 65535;
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public UShortIndexer put(long j10, long j11, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            ShortBuffer shortBuffer = this.buffer;
            long[] jArr = this.strides;
            shortBuffer.put(p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12), (short) iArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public int get(long j10, long j11, long j12) {
        ShortBuffer shortBuffer = this.buffer;
        long[] jArr = this.strides;
        return shortBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)) & 65535;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public UShortIndexer put(long j10, long j11, long j12, int i10) {
        ShortBuffer shortBuffer = this.buffer;
        long[] jArr = this.strides;
        shortBuffer.put((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12), (short) i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public int get(long... jArr) {
        return this.buffer.get((int) index(jArr)) & 65535;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public UShortIndexer put(long[] jArr, int i10) {
        this.buffer.put((int) index(jArr), (short) i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public UShortIndexer get(long[] jArr, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = this.buffer.get(((int) index(jArr)) + i12) & 65535;
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UShortIndexer
    public UShortIndexer put(long[] jArr, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put(((int) index(jArr)) + i12, (short) iArr[i10 + i12]);
        }
        return this;
    }
}
