package p048e0;

import D.w;
import F0.C0399q;
import U.C0880d;
import Y.b;
import Y.f;
import Y.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p013a9.c;

/* JADX INFO: loaded from: classes.dex */
public final class s implements A, List, RandomAccess, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f19524a;

    public s() {
        i iVar = i.f13320b;
        r rVar = new r(iVar);
        if (o.f19509a.get() != null) {
            r rVar2 = new r(iVar);
            rVar2.f19453a = 1;
            rVar.f19454b = rVar2;
        }
        this.f19524a = rVar;
    }

    public final r a() {
        r rVar = this.f19524a;
        m.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (r) o.t(rVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i10;
        Y.c cVar;
        boolean z10;
        i iVarK;
        do {
            Object obj2 = t.f19525a;
            synchronized (obj2) {
                r rVar = this.f19524a;
                m.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) o.i(rVar);
                i10 = rVar2.f19522d;
                cVar = rVar2.f19521c;
            }
            m.c(cVar);
            Y.c cVarO = cVar.o(obj);
            z10 = false;
            if (cVarO.equals(cVar)) {
                return false;
            }
            r rVar3 = this.f19524a;
            m.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (o.f19510b) {
                iVarK = o.k();
                r rVar4 = (r) o.w(rVar3, this, iVarK);
                synchronized (obj2) {
                    int i11 = rVar4.f19522d;
                    if (i11 == i10) {
                        rVar4.f19521c = cVarO;
                        rVar4.f19523e++;
                        rVar4.f19522d = i11 + 1;
                        z10 = true;
                    }
                }
            }
            o.n(iVarK, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return d(new w(i10, collection));
    }

    public final int c() {
        r rVar = this.f19524a;
        m.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((r) o.i(rVar)).f19523e;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        i iVarK;
        r rVar = this.f19524a;
        m.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (o.f19510b) {
            iVarK = o.k();
            r rVar2 = (r) o.w(rVar, this, iVarK);
            synchronized (t.f19525a) {
                rVar2.f19521c = i.f13320b;
                rVar2.f19522d++;
                rVar2.f19523e++;
            }
        }
        o.n(iVarK, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return a().f19521c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return a().f19521c.containsAll(collection);
    }

    public final boolean d(Z8.c cVar) {
        int i10;
        Y.c cVar2;
        Object objInvoke;
        i iVarK;
        boolean z10;
        do {
            Object obj = t.f19525a;
            synchronized (obj) {
                r rVar = this.f19524a;
                m.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) o.i(rVar);
                i10 = rVar2.f19522d;
                cVar2 = rVar2.f19521c;
            }
            m.c(cVar2);
            f fVarQ = cVar2.q();
            objInvoke = cVar.invoke(fVarQ);
            Y.c cVarO = fVarQ.o();
            if (m.b(cVarO, cVar2)) {
                break;
            }
            r rVar3 = this.f19524a;
            m.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (o.f19510b) {
                iVarK = o.k();
                r rVar4 = (r) o.w(rVar3, this, iVarK);
                synchronized (obj) {
                    int i11 = rVar4.f19522d;
                    if (i11 == i10) {
                        rVar4.f19521c = cVarO;
                        rVar4.f19522d = i11 + 1;
                        z10 = true;
                        rVar4.f19523e++;
                    } else {
                        z10 = false;
                    }
                }
            }
            o.n(iVarK, this);
        } while (!z10);
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return a().f19521c.get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return a().f19521c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return a().f19521c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // p048e0.A
    public final C k() {
        return this.f19524a;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return a().f19521c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C0399q(this, 0);
    }

    @Override // p048e0.A
    public final void q(C c3) {
        c3.f19454b = this.f19524a;
        this.f19524a = (r) c3;
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        int i11;
        Y.c cVar;
        i iVarK;
        boolean z10;
        Object obj = get(i10);
        do {
            Object obj2 = t.f19525a;
            synchronized (obj2) {
                r rVar = this.f19524a;
                m.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) o.i(rVar);
                i11 = rVar2.f19522d;
                cVar = rVar2.f19521c;
            }
            m.c(cVar);
            Y.c cVarS = cVar.s(i10);
            if (cVarS.equals(cVar)) {
                break;
            }
            r rVar3 = this.f19524a;
            m.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (o.f19510b) {
                iVarK = o.k();
                r rVar4 = (r) o.w(rVar3, this, iVarK);
                synchronized (obj2) {
                    int i12 = rVar4.f19522d;
                    if (i12 == i11) {
                        rVar4.f19521c = cVarS;
                        z10 = true;
                        rVar4.f19523e++;
                        rVar4.f19522d = i12 + 1;
                    } else {
                        z10 = false;
                    }
                }
            }
            o.n(iVarK, this);
        } while (!z10);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10;
        Y.c cVar;
        boolean z10;
        i iVarK;
        do {
            Object obj = t.f19525a;
            synchronized (obj) {
                r rVar = this.f19524a;
                m.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) o.i(rVar);
                i10 = rVar2.f19522d;
                cVar = rVar2.f19521c;
            }
            m.c(cVar);
            Y.c cVarR = cVar.r(new b(0, collection));
            z10 = false;
            if (m.b(cVarR, cVar)) {
                return false;
            }
            r rVar3 = this.f19524a;
            m.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (o.f19510b) {
                iVarK = o.k();
                r rVar4 = (r) o.w(rVar3, this, iVarK);
                synchronized (obj) {
                    int i11 = rVar4.f19522d;
                    if (i11 == i10) {
                        rVar4.f19521c = cVarR;
                        rVar4.f19523e++;
                        rVar4.f19522d = i11 + 1;
                        z10 = true;
                    }
                }
            }
            o.n(iVarK, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return d(new b(3, collection));
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        int i11;
        Y.c cVar;
        i iVarK;
        boolean z10;
        Object obj2 = get(i10);
        do {
            Object obj3 = t.f19525a;
            synchronized (obj3) {
                r rVar = this.f19524a;
                m.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) o.i(rVar);
                i11 = rVar2.f19522d;
                cVar = rVar2.f19521c;
            }
            m.c(cVar);
            Y.c cVarT = cVar.t(i10, obj);
            if (cVarT.equals(cVar)) {
                break;
            }
            r rVar3 = this.f19524a;
            m.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (o.f19510b) {
                iVarK = o.k();
                r rVar4 = (r) o.w(rVar3, this, iVarK);
                synchronized (obj3) {
                    int i12 = rVar4.f19522d;
                    if (i12 == i11) {
                        rVar4.f19521c = cVarT;
                        rVar4.f19522d = i12 + 1;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            o.n(iVarK, this);
        } while (!z10);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return a().f19521c.k();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11 && i11 <= size()) {
            return new D(this, i10, i11);
        }
        C0880d.T("fromIndex or toIndex are out of bounds");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return l.a(this);
    }

    public final String toString() {
        r rVar = this.f19524a;
        m.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((r) o.i(rVar)).f19521c + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i10;
        Y.c cVar;
        boolean z10;
        i iVarK;
        do {
            Object obj = t.f19525a;
            synchronized (obj) {
                r rVar = this.f19524a;
                m.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) o.i(rVar);
                i10 = rVar2.f19522d;
                cVar = rVar2.f19521c;
            }
            m.c(cVar);
            Y.c cVarP = cVar.p(collection);
            z10 = false;
            if (m.b(cVarP, cVar)) {
                return false;
            }
            r rVar3 = this.f19524a;
            m.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (o.f19510b) {
                iVarK = o.k();
                r rVar4 = (r) o.w(rVar3, this, iVarK);
                synchronized (obj) {
                    int i11 = rVar4.f19522d;
                    if (i11 == i10) {
                        rVar4.f19521c = cVarP;
                        rVar4.f19523e++;
                        rVar4.f19522d = i11 + 1;
                        z10 = true;
                    }
                }
            }
            o.n(iVarK, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new C0399q(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return l.b(this, objArr);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0054 */
    @Override // java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void add(int r8, java.lang.Object r9) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = p048e0.t.f19525a
            monitor-enter(r0)
            e0.r r1 = r7.f19524a     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.m.d(r1, r2)     // Catch: java.lang.Throwable -> L5a
            e0.C r1 = p048e0.o.i(r1)     // Catch: java.lang.Throwable -> L5a
            e0.r r1 = (p048e0.r) r1     // Catch: java.lang.Throwable -> L5a
            int r2 = r1.f19522d     // Catch: java.lang.Throwable -> L5a
            Y.c r1 = r1.f19521c     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r0)
            kotlin.jvm.internal.m.c(r1)
            Y.c r3 = r1.n(r8, r9)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L23
            goto L53
        L23:
            e0.r r1 = r7.f19524a
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.m.d(r1, r4)
            java.lang.Object r4 = p048e0.o.f19510b
            monitor-enter(r4)
            e0.i r5 = p048e0.o.k()     // Catch: java.lang.Throwable -> L54
            e0.C r1 = p048e0.o.w(r1, r7, r5)     // Catch: java.lang.Throwable -> L54
            e0.r r1 = (p048e0.r) r1     // Catch: java.lang.Throwable -> L54
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L54
            int r6 = r1.f19522d     // Catch: java.lang.Throwable -> L49
            if (r6 != r2) goto L4b
            r1.f19521c = r3     // Catch: java.lang.Throwable -> L49
            int r2 = r1.f19523e     // Catch: java.lang.Throwable -> L49
            r3 = 1
            int r2 = r2 + r3
            r1.f19523e = r2     // Catch: java.lang.Throwable -> L49
            int r6 = r6 + 1
            r1.f19522d = r6     // Catch: java.lang.Throwable -> L49
            goto L4c
        L49:
            r8 = move-exception
            goto L56
        L4b:
            r3 = 0
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r4)
            p048e0.o.n(r5, r7)
            if (r3 == 0) goto L0
        L53:
            return
        L54:
            r8 = move-exception
            goto L58
        L56:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            throw r8     // Catch: java.lang.Throwable -> L54
        L58:
            monitor-exit(r4)
            throw r8
        L5a:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p048e0.s.add(int, java.lang.Object):void");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        Y.c cVar;
        boolean z10;
        i iVarK;
        do {
            Object obj2 = t.f19525a;
            synchronized (obj2) {
                r rVar = this.f19524a;
                m.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) o.i(rVar);
                i10 = rVar2.f19522d;
                cVar = rVar2.f19521c;
            }
            m.c(cVar);
            int iIndexOf = cVar.indexOf(obj);
            Y.c cVarS = iIndexOf != -1 ? cVar.s(iIndexOf) : cVar;
            z10 = false;
            if (cVarS.equals(cVar)) {
                return false;
            }
            r rVar3 = this.f19524a;
            m.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (o.f19510b) {
                iVarK = o.k();
                r rVar4 = (r) o.w(rVar3, this, iVarK);
                synchronized (obj2) {
                    int i11 = rVar4.f19522d;
                    if (i11 == i10) {
                        rVar4.f19521c = cVarS;
                        rVar4.f19523e++;
                        rVar4.f19522d = i11 + 1;
                        z10 = true;
                    }
                }
            }
            o.n(iVarK, this);
        } while (!z10);
        return true;
    }
}
