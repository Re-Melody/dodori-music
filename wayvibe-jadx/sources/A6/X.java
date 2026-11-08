package A6;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class X extends E {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y f332c;

    public X(Y y6) {
        this.f332c = y6;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Y y6 = this.f332c;
        p229v9.a.j(i10, y6.f335f);
        int i11 = i10 * 2;
        Object[] objArr = y6.f334e;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // A6.AbstractC0100z
    public final boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f332c.f335f;
    }
}
