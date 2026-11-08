package org.bytedeco.javacpp.indexer;

import V0.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class ByteArrayIndexer extends ByteIndexer {
    protected static final Raw RAW = Raw.getInstance();
    protected byte[] array;
    protected ByteBuffer buffer;

    public ByteArrayIndexer(byte[] bArr) {
        this(bArr, new long[]{bArr.length}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public byte get(long j10) {
        return this.array[(int) j10];
    }

    public ByteBuffer getBuffer() {
        if (this.buffer == null) {
            this.buffer = ByteBuffer.wrap(this.array).order(ByteOrder.nativeOrder());
        }
        return this.buffer;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public char getChar(long j10) {
        Raw raw = RAW;
        if (raw == null) {
            return getBuffer().getChar((int) j10);
        }
        byte[] bArr = this.array;
        return raw.getChar(bArr, Indexer.checkIndex(j10, bArr.length - 1));
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public double getDouble(long j10) {
        Raw raw = RAW;
        if (raw == null) {
            return getBuffer().getDouble((int) j10);
        }
        byte[] bArr = this.array;
        return raw.getDouble(bArr, Indexer.checkIndex(j10, bArr.length - 7));
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public float getFloat(long j10) {
        Raw raw = RAW;
        if (raw == null) {
            return getBuffer().getFloat((int) j10);
        }
        byte[] bArr = this.array;
        return raw.getFloat(bArr, Indexer.checkIndex(j10, bArr.length - 3));
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public int getInt(long j10) {
        Raw raw = RAW;
        if (raw == null) {
            return getBuffer().getInt((int) j10);
        }
        byte[] bArr = this.array;
        return raw.getInt(bArr, Indexer.checkIndex(j10, bArr.length - 3));
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public long getLong(long j10) {
        Raw raw = RAW;
        if (raw == null) {
            return getBuffer().getLong((int) j10);
        }
        byte[] bArr = this.array;
        return raw.getLong(bArr, Indexer.checkIndex(j10, bArr.length - 7));
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public short getShort(long j10) {
        Raw raw = RAW;
        if (raw == null) {
            return getBuffer().getShort((int) j10);
        }
        byte[] bArr = this.array;
        return raw.getShort(bArr, Indexer.checkIndex(j10, bArr.length - 1));
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long j10, byte b10) {
        this.array[(int) j10] = b10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer putChar(long j10, char c3) {
        Raw raw = RAW;
        if (raw == null) {
            getBuffer().putChar((int) j10, c3);
            return this;
        }
        byte[] bArr = this.array;
        raw.putChar(bArr, Indexer.checkIndex(j10, bArr.length - 1), c3);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer, org.bytedeco.javacpp.indexer.Indexer
    public /* bridge */ /* synthetic */ Indexer putDouble(long[] jArr, double d10) {
        return super.putDouble(jArr, d10);
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer putFloat(long j10, float f10) {
        Raw raw = RAW;
        if (raw == null) {
            getBuffer().putFloat((int) j10, f10);
            return this;
        }
        byte[] bArr = this.array;
        raw.putFloat(bArr, Indexer.checkIndex(j10, bArr.length - 3), f10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer putInt(long j10, int i10) {
        Raw raw = RAW;
        if (raw == null) {
            getBuffer().putInt((int) j10, i10);
            return this;
        }
        byte[] bArr = this.array;
        raw.putInt(bArr, Indexer.checkIndex(j10, bArr.length - 3), i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer putLong(long j10, long j11) {
        Raw raw = RAW;
        if (raw == null) {
            getBuffer().putLong((int) j10, j11);
            return this;
        }
        byte[] bArr = this.array;
        raw.putLong(bArr, Indexer.checkIndex(j10, bArr.length - 7), j11);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer putShort(long j10, short s8) {
        Raw raw = RAW;
        if (raw == null) {
            getBuffer().putShort((int) j10, s8);
            return this;
        }
        byte[] bArr = this.array;
        raw.putShort(bArr, Indexer.checkIndex(j10, bArr.length - 1), s8);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.array = null;
    }

    public ByteArrayIndexer(byte[] bArr, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.array = bArr;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public byte[] array() {
        return this.array;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer get(long j10, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i10 + i12] = this.array[(((int) j10) * ((int) this.strides[0])) + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long j10, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[(((int) j10) * ((int) this.strides[0])) + i12] = bArr[i10 + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer putDouble(long j10, double d10) {
        Raw raw = RAW;
        if (raw == null) {
            getBuffer().putDouble((int) j10, d10);
            return this;
        }
        byte[] bArr = this.array;
        raw.putDouble(bArr, Indexer.checkIndex(j10, bArr.length - 7), d10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public byte get(long j10, long j11) {
        return this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)];
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long j10, long j11, byte b10) {
        this.array[(((int) j10) * ((int) this.strides[0])) + ((int) j11)] = b10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer get(long j10, long j11, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.array;
            long[] jArr = this.strides;
            bArr[i10 + i12] = bArr2[p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12)];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long j10, long j11, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.array;
            long[] jArr = this.strides;
            bArr2[p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12)] = bArr[i10 + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public byte get(long j10, long j11, long j12) {
        byte[] bArr = this.array;
        long[] jArr = this.strides;
        return bArr[(((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)];
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long j10, long j11, long j12, byte b10) {
        byte[] bArr = this.array;
        long[] jArr = this.strides;
        bArr[(((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12)] = b10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public byte get(long... jArr) {
        return this.array[(int) index(jArr)];
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long[] jArr, byte b10) {
        this.array[(int) index(jArr)] = b10;
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer get(long[] jArr, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i10 + i12] = this.array[((int) index(jArr)) + i12];
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long[] jArr, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.array[((int) index(jArr)) + i12] = bArr[i10 + i12];
        }
        return this;
    }
}
