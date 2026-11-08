package K1;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import app.nagakiba.wayvibe.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p152o.C2162v;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap f7251a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f7252b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f7253c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E f7254d = new E();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final G f7255e = new G();

    public static Z a(View view) {
        if (f7251a == null) {
            f7251a = new WeakHashMap();
        }
        Z z10 = (Z) f7251a.get(view);
        if (z10 != null) {
            return z10;
        }
        Z z11 = new Z(view);
        f7251a.put(view, z11);
        return z11;
    }

    public static void b(View view, z0 z0Var) {
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsF = z0Var.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsA = i10 >= 30 ? P.a(view, windowInsetsF) : I.a(view, windowInsetsF);
            if (windowInsetsA.equals(windowInsetsF)) {
                return;
            }
            z0.g(view, windowInsetsA);
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = S.f7247d;
        S s8 = (S) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (s8 == null) {
            s8 = new S();
            s8.f7248a = null;
            s8.f7249b = null;
            s8.f7250c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, s8);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = s8.f7248a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = S.f7247d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (s8.f7248a == null) {
                            s8.f7248a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = S.f7247d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                s8.f7248a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    s8.f7248a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = s8.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (s8.f7249b == null) {
                    s8.f7249b = new SparseArray();
                }
                s8.f7249b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return O.a(view);
        }
        if (f7253c) {
            return null;
        }
        if (f7252b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f7252b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f7253c = true;
                return null;
            }
        }
        try {
            Object obj = f7252b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f7253c = true;
            return null;
        }
    }

    public static String[] e(C2162v c2162v) {
        return Build.VERSION.SDK_INT >= 31 ? Q.a(c2162v) : (String[]) c2162v.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void f(View view, int i10) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i11 = Build.VERSION.SDK_INT;
            Object objA = null;
            if (i11 >= 28) {
                tag = N.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z10 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    List<CharSequence> text = accessibilityEventObtain.getText();
                    if (i11 >= 28) {
                        objA = N.a(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            objA = tag2;
                        }
                    }
                    text.add((CharSequence) objA);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            List<CharSequence> text2 = accessibilityEventObtain2.getText();
            if (i11 >= 28) {
                objA = N.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    objA = tag3;
                }
            }
            text2.add((CharSequence) objA);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0604f g(View view, C0604f c0604f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0604f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Q.b(view, c0604f);
        }
        N1.j jVar = (N1.j) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0618u interfaceC0618u = f7254d;
        if (jVar == null) {
            if (view instanceof InterfaceC0618u) {
                interfaceC0618u = (InterfaceC0618u) view;
            }
            return interfaceC0618u.a(c0604f);
        }
        C0604f c0604fA = N1.j.a(view, c0604f);
        if (c0604fA == null) {
            return null;
        }
        if (view instanceof InterfaceC0618u) {
            interfaceC0618u = (InterfaceC0618u) view;
        }
        return interfaceC0618u.a(c0604fA);
    }

    public static void h(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            O.b(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void i(View view, C0597b c0597b) {
        if (c0597b == null && (d(view) instanceof C0595a)) {
            c0597b = new C0597b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0597b == null ? null : c0597b.f7268b);
    }

    public static void j(View view, CharSequence charSequence) {
        new F(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).g(view, charSequence);
        G g3 = f7255e;
        if (charSequence == null) {
            g3.f7239a.remove(view);
            view.removeOnAttachStateChangeListener(g3);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(g3);
        } else {
            g3.f7239a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(g3);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(g3);
            }
        }
    }

    public static void k(View view, C.N n6) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(n6 != null ? new e0(n6) : null);
            return;
        }
        PathInterpolator pathInterpolator = C0602d0.f7282d;
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC0600c0 = n6 != null ? new ViewOnApplyWindowInsetsListenerC0600c0(view, n6) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC0600c0);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0600c0);
        }
    }
}
