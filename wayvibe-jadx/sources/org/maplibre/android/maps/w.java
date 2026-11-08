package org.maplibre.android.maps;

import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLngBounds;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f25017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f25018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f25019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P f25020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2206d f25021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2203a f25022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f25023g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f25024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public L f25025i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public org.maplibre.android.location.w f25026j;
    public C2204b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public M f25027l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f25028m;

    public w(H h10, P p10, Q q5, J j10, C2203a c2203a, C2206d c2206d, ArrayList arrayList) {
        this.f25017a = h10;
        this.f25018b = q5;
        this.f25019c = j10;
        this.f25020d = p10;
        this.f25022f = c2203a;
        this.f25021e = c2206d;
        this.f25024h = arrayList;
    }

    public final void a(ga.b bVar, int i10, p025b9.a aVar) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Null duration passed into animateCamera");
        }
        h();
        this.f25020d.b(this, bVar, i10, aVar);
    }

    public final void b(ga.b bVar, int i10, boolean z10, Ca.h hVar) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Null duration passed into easeCamera");
        }
        h();
        P p10 = this.f25020d;
        p10.getClass();
        CameraPosition cameraPositionA = bVar.a(this);
        if (!((cameraPositionA == null || cameraPositionA.equals(p10.f24886d)) ? false : true)) {
            if (hVar != null) {
                hVar.a();
            }
        } else {
            p10.c();
            p10.f24888f.r(3);
            if (hVar != null) {
                p10.f24887e = hVar;
            }
            p10.f24884b.f24856a.f24941c.add(p10);
            ((NativeMapView) p10.f24883a).j(cameraPositionA.target, cameraPositionA.zoom, cameraPositionA.bearing, cameraPositionA.tilt, cameraPositionA.padding, i10, z10);
        }
    }

    public final CameraPosition c(LatLngBounds latLngBounds, int[] iArr, double d10, double d11) {
        return ((NativeMapView) this.f25017a).n(latLngBounds, iArr, d10, d11);
    }

    public final CameraPosition d() {
        return this.f25020d.d();
    }

    public final double e() {
        return ((NativeMapView) this.f25020d.f24883a).r();
    }

    public final double f() {
        return ((NativeMapView) this.f25020d.f24883a).t();
    }

    public final M g() {
        M m8 = this.f25027l;
        if (m8 == null || !m8.f24854f) {
            return null;
        }
        return m8;
    }

    public final void h() {
        Iterator it = this.f25024h.iterator();
        while (it.hasNext()) {
            org.maplibre.android.location.w wVar = ((org.maplibre.android.location.m) it.next()).f24706a;
            if (wVar.f24737n && wVar.f24738o) {
                wVar.g(8);
            }
        }
    }

    public final void i() {
        ArrayList arrayList = (ArrayList) this.k.f24921c.f24918a;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }

    public final List j(PointF pointF, za.g gVar, String... strArr) {
        return ((NativeMapView) this.f25017a).G(pointF, gVar, strArr);
    }

    public final List k(PointF pointF, String... strArr) {
        return ((NativeMapView) this.f25017a).G(pointF, null, strArr);
    }

    public final List l(RectF rectF, za.g gVar, String... strArr) {
        return ((NativeMapView) this.f25017a).H(rectF, gVar, strArr);
    }

    public final List m(RectF rectF, String... strArr) {
        return ((NativeMapView) this.f25017a).H(rectF, null, strArr);
    }

    public final void n(float f10, float f11) {
        h();
        ((NativeMapView) this.f25017a).C(f10, f11, 0L);
    }

    public final void o(LatLngBounds latLngBounds) {
        ((NativeMapView) this.f25017a).R(latLngBounds);
    }

    public final void p(int i10, int i11, int i12, int i13) {
        int[] iArr = {i10, i11, i12, i13};
        J j10 = this.f25019c;
        j10.getClass();
        double[] dArr = new double[4];
        for (int i14 = 0; i14 < 4; i14++) {
            dArr[i14] = iArr[i14];
        }
        NativeMapView nativeMapView = (NativeMapView) ((H) j10.f24848b);
        if (!nativeMapView.h("setContentPadding")) {
            nativeMapView.f24880g = dArr;
        }
        Q q5 = this.f25018b;
        int[] iArr2 = q5.f24902i;
        int i15 = iArr2[0];
        int i16 = iArr2[1];
        int i17 = iArr2[2];
        int i18 = iArr2[3];
        ImageView imageView = q5.f24901h;
        if (imageView != null) {
            Q.l(i15, i16, i17, i18, imageView, iArr2);
        }
        qa.a aVar = q5.f24897d;
        q5.g(aVar != null ? aVar.isEnabled() : false);
        int[] iArr3 = q5.f24898e;
        q5.i(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
        int[] iArr4 = q5.f24900g;
        q5.f(iArr4[0], iArr4[1], iArr4[2], iArr4[3]);
    }

    public final void q(B9.d dVar, L l10) {
        this.f25025i = l10;
        this.f25026j.e();
        M m8 = this.f25027l;
        if (m8 != null) {
            m8.f();
        }
        H h10 = this.f25017a;
        this.f25027l = new M(dVar, h10);
        if (!TextUtils.isEmpty((String) dVar.f905e)) {
            ((NativeMapView) h10).a0((String) dVar.f905e);
        } else if (TextUtils.isEmpty((String) dVar.f906f)) {
            ((NativeMapView) h10).Z("{\"version\": 8,\"sources\": {},\"layers\": []}");
        } else {
            ((NativeMapView) h10).Z((String) dVar.f906f);
        }
    }
}
