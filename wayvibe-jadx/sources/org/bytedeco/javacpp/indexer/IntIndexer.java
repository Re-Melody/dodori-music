package org.bytedeco.javacpp.indexer;

import java.nio.IntBuffer;
import org.bytedeco.javacpp.IntPointer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class IntIndexer extends Indexer {
    public static final int VALUE_BYTES = 4;

    public IntIndexer(long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
    }

    public static IntIndexer create(int[] iArr) {
        return new IntArrayIndexer(iArr);
    }

    public abstract int get(long j10);

    public abstract int get(long j10, long j11);

    public abstract int get(long j10, long j11, long j12);

    public abstract int get(long... jArr);

    public abstract IntIndexer get(long j10, long j11, int[] iArr, int i10, int i11);

    public IntIndexer get(long j10, int[] iArr) {
        return get(j10, iArr, 0, iArr.length);
    }

    public abstract IntIndexer get(long j10, int[] iArr, int i10, int i11);

    public abstract IntIndexer get(long[] jArr, int[] iArr, int i10, int i11);

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public double getDouble(long... jArr) {
        return get(jArr);
    }

    public abstract IntIndexer put(long j10, int i10);

    public abstract IntIndexer put(long j10, long j11, int i10);

    public abstract IntIndexer put(long j10, long j11, long j12, int i10);

    public abstract IntIndexer put(long j10, long j11, int[] iArr, int i10, int i11);

    public IntIndexer put(long j10, int... iArr) {
        return put(j10, iArr, 0, iArr.length);
    }

    public abstract IntIndexer put(long j10, int[] iArr, int i10, int i11);

    public abstract IntIndexer put(long[] jArr, int i10);

    public abstract IntIndexer put(long[] jArr, int[] iArr, int i10, int i11);

    public static IntIndexer create(IntBuffer intBuffer) {
        return new IntBufferIndexer(intBuffer);
    }

    public IntIndexer get(long j10, long j11, int[] iArr) {
        return get(j10, j11, iArr, 0, iArr.length);
    }

    public IntIndexer put(long j10, long j11, int... iArr) {
        return put(j10, j11, iArr, 0, iArr.length);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public IntIndexer putDouble(long[] jArr, double d10) {
        return put(jArr, (int) d10);
    }

    public static IntIndexer create(IntPointer intPointer) {
        return create(intPointer, new long[]{intPointer.limit() - intPointer.position()}, Indexer.ONE_STRIDE);
    }

    public IntIndexer get(long[] jArr, int[] iArr) {
        return get(jArr, iArr, 0, iArr.length);
    }

    public IntIndexer put(long[] jArr, int... iArr) {
        return put(jArr, iArr, 0, iArr.length);
    }

    public static IntIndexer create(int[] iArr, long[] jArr, long[] jArr2) {
        return new IntArrayIndexer(iArr, jArr, jArr2);
    }

    public static IntIndexer create(IntBuffer intBuffer, long[] jArr, long[] jArr2) {
        return new IntBufferIndexer(intBuffer, jArr, jArr2);
    }

    public static IntIndexer create(IntPointer intPointer, long[] jArr, long[] jArr2) {
        return create(intPointer, jArr, jArr2, true);
    }

    public static IntIndexer create(final IntPointer intPointer, long[] jArr, long[] jArr2, boolean z10) {
        if (z10) {
            return Raw.getInstance() != null ? new IntRawIndexer(intPointer, jArr, jArr2) : new IntBufferIndexer(intPointer.asBuffer(), jArr, jArr2);
        }
        final long jPosition = intPointer.position();
        int[] iArr = new int[(int) Math.min(intPointer.limit() - jPosition, 2147483647L)];
        intPointer.get(iArr);
        return new IntArrayIndexer(iArr, jArr, jArr2) { // from class: org.bytedeco.javacpp.indexer.IntIndexer.1
            @Override // org.bytedeco.javacpp.indexer.IntArrayIndexer, org.bytedeco.javacpp.indexer.Indexer
            public void release() {
                intPointer.position(jPosition).put(this.array);
                super.release();
            }
        };
    }
}
