package org.bytedeco.javacpp.indexer;

import java.nio.CharBuffer;
import org.bytedeco.javacpp.CharPointer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CharIndexer extends Indexer {
    public static final int VALUE_BYTES = 2;

    public CharIndexer(long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
    }

    public static CharIndexer create(char[] cArr) {
        return new CharArrayIndexer(cArr);
    }

    public abstract char get(long j10);

    public abstract char get(long j10, long j11);

    public abstract char get(long j10, long j11, long j12);

    public abstract char get(long... jArr);

    public abstract CharIndexer get(long j10, long j11, char[] cArr, int i10, int i11);

    public CharIndexer get(long j10, char[] cArr) {
        return get(j10, cArr, 0, cArr.length);
    }

    public abstract CharIndexer get(long j10, char[] cArr, int i10, int i11);

    public abstract CharIndexer get(long[] jArr, char[] cArr, int i10, int i11);

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public double getDouble(long... jArr) {
        return get(jArr);
    }

    public abstract CharIndexer put(long j10, char c3);

    public abstract CharIndexer put(long j10, long j11, char c3);

    public abstract CharIndexer put(long j10, long j11, long j12, char c3);

    public abstract CharIndexer put(long j10, long j11, char[] cArr, int i10, int i11);

    public CharIndexer put(long j10, char... cArr) {
        return put(j10, cArr, 0, cArr.length);
    }

    public abstract CharIndexer put(long j10, char[] cArr, int i10, int i11);

    public abstract CharIndexer put(long[] jArr, char c3);

    public abstract CharIndexer put(long[] jArr, char[] cArr, int i10, int i11);

    public static CharIndexer create(CharBuffer charBuffer) {
        return new CharBufferIndexer(charBuffer);
    }

    public CharIndexer get(long j10, long j11, char[] cArr) {
        return get(j10, j11, cArr, 0, cArr.length);
    }

    public CharIndexer put(long j10, long j11, char... cArr) {
        return put(j10, j11, cArr, 0, cArr.length);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public CharIndexer putDouble(long[] jArr, double d10) {
        return put(jArr, (char) d10);
    }

    public static CharIndexer create(CharPointer charPointer) {
        return create(charPointer, new long[]{charPointer.limit() - charPointer.position()}, Indexer.ONE_STRIDE);
    }

    public CharIndexer get(long[] jArr, char[] cArr) {
        return get(jArr, cArr, 0, cArr.length);
    }

    public CharIndexer put(long[] jArr, char... cArr) {
        return put(jArr, cArr, 0, cArr.length);
    }

    public static CharIndexer create(char[] cArr, long[] jArr, long[] jArr2) {
        return new CharArrayIndexer(cArr, jArr, jArr2);
    }

    public static CharIndexer create(CharBuffer charBuffer, long[] jArr, long[] jArr2) {
        return new CharBufferIndexer(charBuffer, jArr, jArr2);
    }

    public static CharIndexer create(CharPointer charPointer, long[] jArr, long[] jArr2) {
        return create(charPointer, jArr, jArr2, true);
    }

    public static CharIndexer create(final CharPointer charPointer, long[] jArr, long[] jArr2, boolean z10) {
        if (z10) {
            return Raw.getInstance() != null ? new CharRawIndexer(charPointer, jArr, jArr2) : new CharBufferIndexer(charPointer.asBuffer(), jArr, jArr2);
        }
        final long jPosition = charPointer.position();
        char[] cArr = new char[(int) Math.min(charPointer.limit() - jPosition, 2147483647L)];
        charPointer.get(cArr);
        return new CharArrayIndexer(cArr, jArr, jArr2) { // from class: org.bytedeco.javacpp.indexer.CharIndexer.1
            @Override // org.bytedeco.javacpp.indexer.CharArrayIndexer, org.bytedeco.javacpp.indexer.Indexer
            public void release() {
                charPointer.position(jPosition).put(this.array);
                super.release();
            }
        };
    }
}
