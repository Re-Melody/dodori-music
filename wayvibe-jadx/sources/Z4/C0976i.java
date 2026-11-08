package Z4;

import B2.AbstractC0112b;
import Z2.C0960a;
import com.google.android.gms.internal.play_billing.zzc;

/* JADX INFO: renamed from: Z4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0976i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13770c;

    public static C0960a a() {
        C0960a c0960a = new C0960a();
        c0960a.f13480c = 0;
        c0960a.f13478a = "";
        return c0960a;
    }

    public final String toString() {
        return AbstractC0112b.g("Response Code: ", zzc.zzl(this.f13768a), ", Debug Message: ", this.f13770c);
    }
}
