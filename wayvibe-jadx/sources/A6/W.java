package A6;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class W extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final W f329e = new W(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f331d;

    public W(Object[] objArr, int i10) {
        this.f330c = objArr;
        this.f331d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        p229v9.a.j(i10, this.f331d);
        Object obj = this.f330c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // A6.E, A6.AbstractC0100z
    public final int h(int i10, Object[] objArr) {
        Object[] objArr2 = this.f330c;
        int i11 = this.f331d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // A6.AbstractC0100z
    public final Object[] k() {
        return this.f330c;
    }

    @Override // A6.AbstractC0100z
    public final int m() {
        return this.f331d;
    }

    @Override // A6.AbstractC0100z
    public final int n() {
        return 0;
    }

    @Override // A6.AbstractC0100z
    public final boolean o() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f331d;
    }
}
