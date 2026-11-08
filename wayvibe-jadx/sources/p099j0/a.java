package p099j0;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import p028c1.c;
import p028c1.k;
import p133m0.f;
import p143n0.AbstractC2078e;
import p143n0.C2077d;
import p143n0.InterfaceC2093u;
import p163p0.b;

/* JADX INFO: loaded from: classes.dex */
public final class a extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f21381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z8.c f21383c;

    public a(c cVar, long j10, Z8.c cVar2) {
        this.f21381a = cVar;
        this.f21382b = j10;
        this.f21383c = cVar2;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        b bVar = new b();
        k kVar = k.Ltr;
        Canvas canvas2 = AbstractC2078e.f22762a;
        C2077d c2077d = new C2077d();
        c2077d.f22749a = canvas;
        p163p0.a aVar = bVar.f25146a;
        p028c1.b bVar2 = aVar.f25142a;
        k kVar2 = aVar.f25143b;
        InterfaceC2093u interfaceC2093u = aVar.f25144c;
        long j10 = aVar.f25145d;
        aVar.f25142a = this.f21381a;
        aVar.f25143b = kVar;
        aVar.f25144c = c2077d;
        aVar.f25145d = this.f21382b;
        c2077d.c();
        this.f21383c.invoke(bVar);
        c2077d.q();
        aVar.f25142a = bVar2;
        aVar.f25143b = kVar2;
        aVar.f25144c = interfaceC2093u;
        aVar.f25145d = j10;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j10 = this.f21382b;
        float fD = f.d(j10);
        c cVar = this.f21381a;
        point.set(cVar.Y(fD / cVar.a()), cVar.Y(f.b(j10) / cVar.a()));
        point2.set(point.x / 2, point.y / 2);
    }
}
