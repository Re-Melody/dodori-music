package com.google.firebase.firestore;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18562d = 104857600;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X f18563e;

    public M(L l10) {
        this.f18559a = l10.f18556d;
        this.f18560b = l10.f18554b;
        this.f18561c = l10.f18555c;
        this.f18563e = (X) l10.f18558f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || M.class != obj.getClass()) {
            return false;
        }
        M m8 = (M) obj;
        if (this.f18560b == m8.f18560b && this.f18561c == m8.f18561c && this.f18562d == m8.f18562d && this.f18559a.equals(m8.f18559a)) {
            return Objects.equals(this.f18563e, m8.f18563e);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f18559a.hashCode() * 31) + (this.f18560b ? 1 : 0)) * 31) + (this.f18561c ? 1 : 0)) * 31;
        long j10 = this.f18562d;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        X x10 = this.f18563e;
        return i10 + (x10 != null ? x10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseFirestoreSettings{host=");
        sb.append(this.f18559a);
        sb.append(", sslEnabled=");
        sb.append(this.f18560b);
        sb.append(", persistenceEnabled=");
        sb.append(this.f18561c);
        sb.append(", cacheSizeBytes=");
        sb.append(this.f18562d);
        sb.append(", cacheSettings=");
        X x10 = this.f18563e;
        sb.append(x10);
        if (sb.toString() == null) {
            return "null";
        }
        return x10.toString() + "}";
    }
}
