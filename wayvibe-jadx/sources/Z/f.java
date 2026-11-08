package Z;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.B;

/* JADX INFO: loaded from: classes.dex */
public class f extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f13426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f13427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13429g;

    public f(e eVar, n[] nVarArr) {
        super(eVar.f13422c, nVarArr);
        this.f13426d = eVar;
        this.f13429g = eVar.f13424e;
    }

    public final void c(int i10, m mVar, Object obj, int i11) {
        int i12 = i11 * 5;
        n[] nVarArr = this.f13417a;
        if (i12 <= 30) {
            int iH = 1 << p206t6.b.H(i10, i12);
            if (mVar.h(iH)) {
                nVarArr[i11].a(mVar.f13442d, Integer.bitCount(mVar.f13439a) * 2, mVar.f(iH));
                this.f13418b = i11;
                return;
            } else {
                int iT = mVar.t(iH);
                m mVarS = mVar.s(iT);
                nVarArr[i11].a(mVar.f13442d, Integer.bitCount(mVar.f13439a) * 2, iT);
                c(i10, mVarS, obj, i11 + 1);
                return;
            }
        }
        n nVar = nVarArr[i11];
        Object[] objArr = mVar.f13442d;
        nVar.a(objArr, objArr.length, 0);
        while (true) {
            n nVar2 = nVarArr[i11];
            if (kotlin.jvm.internal.m.b(nVar2.f13443a[nVar2.f13445c], obj)) {
                this.f13418b = i11;
                return;
            } else {
                nVarArr[i11].f13445c += 2;
            }
        }
    }

    @Override // Z.d, java.util.Iterator
    public final Object next() {
        if (this.f13426d.f13424e != this.f13429g) {
            throw new ConcurrentModificationException();
        }
        if (!this.f13419c) {
            throw new NoSuchElementException();
        }
        n nVar = this.f13417a[this.f13418b];
        this.f13427e = nVar.f13443a[nVar.f13445c];
        this.f13428f = true;
        return super.next();
    }

    @Override // Z.d, java.util.Iterator
    public final void remove() {
        if (!this.f13428f) {
            throw new IllegalStateException();
        }
        boolean z10 = this.f13419c;
        e eVar = this.f13426d;
        if (!z10) {
            B.c(eVar).remove(this.f13427e);
        } else {
            if (!z10) {
                throw new NoSuchElementException();
            }
            n nVar = this.f13417a[this.f13418b];
            Object obj = nVar.f13443a[nVar.f13445c];
            B.c(eVar).remove(this.f13427e);
            c(obj != null ? obj.hashCode() : 0, eVar.f13422c, obj, 0);
        }
        this.f13427e = null;
        this.f13428f = false;
        this.f13429g = eVar.f13424e;
    }
}
