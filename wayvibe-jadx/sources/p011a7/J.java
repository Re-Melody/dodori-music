package p011a7;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14196c;

    public J(String str, String str2, String str3) {
        this.f14194a = str;
        this.f14195b = str2;
        this.f14196c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof J) {
            J j10 = (J) obj;
            String str = this.f14194a;
            if (str != null ? str.equals(j10.f14194a) : j10.f14194a == null) {
                String str2 = this.f14195b;
                if (str2 != null ? str2.equals(j10.f14195b) : j10.f14195b == null) {
                    String str3 = this.f14196c;
                    if (str3 != null ? str3.equals(j10.f14196c) : j10.f14196c == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f14194a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f14195b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f14196c;
        return (str3 != null ? str3.hashCode() : 0) ^ iHashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttestationResult{recaptchaV2Token=");
        sb.append(this.f14194a);
        sb.append(", playIntegrityToken=");
        sb.append(this.f14195b);
        sb.append(", recaptchaEnterpriseToken=");
        return b.m(sb, this.f14196c, "}");
    }
}
