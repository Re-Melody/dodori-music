package p048e0;

import X.d;
import Z.c;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import p013a9.e;

/* JADX INFO: loaded from: classes.dex */
public final class v implements A, Map, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f19529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f19530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f19531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f19532d;

    public v() {
        c cVar = c.f13414c;
        u uVar = new u(cVar);
        if (o.f19509a.get() != null) {
            u uVar2 = new u(cVar);
            uVar2.f19453a = 1;
            uVar.f19454b = uVar2;
        }
        this.f19529a = uVar;
        this.f19530b = new p(this, 0);
        this.f19531c = new p(this, 1);
        this.f19532d = new p(this, 2);
    }

    public final u a() {
        u uVar = this.f19529a;
        m.d(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (u) o.t(uVar, this);
    }

    @Override // java.util.Map
    public final void clear() {
        i iVarK;
        u uVar = this.f19529a;
        m.d(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        u uVar2 = (u) o.i(uVar);
        c cVar = c.f13414c;
        if (cVar != uVar2.f19527c) {
            u uVar3 = this.f19529a;
            m.d(uVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (o.f19510b) {
                iVarK = o.k();
                u uVar4 = (u) o.w(uVar3, this, iVarK);
                synchronized (t.f19526b) {
                    uVar4.f19527c = cVar;
                    uVar4.f19528d++;
                }
            }
            o.n(iVarK, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return a().f19527c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return a().f19527c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f19530b;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return a().f19527c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return a().f19527c.isEmpty();
    }

    @Override // p048e0.A
    public final C k() {
        return this.f19529a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f19531c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        d dVar;
        int i10;
        Object objPut;
        i iVarK;
        boolean z10;
        do {
            Object obj3 = t.f19526b;
            synchronized (obj3) {
                u uVar = this.f19529a;
                m.d(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                u uVar2 = (u) o.i(uVar);
                dVar = uVar2.f19527c;
                i10 = uVar2.f19528d;
            }
            m.c(dVar);
            Z.e eVar = (Z.e) dVar.m();
            objPut = eVar.put(obj, obj2);
            d dVarBuild = eVar.build();
            if (m.b(dVarBuild, dVar)) {
                break;
            }
            u uVar3 = this.f19529a;
            m.d(uVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (o.f19510b) {
                iVarK = o.k();
                u uVar4 = (u) o.w(uVar3, this, iVarK);
                synchronized (obj3) {
                    int i11 = uVar4.f19528d;
                    if (i11 == i10) {
                        uVar4.f19527c = dVarBuild;
                        uVar4.f19528d = i11 + 1;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            o.n(iVarK, this);
        } while (!z10);
        return objPut;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0057 */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void putAll(java.util.Map r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = p048e0.t.f19526b
            monitor-enter(r0)
            e0.u r1 = r7.f19529a     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"
            kotlin.jvm.internal.m.d(r1, r2)     // Catch: java.lang.Throwable -> L5e
            e0.C r1 = p048e0.o.i(r1)     // Catch: java.lang.Throwable -> L5e
            e0.u r1 = (p048e0.u) r1     // Catch: java.lang.Throwable -> L5e
            X.d r2 = r1.f19527c     // Catch: java.lang.Throwable -> L5e
            int r1 = r1.f19528d     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r0)
            kotlin.jvm.internal.m.c(r2)
            X.c r3 = r2.m()
            Z.e r3 = (Z.e) r3
            r3.putAll(r8)
            X.d r3 = r3.build()
            boolean r2 = kotlin.jvm.internal.m.b(r3, r2)
            if (r2 != 0) goto L5d
            e0.u r2 = r7.f19529a
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"
            kotlin.jvm.internal.m.d(r2, r4)
            java.lang.Object r4 = p048e0.o.f19510b
            monitor-enter(r4)
            e0.i r5 = p048e0.o.k()     // Catch: java.lang.Throwable -> L57
            e0.C r2 = p048e0.o.w(r2, r7, r5)     // Catch: java.lang.Throwable -> L57
            e0.u r2 = (p048e0.u) r2     // Catch: java.lang.Throwable -> L57
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L57
            int r6 = r2.f19528d     // Catch: java.lang.Throwable -> L4c
            if (r6 != r1) goto L4e
            r2.f19527c = r3     // Catch: java.lang.Throwable -> L4c
            int r6 = r6 + 1
            r2.f19528d = r6     // Catch: java.lang.Throwable -> L4c
            r1 = 1
            goto L4f
        L4c:
            r8 = move-exception
            goto L59
        L4e:
            r1 = 0
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r4)
            p048e0.o.n(r5, r7)
            if (r1 == 0) goto L0
            goto L5d
        L57:
            r8 = move-exception
            goto L5b
        L59:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            throw r8     // Catch: java.lang.Throwable -> L57
        L5b:
            monitor-exit(r4)
            throw r8
        L5d:
            return
        L5e:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p048e0.v.putAll(java.util.Map):void");
    }

    @Override // p048e0.A
    public final void q(C c3) {
        m.d(c3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f19529a = (u) c3;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        d dVar;
        int i10;
        Object objRemove;
        i iVarK;
        boolean z10;
        do {
            Object obj2 = t.f19526b;
            synchronized (obj2) {
                u uVar = this.f19529a;
                m.d(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                u uVar2 = (u) o.i(uVar);
                dVar = uVar2.f19527c;
                i10 = uVar2.f19528d;
            }
            m.c(dVar);
            X.c cVarM = dVar.m();
            objRemove = cVarM.remove(obj);
            d dVarBuild = cVarM.build();
            if (m.b(dVarBuild, dVar)) {
                break;
            }
            u uVar3 = this.f19529a;
            m.d(uVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (o.f19510b) {
                iVarK = o.k();
                u uVar4 = (u) o.w(uVar3, this, iVarK);
                synchronized (obj2) {
                    int i11 = uVar4.f19528d;
                    if (i11 == i10) {
                        uVar4.f19527c = dVarBuild;
                        uVar4.f19528d = i11 + 1;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            o.n(iVarK, this);
        } while (!z10);
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return a().f19527c.size();
    }

    public final String toString() {
        u uVar = this.f19529a;
        m.d(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((u) o.i(uVar)).f19527c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f19532d;
    }
}
