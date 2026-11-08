package p241x;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import p028c1.j;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f28120c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EdgeEffect f28121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EdgeEffect f28122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EdgeEffect f28123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EdgeEffect f28124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EdgeEffect f28125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EdgeEffect f28126i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EdgeEffect f28127j;
    public EdgeEffect k;

    public J(Context context, int i10) {
        this.f28118a = context;
        this.f28119b = i10;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? C2312o.f28263a.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a() {
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f28118a;
        EdgeEffect edgeEffectA = i10 >= 31 ? C2312o.f28263a.a(context, null) : new T(context);
        edgeEffectA.setColor(this.f28119b);
        if (!j.a(this.f28120c, 0L)) {
            long j10 = this.f28120c;
            edgeEffectA.setSize((int) (j10 >> 32), (int) (j10 & 4294967295L));
        }
        return edgeEffectA;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f28122e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a();
        this.f28122e = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f28123f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a();
        this.f28123f = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f28124g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a();
        this.f28124g = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f28121d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a();
        this.f28121d = edgeEffectA;
        return edgeEffectA;
    }
}
