package com.google.firebase.firestore;

import java.util.Objects;
import p140m7.EnumC2063o;

/* JADX INFO: loaded from: classes.dex */
public final class D extends E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1225v f18529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC2063o f18530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18531c;

    public D(C1225v c1225v, EnumC2063o enumC2063o, Object obj) {
        this.f18529a = c1225v;
        this.f18530b = enumC2063o;
        this.f18531c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && D.class == obj.getClass()) {
            D d10 = (D) obj;
            if (this.f18530b == d10.f18530b && Objects.equals(this.f18529a, d10.f18529a) && Objects.equals(this.f18531c, d10.f18531c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        C1225v c1225v = this.f18529a;
        int iHashCode = (c1225v != null ? c1225v.f18642a.hashCode() : 0) * 31;
        EnumC2063o enumC2063o = this.f18530b;
        int iHashCode2 = (iHashCode + (enumC2063o != null ? enumC2063o.hashCode() : 0)) * 31;
        Object obj = this.f18531c;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }
}
