package org.bytedeco.javacpp.indexer;

import java.nio.ByteBuffer;
import org.bytedeco.javacpp.BooleanPointer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BooleanIndexer extends Indexer {
    public static final int VALUE_BYTES = 1;

    public BooleanIndexer(long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
    }

    public static BooleanIndexer create(boolean[] zArr) {
        return new BooleanArrayIndexer(zArr);
    }

    public abstract BooleanIndexer get(long j10, long j11, boolean[] zArr, int i10, int i11);

    public BooleanIndexer get(long j10, boolean[] zArr) {
        return get(j10, zArr, 0, zArr.length);
    }

    public abstract BooleanIndexer get(long j10, boolean[] zArr, int i10, int i11);

    public abstract BooleanIndexer get(long[] jArr, boolean[] zArr, int i10, int i11);

    public abstract boolean get(long j10);

    public abstract boolean get(long j10, long j11);

    public abstract boolean get(long j10, long j11, long j12);

    public abstract boolean get(long... jArr);

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public double getDouble(long... jArr) {
        return get(jArr) ? 1.0d : 0.0d;
    }

    public abstract BooleanIndexer put(long j10, long j11, long j12, boolean z10);

    public abstract BooleanIndexer put(long j10, long j11, boolean z10);

    public abstract BooleanIndexer put(long j10, long j11, boolean[] zArr, int i10, int i11);

    public abstract BooleanIndexer put(long j10, boolean z10);

    public BooleanIndexer put(long j10, boolean... zArr) {
        return put(j10, zArr, 0, zArr.length);
    }

    public abstract BooleanIndexer put(long j10, boolean[] zArr, int i10, int i11);

    public abstract BooleanIndexer put(long[] jArr, boolean z10);

    public abstract BooleanIndexer put(long[] jArr, boolean[] zArr, int i10, int i11);

    public static BooleanIndexer create(ByteBuffer byteBuffer) {
        return new BooleanBufferIndexer(byteBuffer);
    }

    public BooleanIndexer get(long j10, long j11, boolean[] zArr) {
        return get(j10, j11, zArr, 0, zArr.length);
    }

    public BooleanIndexer put(long j10, long j11, boolean... zArr) {
        return put(j10, j11, zArr, 0, zArr.length);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public BooleanIndexer putDouble(long[] jArr, double d10) {
        return put(jArr, d10 != 0.0d);
    }

    public static BooleanIndexer create(BooleanPointer booleanPointer) {
        return create(booleanPointer, new long[]{booleanPointer.limit() - booleanPointer.position()}, Indexer.ONE_STRIDE);
    }

    public BooleanIndexer get(long[] jArr, boolean[] zArr) {
        return get(jArr, zArr, 0, zArr.length);
    }

    public BooleanIndexer put(long[] jArr, boolean... zArr) {
        return put(jArr, zArr, 0, zArr.length);
    }

    public static BooleanIndexer create(boolean[] zArr, long[] jArr, long[] jArr2) {
        return new BooleanArrayIndexer(zArr, jArr, jArr2);
    }

    public static BooleanIndexer create(ByteBuffer byteBuffer, long[] jArr, long[] jArr2) {
        return new BooleanBufferIndexer(byteBuffer, jArr, jArr2);
    }

    public static BooleanIndexer create(BooleanPointer booleanPointer, long[] jArr, long[] jArr2) {
        return create(booleanPointer, jArr, jArr2, true);
    }

    public static BooleanIndexer create(final BooleanPointer booleanPointer, long[] jArr, long[] jArr2, boolean z10) {
        if (z10) {
            return Raw.getInstance() != null ? new BooleanRawIndexer(booleanPointer, jArr, jArr2) : new BooleanBufferIndexer(booleanPointer.asByteBuffer(), jArr, jArr2);
        }
        final long jPosition = booleanPointer.position();
        boolean[] zArr = new boolean[(int) Math.min(booleanPointer.limit() - jPosition, 2147483647L)];
        booleanPointer.get(zArr);
        return new BooleanArrayIndexer(zArr, jArr, jArr2) { // from class: org.bytedeco.javacpp.indexer.BooleanIndexer.1
            @Override // org.bytedeco.javacpp.indexer.BooleanArrayIndexer, org.bytedeco.javacpp.indexer.Indexer
            public void release() {
                booleanPointer.position(jPosition).put(this.array);
                super.release();
            }
        };
    }
}
