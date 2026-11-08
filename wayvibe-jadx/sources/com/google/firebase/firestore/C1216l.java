package com.google.firebase.firestore;

/* JADX INFO: renamed from: com.google.firebase.firestore.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1216l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC1215k f18612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f18613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18615d;

    public C1216l(h0 h0Var, EnumC1215k enumC1215k, int i10, int i11) {
        this.f18612a = enumC1215k;
        this.f18613b = h0Var;
        this.f18614c = i10;
        this.f18615d = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1216l) {
            C1216l c1216l = (C1216l) obj;
            if (this.f18612a.equals(c1216l.f18612a) && this.f18613b.equals(c1216l.f18613b) && this.f18614c == c1216l.f18614c && this.f18615d == c1216l.f18615d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f18613b.hashCode() + (this.f18612a.hashCode() * 31)) * 31) + this.f18614c) * 31) + this.f18615d;
    }
}
