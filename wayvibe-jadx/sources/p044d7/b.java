package p044d7;

import Ca.C0168a;
import E3.d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import p170p7.h;
import p170p7.n;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f19298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f19299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Comparator f19300c;

    public b() {
        d dVar = h.f25262b;
        this.f19298a = new Object[0];
        this.f19299b = new Object[0];
        this.f19300c = dVar;
    }

    @Override // p044d7.c
    public final boolean a(Object obj) {
        return n(obj) != -1;
    }

    @Override // p044d7.c
    public final Object c(h hVar) {
        int iN = n(hVar);
        if (iN != -1) {
            return this.f19299b[iN];
        }
        return null;
    }

    @Override // p044d7.c
    public final Comparator d() {
        return this.f19300c;
    }

    @Override // p044d7.c
    public final Object f() {
        Object[] objArr = this.f19298a;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    @Override // p044d7.c
    public final Object h() {
        Object[] objArr = this.f19298a;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    @Override // p044d7.c
    public final int i(n nVar) {
        return n(nVar);
    }

    @Override // p044d7.c
    public final boolean isEmpty() {
        return this.f19298a.length == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a(this, 0);
    }

    @Override // p044d7.c
    public final c j(Object obj, Object obj2) {
        int iN = n(obj);
        Comparator comparator = this.f19300c;
        Object[] objArr = this.f19299b;
        Object[] objArr2 = this.f19298a;
        if (iN != -1) {
            if (objArr2[iN] == obj && objArr[iN] == obj2) {
                return this;
            }
            int length = objArr2.length;
            Object[] objArr3 = new Object[length];
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            objArr3[iN] = obj;
            int length2 = objArr.length;
            Object[] objArr4 = new Object[length2];
            System.arraycopy(objArr, 0, objArr4, 0, length2);
            objArr4[iN] = obj2;
            return new b(comparator, objArr3, objArr4);
        }
        if (objArr2.length > 25) {
            HashMap map = new HashMap(objArr2.length + 1);
            for (int i10 = 0; i10 < objArr2.length; i10++) {
                map.put(objArr2[i10], objArr[i10]);
            }
            map.put(obj, obj2);
            return C0168a.u(new ArrayList(map.keySet()), map, comparator);
        }
        int i11 = 0;
        while (i11 < objArr2.length && comparator.compare(objArr2[i11], obj) < 0) {
            i11++;
        }
        int length3 = objArr2.length + 1;
        Object[] objArr5 = new Object[length3];
        System.arraycopy(objArr2, 0, objArr5, 0, i11);
        objArr5[i11] = obj;
        int i12 = i11 + 1;
        System.arraycopy(objArr2, i11, objArr5, i12, (length3 - i11) - 1);
        int length4 = objArr.length + 1;
        Object[] objArr6 = new Object[length4];
        System.arraycopy(objArr, 0, objArr6, 0, i11);
        objArr6[i11] = obj2;
        System.arraycopy(objArr, i11, objArr6, i12, (length4 - i11) - 1);
        return new b(comparator, objArr5, objArr6);
    }

    @Override // p044d7.c
    public final Iterator k(Object obj) {
        int i10 = 0;
        while (true) {
            Object[] objArr = this.f19298a;
            if (i10 >= objArr.length || this.f19300c.compare(objArr[i10], obj) >= 0) {
                break;
            }
            i10++;
        }
        return new a(this, i10);
    }

    @Override // p044d7.c
    public final c m(Object obj) {
        int iN = n(obj);
        if (iN == -1) {
            return this;
        }
        Object[] objArr = this.f19298a;
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, iN);
        int i10 = iN + 1;
        System.arraycopy(objArr, i10, objArr2, iN, length - iN);
        Object[] objArr3 = this.f19299b;
        int length2 = objArr3.length - 1;
        Object[] objArr4 = new Object[length2];
        System.arraycopy(objArr3, 0, objArr4, 0, iN);
        System.arraycopy(objArr3, i10, objArr4, iN, length2 - iN);
        return new b(this.f19300c, objArr2, objArr4);
    }

    public final int n(Object obj) {
        int i10 = 0;
        for (Object obj2 : this.f19298a) {
            if (this.f19300c.compare(obj, obj2) == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // p044d7.c
    public final int size() {
        return this.f19298a.length;
    }

    public b(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.f19298a = objArr;
        this.f19299b = objArr2;
        this.f19300c = comparator;
    }
}
