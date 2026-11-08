package com.google.firebase.firestore;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18631a;

    public p0(int i10) {
        this.f18631a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && p0.class == obj.getClass() && this.f18631a == ((p0) obj).f18631a;
    }

    public final int hashCode() {
        return this.f18631a;
    }

    public final String toString() {
        return V0.p.q(new StringBuilder("TransactionOptions{maxAttempts="), this.f18631a, '}');
    }
}
