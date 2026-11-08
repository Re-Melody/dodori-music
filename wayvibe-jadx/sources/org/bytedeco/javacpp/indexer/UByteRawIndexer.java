package org.bytedeco.javacpp.indexer;

import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import org.apache.tika.fork.ForkServer;
import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.Pointer;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public class UByteRawIndexer extends UByteIndexer {
    protected static final Raw RAW = Raw.getInstance();
    final long base;
    protected BytePointer pointer;
    final long size;

    public UByteRawIndexer(BytePointer bytePointer) {
        this(bytePointer, new long[]{bytePointer.limit() - bytePointer.position()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public int get(long j10) {
        return RAW.getByte(Indexer.checkIndex(j10, this.size) + this.base) & ForkServer.ERROR;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Pointer pointer() {
        return this.pointer;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long j10, int i10) {
        RAW.putByte(Indexer.checkIndex(j10, this.size) + this.base, (byte) i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.pointer = null;
    }

    public UByteRawIndexer(BytePointer bytePointer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.pointer = bytePointer;
        this.base = bytePointer.position() + bytePointer.address();
        this.size = bytePointer.limit() - bytePointer.position();
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer get(long j10, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = get((this.strides[0] * j10) + ((long) i12)) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long j10, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            put((this.strides[0] * j10) + ((long) i12), (byte) iArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public int get(long j10, long j11) {
        return get((j10 * this.strides[0]) + j11) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long j10, long j11, int i10) {
        put((j10 * this.strides[0]) + j11, (byte) i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer get(long j10, long j11, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr = this.strides;
            iArr[i10 + i12] = get((jArr[1] * j11) + (jArr[0] * j10) + ((long) i12)) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long j10, long j11, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr = this.strides;
            put((jArr[1] * j11) + (jArr[0] * j10) + ((long) i12), (byte) iArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public int get(long j10, long j11, long j12) {
        long[] jArr = this.strides;
        return get(b.h(j11, jArr[1], j10 * jArr[0], j12)) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long j10, long j11, long j12, int i10) {
        long[] jArr = this.strides;
        put(b.h(j11, jArr[1], j10 * jArr[0], j12), (byte) i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public int get(long... jArr) {
        return get(index(jArr)) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long[] jArr, int i10) {
        put(index(jArr), (byte) i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer get(long[] jArr, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = get(index(jArr) + ((long) i12)) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.UByteIndexer
    public UByteIndexer put(long[] jArr, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            put(index(jArr) + ((long) i12), (byte) iArr[i10 + i12]);
        }
        return this;
    }
}
