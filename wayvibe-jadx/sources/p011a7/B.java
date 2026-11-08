package p011a7;

import V0.p;
import com.google.android.gms.common.internal.E;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FirebaseAuth f14183g;

    public B(String str, String str2, int i10, int i11, long j10, String str3, FirebaseAuth firebaseAuth) {
        E.f(str3, "sessionInfo cannot be empty.");
        E.f(str, "sharedSecretKey cannot be empty. This is required to generate QR code URL.");
        this.f14177a = str;
        E.f(str2, "hashAlgorithm cannot be empty.");
        this.f14178b = str2;
        this.f14179c = i10;
        this.f14180d = i11;
        this.f14181e = j10;
        this.f14182f = str3;
        this.f14183g = firebaseAuth;
    }

    public final String a(String str, String str2) {
        E.f(str, "accountName cannot be empty.");
        E.f(str2, "issuer cannot be empty.");
        StringBuilder sb = new StringBuilder("otpauth://totp/");
        p.y(sb, str2, ":", str, "?secret=");
        p.y(sb, this.f14177a, "&issuer=", str2, "&algorithm=");
        sb.append(this.f14178b);
        sb.append("&digits=");
        sb.append(this.f14179c);
        return sb.toString();
    }
}
