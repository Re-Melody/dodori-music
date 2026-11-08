package J2;

import B2.C;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6500c;

    public f(String str, String str2, String str3) {
        this.f6498a = str;
        this.f6499b = str2;
        this.f6500c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (C.a(this.f6498a, fVar.f6498a) && C.a(this.f6499b, fVar.f6499b) && C.a(this.f6500c, fVar.f6500c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f6498a.hashCode() * 31;
        String str = this.f6499b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6500c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
