package p259y8;

import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: y8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2356g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f29150b;

    public C2356g(String str, boolean z10) {
        this.f29149a = str;
        this.f29150b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2356g)) {
            return false;
        }
        C2356g c2356g = (C2356g) obj;
        return m.b(this.f29149a, c2356g.f29149a) && this.f29150b == c2356g.f29150b;
    }

    public final int hashCode() {
        String str = this.f29149a;
        return Boolean.hashCode(this.f29150b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f29149a + ", useDataStore=" + this.f29150b + ")";
    }
}
