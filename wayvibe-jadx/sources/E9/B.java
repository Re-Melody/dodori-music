package E9;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class B extends N8.e implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0351l[] f3332a;

    public B(C0351l[] c0351lArr, int[] iArr) {
        this.f3332a = c0351lArr;
    }

    @Override // N8.AbstractC0644a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0351l) {
            return super.contains((C0351l) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f3332a[i10];
    }

    @Override // N8.e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0351l) {
            return super.indexOf((C0351l) obj);
        }
        return -1;
    }

    @Override // N8.AbstractC0644a
    public final int k() {
        return this.f3332a.length;
    }

    @Override // N8.e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0351l) {
            return super.lastIndexOf((C0351l) obj);
        }
        return -1;
    }
}
