package P3;

import K1.T;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.A0;
import androidx.fragment.app.RunnableC1090l;
import app.nagakiba.wayvibe.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class o extends A0 {
    @Override // androidx.fragment.app.A0
    public final void a(View view, Object obj) {
        ((s) obj).b(view);
    }

    @Override // androidx.fragment.app.A0
    public final void b(Object obj, ArrayList arrayList) {
        s sVar = (s) obj;
        if (sVar == null) {
            return;
        }
        int i10 = 0;
        if (sVar instanceof x) {
            x xVar = (x) sVar;
            int size = xVar.f9619v.size();
            while (i10 < size) {
                b((i10 < 0 || i10 >= xVar.f9619v.size()) ? null : (s) xVar.f9619v.get(i10), arrayList);
                i10++;
            }
            return;
        }
        if (A0.h(sVar.f9598c) && A0.h(sVar.f9599d)) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                sVar.b((View) arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.A0
    public final void c(ViewGroup viewGroup, Object obj) {
        s sVar = (s) obj;
        ArrayList arrayList = w.f9618c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap weakHashMap = T.f7251a;
        if (viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (sVar == null) {
                sVar = w.f9616a;
            }
            s sVarClone = sVar.clone();
            ArrayList arrayList2 = (ArrayList) w.a().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((s) it.next()).v(viewGroup);
                }
            }
            if (sVarClone != null) {
                sVarClone.h(viewGroup, true);
            }
            if (viewGroup.getTag(R.id.transition_current_scene) != null) {
                throw new ClassCastException();
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (sVarClone != null) {
                v vVar = new v();
                vVar.f9614a = sVarClone;
                vVar.f9615b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(vVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(vVar);
            }
        }
    }

    @Override // androidx.fragment.app.A0
    public final boolean e(Object obj) {
        return obj instanceof s;
    }

    @Override // androidx.fragment.app.A0
    public final Object f(Object obj) {
        if (obj != null) {
            return ((s) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.A0
    public final Object j(Object obj, Object obj2, Object obj3) {
        s sVar = (s) obj;
        s sVar2 = (s) obj2;
        s sVar3 = (s) obj3;
        if (sVar != null && sVar2 != null) {
            x xVar = new x();
            xVar.I(sVar);
            xVar.I(sVar2);
            xVar.f9620w = false;
            sVar = xVar;
        } else if (sVar == null) {
            sVar = sVar2 != null ? sVar2 : null;
        }
        if (sVar3 == null) {
            return sVar;
        }
        x xVar2 = new x();
        if (sVar != null) {
            xVar2.I(sVar);
        }
        xVar2.I(sVar3);
        return xVar2;
    }

    @Override // androidx.fragment.app.A0
    public final Object k(Object obj, Object obj2) {
        x xVar = new x();
        if (obj != null) {
            xVar.I((s) obj);
        }
        xVar.I((s) obj2);
        return xVar;
    }

    @Override // androidx.fragment.app.A0
    public final void l(Object obj, View view, ArrayList arrayList) {
        ((s) obj).a(new l(view, arrayList));
    }

    @Override // androidx.fragment.app.A0
    public final void m(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((s) obj).a(new m(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.A0
    public final void n(View view, Object obj) {
        if (view != null) {
            A0.g(view, new Rect());
            ((s) obj).B(new k(11));
        }
    }

    @Override // androidx.fragment.app.A0
    public final void o(Object obj, Rect rect) {
        ((s) obj).B(new k(11));
    }

    @Override // androidx.fragment.app.A0
    public final void p(Object obj, G1.b bVar, RunnableC1090l runnableC1090l) {
        s sVar = (s) obj;
        p268z7.c cVar = new p268z7.c(sVar, 20);
        synchronized (bVar) {
            while (bVar.f5342b) {
                try {
                    try {
                        bVar.wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (((p268z7.c) bVar.f5343c) != cVar) {
                bVar.f5343c = cVar;
                if (bVar.f5341a) {
                    ((s) cVar.f29899b).cancel();
                }
            }
        }
        sVar.a(new n(runnableC1090l));
    }

    @Override // androidx.fragment.app.A0
    public final void q(Object obj, View view, ArrayList arrayList) {
        x xVar = (x) obj;
        ArrayList arrayList2 = xVar.f9599d;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            A0.d(arrayList2, (View) arrayList.get(i10));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(xVar, arrayList);
    }

    @Override // androidx.fragment.app.A0
    public final void r(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        x xVar = (x) obj;
        if (xVar != null) {
            ArrayList arrayList3 = xVar.f9599d;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            t(xVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.A0
    public final Object s(Object obj) {
        if (obj == null) {
            return null;
        }
        x xVar = new x();
        xVar.I((s) obj);
        return xVar;
    }

    public final void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        s sVar = (s) obj;
        int i10 = 0;
        if (sVar instanceof x) {
            x xVar = (x) sVar;
            int size = xVar.f9619v.size();
            while (i10 < size) {
                t((i10 < 0 || i10 >= xVar.f9619v.size()) ? null : (s) xVar.f9619v.get(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (A0.h(sVar.f9598c)) {
            ArrayList arrayList3 = sVar.f9599d;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i10 < size2) {
                    sVar.b((View) arrayList2.get(i10));
                    i10++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    sVar.y((View) arrayList.get(size3));
                }
            }
        }
    }
}
