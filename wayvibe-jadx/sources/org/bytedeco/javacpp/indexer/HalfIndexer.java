package org.bytedeco.javacpp.indexer;

import java.nio.ShortBuffer;
import org.bytedeco.javacpp.ShortPointer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class HalfIndexer extends Indexer {
    public static final int VALUE_BYTES = 2;

    public HalfIndexer(long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
    }

    public static HalfIndexer create(short[] sArr) {
        return new HalfArrayIndexer(sArr);
    }

    public static int fromFloat(float f10) {
        int iFloatToIntBits = Float.floatToIntBits(f10);
        int i10 = (iFloatToIntBits >>> 16) & 32768;
        int i11 = Integer.MAX_VALUE & iFloatToIntBits;
        int i12 = i11 + 4096;
        if (i12 >= 1199570944) {
            if (i11 < 1199570944) {
                return i10 | 31743;
            }
            if (i12 < 2139095040) {
                return i10 | 31744;
            }
            return ((iFloatToIntBits & 8388607) >>> 13) | i10 | 31744;
        }
        if (i12 >= 947912704) {
            return ((i11 - 939520000) >>> 13) | i10;
        }
        if (i12 < 855638016) {
            return i10;
        }
        int i13 = i11 >>> 23;
        return ((((iFloatToIntBits & 8388607) | 8388608) + (8388608 >>> (i13 - 102))) >>> (126 - i13)) | i10;
    }

    public static float toFloat(int i10) {
        int i11 = i10 & 1023;
        int i12 = i10 & 31744;
        if (i12 == 31744) {
            i12 = 261120;
        } else if (i12 != 0) {
            i12 += 114688;
        } else if (i11 != 0) {
            i12 = 115712;
            do {
                i11 <<= 1;
                i12 -= 1024;
            } while ((i11 & 1024) == 0);
            i11 &= 1023;
        }
        return Float.intBitsToFloat(((i10 & 32768) << 16) | ((i11 | i12) << 13));
    }

    public abstract float get(long j10);

    public abstract float get(long j10, long j11);

    public abstract float get(long j10, long j11, long j12);

    public abstract float get(long... jArr);

    public abstract HalfIndexer get(long j10, long j11, float[] fArr, int i10, int i11);

    public HalfIndexer get(long j10, float[] fArr) {
        return get(j10, fArr, 0, fArr.length);
    }

    public abstract HalfIndexer get(long j10, float[] fArr, int i10, int i11);

    public abstract HalfIndexer get(long[] jArr, float[] fArr, int i10, int i11);

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public double getDouble(long... jArr) {
        return get(jArr);
    }

    public abstract HalfIndexer put(long j10, float f10);

    public abstract HalfIndexer put(long j10, long j11, float f10);

    public abstract HalfIndexer put(long j10, long j11, long j12, float f10);

    public abstract HalfIndexer put(long j10, long j11, float[] fArr, int i10, int i11);

    public HalfIndexer put(long j10, float... fArr) {
        return put(j10, fArr, 0, fArr.length);
    }

    public abstract HalfIndexer put(long j10, float[] fArr, int i10, int i11);

    public abstract HalfIndexer put(long[] jArr, float f10);

    public abstract HalfIndexer put(long[] jArr, float[] fArr, int i10, int i11);

    public static HalfIndexer create(ShortBuffer shortBuffer) {
        return new HalfBufferIndexer(shortBuffer);
    }

    public HalfIndexer get(long j10, long j11, float[] fArr) {
        return get(j10, j11, fArr, 0, fArr.length);
    }

    public HalfIndexer put(long j10, long j11, float... fArr) {
        return put(j10, j11, fArr, 0, fArr.length);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public HalfIndexer putDouble(long[] jArr, double d10) {
        return put(jArr, (float) d10);
    }

    public static HalfIndexer create(ShortPointer shortPointer) {
        return create(shortPointer, new long[]{shortPointer.limit() - shortPointer.position()}, Indexer.ONE_STRIDE);
    }

    public HalfIndexer get(long[] jArr, float[] fArr) {
        return get(jArr, fArr, 0, fArr.length);
    }

    public HalfIndexer put(long[] jArr, float... fArr) {
        return put(jArr, fArr, 0, fArr.length);
    }

    public static HalfIndexer create(short[] sArr, long[] jArr, long[] jArr2) {
        return new HalfArrayIndexer(sArr, jArr, jArr2);
    }

    public static HalfIndexer create(ShortBuffer shortBuffer, long[] jArr, long[] jArr2) {
        return new HalfBufferIndexer(shortBuffer, jArr, jArr2);
    }

    public static HalfIndexer create(ShortPointer shortPointer, long[] jArr, long[] jArr2) {
        return create(shortPointer, jArr, jArr2, true);
    }

    public static HalfIndexer create(final ShortPointer shortPointer, long[] jArr, long[] jArr2, boolean z10) {
        if (z10) {
            return Raw.getInstance() != null ? new HalfRawIndexer(shortPointer, jArr, jArr2) : new HalfBufferIndexer(shortPointer.asBuffer(), jArr, jArr2);
        }
        final long jPosition = shortPointer.position();
        short[] sArr = new short[(int) Math.min(shortPointer.limit() - jPosition, 2147483647L)];
        shortPointer.get(sArr);
        return new HalfArrayIndexer(sArr, jArr, jArr2) { // from class: org.bytedeco.javacpp.indexer.HalfIndexer.1
            @Override // org.bytedeco.javacpp.indexer.HalfArrayIndexer, org.bytedeco.javacpp.indexer.Indexer
            public void release() {
                shortPointer.position(jPosition).put(this.array);
                super.release();
            }
        };
    }
}
