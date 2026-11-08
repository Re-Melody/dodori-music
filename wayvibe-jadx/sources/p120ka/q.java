package p120ka;

import B8.C0116c;
import V0.p;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.maplibre.android.maps.C2212j;
import org.maplibre.android.maps.C2216n;
import org.maplibre.android.maps.P;
import org.maplibre.android.maps.Q;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends i {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final HashSet f21849H;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f21850A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f21851B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f21852C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f21853D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f21854E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f21855F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f21856G;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final GestureDetector f21857v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f21858w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PointF f21859x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f21860y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f21861z;

    static {
        HashSet hashSet = new HashSet();
        f21849H = hashSet;
        hashSet.add(1);
        hashSet.add(15);
    }

    public q(Context context, C0116c c0116c) {
        super(context, c0116c);
        this.f21857v = new GestureDetector(context, new p(this));
    }

    @Override // p120ka.i, p120ka.f, p120ka.a
    public final boolean a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f21858w) {
            if (actionMasked == 5 || actionMasked == 3) {
                boolean z10 = this.f21830q;
                if (!z10) {
                    this.f21858w = false;
                } else if (z10) {
                    this.r = true;
                }
            } else if (!this.f21830q && actionMasked == 1) {
                this.f21858w = false;
            }
        }
        return this.f21857v.onTouchEvent(motionEvent) | super.a(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0247  */
    /* JADX WARN: Code duplicated, block: B:117:0x0256  */
    /* JADX WARN: Code duplicated, block: B:118:0x0263  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc  */
    @Override // p120ka.f
    public final boolean c() {
        float f10;
        P p10;
        Iterator it;
        boolean z10 = this.f21830q;
        ArrayList arrayList = this.f21821l;
        boolean z11 = false;
        if (z10 && this.f21858w && arrayList.size() > 1) {
            i();
            return false;
        }
        PointF pointF = this.f21858w ? this.f21859x : this.f21823n;
        this.f21850A = 0.0f;
        this.f21851B = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.f21850A = Math.abs(this.f21798d.getX(i10) - pointF.x) + this.f21850A;
            this.f21851B = Math.abs(this.f21798d.getY(i10) - pointF.y) + this.f21851B;
        }
        float f11 = this.f21850A * 2.0f;
        this.f21850A = f11;
        float f12 = this.f21851B * 2.0f;
        this.f21851B = f12;
        if (this.f21858w) {
            this.f21861z = f12;
        } else {
            this.f21861z = (float) Math.hypot(f11, f12);
        }
        if (this.f21860y == 0.0f) {
            this.f21860y = this.f21861z;
        }
        this.f21853D = Math.abs(this.f21860y - this.f21861z);
        if (this.f21858w) {
            boolean z12 = (this.f21798d.getY() < this.f21859x.y && this.f21861z < this.f21852C) || (this.f21798d.getY() > this.f21859x.y && this.f21861z > this.f21852C);
            float fAbs = Math.abs(1.0f - (this.f21861z / this.f21852C)) * 0.5f;
            if (this.f21852C <= 0.0f) {
                f10 = 1.0f;
            } else {
                f10 = z12 ? fAbs + 1.0f : 1.0f - fAbs;
            }
        } else {
            float f13 = this.f21852C;
            if (f13 > 0.0f) {
                f10 = this.f21861z / f13;
            } else {
                f10 = 1.0f;
            }
        }
        this.f21856G = f10;
        this.f21855F = f10 < 1.0f;
        if (this.f21830q && this.f21861z > 0.0f) {
            C2212j c2212j = (C2212j) this.f21802h;
            C2216n c2216n = c2212j.f24981i;
            c2216n.f24990e.r(1);
            PointF pointFA = c2212j.a(this);
            boolean z13 = c2212j.f24977e;
            P p11 = c2216n.f24986a;
            Q q5 = c2216n.f24988c;
            if (z13) {
                double dAbs = Math.abs(this.f21798d.getY() - c2216n.f24998n.y);
                z11 = this.f21798d.getY() < c2216n.f24998n.y;
                double d10 = (((dAbs - 0.0d) / (c2212j.f24979g - 0.0d)) * 4.0d) + 0.0d;
                double d11 = c2212j.f24980h;
                p11.m((z11 ? d11 - d10 : d11 + d10) * ((double) q5.f24915x), pointFA);
            } else {
                p11.n((Math.log(this.f21856G) / Math.log(1.5707963267948966d)) * 0.6499999761581421d * ((double) q5.f24915x), pointFA);
            }
            Iterator it2 = c2216n.k.iterator();
            if (it2.hasNext()) {
                throw p.g(it2);
            }
            c2212j.f24978f = Math.abs(this.f21861z - this.f21852C);
            z11 = true;
        } else if (b(this.f21858w ? 15 : 1) && this.f21853D >= this.f21854E) {
            C2212j c2212j2 = (C2212j) this.f21802h;
            c2212j2.getClass();
            boolean z14 = arrayList.size() == 1;
            c2212j2.f24977e = z14;
            C2216n c2216n2 = c2212j2.f24981i;
            Q q9 = c2216n2.f24988c;
            if (q9.f24905m) {
                if (!z14) {
                    float f14 = this.f21852C;
                    if (f14 > 0.0f) {
                        float f15 = this.f21861z;
                        double eventTime = this.f21798d.getEventTime();
                        double eventTime2 = this.f21799e.getEventTime();
                        if (eventTime != eventTime2) {
                            double dAbs2 = ((double) Math.abs(f15 - f14)) / (eventTime - eventTime2);
                            if (dAbs2 >= c2212j2.f24973a) {
                                j jVar = (j) c2216n2.f24999o.f779f;
                                if (jVar.f21830q) {
                                    c2212j2.f24979g = Resources.getSystem().getDisplayMetrics().heightPixels;
                                    p10 = c2216n2.f24986a;
                                    c2212j2.f24980h = p10.f();
                                    if (c2216n2.f()) {
                                        p10.c();
                                    }
                                    it = c2216n2.k.iterator();
                                    if (it.hasNext()) {
                                        throw p.g(it);
                                    }
                                    c2212j2.f24978f = Math.abs(this.f21861z - this.f21852C);
                                    z11 = true;
                                } else if (Math.abs(jVar.f21837x) <= 0.4d || dAbs2 >= c2212j2.f24974b) {
                                    if (c2216n2.f24988c.f24913v) {
                                        j jVar2 = (j) c2216n2.f24999o.f779f;
                                        jVar2.f21801g = false;
                                        if (jVar2.f21830q) {
                                            jVar2.r = true;
                                        }
                                    }
                                    c2212j2.f24979g = Resources.getSystem().getDisplayMetrics().heightPixels;
                                    p10 = c2216n2.f24986a;
                                    c2212j2.f24980h = p10.f();
                                    if (c2216n2.f()) {
                                        p10.c();
                                    }
                                    it = c2216n2.k.iterator();
                                    if (it.hasNext()) {
                                        throw p.g(it);
                                    }
                                    c2212j2.f24978f = Math.abs(this.f21861z - this.f21852C);
                                    z11 = true;
                                }
                            }
                        }
                    }
                } else if (q9.f24909q) {
                    d dVar = (d) c2216n2.f24999o.f782i;
                    dVar.f21801g = false;
                    if (dVar.f21830q) {
                        dVar.r = true;
                    }
                    c2212j2.f24979g = Resources.getSystem().getDisplayMetrics().heightPixels;
                    p10 = c2216n2.f24986a;
                    c2212j2.f24980h = p10.f();
                    if (c2216n2.f()) {
                        p10.c();
                    }
                    it = c2216n2.k.iterator();
                    if (it.hasNext()) {
                        throw p.g(it);
                    }
                    c2212j2.f24978f = Math.abs(this.f21861z - this.f21852C);
                    z11 = true;
                }
            }
            if (z11) {
                h();
            }
        }
        this.f21852C = this.f21861z;
        return z11;
    }

    @Override // p120ka.f
    public final int d() {
        return (!this.f21830q || this.f21858w) ? 1 : 2;
    }

    @Override // p120ka.f
    public final boolean e() {
        if (super.e()) {
            return true;
        }
        return !this.f21858w && this.f21821l.size() < 2;
    }

    @Override // p120ka.f
    public final void g() {
        this.f21860y = 0.0f;
        this.f21853D = 0.0f;
        this.f21861z = 0.0f;
        this.f21852C = 0.0f;
        this.f21856G = 1.0f;
    }

    @Override // p120ka.i
    public final void i() {
        super.i();
        C2212j c2212j = (C2212j) this.f21802h;
        float f10 = this.f21832t;
        float f11 = this.f21833u;
        boolean z10 = c2212j.f24977e;
        C2216n c2216n = c2212j.f24981i;
        if (z10) {
            ((d) c2216n.f24999o.f782i).f21801g = true;
        } else {
            ((j) c2216n.f24999o.f779f).f21801g = true;
        }
        Iterator it = c2216n.k.iterator();
        if (it.hasNext()) {
            throw p.g(it);
        }
        float fAbs = Math.abs(f11) + Math.abs(f10);
        if (!c2216n.f24988c.r || fAbs < c2212j.f24975c || c2212j.f24978f / fAbs < c2212j.f24976d) {
            c2216n.c();
        } else {
            boolean z11 = this.f21855F;
            double dMax = Math.max(0.0d, Math.min(2.5d, ((double) fAbs) * 2.5d * 1.0E-4d));
            if (z11) {
                dMax = -dMax;
            }
            double d10 = dMax;
            double dF = c2216n.f24986a.f();
            PointF pointFA = c2212j.a(this);
            long jLog = (long) ((Math.log((1.0d / Math.pow(2.718281828459045d, 2.0d)) + Math.abs(d10)) + 2.0d) * 150.0d);
            C2216n c2216n2 = c2212j.f24981i;
            c2216n2.f25000p = c2216n2.b(dF, d10, pointFA, jLog);
            c2216n.g(c2216n.f25000p);
        }
        this.f21858w = false;
    }

    @Override // p120ka.i
    public final HashSet j() {
        return f21849H;
    }
}
