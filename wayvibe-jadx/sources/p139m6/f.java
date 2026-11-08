package p139m6;

import android.widget.ImageButton;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22367a;

    public final void a(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f22367a = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f22367a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        a(i10, true);
    }
}
