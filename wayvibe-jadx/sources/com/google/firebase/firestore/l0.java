package com.google.firebase.firestore;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18617b;

    public l0(boolean z10, boolean z11) {
        this.f18616a = z10;
        this.f18617b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f18616a == l0Var.f18616a && this.f18617b == l0Var.f18617b;
    }

    public final int hashCode() {
        return ((this.f18616a ? 1 : 0) * 31) + (this.f18617b ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnapshotMetadata{hasPendingWrites=");
        sb.append(this.f18616a);
        sb.append(", isFromCache=");
        return p134m1.b.o(sb, this.f18617b, '}');
    }
}
