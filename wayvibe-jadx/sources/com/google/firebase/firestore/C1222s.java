package com.google.firebase.firestore;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.firebase.firestore.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1222s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseFirestore f18636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p170p7.h f18637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p170p7.n f18638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0 f18639d;

    public C1222s(FirebaseFirestore firebaseFirestore, p170p7.h hVar, p170p7.n nVar, boolean z10, boolean z11) {
        firebaseFirestore.getClass();
        this.f18636a = firebaseFirestore;
        hVar.getClass();
        this.f18637b = hVar;
        this.f18638c = nVar;
        this.f18639d = new l0(z11, z10);
    }

    public HashMap a(r rVar) {
        R3.a.g(rVar, "Provided serverTimestampBehavior value must not be null.");
        W4.m mVar = new W4.m(9, this.f18636a, rVar);
        p170p7.n nVar = this.f18638c;
        if (nVar == null) {
            return null;
        }
        return mVar.q(nVar.f25273e.b().L().w());
    }

    public Map b() {
        return a(r.DEFAULT);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1222s)) {
            return false;
        }
        C1222s c1222s = (C1222s) obj;
        if (this.f18636a.equals(c1222s.f18636a) && this.f18637b.equals(c1222s.f18637b) && this.f18639d.equals(c1222s.f18639d)) {
            p170p7.n nVar = c1222s.f18638c;
            p170p7.n nVar2 = this.f18638c;
            if (nVar2 != null ? !(nVar == null || !nVar2.f25273e.equals(nVar.f25273e)) : nVar == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f18637b.f25264a.hashCode() + (this.f18636a.hashCode() * 31)) * 31;
        p170p7.n nVar = this.f18638c;
        return this.f18639d.hashCode() + ((((iHashCode + (nVar != null ? nVar.f25269a.f25264a.hashCode() : 0)) * 31) + (nVar != null ? nVar.f25273e.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DocumentSnapshot{key=" + this.f18637b + ", metadata=" + this.f18639d + ", doc=" + this.f18638c + '}';
    }
}
