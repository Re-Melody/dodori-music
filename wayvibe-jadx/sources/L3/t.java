package L3;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class t extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f7770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7771b;

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7770a = new Rect();
        this.f7771b = true;
    }

    public t(int i10, int i11) {
        super(i10, i11);
        this.f7770a = new Rect();
        this.f7771b = true;
    }

    public t(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f7770a = new Rect();
        this.f7771b = true;
    }

    public t(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f7770a = new Rect();
        this.f7771b = true;
    }

    public t(t tVar) {
        super((ViewGroup.LayoutParams) tVar);
        this.f7770a = new Rect();
        this.f7771b = true;
    }
}
