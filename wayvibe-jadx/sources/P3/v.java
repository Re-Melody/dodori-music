package P3;

import Ca.C0168a;
import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;
import p199t.C2230e;

/* JADX INFO: loaded from: classes.dex */
public final class v implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f9614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f9615b;

    /* JADX WARN: Code duplicated, block: B:101:0x0218  */
    /* JADX WARN: Code duplicated, block: B:102:0x0224  */
    /* JADX WARN: Code duplicated, block: B:106:0x0238  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e2 A[EDGE_INSN: B:133:0x01e2->B:89:0x01e2 BREAK  A[LOOP:1: B:19:0x0087->B:88:0x01d9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[LOOP:0: B:15:0x0052->B:17:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:48:0x0109  */
    /* JADX WARN: Code duplicated, block: B:61:0x014e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0159  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:99:0x020a  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        s sVar;
        int i10;
        C0168a c0168a;
        C0168a c0168a2;
        C2230e c2230e;
        C2230e c2230e2;
        int i11;
        int[] iArr;
        boolean z10;
        int i12;
        int i13;
        C2230e c2230eO;
        int i14;
        Animator animator;
        q qVar;
        View view;
        z zVar;
        z zVar2;
        int i15;
        boolean z11;
        int i16;
        View view2;
        z zVar3;
        C2230e c2230e3;
        int i17;
        int i18;
        View view3;
        SparseArray sparseArray;
        int size;
        int i19;
        View view4;
        View view5;
        p199t.l lVar;
        int iG;
        int i20;
        View view6;
        boolean z12;
        Iterator it;
        boolean z13 = true;
        ViewGroup viewGroup = this.f9615b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = w.f9618c;
        ViewGroup viewGroup2 = this.f9615b;
        if (!arrayList2.remove(viewGroup2)) {
            return true;
        }
        C2230e c2230eA = w.a();
        ArrayList arrayList3 = (ArrayList) c2230eA.get(viewGroup2);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            sVar = this.f9614a;
            arrayList3.add(sVar);
            sVar.a(new u(this, c2230eA));
            i10 = 0;
            sVar.h(viewGroup2, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((s) it.next()).z(viewGroup2);
                }
            }
            sVar.f9604i = new ArrayList();
            sVar.f9605j = new ArrayList();
            c0168a = sVar.f9600e;
            c0168a2 = sVar.f9601f;
            c2230e = new C2230e((C2230e) c0168a.f1501b);
            c2230e2 = new C2230e((C2230e) c0168a2.f1501b);
            i11 = 0;
            while (true) {
                iArr = sVar.f9603h;
                if (i11 < iArr.length) {
                    break;
                }
                i15 = iArr[i11];
                if (i15 != z13) {
                    z11 = z13;
                    for (i16 = c2230e.f26268c - 1; i16 >= 0; i16--) {
                        view2 = (View) c2230e.g(i16);
                        if (view2 == null && sVar.t(view2) && (zVar3 = (z) c2230e2.remove(view2)) != null && sVar.t(zVar3.f9628b)) {
                            sVar.f9604i.add((z) c2230e.h(i16));
                            sVar.f9605j.add(zVar3);
                        }
                    }
                } else if (i15 != 2) {
                    z11 = z13;
                    c2230e3 = (C2230e) c0168a.f1504e;
                    i17 = c2230e3.f26268c;
                    for (i18 = 0; i18 < i17; i18++) {
                        view3 = (View) c2230e3.j(i18);
                        if (view3 == null && sVar.t(view3)) {
                            View view7 = (View) ((C2230e) c0168a2.f1504e).get(c2230e3.g(i18));
                            if (view7 != null && sVar.t(view7)) {
                                z zVar4 = (z) c2230e.get(view3);
                                z zVar5 = (z) c2230e2.get(view7);
                                if (zVar4 != null && zVar5 != null) {
                                    sVar.f9604i.add(zVar4);
                                    sVar.f9605j.add(zVar5);
                                    c2230e.remove(view3);
                                    c2230e2.remove(view7);
                                }
                            }
                        }
                    }
                } else if (i15 != 3) {
                    if (i15 == 4) {
                        lVar = (p199t.l) c0168a.f1503d;
                        iG = lVar.g();
                        i20 = i10;
                        while (i20 < iG) {
                            view6 = (View) lVar.h(i20);
                            if (view6 == null && sVar.t(view6)) {
                                z12 = z13;
                                View view8 = (View) ((p199t.l) c0168a2.f1503d).b(lVar.d(i20));
                                if (view8 != null && sVar.t(view8)) {
                                    z zVar6 = (z) c2230e.get(view6);
                                    z zVar7 = (z) c2230e2.get(view8);
                                    if (zVar6 != null && zVar7 != null) {
                                        sVar.f9604i.add(zVar6);
                                        sVar.f9605j.add(zVar7);
                                        c2230e.remove(view6);
                                        c2230e2.remove(view8);
                                    }
                                }
                            } else {
                                z12 = z13;
                            }
                            i20++;
                            z13 = z12;
                        }
                    }
                    z11 = z13;
                } else {
                    z11 = z13;
                    sparseArray = (SparseArray) c0168a.f1502c;
                    SparseArray sparseArray2 = (SparseArray) c0168a2.f1502c;
                    size = sparseArray.size();
                    for (i19 = 0; i19 < size; i19++) {
                        view4 = (View) sparseArray.valueAt(i19);
                        if (view4 == null && sVar.t(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i19))) != null && sVar.t(view5)) {
                            z zVar8 = (z) c2230e.get(view4);
                            z zVar9 = (z) c2230e2.get(view5);
                            if (zVar8 != null && zVar9 != null) {
                                sVar.f9604i.add(zVar8);
                                sVar.f9605j.add(zVar9);
                                c2230e.remove(view4);
                                c2230e2.remove(view5);
                            }
                        }
                    }
                }
                i11++;
                z13 = z11;
                i10 = 0;
            }
            z10 = z13;
            for (i12 = 0; i12 < c2230e.f26268c; i12++) {
                zVar2 = (z) c2230e.j(i12);
                if (sVar.t(zVar2.f9628b)) {
                    sVar.f9604i.add(zVar2);
                    sVar.f9605j.add(null);
                }
            }
            for (i13 = 0; i13 < c2230e2.f26268c; i13++) {
                zVar = (z) c2230e2.j(i13);
                if (sVar.t(zVar.f9628b)) {
                    sVar.f9605j.add(zVar);
                    sVar.f9604i.add(null);
                }
            }
            c2230eO = s.o();
            int i21 = c2230eO.f26268c;
            B b10 = A.f9530a;
            WindowId windowId = viewGroup2.getWindowId();
            i14 = i21 - 1;
            while (i14 >= 0) {
                animator = (Animator) c2230eO.g(i14);
                if (animator == null && (qVar = (q) c2230eO.get(animator)) != null && (view = qVar.f9588a) != null && qVar.f9591d.f9552a.equals(windowId)) {
                    boolean z14 = z10;
                    z zVarR = sVar.r(view, z14);
                    z zVarN = sVar.n(view, z14);
                    if (zVarR == null && zVarN == null) {
                        zVarN = (z) ((C2230e) sVar.f9601f.f1501b).get(view);
                    }
                    if ((zVarR != null || zVarN != null) && qVar.f9592e.s(qVar.f9590c, zVarN)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            c2230eO.remove(animator);
                        }
                    }
                }
                i14--;
                z10 = true;
            }
            sVar.l(viewGroup2, sVar.f9600e, sVar.f9601f, sVar.f9604i, sVar.f9605j);
            sVar.A();
            return true;
        }
        arrayList3 = new ArrayList();
        c2230eA.put(viewGroup2, arrayList3);
        sVar = this.f9614a;
        arrayList3.add(sVar);
        sVar.a(new u(this, c2230eA));
        i10 = 0;
        sVar.h(viewGroup2, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((s) it.next()).z(viewGroup2);
            }
        }
        sVar.f9604i = new ArrayList();
        sVar.f9605j = new ArrayList();
        c0168a = sVar.f9600e;
        c0168a2 = sVar.f9601f;
        c2230e = new C2230e((C2230e) c0168a.f1501b);
        c2230e2 = new C2230e((C2230e) c0168a2.f1501b);
        i11 = 0;
        while (true) {
            iArr = sVar.f9603h;
            if (i11 < iArr.length) {
                break;
                break;
            }
            i15 = iArr[i11];
            if (i15 != z13) {
                z11 = z13;
                while (i16 >= 0) {
                    view2 = (View) c2230e.g(i16);
                    if (view2 == null) {
                    }
                }
            } else if (i15 != 2) {
                z11 = z13;
                c2230e3 = (C2230e) c0168a.f1504e;
                i17 = c2230e3.f26268c;
                while (i18 < i17) {
                    view3 = (View) c2230e3.j(i18);
                    if (view3 == null) {
                    }
                }
            } else if (i15 != 3) {
                if (i15 == 4) {
                    lVar = (p199t.l) c0168a.f1503d;
                    iG = lVar.g();
                    i20 = i10;
                    while (i20 < iG) {
                        view6 = (View) lVar.h(i20);
                        if (view6 == null) {
                            z12 = z13;
                        } else {
                            z12 = z13;
                        }
                        i20++;
                        z13 = z12;
                    }
                }
                z11 = z13;
            } else {
                z11 = z13;
                sparseArray = (SparseArray) c0168a.f1502c;
                SparseArray sparseArray3 = (SparseArray) c0168a2.f1502c;
                size = sparseArray.size();
                while (i19 < size) {
                    view4 = (View) sparseArray.valueAt(i19);
                    if (view4 == null) {
                    }
                }
            }
            i11++;
            z13 = z11;
            i10 = 0;
        }
        z10 = z13;
        while (i12 < c2230e.f26268c) {
            zVar2 = (z) c2230e.j(i12);
            if (sVar.t(zVar2.f9628b)) {
                sVar.f9604i.add(zVar2);
                sVar.f9605j.add(null);
            }
        }
        while (i13 < c2230e2.f26268c) {
            zVar = (z) c2230e2.j(i13);
            if (sVar.t(zVar.f9628b)) {
                sVar.f9605j.add(zVar);
                sVar.f9604i.add(null);
            }
        }
        c2230eO = s.o();
        int i22 = c2230eO.f26268c;
        B b11 = A.f9530a;
        WindowId windowId2 = viewGroup2.getWindowId();
        i14 = i22 - 1;
        while (i14 >= 0) {
            animator = (Animator) c2230eO.g(i14);
            if (animator == null) {
            }
            i14--;
            z10 = true;
        }
        sVar.l(viewGroup2, sVar.f9600e, sVar.f9601f, sVar.f9604i, sVar.f9605j);
        sVar.A();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f9615b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = w.f9618c;
        ViewGroup viewGroup2 = this.f9615b;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) w.a().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((s) it.next()).z(viewGroup2);
            }
        }
        this.f9614a.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
