package com.apple.android.music.playback.f;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long[] f17402a = new long[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f17403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17404c;

    public d() {
        this.f17403b = f17402a;
        this.f17404c = 0;
    }

    public void a(long j10) {
        c(this.f17404c + 1);
        long[] jArr = this.f17403b;
        int i10 = this.f17404c;
        this.f17404c = i10 + 1;
        jArr[i10] = j10;
    }

    public long b(int i10) {
        if (i10 < 0 || i10 >= this.f17404c) {
            throw new IndexOutOfBoundsException();
        }
        return this.f17403b[i10];
    }

    public void c(int i10) {
        long[] jArr = this.f17403b;
        if (jArr == f17402a && i10 < 10) {
            i10 = 10;
        }
        if (i10 - jArr.length > 0) {
            int length = jArr.length;
            int i11 = length + (length >> 1);
            if (i11 - i10 >= 0) {
                i10 = i11;
            }
            if (i10 - 2147483639 > 0) {
                i10 = 2147483639;
            }
            this.f17403b = Arrays.copyOf(jArr, i10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f17404c != dVar.f17404c) {
            return false;
        }
        long[] jArr = dVar.f17403b;
        for (int i10 = 0; i10 < this.f17404c; i10++) {
            if (this.f17403b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f17404c; i11++) {
            long j10 = this.f17403b[i11];
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    public void a(int i10, long j10) {
        int i11;
        if (i10 >= 0 && i10 <= (i11 = this.f17404c)) {
            c(i11 + 1);
            long[] jArr = this.f17403b;
            System.arraycopy(jArr, i10, jArr, i10 + 1, this.f17404c - i10);
            this.f17403b[i10] = j10;
            this.f17404c++;
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public d(int i10) {
        this.f17403b = new long[i10];
        this.f17404c = 0;
    }

    public void b() {
        this.f17404c = 0;
    }

    public int b(long j10) {
        for (int i10 = 0; i10 < this.f17404c; i10++) {
            if (this.f17403b[i10] == j10) {
                return i10;
            }
        }
        return -1;
    }

    public long a(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f17404c)) {
            long[] jArr = this.f17403b;
            long j10 = jArr[i10];
            int i12 = (i11 - i10) - 1;
            if (i12 > 0) {
                System.arraycopy(jArr, i10 + 1, jArr, i10, i12);
            }
            this.f17404c--;
            return j10;
        }
        throw new IndexOutOfBoundsException();
    }

    public int a() {
        return this.f17404c;
    }
}
