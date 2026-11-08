package W;

import D7.W;
import N8.m;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class d implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f12756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f12757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12758c = 0;

    public d(Object[] objArr) {
        this.f12756a = objArr;
    }

    public final void a(int i10, Object obj) {
        j(this.f12758c + 1);
        Object[] objArr = this.f12756a;
        int i11 = this.f12758c;
        if (i10 != i11) {
            m.k0(objArr, i10 + 1, objArr, i10, i11);
        }
        objArr[i10] = obj;
        this.f12758c++;
    }

    public final void b(Object obj) {
        j(this.f12758c + 1);
        Object[] objArr = this.f12756a;
        int i10 = this.f12758c;
        objArr[i10] = obj;
        this.f12758c = i10 + 1;
    }

    public final void c(int i10, d dVar) {
        if (dVar.l()) {
            return;
        }
        j(this.f12758c + dVar.f12758c);
        Object[] objArr = this.f12756a;
        int i11 = this.f12758c;
        if (i10 != i11) {
            m.k0(objArr, dVar.f12758c + i10, objArr, i10, i11);
        }
        m.k0(dVar.f12756a, i10, objArr, 0, dVar.f12758c);
        this.f12758c += dVar.f12758c;
    }

    public final void d(int i10, List list) {
        if (list.isEmpty()) {
            return;
        }
        j(list.size() + this.f12758c);
        Object[] objArr = this.f12756a;
        if (i10 != this.f12758c) {
            m.k0(objArr, list.size() + i10, objArr, i10, this.f12758c);
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = list.get(i11);
        }
        this.f12758c = list.size() + this.f12758c;
    }

    public final boolean f(int i10, Collection collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        j(collection.size() + this.f12758c);
        Object[] objArr = this.f12756a;
        if (i10 != this.f12758c) {
            m.k0(objArr, collection.size() + i10, objArr, i10, this.f12758c);
        }
        for (Object obj : collection) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                W.k0();
                throw null;
            }
            objArr[i11 + i10] = obj;
            i11 = i12;
        }
        this.f12758c = collection.size() + this.f12758c;
        return true;
    }

    public final List g() {
        a aVar = this.f12757b;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f12757b = aVar2;
        return aVar2;
    }

    public final void h() {
        Object[] objArr = this.f12756a;
        int i10 = this.f12758c;
        while (true) {
            i10--;
            if (-1 >= i10) {
                this.f12758c = 0;
                return;
            }
            objArr[i10] = null;
        }
    }

    public final boolean i(Object obj) {
        int i10 = this.f12758c - 1;
        if (i10 >= 0) {
            for (int i11 = 0; !kotlin.jvm.internal.m.b(this.f12756a[i11], obj); i11++) {
                if (i11 != i10) {
                }
            }
            return true;
        }
        return false;
    }

    public final void j(int i10) {
        Object[] objArr = this.f12756a;
        if (objArr.length < i10) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i10, objArr.length * 2));
            kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f12756a = objArrCopyOf;
        }
    }

    public final int k(Object obj) {
        int i10 = this.f12758c;
        if (i10 <= 0) {
            return -1;
        }
        Object[] objArr = this.f12756a;
        int i11 = 0;
        while (!kotlin.jvm.internal.m.b(obj, objArr[i11])) {
            i11++;
            if (i11 >= i10) {
                return -1;
            }
        }
        return i11;
    }

    public final boolean l() {
        return this.f12758c == 0;
    }

    public final boolean m() {
        return this.f12758c != 0;
    }

    public final boolean n(Object obj) {
        int iK = k(obj);
        if (iK < 0) {
            return false;
        }
        o(iK);
        return true;
    }

    public final Object o(int i10) {
        Object[] objArr = this.f12756a;
        Object obj = objArr[i10];
        int i11 = this.f12758c;
        if (i10 != i11 - 1) {
            m.k0(objArr, i10, objArr, i10 + 1, i11);
        }
        int i12 = this.f12758c - 1;
        this.f12758c = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void p(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f12758c;
            if (i11 < i12) {
                Object[] objArr = this.f12756a;
                m.k0(objArr, i10, objArr, i11, i12);
            }
            int i13 = this.f12758c;
            int i14 = i13 - (i11 - i10);
            int i15 = i13 - 1;
            if (i14 <= i15) {
                int i16 = i14;
                while (true) {
                    this.f12756a[i16] = null;
                    if (i16 == i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f12758c = i14;
        }
    }

    public final void q(Comparator comparator) {
        Arrays.sort(this.f12756a, 0, this.f12758c, comparator);
    }
}
