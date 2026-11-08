package org.bytedeco.javacpp.indexer;

import V0.p;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes2.dex */
public class UByteArrayIndexer extends UByteIndexer {
    protected byte[] array;

    public UByteArrayIndexer(byte[] bArr) {
        this(bArr, new long[]{bArr.length}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public int get(long j10) {
        return this.array[(int) j10] & ForkServer.ERROR;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long j10, int i10) {
        this.array[(int) j10] = (byte) i10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer, org.bytedeco.javacpp.indexer.Indexer
    public /* bridge */ /* synthetic */ Indexer putDouble(long[] jArr, double d10) {
        return super.putDouble(jArr, d10);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.array = null;
    }

    public UByteArrayIndexer(byte[] bArr, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.array = bArr;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public byte[] array() {
        return this.array;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer get(long j10, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = this.array[(((int) j10) * ((int) this.strides[0])) + i12] & ForkServer.ERROR;
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long j10, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[(((int) j10) * ((int) this.strides[0])) + i12] = (byte) iArr[i10 + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public int get(long j10, long j11) {
        return this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)] & ForkServer.ERROR;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long j10, long j11, int i10) {
        this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)] = (byte) i10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer get(long j10, long j11, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr = this.array;
            long[] jArr = this.strides;
            iArr[i10 + i12] = bArr[p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12)] & ForkServer.ERROR;
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long j10, long j11, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr = this.array;
            long[] jArr = this.strides;
            bArr[p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12)] = (byte) iArr[i10 + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public int get(long j10, long j11, long j12) {
        byte[] bArr = this.array;
        long[] jArr = this.strides;
        return bArr[(((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)] & ForkServer.ERROR;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long j10, long j11, long j12, int i10) {
        byte[] bArr = this.array;
        long[] jArr = this.strides;
        bArr[(((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)] = (byte) i10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public int get(long... jArr) {
        return this.array[(int) index(jArr)] & ForkServer.ERROR;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long[] jArr, int i10) {
        this.array[(int) index(jArr)] = (byte) i10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer get(long[] jArr, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = this.array[((int) index(jArr)) + i12] & ForkServer.ERROR;
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long[] jArr, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[((int) index(jArr)) + i12] = (byte) iArr[i10 + i12];
        }
        return this;
    }
}
