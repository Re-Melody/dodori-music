package A6;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends I {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object[] f354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c0 f355j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f360h;

    static {
        Object[] objArr = new Object[0];
        f354i = objArr;
        f355j = new c0(objArr, 0, objArr, 0, 0);
    }

    public c0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f356d = objArr;
        this.f357e = i10;
        this.f358f = objArr2;
        this.f359g = i11;
        this.f360h = i12;
    }

    @Override // A6.AbstractC0100z, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f358f;
            if (objArr.length != 0) {
                int iM = AbstractC0093s.m(obj == null ? 0 : obj.hashCode());
                while (true) {
                    int i10 = iM & this.f359g;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // A6.AbstractC0100z
    public final int h(int i10, Object[] objArr) {
        Object[] objArr2 = this.f356d;
        int i11 = this.f360h;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // A6.I, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f357e;
    }

    @Override // A6.AbstractC0100z
    public final Object[] k() {
        return this.f356d;
    }

    @Override // A6.AbstractC0100z
    public final int m() {
        return this.f360h;
    }

    @Override // A6.AbstractC0100z
    public final int n() {
        return 0;
    }

    @Override // A6.AbstractC0100z
    public final boolean o() {
        return false;
    }

    @Override // A6.I
    public final E s() {
        return E.p(this.f360h, this.f356d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f360h;
    }

    @Override // A6.I
    /* JADX INFO: renamed from: t */
    public final k0 iterator() {
        return f().listIterator(0);
    }
}
