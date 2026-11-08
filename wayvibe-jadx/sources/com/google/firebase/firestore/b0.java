package com.google.firebase.firestore;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18589a;

    public b0(long j10) {
        this.f18589a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && b0.class == obj.getClass() && this.f18589a == ((b0) obj).f18589a;
    }

    public final int hashCode() {
        long j10 = this.f18589a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return "PersistentCacheSettings{sizeBytes=" + this.f18589a + '}';
    }
}
