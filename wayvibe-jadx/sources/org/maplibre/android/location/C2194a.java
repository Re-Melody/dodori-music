package org.maplibre.android.location;

/* JADX INFO: renamed from: org.maplibre.android.location.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2194a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f24662b;

    public C2194a(int i10, C c3) {
        this.f24661a = i10;
        this.f24662b = c3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2194a.class != obj.getClass()) {
            return false;
        }
        C2194a c2194a = (C2194a) obj;
        if (this.f24661a != c2194a.f24661a) {
            return false;
        }
        C c3 = c2194a.f24662b;
        C c9 = this.f24662b;
        if (c9 != null) {
            return c9.equals(c3);
        }
        return c3 == null;
    }

    public final int hashCode() {
        int i10 = this.f24661a * 31;
        C c3 = this.f24662b;
        return i10 + (c3 != null ? c3.hashCode() : 0);
    }
}
