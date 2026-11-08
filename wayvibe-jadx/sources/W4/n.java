package W4;

import G0.AbstractC0454b;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class n implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f12827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f12828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M4.e f12829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile AbstractC0454b f12830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f12831e;

    public n(c cVar, Uri uri, M4.e eVar) {
        e eVar2 = new e(uri, 1);
        this.f12828b = cVar;
        this.f12827a = eVar2;
        this.f12829c = eVar;
    }

    @Override // W4.k
    public final void d() {
        this.f12831e = true;
    }

    @Override // W4.k
    public final boolean e() {
        return this.f12831e;
    }

    @Override // W4.k
    public final void f() {
        d dVar = new d(this.f12828b, this.f12827a);
        try {
            dVar.f12792a.a(dVar.f12793b);
            dVar.f12795d = true;
            this.f12830d = this.f12829c.c(this.f12828b.a(), dVar);
        } finally {
            X4.j.f(dVar);
        }
    }
}
