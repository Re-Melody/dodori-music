package A6;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends I {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f379d;

    public i0(Object obj) {
        obj.getClass();
        this.f379d = obj;
    }

    @Override // A6.AbstractC0100z, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f379d.equals(obj);
    }

    @Override // A6.I, A6.AbstractC0100z
    public final E f() {
        return E.x(this.f379d);
    }

    @Override // A6.AbstractC0100z
    public final int h(int i10, Object[] objArr) {
        objArr[i10] = this.f379d;
        return i10 + 1;
    }

    @Override // A6.I, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f379d.hashCode();
    }

    @Override // A6.AbstractC0100z
    public final boolean o() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // A6.I
    /* JADX INFO: renamed from: t */
    public final k0 iterator() {
        L l10 = new L();
        l10.f315a = this.f379d;
        return l10;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f379d.toString() + ']';
    }
}
