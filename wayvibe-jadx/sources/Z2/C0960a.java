package Z2;

import Z4.C0976i;

/* JADX INFO: renamed from: Z2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0960a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13480c;

    public C0960a(String str, int i10, int i11, int i12, long j10) {
        this.f13478a = str;
        this.f13480c = i10;
        this.f13479b = i11;
    }

    public C0976i a() {
        C0976i c0976i = new C0976i();
        c0976i.f13768a = this.f13479b;
        c0976i.f13769b = this.f13480c;
        c0976i.f13770c = this.f13478a;
        return c0976i;
    }
}
