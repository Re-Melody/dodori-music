package p143n0;

import android.graphics.RenderEffect;

/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RenderEffect f22723a;

    public final RenderEffect a() {
        RenderEffect renderEffect = this.f22723a;
        if (renderEffect != null) {
            return renderEffect;
        }
        C2090q c2090q = (C2090q) this;
        RenderEffect renderEffectA = Y.f22724a.a(null, c2090q.f22786b, c2090q.f22787c, c2090q.f22788d);
        this.f22723a = renderEffectA;
        return renderEffectA;
    }
}
