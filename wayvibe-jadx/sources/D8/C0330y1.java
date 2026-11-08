package D8;

import B8.C0129p;
import B8.EnumC0128o;
import java.util.logging.Level;

/* JADX INFO: renamed from: D8.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0330y1 implements B8.P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0129p f2860a = C0129p.a(EnumC0128o.IDLE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B1 f2861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1 f2862c;

    public C0330y1(C1 c3) {
        this.f2862c = c3;
    }

    @Override // B8.P
    public final void a(C0129p c0129p) {
        C1.f2201o.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{c0129p, this.f2861b.f2196a});
        this.f2860a = c0129p;
        C1 c3 = this.f2862c;
        if (c3.f2204h.c() && ((B1) c3.f2203g.get(c3.f2204h.a())).f2198c == this) {
            c3.j(this.f2861b);
        }
    }
}
