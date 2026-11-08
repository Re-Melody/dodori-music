package D8;

import B8.EnumC0128o;

/* JADX INFO: loaded from: classes2.dex */
public final class B1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B8.A f2196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EnumC0128o f2197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0330y1 f2198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2199d = false;

    public B1(B8.A a10, EnumC0128o enumC0128o, C0330y1 c0330y1) {
        this.f2196a = a10;
        this.f2197b = enumC0128o;
        this.f2198c = c0330y1;
    }

    public static void a(B1 b10, EnumC0128o enumC0128o) {
        b10.f2197b = enumC0128o;
        if (enumC0128o == EnumC0128o.READY || enumC0128o == EnumC0128o.TRANSIENT_FAILURE) {
            b10.f2199d = true;
        } else if (enumC0128o == EnumC0128o.IDLE) {
            b10.f2199d = false;
        }
    }
}
