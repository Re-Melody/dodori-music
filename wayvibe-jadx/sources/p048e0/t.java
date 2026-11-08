package p048e0;

import U.C0880d;
import Z8.a;
import Z8.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f19525a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f19526b = new Object();

    public static final void a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
    }

    public static final int b(int[] iArr, int i10) {
        int length = iArr.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) >>> 1;
            int i13 = iArr[i12];
            if (i10 > i13) {
                i11 = i12 + 1;
            } else {
                if (i10 >= i13) {
                    return i12;
                }
                length = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static i c() {
        return (i) o.f19509a.get();
    }

    public static i d(i iVar) {
        if (iVar instanceof E) {
            E e2 = (E) iVar;
            if (e2.f19463t == C0880d.z()) {
                e2.r = null;
                return iVar;
            }
        }
        if (iVar instanceof F) {
            F f10 = (F) iVar;
            if (f10.f19467h == C0880d.z()) {
                f10.f19466g = null;
                return iVar;
            }
        }
        i iVarH = o.h(iVar, null, false);
        iVarH.j();
        return iVarH;
    }

    public static Object e(a aVar, c cVar) {
        i e2;
        if (cVar == null) {
            return aVar.invoke();
        }
        i iVar = (i) o.f19509a.get();
        if (iVar instanceof E) {
            E e4 = (E) iVar;
            if (e4.f19463t == C0880d.z()) {
                c cVar2 = e4.r;
                c cVar3 = e4.f19462s;
                try {
                    ((E) iVar).r = o.l(true, cVar, cVar2);
                    ((E) iVar).f19462s = cVar3;
                    return aVar.invoke();
                } finally {
                    e4.r = cVar2;
                    e4.f19462s = cVar3;
                }
            }
        }
        if (iVar == null || (iVar instanceof C1947e)) {
            e2 = new E(iVar instanceof C1947e ? (C1947e) iVar : null, cVar, null, true, false);
        } else {
            if (cVar == null) {
                return aVar.invoke();
            }
            e2 = iVar.t(cVar);
        }
        try {
            i iVarJ = e2.j();
            try {
                Object objInvoke = aVar.invoke();
                i.p(iVarJ);
                e2.c();
                return objInvoke;
            } catch (Throwable th) {
                i.p(iVarJ);
                throw th;
            }
        } catch (Throwable th2) {
            e2.c();
            throw th2;
        }
    }

    public static void f(i iVar, i iVar2, c cVar) {
        if (iVar != iVar2) {
            iVar2.getClass();
            i.p(iVar);
            iVar2.c();
        } else if (iVar instanceof E) {
            ((E) iVar).r = cVar;
        } else if (iVar instanceof F) {
            ((F) iVar).f19466g = cVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + iVar).toString());
        }
    }

    public static final void g() {
        throw new UnsupportedOperationException();
    }
}
