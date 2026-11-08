package org.maplibre.android.maps.renderer.egl;

import javax.microedition.khronos.egl.EGLConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f25011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f25012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EGLConfig f25015e;

    public a(b bVar, c cVar, boolean z10, int i10, EGLConfig eGLConfig) {
        this.f25011a = bVar;
        this.f25012b = cVar;
        this.f25013c = z10;
        this.f25014d = i10;
        this.f25015e = eGLConfig;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i10;
        int i11;
        int i12;
        a aVar = (a) obj;
        int i13 = this.f25011a.value;
        int i14 = aVar.f25011a.value;
        int i15 = 1;
        if (i13 < i14) {
            i10 = -1;
        } else {
            i10 = i13 == i14 ? 0 : 1;
        }
        if (i10 != 0) {
            return i10;
        }
        int i16 = this.f25012b.value;
        int i17 = aVar.f25012b.value;
        if (i16 < i17) {
            i11 = -1;
        } else {
            i11 = i16 == i17 ? 0 : 1;
        }
        if (i11 != 0) {
            return i11;
        }
        boolean z10 = aVar.f25013c;
        boolean z11 = this.f25013c;
        if (z11 == z10) {
            i12 = 0;
        } else {
            i12 = z11 ? 1 : -1;
        }
        if (i12 != 0) {
            return i12;
        }
        int i18 = this.f25014d;
        int i19 = aVar.f25014d;
        if (i18 < i19) {
            i15 = -1;
        } else if (i18 == i19) {
            i15 = 0;
        }
        if (i15 != 0) {
            return i15;
        }
        return 0;
    }
}
