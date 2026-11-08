package p023b7;

import B8.V;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p106j7.b;

/* JADX INFO: loaded from: classes.dex */
public final class r implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f15810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f15811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f15812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f15813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f15814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f15815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f15816g;

    public r(a aVar, b bVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (i iVar : aVar.f15773c) {
            int i10 = iVar.f15795c;
            boolean z10 = i10 == 0;
            int i11 = iVar.f15794b;
            q qVar = iVar.f15793a;
            if (z10) {
                if (i11 == 2) {
                    hashSet4.add(qVar);
                } else {
                    hashSet.add(qVar);
                }
            } else if (i10 == 2) {
                hashSet3.add(qVar);
            } else if (i11 == 2) {
                hashSet5.add(qVar);
            } else {
                hashSet2.add(qVar);
            }
        }
        Set set = aVar.f15776f;
        if (!set.isEmpty()) {
            hashSet.add(q.a(b.class));
        }
        this.f15810a = Collections.unmodifiableSet(hashSet);
        this.f15811b = Collections.unmodifiableSet(hashSet2);
        this.f15812c = Collections.unmodifiableSet(hashSet3);
        this.f15813d = Collections.unmodifiableSet(hashSet4);
        this.f15814e = Collections.unmodifiableSet(hashSet5);
        this.f15815f = set;
        this.f15816g = bVar;
    }

    @Override // p023b7.b
    public final Object a(Class cls) {
        if (this.f15810a.contains(q.a(cls))) {
            Object objA = this.f15816g.a(cls);
            return !cls.equals(b.class) ? objA : new k(this.f15815f, (b) objA);
        }
        throw new V("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // p023b7.b
    public final o b(q qVar) {
        if (this.f15812c.contains(qVar)) {
            return this.f15816g.b(qVar);
        }
        throw new V("Attempting to request an undeclared dependency Deferred<" + qVar + ">.");
    }

    @Override // p023b7.b
    public final p227v7.b c(q qVar) {
        if (this.f15811b.contains(qVar)) {
            return this.f15816g.c(qVar);
        }
        throw new V("Attempting to request an undeclared dependency Provider<" + qVar + ">.");
    }

    @Override // p023b7.b
    public final p227v7.b d(Class cls) {
        return c(q.a(cls));
    }

    @Override // p023b7.b
    public final p227v7.b e(q qVar) {
        if (this.f15814e.contains(qVar)) {
            return this.f15816g.e(qVar);
        }
        throw new V("Attempting to request an undeclared dependency Provider<Set<" + qVar + ">>.");
    }

    @Override // p023b7.b
    public final Set f(q qVar) {
        if (this.f15813d.contains(qVar)) {
            return this.f15816g.f(qVar);
        }
        throw new V("Attempting to request an undeclared dependency Set<" + qVar + ">.");
    }

    @Override // p023b7.b
    public final Object g(q qVar) {
        if (this.f15810a.contains(qVar)) {
            return this.f15816g.g(qVar);
        }
        throw new V("Attempting to request an undeclared dependency " + qVar + ".");
    }

    @Override // p023b7.b
    public final o h(Class cls) {
        return b(q.a(cls));
    }
}
