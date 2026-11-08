package com.google.firebase.firestore;

import java.util.List;
import java.util.Objects;
import p140m7.EnumC2052d;

/* JADX INFO: loaded from: classes.dex */
public final class C extends E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC2052d f18528b;

    public C(List list, EnumC2052d enumC2052d) {
        this.f18527a = list;
        this.f18528b = enumC2052d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C.class == obj.getClass()) {
            C c3 = (C) obj;
            if (this.f18528b == c3.f18528b && Objects.equals(this.f18527a, c3.f18527a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f18527a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        EnumC2052d enumC2052d = this.f18528b;
        return iHashCode + (enumC2052d != null ? enumC2052d.hashCode() : 0);
    }
}
