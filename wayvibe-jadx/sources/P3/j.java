package P3;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j extends s {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String[] f9576w = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f9577v;

    public j(int i10) {
        this.f9577v = i10;
    }

    public static void I(z zVar) {
        int visibility = zVar.f9628b.getVisibility();
        HashMap map = zVar.f9627a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = zVar.f9628b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static F K(z zVar, z zVar2) {
        F f10 = new F();
        f10.f9546a = false;
        f10.f9547b = false;
        if (zVar != null) {
            HashMap map = zVar.f9627a;
            if (map.containsKey("android:visibility:visibility")) {
                f10.f9548c = ((Integer) map.get("android:visibility:visibility")).intValue();
                f10.f9550e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                f10.f9548c = -1;
                f10.f9550e = null;
            }
        } else {
            f10.f9548c = -1;
            f10.f9550e = null;
        }
        if (zVar2 != null) {
            HashMap map2 = zVar2.f9627a;
            if (map2.containsKey("android:visibility:visibility")) {
                f10.f9549d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                f10.f9551f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                f10.f9549d = -1;
                f10.f9551f = null;
            }
        } else {
            f10.f9549d = -1;
            f10.f9551f = null;
        }
        if (zVar != null && zVar2 != null) {
            int i10 = f10.f9548c;
            int i11 = f10.f9549d;
            if (i10 != i11 || f10.f9550e != f10.f9551f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        f10.f9547b = false;
                        f10.f9546a = true;
                        return f10;
                    }
                    if (i11 == 0) {
                        f10.f9547b = true;
                        f10.f9546a = true;
                        return f10;
                    }
                } else {
                    if (f10.f9551f == null) {
                        f10.f9547b = false;
                        f10.f9546a = true;
                        return f10;
                    }
                    if (f10.f9550e == null) {
                        f10.f9547b = true;
                        f10.f9546a = true;
                        return f10;
                    }
                }
            }
        } else {
            if (zVar == null && f10.f9549d == 0) {
                f10.f9547b = true;
                f10.f9546a = true;
                return f10;
            }
            if (zVar2 == null && f10.f9548c == 0) {
                f10.f9547b = false;
                f10.f9546a = true;
            }
        }
        return f10;
    }

    public final ObjectAnimator J(View view, float f10, float f11) {
        int i10 = 0;
        if (f10 == f11) {
            return null;
        }
        A.f9530a.Q(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, A.f9531b, f11);
        objectAnimatorOfFloat.addListener(new i(view));
        a(new h(view, i10));
        return objectAnimatorOfFloat;
    }

    @Override // P3.s
    public final void d(z zVar) {
        I(zVar);
    }

    @Override // P3.s
    public final void g(z zVar) {
        I(zVar);
        zVar.f9627a.put("android:fade:transitionAlpha", Float.valueOf(A.f9530a.w(zVar.f9628b)));
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:66:0x0145  */
    /* JADX WARN: Code duplicated, block: B:68:0x014d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0150  */
    /* JADX WARN: Code duplicated, block: B:70:0x0155  */
    /* JADX WARN: Code duplicated, block: B:73:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x0183  */
    /* JADX WARN: Code duplicated, block: B:80:0x019f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x0209  */
    /* JADX WARN: Code duplicated, block: B:93:0x0226  */
    /* JADX WARN: Code duplicated, block: B:95:0x0238  */
    /* JADX WARN: Code duplicated, block: B:98:0x023f  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (K(n(r3, false), r(r3, false)).f9546a != false) goto L9;
     */
    @Override // P3.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator k(android.view.ViewGroup r25, P3.z r26, P3.z r27) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.j.k(android.view.ViewGroup, P3.z, P3.z):android.animation.Animator");
    }

    @Override // P3.s
    public final String[] p() {
        return f9576w;
    }

    @Override // P3.s
    public final boolean s(z zVar, z zVar2) {
        if (zVar == null && zVar2 == null) {
            return false;
        }
        if (zVar != null && zVar2 != null && zVar2.f9627a.containsKey("android:visibility:visibility") != zVar.f9627a.containsKey("android:visibility:visibility")) {
            return false;
        }
        F fK = K(zVar, zVar2);
        if (fK.f9546a) {
            return fK.f9548c == 0 || fK.f9549d == 0;
        }
        return false;
    }
}
