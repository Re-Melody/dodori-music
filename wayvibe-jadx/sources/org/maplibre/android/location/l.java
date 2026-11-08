package org.maplibre.android.location;

import B8.C0116c;
import android.content.Context;
import android.location.Location;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.C2203a;
import org.maplibre.android.maps.C2216n;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.P;
import org.maplibre.android.maps.Q;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final org.maplibre.android.maps.w f24691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P f24692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f24693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z f24694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p120ka.d f24695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Y7.e f24696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0116c f24697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f24698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f24699j;
    public LatLng k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f24700l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C2199f f24701m = new C2199f(this, 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C2199f f24702n = new C2199f(this, 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2199f f24703o = new C2199f(this, 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C2197d f24704p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C2197d f24705q;
    public final C2197d r;

    /* JADX WARN: Type inference failed for: r0v3, types: [org.maplibre.android.location.d] */
    /* JADX WARN: Type inference failed for: r0v4, types: [org.maplibre.android.location.d] */
    /* JADX WARN: Type inference failed for: r0v5, types: [org.maplibre.android.location.d] */
    public l(Context context, org.maplibre.android.maps.w wVar, P p10, s sVar, z zVar, Y7.e eVar) {
        final int i10 = 0;
        this.f24704p = new C(this) { // from class: org.maplibre.android.location.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f24677b;

            {
                this.f24677b = this;
            }

            @Override // org.maplibre.android.location.C
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        l lVar = this.f24677b;
                        lVar.getClass();
                        float fFloatValue = ((Float) obj).floatValue();
                        if (!lVar.f24699j) {
                            lVar.f24692c.j(lVar.f24691b, new ga.e(fFloatValue, 3), null);
                            ((w) lVar.f24696g.f13395b).f24716A.h();
                            break;
                        }
                        break;
                    case 1:
                        double[] dArr = (double[]) obj;
                        l lVar2 = this.f24677b;
                        if (!lVar2.f24699j) {
                            lVar2.f24692c.j(lVar2.f24691b, new ga.d(null, -1.0d, -1.0d, -1.0d, dArr), null);
                            ((w) lVar2.f24696g.f13395b).f24716A.h();
                            break;
                        }
                        break;
                    default:
                        l lVar3 = this.f24677b;
                        lVar3.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue();
                        if (!lVar3.f24699j) {
                            lVar3.f24692c.j(lVar3.f24691b, new ga.d(null, -1.0d, fFloatValue2, -1.0d, null), null);
                            ((w) lVar3.f24696g.f13395b).f24716A.h();
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f24705q = new C(this) { // from class: org.maplibre.android.location.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f24677b;

            {
                this.f24677b = this;
            }

            @Override // org.maplibre.android.location.C
            public final void a(Object obj) {
                switch (i11) {
                    case 0:
                        l lVar = this.f24677b;
                        lVar.getClass();
                        float fFloatValue = ((Float) obj).floatValue();
                        if (!lVar.f24699j) {
                            lVar.f24692c.j(lVar.f24691b, new ga.e(fFloatValue, 3), null);
                            ((w) lVar.f24696g.f13395b).f24716A.h();
                            break;
                        }
                        break;
                    case 1:
                        double[] dArr = (double[]) obj;
                        l lVar2 = this.f24677b;
                        if (!lVar2.f24699j) {
                            lVar2.f24692c.j(lVar2.f24691b, new ga.d(null, -1.0d, -1.0d, -1.0d, dArr), null);
                            ((w) lVar2.f24696g.f13395b).f24716A.h();
                            break;
                        }
                        break;
                    default:
                        l lVar3 = this.f24677b;
                        lVar3.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue();
                        if (!lVar3.f24699j) {
                            lVar3.f24692c.j(lVar3.f24691b, new ga.d(null, -1.0d, fFloatValue2, -1.0d, null), null);
                            ((w) lVar3.f24696g.f13395b).f24716A.h();
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 2;
        this.r = new C(this) { // from class: org.maplibre.android.location.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f24677b;

            {
                this.f24677b = this;
            }

            @Override // org.maplibre.android.location.C
            public final void a(Object obj) {
                switch (i12) {
                    case 0:
                        l lVar = this.f24677b;
                        lVar.getClass();
                        float fFloatValue = ((Float) obj).floatValue();
                        if (!lVar.f24699j) {
                            lVar.f24692c.j(lVar.f24691b, new ga.e(fFloatValue, 3), null);
                            ((w) lVar.f24696g.f13395b).f24716A.h();
                            break;
                        }
                        break;
                    case 1:
                        double[] dArr = (double[]) obj;
                        l lVar2 = this.f24677b;
                        if (!lVar2.f24699j) {
                            lVar2.f24692c.j(lVar2.f24691b, new ga.d(null, -1.0d, -1.0d, -1.0d, dArr), null);
                            ((w) lVar2.f24696g.f13395b).f24716A.h();
                            break;
                        }
                        break;
                    default:
                        l lVar3 = this.f24677b;
                        lVar3.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue();
                        if (!lVar3.f24699j) {
                            lVar3.f24692c.j(lVar3.f24691b, new ga.d(null, -1.0d, fFloatValue2, -1.0d, null), null);
                            ((w) lVar3.f24696g.f13395b).f24716A.h();
                            break;
                        }
                        break;
                }
            }
        };
        C2200g c2200g = new C2200g(this, 0);
        C2201h c2201h = new C2201h(this);
        C2202i c2202i = new C2202i(this);
        j jVar = new j(this);
        this.f24691b = wVar;
        this.f24692c = p10;
        this.f24697h = ((MapView) wVar.f25022f.f24918a).f24870p.f24999o;
        k kVar = new k(this, context);
        this.f24698i = kVar;
        this.f24695f = (p120ka.d) kVar.f782i;
        C2203a c2203a = wVar.f25022f;
        ((MapView) c2203a.f24918a).f24870p.f24995j.add(c2202i);
        MapView mapView = (MapView) c2203a.f24918a;
        mapView.f24870p.f24993h.add(jVar);
        mapView.f24870p.f24994i.add(c2201h);
        wVar.f25021e.f24937f.add(c2200g);
        this.f24693d = sVar;
        this.f24696g = eVar;
        c(zVar);
    }

    public static boolean a(l lVar) {
        int i10 = lVar.f24690a;
        return i10 == 16 || i10 == 32 || i10 == 22 || i10 == 34 || i10 == 36;
    }

    public final void b() {
        if (this.f24694e.f24838z) {
            boolean zD = d();
            p120ka.d dVar = this.f24695f;
            if (zD) {
                dVar.f21812y = this.f24694e.f24801A;
            } else {
                dVar.f21812y = ((p120ka.d) this.f24697h.f782i).f21812y;
                dVar.f21811x = null;
            }
        }
    }

    public final void c(z zVar) {
        this.f24694e = zVar;
        boolean z10 = zVar.f24838z;
        org.maplibre.android.maps.w wVar = this.f24691b;
        if (z10) {
            MapView mapView = (MapView) wVar.f25022f.f24918a;
            C2216n c2216n = mapView.f24870p;
            C0116c c0116c = c2216n.f24999o;
            k kVar = this.f24698i;
            if (c0116c != kVar) {
                Context context = mapView.getContext();
                c2216n.e(kVar);
                c2216n.d(context);
            }
            b();
            return;
        }
        MapView mapView2 = (MapView) wVar.f25022f.f24918a;
        C2216n c2216n2 = mapView2.f24870p;
        C0116c c0116c2 = c2216n2.f24999o;
        C0116c c0116c3 = this.f24697h;
        if (c0116c2 != c0116c3) {
            Context context2 = mapView2.getContext();
            c2216n2.e(c0116c3);
            c2216n2.d(context2);
        }
    }

    public final boolean d() {
        int i10 = this.f24690a;
        return i10 == 24 || i10 == 32 || i10 == 34 || i10 == 36;
    }

    public final void e(int i10, Location location, oa.e eVar) {
        double d10;
        if (this.f24690a == i10) {
            if (eVar != null) {
                eVar.g(i10);
                return;
            }
            return;
        }
        boolean zD = d();
        this.f24690a = i10;
        org.maplibre.android.maps.w wVar = this.f24691b;
        if (i10 != 8) {
            wVar.f25020d.c();
        }
        b();
        int i11 = this.f24690a;
        s sVar = this.f24693d;
        sVar.j(i11);
        if (zD && !d()) {
            Q q5 = wVar.f25018b;
            q5.f24917z = null;
            q5.f24894a.a(null);
            sVar.i();
        }
        if (zD || !d() || location == null || !this.f24700l) {
            if (eVar != null) {
                eVar.g(this.f24690a);
                return;
            }
            return;
        }
        this.f24699j = true;
        LatLng latLng = new LatLng(location);
        int i12 = this.f24690a;
        if (i12 == 34 || i12 == 36 || i12 == 22) {
            double bearing = i12 == 36 ? 0.0d : location.getBearing();
            while (bearing >= 360.0d) {
                bearing -= 360.0d;
            }
            while (bearing < 0.0d) {
                bearing += 360.0d;
            }
            d10 = bearing;
        } else {
            d10 = -1.0d;
        }
        ga.d dVarH = p003a.a.H(new CameraPosition(latLng, -1.0d, -1.0d, d10, null));
        C2198e c2198e = new C2198e(this, eVar);
        boolean zD2 = p025b9.a.D(wVar.f25019c, wVar.f25020d.d().target, latLng);
        P p10 = this.f24692c;
        if (zD2) {
            p10.j(wVar, dVarH, c2198e);
        } else {
            p10.b(wVar, dVarH, (int) 750, c2198e);
        }
    }
}
