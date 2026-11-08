package com.google.firebase.firestore;

import com.google.protobuf.AbstractC1252l;

/* JADX INFO: renamed from: com.google.firebase.firestore.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1212h implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1252l f18600a;

    public C1212h(AbstractC1252l abstractC1252l) {
        this.f18600a = abstractC1252l;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return p207t7.u.c(this.f18600a, ((C1212h) obj).f18600a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1212h) {
            return this.f18600a.equals(((C1212h) obj).f18600a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18600a.hashCode();
    }

    public final String toString() {
        return "Blob { bytes=" + p207t7.u.j(this.f18600a) + " }";
    }
}
