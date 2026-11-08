package org.maplibre.android.maps;

import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import p098j.HandlerC1993f;

/* JADX INFO: renamed from: org.maplibre.android.maps.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2206d implements s, r, InterfaceC2219q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HandlerC1993f f24932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f24935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f24936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f24937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList f24938g;

    public C2206d() {
        HandlerC1993f handlerC1993f = new HandlerC1993f(2);
        handlerC1993f.f21328b = new WeakReference(this);
        this.f24932a = handlerC1993f;
        this.f24933b = true;
        this.f24935d = new CopyOnWriteArrayList();
        this.f24936e = new CopyOnWriteArrayList();
        this.f24937f = new CopyOnWriteArrayList();
        this.f24938g = new CopyOnWriteArrayList();
    }

    @Override // org.maplibre.android.maps.InterfaceC2219q
    public final void F() {
        this.f24932a.a(3);
    }

    @Override // org.maplibre.android.maps.r
    public final void h() {
        this.f24932a.a(1);
    }

    @Override // org.maplibre.android.maps.s
    public final void r(int i10) {
        this.f24934c = i10;
        this.f24932a.a(0);
    }
}
