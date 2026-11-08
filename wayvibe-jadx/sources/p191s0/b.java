package p191s0;

import B2.s;
import F0.J;
import kotlin.jvm.internal.m;
import oa.e;
import p028c1.k;
import p133m0.f;
import p143n0.AbstractC2097y;
import p163p0.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f26036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC2097y f26037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f26038c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f26039d = k.Ltr;

    public abstract void d(float f10);

    public abstract void e(AbstractC2097y abstractC2097y);

    public final void g(c cVar, long j10, float f10, AbstractC2097y abstractC2097y) {
        if (this.f26038c != f10) {
            d(f10);
            this.f26038c = f10;
        }
        if (!m.b(this.f26037b, abstractC2097y)) {
            e(abstractC2097y);
            this.f26037b = abstractC2097y;
        }
        J j11 = (J) cVar;
        k layoutDirection = j11.getLayoutDirection();
        if (this.f26039d != layoutDirection) {
            f(layoutDirection);
            this.f26039d = layoutDirection;
        }
        p163p0.b bVar = j11.f3621a;
        float fD = f.d(bVar.c()) - f.d(j10);
        float fB = f.b(bVar.c()) - f.b(j10);
        ((e) bVar.f25147b.f22979a).e(0.0f, 0.0f, fD, fB);
        if (f10 > 0.0f) {
            try {
                if (f.d(j10) > 0.0f && f.b(j10) > 0.0f) {
                    i(j11);
                }
            } finally {
                ((e) bVar.f25147b.f22979a).e(-0.0f, -0.0f, -fD, -fB);
            }
        }
    }

    public abstract long h();

    public abstract void i(c cVar);

    public void f(k kVar) {
    }
}
