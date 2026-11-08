package org.bytedeco.javacpp.indexer;

import java.nio.Buffer;
import org.bytedeco.javacpp.Pointer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Indexer implements AutoCloseable {
    protected static final long[] ONE_STRIDE = {1};
    protected Indexable indexable;
    protected long[] sizes;
    protected long[] strides;

    public Indexer(long[] jArr, long[] jArr2) {
        this.sizes = jArr;
        this.strides = jArr2;
    }

    public static final long checkIndex(long j10, long j11) {
        if (j10 < 0 || j10 >= j11) {
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
        return j10;
    }

    public Object array() {
        return null;
    }

    public Buffer buffer() {
        return null;
    }

    public long channels() {
        long[] jArr = this.sizes;
        if (jArr.length == 3) {
            return jArr[2];
        }
        return 1L;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        release();
    }

    public long cols() {
        long[] jArr = this.sizes;
        if (jArr.length == 3) {
            return jArr[1];
        }
        return -1L;
    }

    public abstract double getDouble(long... jArr);

    public long height() {
        long[] jArr = this.sizes;
        if (jArr.length == 3) {
            return jArr[0];
        }
        return -1L;
    }

    public long index(long... jArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = this.strides;
            if (i10 >= jArr2.length) {
                break;
            }
            j10 += jArr[i10] * jArr2[i10];
        }
        return j10;
    }

    public Indexable indexable() {
        return this.indexable;
    }

    public Pointer pointer() {
        return null;
    }

    public abstract Indexer putDouble(long[] jArr, double d10);

    public abstract void release();

    public long rows() {
        long[] jArr = this.sizes;
        if (jArr.length == 3) {
            return jArr[0];
        }
        return -1L;
    }

    public long size(int i10) {
        return this.sizes[i10];
    }

    public long[] sizes() {
        return this.sizes;
    }

    public long stride(int i10) {
        return this.strides[i10];
    }

    public long[] strides() {
        return this.strides;
    }

    public String toString() {
        int i10;
        char c3 = 2;
        char c9 = 1;
        long[] jArr = this.sizes;
        int i11 = 0;
        long j10 = 1;
        long j11 = jArr.length > 0 ? jArr[0] : 1L;
        long j12 = jArr.length > 1 ? jArr[1] : 1L;
        long j13 = jArr.length > 2 ? jArr[2] : 1L;
        StringBuilder sb = new StringBuilder(j11 > 1 ? "\n[ " : "[ ");
        int i12 = 0;
        while (true) {
            long j14 = i12;
            if (j14 >= j11) {
                sb.append(" ]");
                return sb.toString();
            }
            char c10 = c3;
            int i13 = i11;
            long j15 = j10;
            while (true) {
                long j16 = i13;
                if (j16 >= j12) {
                    break;
                }
                char c11 = c9;
                if (j13 > j15) {
                    sb.append("(");
                }
                int i14 = i12;
                int i15 = i13;
                while (true) {
                    long j17 = i15;
                    i10 = i13;
                    if (j17 >= j13) {
                        break;
                    }
                    long[] jArr2 = new long[3];
                    jArr2[i13] = j14;
                    jArr2[c11] = j16;
                    jArr2[c10] = j17;
                    sb.append((float) getDouble(jArr2));
                    if (j17 < j13 - j15) {
                        sb.append(", ");
                    }
                    i15++;
                    i13 = i10;
                }
                if (j13 > j15) {
                    sb.append(")");
                }
                if (j16 < j12 - j15) {
                    sb.append(", ");
                }
                i13 = i10 + 1;
                c9 = c11;
                i12 = i14;
            }
            char c12 = c9;
            int i16 = i12;
            if (j14 < j11 - j15) {
                sb.append("\n  ");
            }
            i12 = i16 + 1;
            c3 = c10;
            i11 = i13;
            j10 = j15;
            c9 = c12;
        }
    }

    public long width() {
        long[] jArr = this.sizes;
        if (jArr.length == 3) {
            return jArr[1];
        }
        return -1L;
    }

    public Indexer indexable(Indexable indexable) {
        this.indexable = indexable;
        return this;
    }
}
