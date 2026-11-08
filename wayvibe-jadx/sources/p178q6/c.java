package p178q6;

import K1.I;
import K1.K;
import K1.T;
import L1.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.maplibre.android.location.v;
import p051e6.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityManager f25676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f25677b;

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f19624i);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            WeakHashMap weakHashMap = T.f7251a;
            K.k(this, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        this.f25676a = accessibilityManager;
        v vVar = new v(this);
        this.f25677b = vVar;
        accessibilityManager.addTouchExplorationStateChangeListener(new b(vVar));
        setClickableOrFocusableBasedOnAccessibility(accessibilityManager.isTouchExplorationEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickableOrFocusableBasedOnAccessibility(boolean z10) {
        setClickable(!z10);
        setFocusable(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = T.f7251a;
        I.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25676a.removeTouchExplorationStateChangeListener(new b(this.f25677b));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setOnAttachStateChangeListener(a aVar) {
    }

    public void setOnLayoutChangeListener(b bVar) {
    }
}
