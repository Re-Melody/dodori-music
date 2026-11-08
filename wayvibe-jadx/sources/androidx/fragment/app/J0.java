package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class J0 {
    private static final /* synthetic */ J0[] $VALUES;
    public static final H0 Companion;
    public static final J0 GONE;
    public static final J0 INVISIBLE;
    public static final J0 REMOVED;
    public static final J0 VISIBLE;

    static {
        J0 j10 = new J0("REMOVED", 0);
        REMOVED = j10;
        J0 j11 = new J0("VISIBLE", 1);
        VISIBLE = j11;
        J0 j12 = new J0("GONE", 2);
        GONE = j12;
        J0 j13 = new J0("INVISIBLE", 3);
        INVISIBLE = j13;
        $VALUES = new J0[]{j10, j11, j12, j13};
        Companion = new H0();
    }

    public static J0 valueOf(String str) {
        return (J0) Enum.valueOf(J0.class, str);
    }

    public static J0[] values() {
        return (J0[]) $VALUES.clone();
    }

    public final void a(View view, ViewGroup container) {
        kotlin.jvm.internal.m.f(view, "view");
        kotlin.jvm.internal.m.f(container, "container");
        int i10 = I0.f15212a[ordinal()];
        if (i10 == 1) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (AbstractC1083h0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i10 == 2) {
            if (AbstractC1083h0.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (AbstractC1083h0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (i10 == 3) {
            if (AbstractC1083h0.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (i10 != 4) {
            return;
        }
        if (AbstractC1083h0.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }
}
