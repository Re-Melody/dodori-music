package A6;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends I {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient b0 f336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient a0 f337e;

    public Z(b0 b0Var, a0 a0Var) {
        this.f336d = b0Var;
        this.f337e = a0Var;
    }

    @Override // A6.AbstractC0100z, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f336d.get(obj) != null;
    }

    @Override // A6.I, A6.AbstractC0100z
    public final E f() {
        return this.f337e;
    }

    @Override // A6.AbstractC0100z
    public final int h(int i10, Object[] objArr) {
        return this.f337e.h(i10, objArr);
    }

    @Override // A6.AbstractC0100z
    public final boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f336d.f348f;
    }

    @Override // A6.I
    /* JADX INFO: renamed from: t */
    public final k0 iterator() {
        return this.f337e.listIterator(0);
    }
}
