package P;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import p143n0.C2096x;

/* JADX INFO: loaded from: classes.dex */
public final class E extends RippleDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2096x f9374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f9375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9376d;

    public E(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f9373a = z10;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f9373a) {
            this.f9376d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f9376d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f9376d;
    }
}
