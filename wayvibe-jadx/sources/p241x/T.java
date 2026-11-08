package p241x;

import android.content.Context;
import android.widget.EdgeEffect;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class T extends EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f28147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f28148b;

    public T(Context context) {
        super(context);
        this.f28147a = c.a(context).f15846a * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i10) {
        this.f28148b = 0.0f;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10, float f11) {
        this.f28148b = 0.0f;
        super.onPull(f10, f11);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f28148b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10) {
        this.f28148b = 0.0f;
        super.onPull(f10);
    }
}
