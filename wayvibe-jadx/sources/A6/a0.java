package A6;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends E {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f341e;

    public a0(Object[] objArr, int i10, int i11) {
        this.f339c = objArr;
        this.f340d = i10;
        this.f341e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        p229v9.a.j(i10, this.f341e);
        Object obj = this.f339c[(i10 * 2) + this.f340d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // A6.AbstractC0100z
    public final boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f341e;
    }
}
