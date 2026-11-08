package com.google.firebase.firestore;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Z f18586a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Y.class != obj.getClass()) {
            return false;
        }
        return this.f18586a.equals(((Y) obj).f18586a);
    }

    public final int hashCode() {
        return this.f18586a.hashCode();
    }

    public final String toString() {
        return "MemoryCacheSettings{gcSettings=" + this.f18586a + "}";
    }
}
