package org.maplibre.android.maps;

import B8.C0116c;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.DecelerateInterpolator;
import app.nagakiba.wayvibe.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: org.maplibre.android.maps.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2216n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f24986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f24987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q f24988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2204b f24989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2206d f24990e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PointF f24997m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0116c f24999o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ValueAnimator f25000p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f25001q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f25003t;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f24991f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList f24992g = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList f24993h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f24994i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f24995j = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList k = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f24996l = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PointF f24998n = new PointF();
    public final ArrayList r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Handler f25002s = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final A f25004u = new A(this, 1);

    public C2216n(Context context, P p10, J j10, Q q5, C2204b c2204b, C2206d c2206d) {
        this.f24989d = c2204b;
        this.f24986a = p10;
        this.f24987b = j10;
        this.f24988c = q5;
        this.f24990e = c2206d;
        if (context != null) {
            e(new C0116c(context, true));
            d(context);
        }
    }

    public final void a() {
        this.f25002s.removeCallbacksAndMessages(null);
        this.r.clear();
        ValueAnimator valueAnimator = this.f25000p;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f25001q;
        if (valueAnimator2 != null && valueAnimator2.isStarted()) {
            valueAnimator2.cancel();
        }
        c();
    }

    public final ValueAnimator b(double d10, double d11, PointF pointF, long j10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((float) d10, (float) (d10 + d11));
        valueAnimatorOfFloat.setDuration(j10);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new C2210h(this, pointF, 1));
        valueAnimatorOfFloat.addListener(new P3.p(this, 6));
        return valueAnimatorOfFloat;
    }

    public final void c() {
        if (f()) {
            this.f24986a.h();
            this.f24990e.F();
        }
    }

    public final void d(Context context) {
        C2214l c2214l = new C2214l(this, context.getResources().getDimension(R.dimen.mapbox_defaultScaleSpanSinceStartThreshold));
        C2209g c2209g = new C2209g(this);
        C2212j c2212j = new C2212j(this, context.getResources().getDimension(R.dimen.maplibre_density_constant), context.getResources().getDimension(R.dimen.maplibre_minimum_scale_speed), context.getResources().getDimension(R.dimen.maplibre_minimum_angled_scale_speed), context.getResources().getDimension(R.dimen.maplibre_minimum_scale_velocity));
        C2211i c2211i = new C2211i(this, context.getResources().getDimension(R.dimen.maplibre_minimum_scale_span_when_rotating), context.getResources().getDimension(R.dimen.maplibre_density_constant), context.getResources().getDimension(R.dimen.maplibre_angular_velocity_multiplier), context.getResources().getDimension(R.dimen.maplibre_minimum_angular_velocity), context.getResources().getDimension(R.dimen.mapbox_defaultScaleSpanSinceStartThreshold));
        C2213k c2213k = new C2213k(this);
        C2215m c2215m = new C2215m(this);
        C0116c c0116c = this.f24999o;
        ((p120ka.o) c0116c.f777d).f21802h = c2214l;
        ((p120ka.d) c0116c.f782i).f21802h = c2209g;
        ((p120ka.q) c0116c.f778e).f21802h = c2212j;
        ((p120ka.j) c0116c.f779f).f21802h = c2211i;
        ((p120ka.k) c0116c.f780g).f21802h = c2213k;
        ((p120ka.g) c0116c.f781h).f21802h = c2215m;
    }

    public final void e(C0116c c0116c) {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        hashSet.add(1);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(3);
        hashSet2.add(2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(1);
        hashSet3.add(6);
        c0116c.getClass();
        List listAsList = Arrays.asList(hashSet, hashSet2, hashSet3);
        ArrayList arrayList = (ArrayList) c0116c.f775b;
        arrayList.clear();
        arrayList.addAll(listAsList);
        ((p120ka.j) c0116c.f779f).f21835v = 3.0f;
        p120ka.d dVar = (p120ka.d) c0116c.f782i;
        dVar.f21812y = dVar.f21795a.getResources().getDimension(R.dimen.maplibre_minimum_move_threshold);
        this.f24999o = c0116c;
    }

    public final boolean f() {
        Q q5 = this.f24988c;
        if (q5.f24906n && ((p120ka.d) this.f24999o.f782i).f21830q) {
            return false;
        }
        if (q5.f24905m && ((p120ka.q) this.f24999o.f778e).f21830q) {
            return false;
        }
        if (q5.k && ((p120ka.j) this.f24999o.f779f).f21830q) {
            return false;
        }
        return (q5.f24904l && ((p120ka.k) this.f24999o.f780g).f21830q) ? false : true;
    }

    public final void g(ValueAnimator valueAnimator) {
        this.r.add(valueAnimator);
        Handler handler = this.f25002s;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(this.f25004u, 150L);
    }

    public final void h(boolean z10, PointF pointF, boolean z11) {
        ValueAnimator valueAnimator = this.f25000p;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorB = b(this.f24986a.f(), z10 ? 1.0d : -1.0d, pointF, 300L);
        this.f25000p = valueAnimatorB;
        if (z11) {
            valueAnimatorB.start();
        } else {
            g(valueAnimatorB);
        }
    }
}
