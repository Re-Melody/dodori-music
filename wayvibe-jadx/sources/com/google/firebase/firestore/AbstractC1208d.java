package com.google.firebase.firestore;

import B2.AbstractC0112b;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.firebase.firestore.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1208d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1225v f18590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18592c;

    public AbstractC1208d(C1225v c1225v, String str) {
        String str2;
        this.f18590a = c1225v;
        this.f18591b = str;
        StringBuilder sbO = AbstractC0112b.o(str);
        if (c1225v == null) {
            str2 = "";
        } else {
            str2 = "_" + c1225v;
        }
        sbO.append(str2);
        this.f18592c = sbO.toString();
    }

    public final String a() {
        C1225v c1225v = this.f18590a;
        return c1225v == null ? "" : c1225v.f18642a.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1208d)) {
            return false;
        }
        AbstractC1208d abstractC1208d = (AbstractC1208d) obj;
        C1225v c1225v = this.f18590a;
        if (c1225v == null || abstractC1208d.f18590a == null) {
            return c1225v == null && abstractC1208d.f18590a == null;
        }
        return this.f18591b.equals(abstractC1208d.f18591b) && a().equals(abstractC1208d.a());
    }

    public final int hashCode() {
        return Objects.hash(this.f18591b, a());
    }
}
