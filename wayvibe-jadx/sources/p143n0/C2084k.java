package p143n0;

import android.graphics.PathMeasure;

/* JADX INFO: renamed from: n0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2084k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f22780a;

    public C2084k(PathMeasure pathMeasure) {
        this.f22780a = pathMeasure;
    }

    public final void a(float f10, float f11, C2083j c2083j) {
        if (c2083j == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f22780a.getSegment(f10, f11, c2083j.f22776a, true);
    }
}
