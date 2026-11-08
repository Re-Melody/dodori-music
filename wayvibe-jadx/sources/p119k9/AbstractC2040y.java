package p119k9;

import Q8.a;
import Q8.e;
import Q8.f;
import Q8.g;
import Q8.h;
import Q8.i;
import Q8.j;
import kotlin.jvm.internal.m;
import p021b5.b;

/* JADX INFO: renamed from: k9.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2040y extends a implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2039x f21790b = new C2039x(e.f10594a, new b(8));

    public AbstractC2040y() {
        super(e.f10594a);
    }

    @Override // Q8.a, Q8.i
    public final g get(h key) {
        g gVar;
        m.f(key, "key");
        if (!(key instanceof C2039x)) {
            if (e.f10594a == key) {
                return this;
            }
            return null;
        }
        C2039x c2039x = (C2039x) key;
        h hVar = this.f10590a;
        if ((hVar == c2039x || c2039x.f21789b == hVar) && (gVar = (g) c2039x.f21788a.invoke(this)) != null) {
            return gVar;
        }
        return null;
    }

    public abstract void l(i iVar, Runnable runnable);

    /* JADX WARN: Code duplicated, block: B:15:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0027 A[RETURN] */
    @Override // Q8.a, Q8.i
    public final i minusKey(h key) {
        m.f(key, "key");
        boolean z10 = key instanceof C2039x;
        j jVar = j.f10595a;
        if (!z10) {
            if (e.f10594a == key) {
                return jVar;
            }
            return this;
        }
        C2039x c2039x = (C2039x) key;
        h hVar = this.f10590a;
        if ((hVar == c2039x || c2039x.f21789b == hVar) && ((g) c2039x.f21788a.invoke(this)) != null) {
            return jVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + F.n(this);
    }

    public void v(i iVar, Runnable runnable) {
        l(iVar, runnable);
    }

    public boolean w(i iVar) {
        return !(this instanceof K0);
    }

    public AbstractC2040y x(int i10) {
        p9.a.a(i10);
        return new p9.g(this, i10);
    }
}
