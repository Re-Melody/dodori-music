package p063f8;

import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19850c;

    public a(String str, String str2) {
        this.f19848a = str;
        this.f19849b = null;
        this.f19850c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f19848a.equals(aVar.f19848a)) {
            return this.f19850c.equals(aVar.f19850c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19850c.hashCode() + (this.f19848a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.f19848a);
        sb.append(", function: ");
        return b.m(sb, this.f19850c, " )");
    }

    public a(String str, String str2, String str3) {
        this.f19848a = str;
        this.f19849b = str2;
        this.f19850c = str3;
    }
}
