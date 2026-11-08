package A6;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends I {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient b0 f333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f335f;

    public Y(b0 b0Var, Object[] objArr, int i10) {
        this.f333d = b0Var;
        this.f334e = objArr;
        this.f335f = i10;
    }

    @Override // A6.AbstractC0100z, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f333d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // A6.AbstractC0100z
    public final int h(int i10, Object[] objArr) {
        return f().h(i10, objArr);
    }

    @Override // A6.AbstractC0100z
    public final boolean o() {
        return true;
    }

    @Override // A6.I
    public final E s() {
        return new X(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f335f;
    }

    @Override // A6.I
    /* JADX INFO: renamed from: t */
    public final k0 iterator() {
        return f().listIterator(0);
    }
}
