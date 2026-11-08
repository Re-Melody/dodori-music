package p089i1;

import U.A0;
import android.os.Handler;
import java.util.ArrayList;
import p009a5.o;
import p048e0.x;

/* JADX INFO: loaded from: classes.dex */
public final class i implements A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f20448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f20449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f20450c = new x(new h(this, 0));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20451d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f20452e = new h(this, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f20453f = new ArrayList();

    public i(g gVar) {
        this.f20448a = gVar;
    }

    @Override // U.A0
    public final void b() {
        x xVar = this.f20450c;
        o oVar = xVar.f19550g;
        if (oVar != null) {
            oVar.b();
        }
        xVar.b();
    }

    @Override // U.A0
    public final void c() {
        this.f20450c.d();
    }

    @Override // U.A0
    public final void a() {
    }
}
