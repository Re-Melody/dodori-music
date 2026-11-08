package P3;

import B2.AbstractC0112b;
import Ca.C0168a;
import K1.K;
import K1.T;
import K1.Y;
import android.animation.Animator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p199t.C2230e;

/* JADX INFO: loaded from: classes.dex */
public abstract class s implements Cloneable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f9593s = {2, 1, 3, 4};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p217u7.d f9594t = new p217u7.d(15);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ThreadLocal f9595u = new ThreadLocal();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f9604i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f9605j;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p242x0.c f9611q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9596a = getClass().getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9597b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f9598c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f9599d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0168a f9600e = new C0168a(11);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0168a f9601f = new C0168a(11);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x f9602g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f9603h = f9593s;
    public final ArrayList k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9606l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9607m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9608n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f9609o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f9610p = new ArrayList();
    public p217u7.d r = f9594t;

    public static void c(C0168a c0168a, View view, z zVar) {
        ((C2230e) c0168a.f1501b).put(view, zVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) c0168a.f1502c;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = T.f7251a;
        String strF = K.f(view);
        if (strF != null) {
            C2230e c2230e = (C2230e) c0168a.f1504e;
            if (c2230e.containsKey(strF)) {
                c2230e.put(strF, null);
            } else {
                c2230e.put(strF, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                p199t.l lVar = (p199t.l) c0168a.f1503d;
                if (lVar.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    lVar.e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) lVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    lVar.e(itemIdAtPosition, null);
                }
            }
        }
    }

    public static C2230e o() {
        ThreadLocal threadLocal = f9595u;
        C2230e c2230e = (C2230e) threadLocal.get();
        if (c2230e != null) {
            return c2230e;
        }
        C2230e c2230e2 = new C2230e(0);
        threadLocal.set(c2230e2);
        return c2230e2;
    }

    public static boolean u(z zVar, z zVar2, String str) {
        Object obj = zVar.f9627a.get(str);
        Object obj2 = zVar2.f9627a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A() {
        G();
        C2230e c2230eO = o();
        for (Animator animator : this.f9610p) {
            if (c2230eO.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new Y(this, c2230eO));
                    long j10 = this.f9597b;
                    if (j10 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j10);
                    }
                    animator.addListener(new p(this, 0));
                    animator.start();
                }
            }
        }
        this.f9610p.clear();
        m();
    }

    public void B(p242x0.c cVar) {
        this.f9611q = cVar;
    }

    public void D(p217u7.d dVar) {
        if (dVar == null) {
            this.r = f9594t;
        } else {
            this.r = dVar;
        }
    }

    public void F(long j10) {
        this.f9597b = j10;
    }

    public final void G() {
        if (this.f9606l == 0) {
            ArrayList arrayList = this.f9609o;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f9609o.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((r) arrayList2.get(i10)).c(this);
                }
            }
            this.f9608n = false;
        }
        this.f9606l++;
    }

    public String H(String str) {
        StringBuilder sbO = AbstractC0112b.o(str);
        sbO.append(getClass().getSimpleName());
        sbO.append("@");
        sbO.append(Integer.toHexString(hashCode()));
        sbO.append(": ");
        String string = sbO.toString();
        if (this.f9597b != -1) {
            string = V0.p.k(this.f9597b, ") ", V0.p.t(string, "dly("));
        }
        ArrayList arrayList = this.f9598c;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f9599d;
        if (size <= 0 && arrayList2.size() <= 0) {
            return string;
        }
        String strN = V0.p.n(string, "tgts(");
        if (arrayList.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i10 > 0) {
                    strN = V0.p.n(strN, ", ");
                }
                StringBuilder sbO2 = AbstractC0112b.o(strN);
                sbO2.append(arrayList.get(i10));
                strN = sbO2.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if (i11 > 0) {
                    strN = V0.p.n(strN, ", ");
                }
                StringBuilder sbO3 = AbstractC0112b.o(strN);
                sbO3.append(arrayList2.get(i11));
                strN = sbO3.toString();
            }
        }
        return V0.p.n(strN, ")");
    }

    public void a(r rVar) {
        if (this.f9609o == null) {
            this.f9609o = new ArrayList();
        }
        this.f9609o.add(rVar);
    }

    public void b(View view) {
        this.f9599d.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = this.f9609o;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.f9609o.clone();
        int size2 = arrayList3.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((r) arrayList3.get(i10)).d();
        }
    }

    public abstract void d(z zVar);

    public final void e(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            z zVar = new z(view);
            if (z10) {
                g(zVar);
            } else {
                d(zVar);
            }
            zVar.f9629c.add(this);
            f(zVar);
            if (z10) {
                c(this.f9600e, view, zVar);
            } else {
                c(this.f9601f, view, zVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), z10);
            }
        }
    }

    public abstract void g(z zVar);

    public final void h(ViewGroup viewGroup, boolean z10) {
        i(z10);
        ArrayList arrayList = this.f9598c;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f9599d;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z10);
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i10)).intValue());
            if (viewFindViewById != null) {
                z zVar = new z(viewFindViewById);
                if (z10) {
                    g(zVar);
                } else {
                    d(zVar);
                }
                zVar.f9629c.add(this);
                f(zVar);
                if (z10) {
                    c(this.f9600e, viewFindViewById, zVar);
                } else {
                    c(this.f9601f, viewFindViewById, zVar);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            View view = (View) arrayList2.get(i11);
            z zVar2 = new z(view);
            if (z10) {
                g(zVar2);
            } else {
                d(zVar2);
            }
            zVar2.f9629c.add(this);
            f(zVar2);
            if (z10) {
                c(this.f9600e, view, zVar2);
            } else {
                c(this.f9601f, view, zVar2);
            }
        }
    }

    public final void i(boolean z10) {
        if (z10) {
            ((C2230e) this.f9600e.f1501b).clear();
            ((SparseArray) this.f9600e.f1502c).clear();
            ((p199t.l) this.f9600e.f1503d).a();
        } else {
            ((C2230e) this.f9601f.f1501b).clear();
            ((SparseArray) this.f9601f.f1502c).clear();
            ((p199t.l) this.f9601f.f1503d).a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public s clone() {
        try {
            s sVar = (s) super.clone();
            sVar.f9610p = new ArrayList();
            sVar.f9600e = new C0168a(11);
            sVar.f9601f = new C0168a(11);
            sVar.f9604i = null;
            sVar.f9605j = null;
            return sVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, z zVar, z zVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, C0168a c0168a, C0168a c0168a2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorK;
        int i10;
        int i11;
        View view;
        z zVar;
        Animator animator;
        z zVar2;
        C2230e c2230eO = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            z zVar3 = (z) arrayList.get(i12);
            z zVar4 = (z) arrayList2.get(i12);
            if (zVar3 != null && !zVar3.f9629c.contains(this)) {
                zVar3 = null;
            }
            if (zVar4 != null && !zVar4.f9629c.contains(this)) {
                zVar4 = null;
            }
            if (!(zVar3 == null && zVar4 == null) && ((zVar3 == null || zVar4 == null || s(zVar3, zVar4)) && (animatorK = k(viewGroup, zVar3, zVar4)) != null)) {
                String str = this.f9596a;
                if (zVar4 != null) {
                    String[] strArrP = p();
                    view = zVar4.f9628b;
                    if (strArrP != null && strArrP.length > 0) {
                        zVar2 = new z(view);
                        z zVar5 = (z) ((C2230e) c0168a2.f1501b).get(view);
                        i10 = size;
                        if (zVar5 != null) {
                            int i13 = 0;
                            while (i13 < strArrP.length) {
                                HashMap map = zVar2.f9627a;
                                int i14 = i12;
                                String str2 = strArrP[i13];
                                map.put(str2, zVar5.f9627a.get(str2));
                                i13++;
                                i12 = i14;
                            }
                        }
                        i11 = i12;
                        int i15 = c2230eO.f26268c;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= i15) {
                                animator = animatorK;
                                break;
                            }
                            q qVar = (q) c2230eO.get((Animator) c2230eO.g(i16));
                            if (qVar.f9590c != null && qVar.f9588a == view && qVar.f9589b.equals(str) && qVar.f9590c.equals(zVar2)) {
                                animator = null;
                                break;
                            }
                            i16++;
                        }
                    } else {
                        i10 = size;
                        i11 = i12;
                        animator = animatorK;
                        zVar2 = null;
                    }
                    animatorK = animator;
                    zVar = zVar2;
                } else {
                    i10 = size;
                    i11 = i12;
                    view = zVar3.f9628b;
                    zVar = null;
                }
                if (animatorK != null) {
                    B b10 = A.f9530a;
                    G g3 = new G(viewGroup);
                    q qVar2 = new q();
                    qVar2.f9588a = view;
                    qVar2.f9589b = str;
                    qVar2.f9590c = zVar;
                    qVar2.f9591d = g3;
                    qVar2.f9592e = this;
                    c2230eO.put(animatorK, qVar2);
                    this.f9610p.add(animatorK);
                }
            } else {
                i10 = size;
                i11 = i12;
            }
            i12 = i11 + 1;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i17 = 0; i17 < sparseIntArray.size(); i17++) {
                Animator animator2 = (Animator) this.f9610p.get(sparseIntArray.keyAt(i17));
                animator2.setStartDelay(animator2.getStartDelay() + (((long) sparseIntArray.valueAt(i17)) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i10 = this.f9606l - 1;
        this.f9606l = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f9609o;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f9609o.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((r) arrayList2.get(i11)).a(this);
                }
            }
            for (int i12 = 0; i12 < ((p199t.l) this.f9600e.f1503d).g(); i12++) {
                View view = (View) ((p199t.l) this.f9600e.f1503d).h(i12);
                if (view != null) {
                    WeakHashMap weakHashMap = T.f7251a;
                    view.setHasTransientState(false);
                }
            }
            for (int i13 = 0; i13 < ((p199t.l) this.f9601f.f1503d).g(); i13++) {
                View view2 = (View) ((p199t.l) this.f9601f.f1503d).h(i13);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = T.f7251a;
                    view2.setHasTransientState(false);
                }
            }
            this.f9608n = true;
        }
    }

    public final z n(View view, boolean z10) {
        x xVar = this.f9602g;
        if (xVar != null) {
            return xVar.n(view, z10);
        }
        ArrayList arrayList = z10 ? this.f9604i : this.f9605j;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            z zVar = (z) arrayList.get(i10);
            if (zVar == null) {
                return null;
            }
            if (zVar.f9628b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (z) (z10 ? this.f9605j : this.f9604i).get(i10);
        }
        return null;
    }

    public String[] p() {
        return null;
    }

    public final z r(View view, boolean z10) {
        x xVar = this.f9602g;
        if (xVar != null) {
            return xVar.r(view, z10);
        }
        return (z) ((C2230e) (z10 ? this.f9600e : this.f9601f).f1501b).get(view);
    }

    public boolean s(z zVar, z zVar2) {
        if (zVar != null && zVar2 != null) {
            String[] strArrP = p();
            if (strArrP != null) {
                for (String str : strArrP) {
                    if (u(zVar, zVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = zVar.f9627a.keySet().iterator();
                while (it.hasNext()) {
                    if (u(zVar, zVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f9598c;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f9599d;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public void v(ViewGroup viewGroup) {
        if (this.f9608n) {
            return;
        }
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).pause();
        }
        ArrayList arrayList2 = this.f9609o;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.f9609o.clone();
            int size2 = arrayList3.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((r) arrayList3.get(i10)).b();
            }
        }
        this.f9607m = true;
    }

    public void w(r rVar) {
        ArrayList arrayList = this.f9609o;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(rVar);
        if (this.f9609o.size() == 0) {
            this.f9609o = null;
        }
    }

    public void y(View view) {
        this.f9599d.remove(view);
    }

    public void z(View view) {
        if (this.f9607m) {
            if (!this.f9608n) {
                ArrayList arrayList = this.k;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((Animator) arrayList.get(size)).resume();
                }
                ArrayList arrayList2 = this.f9609o;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.f9609o.clone();
                    int size2 = arrayList3.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((r) arrayList3.get(i10)).e();
                    }
                }
            }
            this.f9607m = false;
        }
    }

    public void C() {
    }

    public void E() {
    }

    public void f(z zVar) {
    }
}
