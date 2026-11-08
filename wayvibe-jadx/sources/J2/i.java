package J2;

import B2.C;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6513e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f6509a = str;
        this.f6510b = str2;
        this.f6511c = str3;
        this.f6512d = str4;
        this.f6513e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return C.a(this.f6509a, iVar.f6509a) && C.a(this.f6510b, iVar.f6510b) && C.a(this.f6511c, iVar.f6511c) && C.a(this.f6512d, iVar.f6512d) && C.a(this.f6513e, iVar.f6513e);
    }

    public final int hashCode() {
        String str = this.f6509a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6510b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6511c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f6512d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f6513e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
