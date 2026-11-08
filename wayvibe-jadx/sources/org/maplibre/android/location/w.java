package org.maplibre.android.location;

import B8.V;
import android.animation.Animator;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.animation.DecelerateInterpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.log.Logger;
import org.maplibre.android.maps.C2206d;
import org.maplibre.android.maps.J;
import org.maplibre.android.maps.P;
import p098j.HandlerC1993f;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C2200g f24716A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final n f24717B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final o f24718C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final p f24719D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final q f24720E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Y7.e f24721F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final r f24722G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final s f24723H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final t f24724I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final org.maplibre.android.maps.w f24725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P f24726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f24727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public W4.m f24728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ma.d f24729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f24730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f24731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f24732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public B f24733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l f24734j;
    public C2196c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Location f24735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CameraPosition f24736m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f24737n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24738o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f24739p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f24740q;
    public boolean r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public I f24741s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CopyOnWriteArrayList f24742t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f24743u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CopyOnWriteArrayList f24744v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CopyOnWriteArrayList f24745w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArrayList f24746x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f24747y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f24748z;

    public w(org.maplibre.android.maps.w wVar, P p10, ArrayList arrayList) {
        ma.c cVar = new ma.c(1000L);
        cVar.f22544d = 1000L;
        cVar.f22542b = 0;
        this.f24729e = new ma.d(cVar);
        this.f24730f = new u(this);
        v vVar = new v();
        vVar.f24715a = new WeakReference(this);
        this.f24731g = vVar;
        this.f24742t = new CopyOnWriteArrayList();
        this.f24743u = new CopyOnWriteArrayList();
        this.f24744v = new CopyOnWriteArrayList();
        this.f24745w = new CopyOnWriteArrayList();
        this.f24746x = new CopyOnWriteArrayList();
        this.f24716A = new C2200g(this, 1);
        this.f24717B = new n(this);
        this.f24718C = new o(this);
        this.f24719D = new p(this);
        this.f24720E = new q(this);
        this.f24721F = new Y7.e(this, 29);
        this.f24722G = new r(this);
        this.f24723H = new s(this);
        this.f24724I = new t(this);
        m mVar = new m(this);
        this.f24725a = wVar;
        this.f24726b = p10;
        arrayList.add(mVar);
    }

    public static void a(w wVar) {
        D d10;
        wVar.getClass();
        HashSet<C2194a> hashSet = new HashSet();
        B b10 = wVar.f24733i;
        b10.getClass();
        HashSet hashSet2 = new HashSet();
        hashSet2.add(new C2194a(0, b10.f24646j));
        int i10 = b10.f24637a;
        if (i10 == 8) {
            hashSet2.add(new C2194a(2, b10.k));
        } else if (i10 == 4) {
            hashSet2.add(new C2194a(3, b10.f24647l));
        }
        int i11 = b10.f24637a;
        if (i11 == 4 || i11 == 18) {
            hashSet2.add(new C2194a(6, b10.f24648m));
        }
        if (b10.f24640d.f24809I.booleanValue()) {
            hashSet2.add(new C2194a(9, b10.f24649n));
        }
        hashSet.addAll(hashSet2);
        l lVar = wVar.f24734j;
        lVar.getClass();
        HashSet hashSet3 = new HashSet();
        if (lVar.d()) {
            hashSet3.add(new C2194a(1, lVar.f24701m));
        }
        int i12 = lVar.f24690a;
        if (i12 == 34 || i12 == 36 || i12 == 22) {
            hashSet3.add(new C2194a(4, lVar.f24702n));
        }
        int i13 = lVar.f24690a;
        if (i13 == 32 || i13 == 16) {
            hashSet3.add(new C2194a(5, lVar.f24703o));
        }
        hashSet3.add(new C2194a(7, lVar.f24704p));
        hashSet3.add(new C2194a(8, lVar.r));
        hashSet3.add(new C2194a(10, lVar.f24705q));
        hashSet.addAll(hashSet3);
        C2196c c2196c = wVar.k;
        SparseArray sparseArray = c2196c.f24675m;
        sparseArray.clear();
        for (C2194a c2194a : hashSet) {
            sparseArray.append(c2194a.f24661a, c2194a.f24662b);
        }
        int i14 = 0;
        while (true) {
            SparseArray sparseArray2 = c2196c.f24664a;
            if (i14 >= sparseArray2.size()) {
                break;
            }
            int iKeyAt = sparseArray2.keyAt(i14);
            if (sparseArray.get(iKeyAt) == null && (d10 = (D) sparseArray2.get(iKeyAt)) != null) {
                d10.f24655f = true;
            }
            i14++;
        }
        wVar.k.h(wVar.f24725a.f25020d.d(), wVar.f24734j.f24690a == 36);
        C2196c c2196c2 = wVar.k;
        SparseArray sparseArray3 = c2196c2.f24664a;
        F f10 = (F) sparseArray3.get(0);
        E e2 = (E) sparseArray3.get(2);
        E e4 = (E) sparseArray3.get(3);
        E e7 = (E) sparseArray3.get(6);
        if (f10 != null && e2 != null) {
            c2196c2.d(0, new LatLng[]{(LatLng) f10.getAnimatedValue(), (LatLng) f10.f24651b});
            Float f11 = (Float) e2.getAnimatedValue();
            f11.getClass();
            Float f12 = (Float) e2.f24651b;
            f12.getClass();
            c2196c2.c(2, new Float[]{f11, f12});
            c2196c2.g(f10.getDuration() - f10.getCurrentPlayTime(), 0, 2);
        }
        if (e4 != null) {
            E e10 = (E) c2196c2.f24664a.get(3);
            float fFloatValue = e10 != null ? ((Float) e10.getAnimatedValue()).floatValue() : c2196c2.f24668e;
            Float f13 = (Float) e4.f24651b;
            f13.getClass();
            c2196c2.c(3, new Float[]{Float.valueOf(fFloatValue), f13});
            c2196c2.g(c2196c2.f24673j ? 500L : 0L, 3);
        }
        if (e7 != null) {
            c2196c2.e(c2196c2.f24667d, false);
        }
    }

    public final void b(z zVar) {
        c();
        this.f24727c = zVar;
        org.maplibre.android.maps.w wVar = this.f24725a;
        if (wVar.g() != null) {
            this.f24733i.a(zVar);
            this.f24734j.c(zVar);
            I i10 = this.f24741s;
            boolean z10 = zVar.f24833u;
            if (z10) {
                i10.a(i10.f24659d);
            } else if (i10.f24656a) {
                i10.f24658c.removeCallbacksAndMessages(null);
                i10.f24657b.a(false);
            }
            i10.f24656a = z10;
            I i11 = this.f24741s;
            i11.f24660e = zVar.f24834v;
            HandlerC1993f handlerC1993f = i11.f24658c;
            if (handlerC1993f.hasMessages(1)) {
                handlerC1993f.removeCallbacksAndMessages(null);
                handlerC1993f.sendEmptyMessageDelayed(1, i11.f24660e);
            }
            C2196c c2196c = this.k;
            c2196c.f24670g = zVar.f24806F;
            c2196c.f24673j = zVar.f24807G;
            c2196c.k = zVar.f24808H;
            if (zVar.f24809I.booleanValue()) {
                k();
            } else {
                this.k.a(9);
                this.f24733i.f24645i.h(false);
            }
            int[] iArr = zVar.f24835w;
            if (iArr != null) {
                wVar.p(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
        }
    }

    public final void c() {
        if (!this.f24737n) {
            throw new V("The LocationComponent has to be activated with one of the LocationComponent#activateLocationComponent overloads before any other methods are invoked.");
        }
    }

    public final void d() {
        if (this.f24737n && this.f24739p) {
            org.maplibre.android.maps.w wVar = this.f24725a;
            if (wVar.g() == null) {
                return;
            }
            if (!this.f24740q) {
                this.f24740q = true;
                C2200g c2200g = this.f24716A;
                C2206d c2206d = wVar.f25021e;
                c2206d.f24937f.add(c2200g);
                c2206d.f24938g.add(this.f24717B);
                if (this.f24727c.f24833u) {
                    I i10 = this.f24741s;
                    if (!i10.f24659d) {
                        HandlerC1993f handlerC1993f = i10.f24658c;
                        handlerC1993f.removeCallbacksAndMessages(null);
                        handlerC1993f.sendEmptyMessageDelayed(1, i10.f24660e);
                    }
                }
            }
            if (this.f24738o) {
                W4.m mVar = this.f24728d;
                if (mVar != null) {
                    try {
                        mVar.F(this.f24729e, this.f24730f, Looper.getMainLooper());
                    } catch (SecurityException e2) {
                        Logger.e("Mbgl-LocationComponent", "Unable to request location updates", e2);
                    }
                }
                g(this.f24734j.f24690a);
                if (this.f24727c.f24809I.booleanValue()) {
                    k();
                } else {
                    this.k.a(9);
                    this.f24733i.f24645i.h(false);
                }
                W4.m mVar2 = this.f24728d;
                if (mVar2 != null) {
                    v vVar = this.f24731g;
                    if (vVar == null) {
                        throw new NullPointerException("callback == null");
                    }
                    ((ma.b) mVar2.f12825b).h(vVar);
                } else {
                    c();
                    p(this.f24735l, true);
                }
                n(true);
                x xVar = this.f24732h;
                m(xVar != null ? xVar.f24758j : 0.0f);
            }
        }
    }

    public final void e() {
        if (this.f24737n && this.f24740q && this.f24739p) {
            int i10 = 0;
            this.f24740q = false;
            this.f24741s.f24658c.removeCallbacksAndMessages(null);
            if (this.f24732h != null) {
                n(false);
            }
            this.k.a(9);
            this.f24733i.f24645i.h(false);
            C2196c c2196c = this.k;
            while (true) {
                SparseArray sparseArray = c2196c.f24664a;
                if (i10 >= sparseArray.size()) {
                    break;
                }
                c2196c.a(sparseArray.keyAt(i10));
                i10++;
            }
            W4.m mVar = this.f24728d;
            if (mVar != null) {
                mVar.E(this.f24730f);
            }
            C2200g c2200g = this.f24716A;
            org.maplibre.android.maps.w wVar = this.f24725a;
            CopyOnWriteArrayList copyOnWriteArrayList = wVar.f25021e.f24937f;
            if (copyOnWriteArrayList.contains(c2200g)) {
                copyOnWriteArrayList.remove(c2200g);
            }
            n nVar = this.f24717B;
            CopyOnWriteArrayList copyOnWriteArrayList2 = wVar.f25021e.f24938g;
            if (copyOnWriteArrayList2.contains(nVar)) {
                copyOnWriteArrayList2.remove(nVar);
            }
        }
    }

    public final void f(x xVar) {
        if (this.r) {
            this.r = false;
            ArrayList arrayList = xVar.f24751c;
            arrayList.remove(this.f24722G);
            if (arrayList.isEmpty()) {
                Sensor sensor = xVar.f24752d;
                boolean z10 = sensor != null;
                SensorManager sensorManager = xVar.f24750b;
                if (z10) {
                    sensorManager.unregisterListener(xVar, sensor);
                } else {
                    sensorManager.unregisterListener(xVar, xVar.f24753e);
                    sensorManager.unregisterListener(xVar, xVar.f24754f);
                }
            }
        }
    }

    public final void g(int i10) {
        c();
        this.f24734j.e(i10, this.f24735l, new oa.e(this, 1));
        n(true);
    }

    public final void h(boolean z10) {
        c();
        if (z10) {
            this.f24738o = true;
            d();
        } else {
            this.f24738o = false;
            B b10 = this.f24733i;
            b10.f24642f = true;
            b10.f24645i.x();
            e();
        }
        this.f24734j.f24700l = z10;
    }

    public final void i(W4.m mVar) {
        c();
        W4.m mVar2 = this.f24728d;
        u uVar = this.f24730f;
        if (mVar2 != null) {
            mVar2.E(uVar);
            this.f24728d = null;
        }
        if (mVar == null) {
            this.f24747y = 0L;
            return;
        }
        this.f24747y = this.f24729e.f22548d;
        this.f24728d = mVar;
        if (this.f24740q && this.f24738o) {
            v vVar = this.f24731g;
            if (vVar == null) {
                throw new NullPointerException("callback == null");
            }
            ((ma.b) mVar.f12825b).h(vVar);
            mVar.F(this.f24729e, uVar, Looper.getMainLooper());
        }
    }

    public final void j(int i10) {
        c();
        if (this.f24735l != null && i10 == 8) {
            C2196c c2196c = this.k;
            c2196c.a(2);
            c2196c.f24664a.remove(2);
            B b10 = this.f24733i;
            b10.f24645i.H(Float.valueOf(this.f24735l.getBearing()));
        }
        B b11 = this.f24733i;
        if (b11.f24637a != i10) {
            b11.f24637a = i10;
            b11.e(b11.f24640d);
            b11.b(b11.f24640d);
            if (!b11.f24642f) {
                b11.d();
            }
            b11.f24641e.a();
        }
        o(true);
        n(true);
    }

    public final void k() {
        if (this.f24738o && this.f24740q) {
            C2196c c2196c = this.k;
            z zVar = this.f24727c;
            c2196c.a(9);
            C c3 = (C) c2196c.f24675m.get(9);
            if (c3 != null) {
                int i10 = c2196c.f24674l;
                float f10 = zVar.f24812L;
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                c2196c.f24671h.getClass();
                H h10 = new H(new Float[]{Float.valueOf(0.0f), Float.valueOf(zVar.f24813M)}, c3, i10);
                h10.setDuration((long) f10);
                h10.setRepeatMode(1);
                h10.setRepeatCount(-1);
                h10.setInterpolator(decelerateInterpolator);
                SparseArray sparseArray = c2196c.f24664a;
                sparseArray.put(9, h10);
                Animator animator = (Animator) sparseArray.get(9);
                if (animator != null) {
                    animator.start();
                }
            }
            this.f24733i.f24645i.h(true);
        }
    }

    public final void l(Location location, boolean z10) {
        float fD;
        if (location == null) {
            fD = 0.0f;
        } else {
            fD = (float) ((1.0d / this.f24725a.f25019c.d(location.getLatitude())) * ((double) location.getAccuracy()));
        }
        this.k.e(fD, z10);
    }

    public final void m(float f10) {
        C2196c c2196c = this.k;
        CameraPosition cameraPositionD = this.f24725a.f25020d.d();
        if (c2196c.f24668e < 0.0f) {
            c2196c.f24668e = f10;
        }
        E e2 = (E) c2196c.f24664a.get(3);
        float fFloatValue = e2 != null ? ((Float) e2.getAnimatedValue()).floatValue() : c2196c.f24668e;
        float f11 = (float) cameraPositionD.bearing;
        c2196c.b(fFloatValue, p025b9.a.X(f10, fFloatValue), 3);
        c2196c.b(f11, p025b9.a.X(f10, f11), 5);
        c2196c.g(c2196c.f24673j ? 500L : 0L, 3, 5);
        c2196c.f24668e = f10;
    }

    public final void n(boolean z10) {
        x xVar = this.f24732h;
        if (xVar != null) {
            if (!z10) {
                f(xVar);
                return;
            }
            if (this.f24737n && this.f24739p && this.f24738o && this.f24740q) {
                int i10 = this.f24734j.f24690a;
                if (i10 != 32 && i10 != 16 && this.f24733i.f24637a != 4) {
                    f(xVar);
                    return;
                }
                if (this.r) {
                    return;
                }
                this.r = true;
                ArrayList arrayList = xVar.f24751c;
                if (arrayList.isEmpty()) {
                    Sensor sensor = xVar.f24752d;
                    boolean z11 = sensor != null;
                    SensorManager sensorManager = xVar.f24750b;
                    if (z11) {
                        sensorManager.registerListener(xVar, sensor, 100000);
                    } else {
                        sensorManager.registerListener(xVar, xVar.f24753e, 100000);
                        sensorManager.registerListener(xVar, xVar.f24754f, 100000);
                    }
                }
                arrayList.add(this.f24722G);
            }
        }
    }

    public final void o(boolean z10) {
        CameraPosition cameraPositionD = this.f24725a.f25020d.d();
        CameraPosition cameraPosition = this.f24736m;
        if (cameraPosition == null || z10) {
            this.f24736m = cameraPositionD;
            B b10 = this.f24733i;
            double d10 = cameraPositionD.bearing;
            if (b10.f24637a != 8) {
                b10.f24645i.j(d10);
            }
            B b11 = this.f24733i;
            b11.f24645i.m(cameraPositionD.tilt);
            c();
            l(this.f24735l, true);
            return;
        }
        double d11 = cameraPositionD.bearing;
        if (d11 != cameraPosition.bearing) {
            B b12 = this.f24733i;
            if (b12.f24637a != 8) {
                b12.f24645i.j(d11);
            }
        }
        double d12 = cameraPositionD.tilt;
        if (d12 != this.f24736m.tilt) {
            this.f24733i.f24645i.m(d12);
        }
        if (cameraPositionD.zoom != this.f24736m.zoom) {
            c();
            l(this.f24735l, true);
        }
        this.f24736m = cameraPositionD;
    }

    public final void p(Location location, boolean z10) {
        Float[] fArrF;
        if (location == null) {
            return;
        }
        if (!this.f24740q) {
            this.f24735l = location;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f24748z < this.f24747y) {
            return;
        }
        this.f24748z = jElapsedRealtime;
        B b10 = this.f24733i;
        boolean z11 = b10.f24642f;
        int i10 = 1;
        if (this.f24738o && this.f24739p && z11) {
            b10.d();
            if (this.f24727c.f24809I.booleanValue()) {
                this.f24733i.f24645i.h(true);
            }
        }
        if (!z10) {
            I i11 = this.f24741s;
            i11.a(false);
            HandlerC1993f handlerC1993f = i11.f24658c;
            handlerC1993f.removeCallbacksAndMessages(null);
            handlerC1993f.sendEmptyMessageDelayed(1, i11.f24660e);
        }
        CameraPosition cameraPositionD = this.f24725a.f25020d.d();
        c();
        boolean z12 = this.f24734j.f24690a == 36;
        C2196c c2196c = this.k;
        Location[] locationArr = {location};
        c2196c.getClass();
        Location location2 = locationArr[0];
        if (c2196c.f24666c == null) {
            c2196c.f24666c = location2;
            c2196c.f24669f = SystemClock.elapsedRealtime() - 750;
        }
        SparseArray sparseArray = c2196c.f24664a;
        D d10 = (D) sparseArray.get(0);
        LatLng latLng = d10 != null ? (LatLng) d10.getAnimatedValue() : new LatLng(c2196c.f24666c);
        E e2 = (E) sparseArray.get(2);
        float fFloatValue = e2 != null ? ((Float) e2.getAnimatedValue()).floatValue() : c2196c.f24666c.getBearing();
        LatLng latLng2 = cameraPositionD.target;
        float f10 = ((((float) cameraPositionD.bearing) % 360.0f) + 360.0f) % 360.0f;
        if (latLng2 == null) {
            latLng2 = latLng;
        }
        LatLng[] latLngArr = new LatLng[2];
        latLngArr[0] = latLng;
        int i12 = 1;
        while (i12 < 2) {
            latLngArr[i12] = new LatLng(locationArr[i12 - 1]);
            i12++;
            i10 = i10;
        }
        int i13 = i10;
        Float[] fArrF2 = C2196c.f(Float.valueOf(fFloatValue), locationArr);
        c2196c.d(0, latLngArr);
        c2196c.c(2, fArrF2);
        latLngArr[0] = latLng2;
        if (z12) {
            fArrF = new Float[2];
            fArrF[0] = Float.valueOf(f10);
            fArrF[i13] = Float.valueOf(p025b9.a.X(0.0f, f10));
        } else {
            fArrF = C2196c.f(Float.valueOf(f10), locationArr);
        }
        c2196c.d(i13, latLngArr);
        c2196c.c(4, fArrF);
        LatLng latLng3 = new LatLng(location2);
        J j10 = c2196c.f24665b;
        long jMin = 0;
        if (!(p025b9.a.D(j10, latLng2, latLng3) || p025b9.a.D(j10, latLng, latLng3))) {
            long j11 = c2196c.f24669f;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            c2196c.f24669f = jElapsedRealtime2;
            jMin = Math.min(j11 != 0 ? (long) ((jElapsedRealtime2 - j11) * c2196c.f24670g) : 0L, 2000L);
        }
        c2196c.g(jMin, 0, 2, 1, 4);
        c2196c.f24666c = location2;
        l(location, false);
        this.f24735l = location;
    }
}
