package p059f4;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19796b;

    public h(String str, long j10) {
        this.f19795a = str;
        this.f19796b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return m.b(this.f19795a, hVar.f19795a) && this.f19796b == hVar.f19796b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19796b) + (this.f19795a.hashCode() * 31);
    }

    public final String toString() {
        return "DeveloperTokenPayload(token=" + this.f19795a + ", expiresAtMillis=" + this.f19796b + ")";
    }
}
