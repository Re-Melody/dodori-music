package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import app.nagakiba.wayvibe.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import p199t.C2230e;

/* JADX INFO: renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1095o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f15396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f15397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f15398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15400e;

    public C1095o(ViewGroup container) {
        kotlin.jvm.internal.m.f(container, "container");
        this.f15396a = container;
        this.f15397b = new ArrayList();
        this.f15398c = new ArrayList();
    }

    public static void f(C2230e c2230e, View view) {
        WeakHashMap weakHashMap = K1.T.f7251a;
        String strF = K1.K.f(view);
        if (strF != null) {
            c2230e.put(strF, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    f(c2230e, childAt);
                }
            }
        }
    }

    public static final C1095o j(ViewGroup container, AbstractC1083h0 fragmentManager) {
        kotlin.jvm.internal.m.f(container, "container");
        kotlin.jvm.internal.m.f(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.m.e(fragmentManager.H(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C1095o) {
            return (C1095o) tag;
        }
        C1095o c1095o = new C1095o(container);
        container.setTag(R.id.special_effects_controller_view_tag, c1095o);
        return c1095o;
    }

    public final void a(F0 operation) {
        kotlin.jvm.internal.m.f(operation, "operation");
        if (operation.f15204i) {
            J0 j10 = operation.f15196a;
            View viewRequireView = operation.f15198c.requireView();
            kotlin.jvm.internal.m.e(viewRequireView, "operation.fragment.requireView()");
            j10.a(viewRequireView, this.f15396a);
            operation.f15204i = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x03f7 A[LOOP:18: B:124:0x03f1->B:126:0x03f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e9  */
    public final void b(ArrayList arrayList, boolean z10) {
        Object next;
        Object objPrevious;
        boolean z11;
        ArrayList<C1078f> arrayList2;
        C1092m c1092m;
        Iterator it;
        ArrayList arrayList3;
        A0 a10;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        Object objS;
        ArrayList sharedElementSourceNames;
        ArrayList<String> sharedElementTargetNames;
        M8.l lVar;
        int i10 = 2;
        int i11 = 1;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            F0 f10 = (F0) next;
            H0 h10 = J0.Companion;
            View view = f10.f15198c.mView;
            kotlin.jvm.internal.m.e(view, "operation.fragment.mView");
            h10.getClass();
            J0 j0A = H0.a(view);
            J0 j10 = J0.VISIBLE;
            if (j0A == j10 && f10.f15196a != j10) {
                break;
            }
        }
        F0 f11 = (F0) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            F0 f12 = (F0) objPrevious;
            H0 h11 = J0.Companion;
            View view2 = f12.f15198c.mView;
            kotlin.jvm.internal.m.e(view2, "operation.fragment.mView");
            h11.getClass();
            J0 j0A2 = H0.a(view2);
            J0 j11 = J0.VISIBLE;
            if (j0A2 != j11 && f12.f15196a == j11) {
                break;
            }
        }
        F0 f13 = (F0) objPrevious;
        if (AbstractC1083h0.J(2)) {
            Log.v("FragmentManager", "Executing operations from " + f11 + " to " + f13);
        }
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        F f14 = ((F0) N8.n.I0(arrayList)).f15198c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C c3 = ((F0) it3.next()).f15198c.mAnimationInfo;
            C c9 = f14.mAnimationInfo;
            c3.f15172b = c9.f15172b;
            c3.f15173c = c9.f15173c;
            c3.f15174d = c9.f15174d;
            c3.f15175e = c9.f15175e;
            i10 = i10;
        }
        int i12 = i10;
        Iterator it4 = arrayList.iterator();
        while (true) {
            boolean z12 = false;
            if (!it4.hasNext()) {
                break;
            }
            F0 f15 = (F0) it4.next();
            arrayList7.add(new C1078f(f15, z10));
            if (z10) {
                if (f15 == f11) {
                    z12 = true;
                }
            } else if (f15 == f13) {
                z12 = true;
            }
            arrayList8.add(new C1094n(f15, z10, z12));
            f15.f15199d.add(new D0(this, f15, i11));
        }
        ArrayList arrayList9 = new ArrayList();
        for (Object obj : arrayList8) {
            if (!((C1094n) obj).a()) {
                arrayList9.add(obj);
            }
        }
        ArrayList<C1094n> arrayList10 = new ArrayList();
        for (Object obj2 : arrayList9) {
            if (((C1094n) obj2).b() != null) {
                arrayList10.add(obj2);
            }
        }
        ArrayList arrayList11 = arrayList7;
        A0 a11 = null;
        for (C1094n c1094n : arrayList10) {
            A0 a0B = c1094n.b();
            if (a11 != null && a0B != a11) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + c1094n.f15354a.f15198c + " returned Transition " + c1094n.f15379b + " which uses a different Transition type than other Fragments.").toString());
            }
            a11 = a0B;
        }
        if (a11 == null) {
            z11 = true;
            arrayList2 = arrayList11;
        } else {
            ArrayList arrayList12 = new ArrayList();
            ArrayList arrayList13 = new ArrayList();
            ArrayList arrayList14 = arrayList10;
            C2230e c2230e = new C2230e(0);
            ArrayList<String> arrayList15 = new ArrayList<>();
            ArrayList arrayList16 = new ArrayList();
            z11 = true;
            C2230e c2230e2 = new C2230e(0);
            ArrayList<String> arrayList17 = arrayList15;
            C2230e c2230e3 = new C2230e(0);
            Iterator it5 = arrayList14.iterator();
            loop10: while (true) {
                Object obj3 = null;
                while (true) {
                    if (!it5.hasNext()) {
                        ArrayList arrayList18 = arrayList14;
                        A0 a12 = a11;
                        ArrayList arrayList19 = arrayList12;
                        arrayList2 = arrayList11;
                        ArrayList arrayList20 = arrayList13;
                        if (obj3 == null) {
                            if (!arrayList18.isEmpty()) {
                                Iterator it6 = arrayList18.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        if (((C1094n) it6.next()).f15379b != null) {
                                            c1092m = new C1092m(arrayList18, f11, f13, a12, obj3, arrayList19, arrayList20, c2230e, arrayList17, arrayList16, c2230e2, c2230e3, z10);
                                            it = arrayList18.iterator();
                                            while (it.hasNext()) {
                                                ((C1094n) it.next()).f15354a.f15205j.add(c1092m);
                                            }
                                            break loop10;
                                            break loop10;
                                        }
                                    }
                                }
                            }
                            break loop10;
                        }
                        c1092m = new C1092m(arrayList18, f11, f13, a12, obj3, arrayList19, arrayList20, c2230e, arrayList17, arrayList16, c2230e2, c2230e3, z10);
                        it = arrayList18.iterator();
                        while (it.hasNext()) {
                            ((C1094n) it.next()).f15354a.f15205j.add(c1092m);
                        }
                        break loop10;
                    }
                    Object obj4 = ((C1094n) it5.next()).f15381d;
                    if (obj4 == null || f11 == null || f13 == null) {
                        arrayList3 = arrayList14;
                        a10 = a11;
                        arrayList4 = arrayList12;
                        arrayList5 = arrayList11;
                        arrayList6 = arrayList13;
                    } else {
                        objS = a11.s(a11.f(obj4));
                        F f16 = f13.f15198c;
                        sharedElementSourceNames = f16.getSharedElementSourceNames();
                        arrayList3 = arrayList14;
                        kotlin.jvm.internal.m.e(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                        F f17 = f11.f15198c;
                        a10 = a11;
                        ArrayList<String> sharedElementSourceNames2 = f17.getSharedElementSourceNames();
                        arrayList4 = arrayList12;
                        kotlin.jvm.internal.m.e(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                        ArrayList<String> sharedElementTargetNames2 = f17.getSharedElementTargetNames();
                        arrayList5 = arrayList11;
                        kotlin.jvm.internal.m.e(sharedElementTargetNames2, "firstOut.fragment.sharedElementTargetNames");
                        int size = sharedElementTargetNames2.size();
                        arrayList6 = arrayList13;
                        int i13 = 0;
                        while (i13 < size) {
                            int i14 = size;
                            int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames2.get(i13));
                            ArrayList<String> arrayList21 = sharedElementTargetNames2;
                            if (iIndexOf != -1) {
                                sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i13));
                            }
                            i13++;
                            size = i14;
                            sharedElementTargetNames2 = arrayList21;
                        }
                        sharedElementTargetNames = f16.getSharedElementTargetNames();
                        kotlin.jvm.internal.m.e(sharedElementTargetNames, "lastIn.fragment.sharedElementTargetNames");
                        if (z10) {
                            f17.getEnterTransitionCallback();
                            f16.getExitTransitionCallback();
                            lVar = new M8.l(null, null);
                        } else {
                            f17.getExitTransitionCallback();
                            f16.getEnterTransitionCallback();
                            lVar = new M8.l(null, null);
                        }
                        if (lVar.f8413a != null) {
                            throw new ClassCastException();
                        }
                        if (lVar.f8414b != null) {
                            throw new ClassCastException();
                        }
                        int size2 = sharedElementSourceNames.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj5 = sharedElementSourceNames.get(i15);
                            int i16 = size2;
                            kotlin.jvm.internal.m.e(obj5, "exitingNames[i]");
                            String str = sharedElementTargetNames.get(i15);
                            kotlin.jvm.internal.m.e(str, "enteringNames[i]");
                            c2230e.put((String) obj5, str);
                            i15++;
                            size2 = i16;
                        }
                        if (AbstractC1083h0.J(i12)) {
                            Log.v("FragmentManager", ">>> entering view names <<<");
                            for (Iterator<String> it7 = sharedElementTargetNames.iterator(); it7.hasNext(); it7 = it7) {
                                Log.v("FragmentManager", "Name: " + it7.next());
                            }
                            Log.v("FragmentManager", ">>> exiting view names <<<");
                            for (Iterator it8 = sharedElementSourceNames.iterator(); it8.hasNext(); it8 = it8) {
                                Log.v("FragmentManager", "Name: " + ((String) it8.next()));
                            }
                        }
                        View view3 = f17.mView;
                        kotlin.jvm.internal.m.e(view3, "firstOut.fragment.mView");
                        f(c2230e2, view3);
                        c2230e2.n(sharedElementSourceNames);
                        c2230e.n(c2230e2.keySet());
                        View view4 = f16.mView;
                        kotlin.jvm.internal.m.e(view4, "lastIn.fragment.mView");
                        f(c2230e3, view4);
                        c2230e3.n(sharedElementTargetNames);
                        c2230e3.n(c2230e.values());
                        y0 y0Var = t0.f15440a;
                        for (int i17 = c2230e.f26268c - 1; -1 < i17; i17--) {
                            if (!c2230e3.containsKey((String) c2230e.j(i17))) {
                                c2230e.h(i17);
                            }
                        }
                        int i18 = i12;
                        N8.n.z0(c2230e2.entrySet(), new Y.b(i18, c2230e.keySet()), false);
                        N8.n.z0(c2230e3.entrySet(), new Y.b(i18, c2230e.values()), false);
                        if (c2230e.isEmpty()) {
                            break;
                        }
                        arrayList16 = sharedElementSourceNames;
                        arrayList17 = sharedElementTargetNames;
                        obj3 = objS;
                    }
                    arrayList14 = arrayList3;
                    a11 = a10;
                    arrayList12 = arrayList4;
                    arrayList11 = arrayList5;
                    arrayList13 = arrayList6;
                    i12 = 2;
                }
                Log.i("FragmentManager", "Ignoring shared elements transition " + objS + " between " + f11 + " and " + f13 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                arrayList4.clear();
                arrayList6.clear();
                arrayList16 = sharedElementSourceNames;
                arrayList17 = sharedElementTargetNames;
                arrayList14 = arrayList3;
                a11 = a10;
                arrayList12 = arrayList4;
                arrayList11 = arrayList5;
                arrayList13 = arrayList6;
                i12 = 2;
            }
        }
        ArrayList<C1078f> arrayList22 = new ArrayList();
        ArrayList arrayList23 = new ArrayList();
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            N8.n.u0(arrayList23, ((C1078f) it9.next()).f15354a.k);
        }
        boolean zIsEmpty = arrayList23.isEmpty();
        boolean z13 = false;
        for (C1078f c1078f : arrayList2) {
            Context context = this.f15396a.getContext();
            F0 f18 = c1078f.f15354a;
            kotlin.jvm.internal.m.e(context, "context");
            L lB = c1078f.b(context);
            if (lB != null) {
                if (((AnimatorSet) lB.f15216b) == null) {
                    arrayList22.add(c1078f);
                } else {
                    F f19 = f18.f15198c;
                    if (f18.k.isEmpty()) {
                        if (f18.f15196a == J0.GONE) {
                            f18.f15204i = false;
                        }
                        f18.f15205j.add(new C1082h(c1078f));
                        z13 = z11;
                    } else if (AbstractC1083h0.J(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + f19 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (C1078f c1078f2 : arrayList22) {
            F0 f20 = c1078f2.f15354a;
            F f21 = f20.f15198c;
            if (zIsEmpty) {
                if (!z13) {
                    f20.f15205j.add(new C1076e(c1078f2));
                } else if (AbstractC1083h0.J(2)) {
                    Log.v(r8, "Ignoring Animation set on " + f21 + " as Animations cannot run alongside Animators.");
                }
            } else if (AbstractC1083h0.J(2)) {
                Log.v(r8, "Ignoring Animation set on " + f21 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    public final void c(ArrayList operations) {
        kotlin.jvm.internal.m.f(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            N8.n.u0(arrayList, ((F0) it.next()).k);
        }
        List listW0 = N8.n.W0(N8.n.b1(arrayList));
        int size = listW0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((E0) listW0.get(i10)).c(this.f15396a);
        }
        int size2 = operations.size();
        for (int i11 = 0; i11 < size2; i11++) {
            a((F0) operations.get(i11));
        }
        List listW1 = N8.n.W0(operations);
        int size3 = listW1.size();
        for (int i12 = 0; i12 < size3; i12++) {
            F0 f10 = (F0) listW1.get(i12);
            if (f10.k.isEmpty()) {
                f10.b();
            }
        }
    }

    public final void d(J0 j10, G0 g3, q0 q0Var) {
        synchronized (this.f15397b) {
            try {
                F f10 = q0Var.f15408c;
                kotlin.jvm.internal.m.e(f10, "fragmentStateManager.fragment");
                F0 f0G = g(f10);
                if (f0G == null) {
                    F f11 = q0Var.f15408c;
                    f0G = f11.mTransitioning ? h(f11) : null;
                }
                if (f0G != null) {
                    f0G.d(j10, g3);
                    return;
                }
                F0 f12 = new F0(j10, g3, q0Var);
                this.f15397b.add(f12);
                f12.f15199d.add(new D0(this, f12, 0));
                f12.f15199d.add(new D0(this, f12, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x016e  */
    public final void e() {
        boolean z10;
        boolean z11;
        if (this.f15400e) {
            return;
        }
        if (!this.f15396a.isAttachedToWindow()) {
            i();
            this.f15399d = false;
            return;
        }
        synchronized (this.f15397b) {
            try {
                if (this.f15397b.isEmpty()) {
                    ArrayList<F0> arrayListY0 = N8.n.Y0(this.f15398c);
                    this.f15398c.clear();
                    for (F0 f10 : arrayListY0) {
                        if (AbstractC1083h0.J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + f10 + " with no incoming pendingOperations");
                        }
                        ViewGroup container = this.f15396a;
                        f10.getClass();
                        kotlin.jvm.internal.m.f(container, "container");
                        if (!f10.f15200e) {
                            f10.a(container);
                        }
                        if (!f10.f15201f) {
                            this.f15398c.add(f10);
                        }
                    }
                } else {
                    ArrayList arrayListY1 = N8.n.Y0(this.f15398c);
                    this.f15398c.clear();
                    Iterator it = arrayListY1.iterator();
                    while (true) {
                        z10 = true;
                        if (!it.hasNext()) {
                            break;
                        }
                        F0 f11 = (F0) it.next();
                        if (AbstractC1083h0.J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + f11);
                        }
                        ViewGroup container2 = this.f15396a;
                        boolean z12 = f11.f15198c.mTransitioning;
                        kotlin.jvm.internal.m.f(container2, "container");
                        if (!f11.f15200e) {
                            if (z12) {
                                f11.f15202g = true;
                            }
                            f11.a(container2);
                        }
                        if (!f11.f15201f) {
                            this.f15398c.add(f11);
                        }
                    }
                    m();
                    ArrayList<F0> arrayListY2 = N8.n.Y0(this.f15397b);
                    if (arrayListY2.isEmpty()) {
                        return;
                    }
                    this.f15397b.clear();
                    this.f15398c.addAll(arrayListY2);
                    if (AbstractC1083h0.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(arrayListY2, this.f15399d);
                    boolean z13 = true;
                    boolean z14 = true;
                    for (F0 f12 : arrayListY2) {
                        if (f12.k.isEmpty()) {
                            z11 = false;
                        } else {
                            ArrayList arrayList = f12.k;
                            if (arrayList == null || !arrayList.isEmpty()) {
                                Iterator it2 = arrayList.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (!((E0) it2.next()).a()) {
                                            z11 = false;
                                        }
                                    }
                                }
                            }
                            z11 = true;
                        }
                        if (!f12.f15198c.mTransitioning) {
                            z13 = false;
                        }
                        z14 = z11;
                    }
                    if (z14) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = arrayListY2.iterator();
                        while (it3.hasNext()) {
                            N8.n.u0(arrayList2, ((F0) it3.next()).k);
                        }
                        if (arrayList2.isEmpty()) {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!z13) {
                        l(arrayListY2);
                        c(arrayListY2);
                    } else if (z10) {
                        l(arrayListY2);
                        int size = arrayListY2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            a((F0) arrayListY2.get(i10));
                        }
                    }
                    this.f15399d = false;
                    if (AbstractC1083h0.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final F0 g(F f10) {
        Object next;
        Iterator it = this.f15397b.iterator();
        while (it.hasNext()) {
            next = it.next();
            F0 f11 = (F0) next;
            if (kotlin.jvm.internal.m.b(f11.f15198c, f10) && !f11.f15200e) {
                return (F0) next;
            }
        }
        next = null;
        return (F0) next;
    }

    public final F0 h(F f10) {
        Object next;
        Iterator it = this.f15398c.iterator();
        while (it.hasNext()) {
            next = it.next();
            F0 f11 = (F0) next;
            if (kotlin.jvm.internal.m.b(f11.f15198c, f10) && !f11.f15200e) {
                return (F0) next;
            }
        }
        next = null;
        return (F0) next;
    }

    public final void i() {
        if (AbstractC1083h0.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f15396a.isAttachedToWindow();
        synchronized (this.f15397b) {
            try {
                m();
                l(this.f15397b);
                for (F0 f10 : N8.n.Y0(this.f15398c)) {
                    if (AbstractC1083h0.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f15396a + " is not attached to window. ") + "Cancelling running operation " + f10);
                    }
                    f10.a(this.f15396a);
                }
                for (F0 f11 : N8.n.Y0(this.f15397b)) {
                    if (AbstractC1083h0.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f15396a + " is not attached to window. ") + "Cancelling pending operation " + f11);
                    }
                    f11.a(this.f15396a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        Object objPrevious;
        synchronized (this.f15397b) {
            try {
                m();
                ArrayList arrayList = this.f15397b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    F0 f10 = (F0) objPrevious;
                    H0 h10 = J0.Companion;
                    View view = f10.f15198c.mView;
                    kotlin.jvm.internal.m.e(view, "operation.fragment.mView");
                    h10.getClass();
                    J0 j0A = H0.a(view);
                    J0 j10 = f10.f15196a;
                    J0 j11 = J0.VISIBLE;
                    if (j10 == j11 && j0A != j11) {
                        break;
                    }
                }
                F0 f11 = (F0) objPrevious;
                F f12 = f11 != null ? f11.f15198c : null;
                this.f15400e = f12 != null ? f12.isPostponed() : false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            F0 f10 = (F0) arrayList.get(i10);
            if (!f10.f15203h) {
                f10.f15203h = true;
                G0 g3 = f10.f15197b;
                G0 g10 = G0.ADDING;
                q0 q0Var = f10.f15206l;
                if (g3 == g10) {
                    F f11 = q0Var.f15408c;
                    kotlin.jvm.internal.m.e(f11, "fragmentStateManager.fragment");
                    View viewFindFocus = f11.mView.findFocus();
                    if (viewFindFocus != null) {
                        f11.setFocusedView(viewFindFocus);
                        if (AbstractC1083h0.J(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + f11);
                        }
                    }
                    View viewRequireView = f10.f15198c.requireView();
                    kotlin.jvm.internal.m.e(viewRequireView, "this.fragment.requireView()");
                    if (viewRequireView.getParent() == null) {
                        q0Var.b();
                        viewRequireView.setAlpha(0.0f);
                    }
                    if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                        viewRequireView.setVisibility(4);
                    }
                    viewRequireView.setAlpha(f11.getPostOnViewCreatedAlpha());
                } else if (g3 == G0.REMOVING) {
                    F f12 = q0Var.f15408c;
                    kotlin.jvm.internal.m.e(f12, "fragmentStateManager.fragment");
                    View viewRequireView2 = f12.requireView();
                    kotlin.jvm.internal.m.e(viewRequireView2, "fragment.requireView()");
                    if (AbstractC1083h0.J(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView2.findFocus() + " on view " + viewRequireView2 + " for Fragment " + f12);
                    }
                    viewRequireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N8.n.u0(arrayList2, ((F0) it.next()).k);
        }
        List listW0 = N8.n.W0(N8.n.b1(arrayList2));
        int size2 = listW0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            E0 e1 = (E0) listW0.get(i11);
            e1.getClass();
            ViewGroup container = this.f15396a;
            kotlin.jvm.internal.m.f(container, "container");
            if (!e1.f15194a) {
                e1.e(container);
            }
            e1.f15194a = true;
        }
    }

    public final void m() {
        for (F0 f10 : this.f15397b) {
            if (f10.f15197b == G0.ADDING) {
                View viewRequireView = f10.f15198c.requireView();
                kotlin.jvm.internal.m.e(viewRequireView, "fragment.requireView()");
                H0 h10 = J0.Companion;
                int visibility = viewRequireView.getVisibility();
                h10.getClass();
                f10.d(H0.b(visibility), G0.NONE);
            }
        }
    }
}
