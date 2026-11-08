package Ca;

import org.maplibre.android.geometry.LatLngBounds;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final org.maplibre.android.maps.x f1509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f1515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LatLngBounds f1516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ma.d f1517i;

    public f() {
        org.maplibre.android.maps.x xVar = new org.maplibre.android.maps.x();
        xVar.f25055l = true;
        xVar.f25052h = false;
        xVar.f25035G = true;
        this.f1509a = xVar;
        this.f1510b = false;
        this.f1511c = false;
        this.f1512d = true;
        this.f1513e = 0;
        this.f1514f = 0;
        this.f1515g = "";
        this.f1516h = null;
        this.f1517i = null;
    }

    @Override // Ca.p
    public final void A(int i10) {
        this.f1513e = i10;
    }

    @Override // Ca.p
    public final void C(int i10) {
        org.maplibre.android.maps.x xVar = this.f1509a;
        if (i10 == 0) {
            xVar.f25056m = 8388659;
            return;
        }
        if (i10 == 1) {
            xVar.f25056m = 8388661;
        } else if (i10 == 2) {
            xVar.f25056m = 8388691;
        } else {
            if (i10 != 3) {
                return;
            }
            xVar.f25056m = 8388693;
        }
    }

    @Override // Ca.p
    public final void E(boolean z10) {
        this.f1509a.f25052h = z10;
    }

    @Override // Ca.p
    public final void a(boolean z10) {
        this.f1509a.f25036H = z10;
    }

    @Override // Ca.p
    public final void d(boolean z10) {
        this.f1509a.f25047c = z10;
    }

    @Override // Ca.p
    public final void e(boolean z10) {
        this.f1510b = z10;
    }

    @Override // Ca.p
    public final void f(int i10, int i11) {
        org.maplibre.android.maps.x xVar = this.f1509a;
        int i12 = xVar.f25056m;
        if (i12 == 8388659) {
            xVar.f25057n = new int[]{i10, i11, 0, 0};
            return;
        }
        if (i12 == 8388661) {
            xVar.f25057n = new int[]{0, i11, i10, 0};
        } else if (i12 != 8388693) {
            xVar.f25057n = new int[]{i10, 0, 0, i11};
        } else {
            xVar.f25057n = new int[]{0, 0, i10, i11};
        }
    }

    @Override // Ca.p
    public final void g(String str) {
        this.f1515g = str;
    }

    @Override // Ca.p
    public final void k(boolean z10) {
        this.f1509a.f25064v = z10;
    }

    @Override // Ca.p
    public final void l(boolean z10) {
        this.f1509a.f25065w = z10;
    }

    @Override // Ca.p
    public final void m(int i10) {
        this.f1514f = i10;
    }

    @Override // Ca.p
    public final void n(Float f10, Float f11) {
        org.maplibre.android.maps.x xVar = this.f1509a;
        if (f10 != null) {
            xVar.f25058o = f10.floatValue();
        }
        if (f11 != null) {
            xVar.f25059p = f11.floatValue();
        }
    }

    @Override // Ca.p
    public final void o(int i10, int i11) {
        org.maplibre.android.maps.x xVar = this.f1509a;
        int i12 = xVar.f25049e;
        if (i12 == 8388659) {
            xVar.f25050f = new int[]{i10, i11, 0, 0};
            return;
        }
        if (i12 == 8388691) {
            xVar.f25050f = new int[]{i10, 0, 0, i11};
        } else if (i12 != 8388693) {
            xVar.f25050f = new int[]{0, i11, i10, 0};
        } else {
            xVar.f25050f = new int[]{0, 0, i10, i11};
        }
    }

    @Override // Ca.p
    public final void p(boolean z10) {
        this.f1509a.f25061s = z10;
    }

    @Override // Ca.p
    public final void q(int i10, int i11) {
        this.f1509a.f25054j = new int[]{i10, 0, 0, i11};
    }

    @Override // Ca.p
    public final void s(int i10) {
        org.maplibre.android.maps.x xVar = this.f1509a;
        if (i10 == 0) {
            xVar.f25049e = 8388659;
            return;
        }
        if (i10 == 1) {
            xVar.f25049e = 8388661;
        } else if (i10 == 2) {
            xVar.f25049e = 8388691;
        } else {
            if (i10 != 3) {
                return;
            }
            xVar.f25049e = 8388693;
        }
    }

    @Override // Ca.p
    public final void t(int i10) {
        this.f1509a.f25037I = i10;
    }

    @Override // Ca.p
    public final void u(int i10) {
        org.maplibre.android.maps.x xVar = this.f1509a;
        if (i10 == 0) {
            xVar.f25053i = 8388659;
            return;
        }
        if (i10 == 1) {
            xVar.f25053i = 8388661;
        } else if (i10 == 2) {
            xVar.f25053i = 8388691;
        } else {
            if (i10 != 3) {
                return;
            }
            xVar.f25053i = 8388693;
        }
    }

    @Override // Ca.p
    public final void v(boolean z10) {
        this.f1509a.f25062t = z10;
    }

    @Override // Ca.p
    public final void w(ma.d dVar) {
        this.f1517i = dVar;
    }

    @Override // Ca.p
    public final void x(boolean z10) {
        this.f1509a.f25055l = z10;
    }

    @Override // Ca.p
    public final void y(LatLngBounds latLngBounds) {
        this.f1516h = latLngBounds;
    }

    @Override // Ca.p
    public final void z(boolean z10) {
        this.f1511c = z10;
    }
}
