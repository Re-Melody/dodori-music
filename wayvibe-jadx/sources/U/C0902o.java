package U;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: U.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0902o extends AbstractC0909s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f11894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f11895e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0891i0 f11896f = C0880d.K(c0.e.f15838d, U.f11813d);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0906q f11897g;

    public C0902o(C0906q c0906q, int i10, boolean z10, boolean z11, U u10) {
        this.f11897g = c0906q;
        this.f11891a = i10;
        this.f11892b = z10;
        this.f11893c = z11;
    }

    @Override // U.AbstractC0909s
    public final void a(C0913u c0913u, c0.b bVar) {
        this.f11897g.f11924b.a(c0913u, bVar);
    }

    @Override // U.AbstractC0909s
    public final void b() {
        this.f11897g.f11946z--;
    }

    @Override // U.AbstractC0909s
    public final boolean c() {
        return this.f11897g.f11924b.c();
    }

    @Override // U.AbstractC0909s
    public final boolean d() {
        return this.f11892b;
    }

    @Override // U.AbstractC0909s
    public final boolean e() {
        return this.f11893c;
    }

    @Override // U.AbstractC0909s
    public final InterfaceC0897l0 f() {
        return (InterfaceC0897l0) this.f11896f.getValue();
    }

    @Override // U.AbstractC0909s
    public final int g() {
        return this.f11891a;
    }

    @Override // U.AbstractC0909s
    public final Q8.i h() {
        return this.f11897g.f11924b.h();
    }

    @Override // U.AbstractC0909s
    public final void i(C0913u c0913u) {
        C0906q c0906q = this.f11897g;
        c0906q.f11924b.i(c0906q.f11929g);
        c0906q.f11924b.i(c0913u);
    }

    @Override // U.AbstractC0909s
    public final void j(Set set) {
        HashSet hashSet = this.f11894d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f11894d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // U.AbstractC0909s
    public final void k(C0906q c0906q) {
        this.f11895e.add(c0906q);
    }

    @Override // U.AbstractC0909s
    public final void l(C0913u c0913u) {
        this.f11897g.f11924b.l(c0913u);
    }

    @Override // U.AbstractC0909s
    public final void m() {
        this.f11897g.f11946z++;
    }

    @Override // U.AbstractC0909s
    public final void n(InterfaceC0898m interfaceC0898m) {
        HashSet<Set> hashSet = this.f11894d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                kotlin.jvm.internal.m.d(interfaceC0898m, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(((C0906q) interfaceC0898m).f11925c);
            }
        }
        LinkedHashSet linkedHashSet = this.f11895e;
        kotlin.jvm.internal.B.a(linkedHashSet);
        linkedHashSet.remove(interfaceC0898m);
    }

    @Override // U.AbstractC0909s
    public final void o(C0913u c0913u) {
        this.f11897g.f11924b.o(c0913u);
    }

    public final void p() {
        LinkedHashSet<C0906q> linkedHashSet = this.f11895e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f11894d;
        if (hashSet != null) {
            for (C0906q c0906q : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(c0906q.f11925c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
