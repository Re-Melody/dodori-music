package org.bytedeco.javacpp.indexer;

import java.nio.FloatBuffer;
import org.bytedeco.javacpp.FloatPointer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FloatIndexer extends Indexer {
    public static final int VALUE_BYTES = 4;

    public FloatIndexer(long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
    }

    public static FloatIndexer create(float[] fArr) {
        return new FloatArrayIndexer(fArr);
    }

    public abstract float get(long j10);

    public abstract float get(long j10, long j11);

    public abstract float get(long j10, long j11, long j12);

    public abstract float get(long... jArr);

    public abstract FloatIndexer get(long j10, long j11, float[] fArr, int i10, int i11);

    public FloatIndexer get(long j10, float[] fArr) {
        return get(j10, fArr, 0, fArr.length);
    }

    public abstract FloatIndexer get(long j10, float[] fArr, int i10, int i11);

    public abstract FloatIndexer get(long[] jArr, float[] fArr, int i10, int i11);

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public double getDouble(long... jArr) {
        return get(jArr);
    }

    public abstract FloatIndexer put(long j10, float f10);

    public abstract FloatIndexer put(long j10, long j11, float f10);

    public abstract FloatIndexer put(long j10, long j11, long j12, float f10);

    public abstract FloatIndexer put(long j10, long j11, float[] fArr, int i10, int i11);

    public FloatIndexer put(long j10, float... fArr) {
        return put(j10, fArr, 0, fArr.length);
    }

    public abstract FloatIndexer put(long j10, float[] fArr, int i10, int i11);

    public abstract FloatIndexer put(long[] jArr, float f10);

    public abstract FloatIndexer put(long[] jArr, float[] fArr, int i10, int i11);

    public static FloatIndexer create(FloatBuffer floatBuffer) {
        return new FloatBufferIndexer(floatBuffer);
    }

    public FloatIndexer get(long j10, long j11, float[] fArr) {
        return get(j10, j11, fArr, 0, fArr.length);
    }

    public FloatIndexer put(long j10, long j11, float... fArr) {
        return put(j10, j11, fArr, 0, fArr.length);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public FloatIndexer putDouble(long[] jArr, double d10) {
        return put(jArr, (float) d10);
    }

    public static FloatIndexer create(FloatPointer floatPointer) {
        return create(floatPointer, new long[]{floatPointer.limit() - floatPointer.position()}, Indexer.ONE_STRIDE);
    }

    public FloatIndexer get(long[] jArr, float[] fArr) {
        return get(jArr, fArr, 0, fArr.length);
    }

    public FloatIndexer put(long[] jArr, float... fArr) {
        return put(jArr, fArr, 0, fArr.length);
    }

    public static FloatIndexer create(float[] fArr, long[] jArr, long[] jArr2) {
        return new FloatArrayIndexer(fArr, jArr, jArr2);
    }

    public static FloatIndexer create(FloatBuffer floatBuffer, long[] jArr, long[] jArr2) {
        return new FloatBufferIndexer(floatBuffer, jArr, jArr2);
    }

    public static FloatIndexer create(FloatPointer floatPointer, long[] jArr, long[] jArr2) {
        return create(floatPointer, jArr, jArr2, true);
    }

    public static FloatIndexer create(final FloatPointer floatPointer, long[] jArr, long[] jArr2, boolean z10) {
        if (z10) {
            return Raw.getInstance() != null ? new FloatRawIndexer(floatPointer, jArr, jArr2) : new FloatBufferIndexer(floatPointer.asBuffer(), jArr, jArr2);
        }
        final long jPosition = floatPointer.position();
        float[] fArr = new float[(int) Math.min(floatPointer.limit() - jPosition, 2147483647L)];
        floatPointer.get(fArr);
        return new FloatArrayIndexer(fArr, jArr, jArr2) { // from class: org.bytedeco.javacpp.indexer.FloatIndexer.1
            @Override // org.bytedeco.javacpp.indexer.FloatArrayIndexer, org.bytedeco.javacpp.indexer.Indexer
            public void release() {
                floatPointer.position(jPosition).put(this.array);
                super.release();
            }
        };
    }
}
