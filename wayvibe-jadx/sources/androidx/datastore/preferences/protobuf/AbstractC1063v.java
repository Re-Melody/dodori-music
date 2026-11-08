package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1063v implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1066y f15157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC1066y f15158b;

    public AbstractC1063v(AbstractC1066y abstractC1066y) {
        this.f15157a = abstractC1066y;
        if (abstractC1066y.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f15158b = abstractC1066y.i();
    }

    public final AbstractC1066y a() {
        AbstractC1066y abstractC1066yB = b();
        abstractC1066yB.getClass();
        if (AbstractC1066y.f(abstractC1066yB, true)) {
            return abstractC1066yB;
        }
        throw new i0();
    }

    public final AbstractC1066y b() {
        if (!this.f15158b.g()) {
            return this.f15158b;
        }
        AbstractC1066y abstractC1066y = this.f15158b;
        abstractC1066y.getClass();
        Z z10 = Z.f15060c;
        z10.getClass();
        z10.a(abstractC1066y.getClass()).b(abstractC1066y);
        abstractC1066y.h();
        return this.f15158b;
    }

    public final void c() {
        if (this.f15158b.g()) {
            return;
        }
        AbstractC1066y abstractC1066yI = this.f15157a.i();
        AbstractC1066y abstractC1066y = this.f15158b;
        Z z10 = Z.f15060c;
        z10.getClass();
        z10.a(abstractC1066yI.getClass()).a(abstractC1066yI, abstractC1066y);
        this.f15158b = abstractC1066yI;
    }

    public final Object clone() {
        AbstractC1063v abstractC1063v = (AbstractC1063v) this.f15157a.c(EnumC1065x.NEW_BUILDER);
        abstractC1063v.f15158b = b();
        return abstractC1063v;
    }
}
