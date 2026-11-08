package O6;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class C implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f9245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f9246b;

    public C(List list, List list2) {
        this.f9245a = list;
        this.f9246b = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new D(this.f9245a.iterator(), this.f9246b.iterator());
    }
}
