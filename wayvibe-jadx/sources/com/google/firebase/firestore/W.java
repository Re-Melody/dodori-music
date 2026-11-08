package com.google.firebase.firestore;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final W f18579g = new W(0, 0, 0, 0, null, V.SUCCESS);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V f18584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final K f18585f;

    public W(int i10, int i11, long j10, long j11, K k, V v3) {
        this.f18580a = i10;
        this.f18581b = i11;
        this.f18582c = j10;
        this.f18583d = j11;
        this.f18584e = v3;
        this.f18585f = k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W.class != obj.getClass()) {
            return false;
        }
        W w10 = (W) obj;
        if (this.f18580a != w10.f18580a || this.f18581b != w10.f18581b || this.f18582c != w10.f18582c || this.f18583d != w10.f18583d || this.f18584e != w10.f18584e) {
            return false;
        }
        K k = w10.f18585f;
        K k10 = this.f18585f;
        if (k10 != null) {
            return k10.equals(k);
        }
        return k == null;
    }

    public final int hashCode() {
        int i10 = ((this.f18580a * 31) + this.f18581b) * 31;
        long j10 = this.f18582c;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f18583d;
        int iHashCode = (this.f18584e.hashCode() + ((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31;
        K k = this.f18585f;
        return iHashCode + (k != null ? k.hashCode() : 0);
    }
}
