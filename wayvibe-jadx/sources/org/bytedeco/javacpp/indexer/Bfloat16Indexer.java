package org.bytedeco.javacpp.indexer;

import java.nio.ShortBuffer;
import org.bytedeco.javacpp.ShortPointer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Bfloat16Indexer extends Indexer {
    public static final int VALUE_BYTES = 2;

    public Bfloat16Indexer(long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
    }

    public static Bfloat16Indexer create(short[] sArr) {
        return new Bfloat16ArrayIndexer(sArr);
    }

    public static int fromFloat(float f10) {
        return Float.floatToIntBits(f10) >>> 16;
    }

    public static float toFloat(int i10) {
        return Float.intBitsToFloat(i10 << 16);
    }

    public abstract float get(long j10);

    public abstract float get(long j10, long j11);

    public abstract float get(long j10, long j11, long j12);

    public abstract float get(long... jArr);

    public abstract Bfloat16Indexer get(long j10, long j11, float[] fArr, int i10, int i11);

    public Bfloat16Indexer get(long j10, float[] fArr) {
        return get(j10, fArr, 0, fArr.length);
    }

    public abstract Bfloat16Indexer get(long j10, float[] fArr, int i10, int i11);

    public abstract Bfloat16Indexer get(long[] jArr, float[] fArr, int i10, int i11);

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public double getDouble(long... jArr) {
        return get(jArr);
    }

    public abstract Bfloat16Indexer put(long j10, float f10);

    public abstract Bfloat16Indexer put(long j10, long j11, float f10);

    public abstract Bfloat16Indexer put(long j10, long j11, long j12, float f10);

    public abstract Bfloat16Indexer put(long j10, long j11, float[] fArr, int i10, int i11);

    public Bfloat16Indexer put(long j10, float... fArr) {
        return put(j10, fArr, 0, fArr.length);
    }

    public abstract Bfloat16Indexer put(long j10, float[] fArr, int i10, int i11);

    public abstract Bfloat16Indexer put(long[] jArr, float f10);

    public abstract Bfloat16Indexer put(long[] jArr, float[] fArr, int i10, int i11);

    public static Bfloat16Indexer create(ShortBuffer shortBuffer) {
        return new Bfloat16BufferIndexer(shortBuffer);
    }

    public Bfloat16Indexer get(long j10, long j11, float[] fArr) {
        return get(j10, j11, fArr, 0, fArr.length);
    }

    public Bfloat16Indexer put(long j10, long j11, float... fArr) {
        return put(j10, j11, fArr, 0, fArr.length);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Bfloat16Indexer putDouble(long[] jArr, double d10) {
        return put(jArr, (float) d10);
    }

    public static Bfloat16Indexer create(ShortPointer shortPointer) {
        return create(shortPointer, new long[]{shortPointer.limit() - shortPointer.position()}, Indexer.ONE_STRIDE);
    }

    public Bfloat16Indexer get(long[] jArr, float[] fArr) {
        return get(jArr, fArr, 0, fArr.length);
    }

    public Bfloat16Indexer put(long[] jArr, float... fArr) {
        return put(jArr, fArr, 0, fArr.length);
    }

    public static Bfloat16Indexer create(short[] sArr, long[] jArr, long[] jArr2) {
        return new Bfloat16ArrayIndexer(sArr, jArr, jArr2);
    }

    public static Bfloat16Indexer create(ShortBuffer shortBuffer, long[] jArr, long[] jArr2) {
        return new Bfloat16BufferIndexer(shortBuffer, jArr, jArr2);
    }

    public static Bfloat16Indexer create(ShortPointer shortPointer, long[] jArr, long[] jArr2) {
        return create(shortPointer, jArr, jArr2, true);
    }

    public static Bfloat16Indexer create(final ShortPointer shortPointer, long[] jArr, long[] jArr2, boolean z10) {
        if (z10) {
            return Raw.getInstance() != null ? new Bfloat16RawIndexer(shortPointer, jArr, jArr2) : new Bfloat16BufferIndexer(shortPointer.asBuffer(), jArr, jArr2);
        }
        final long jPosition = shortPointer.position();
        short[] sArr = new short[(int) Math.min(shortPointer.limit() - jPosition, 2147483647L)];
        shortPointer.get(sArr);
        return new Bfloat16ArrayIndexer(sArr, jArr, jArr2) { // from class: org.bytedeco.javacpp.indexer.Bfloat16Indexer.1
            @Override // org.bytedeco.javacpp.indexer.Bfloat16ArrayIndexer, org.bytedeco.javacpp.indexer.Indexer
            public void release() {
                shortPointer.position(jPosition).put(this.array);
                super.release();
            }
        };
    }
}
