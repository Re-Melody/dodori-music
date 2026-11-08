package org.bytedeco.javacpp.indexer;

import V0.p;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes2.dex */
public class UByteBufferIndexer extends UByteIndexer {
    protected ByteBuffer buffer;

    public UByteBufferIndexer(ByteBuffer byteBuffer) {
        this(byteBuffer, new long[]{byteBuffer.limit()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Buffer buffer() {
        return this.buffer;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public int get(long j10) {
        return this.buffer.get((int) j10) & ForkServer.ERROR;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long j10, int i10) {
        this.buffer.put((int) j10, (byte) i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.buffer = null;
    }

    public UByteBufferIndexer(ByteBuffer byteBuffer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.buffer = byteBuffer;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer get(long j10, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = this.buffer.get((((int) j10) * ((int) this.strides[0])) + i12) & ForkServer.ERROR;
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long j10, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put((((int) j10) * ((int) this.strides[0])) + i12, (byte) iArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public int get(long j10, long j11) {
        return this.buffer.get((((int) j10) * ((int) this.strides[0])) + ((int) j11)) & ForkServer.ERROR;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long j10, long j11, int i10) {
        this.buffer.put((((int) j10) * ((int) this.strides[0])) + ((int) j11), (byte) i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer get(long j10, long j11, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            ByteBuffer byteBuffer = this.buffer;
            long[] jArr = this.strides;
            iArr[i10 + i12] = byteBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + i12) & ForkServer.ERROR;
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long j10, long j11, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            ByteBuffer byteBuffer = this.buffer;
            long[] jArr = this.strides;
            byteBuffer.put(p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12), (byte) iArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public int get(long j10, long j11, long j12) {
        ByteBuffer byteBuffer = this.buffer;
        long[] jArr = this.strides;
        return byteBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)) & ForkServer.ERROR;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long j10, long j11, long j12, int i10) {
        ByteBuffer byteBuffer = this.buffer;
        long[] jArr = this.strides;
        byteBuffer.put((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12), (byte) i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public int get(long... jArr) {
        return this.buffer.get((int) index(jArr)) & ForkServer.ERROR;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long[] jArr, int i10) {
        this.buffer.put((int) index(jArr), (byte) i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer get(long[] jArr, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = this.buffer.get(((int) index(jArr)) + i12) & ForkServer.ERROR;
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long[] jArr, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put(((int) index(jArr)) + i12, (byte) iArr[i10 + i12]);
        }
        return this;
    }
}
