package D8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f2488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Collection f2489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e2 f2491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2493h;

    public b2(List list, Collection collection, Collection collection2, e2 e2Var, boolean z10, boolean z11, boolean z12, int i10) {
        this.f2487b = list;
        p229v9.a.k(collection, "drainedSubstreams");
        this.f2488c = collection;
        this.f2491f = e2Var;
        this.f2489d = collection2;
        this.f2492g = z10;
        this.f2486a = z11;
        this.f2493h = z12;
        this.f2490e = i10;
        p229v9.a.o("passThrough should imply buffer is null", !z11 || list == null);
        p229v9.a.o("passThrough should imply winningSubstream != null", (z11 && e2Var == null) ? false : true);
        p229v9.a.o("passThrough should imply winningSubstream is drained", !z11 || (collection.size() == 1 && collection.contains(e2Var)) || (collection.size() == 0 && e2Var.f2592b));
        p229v9.a.o("cancelled should imply committed", (z10 && e2Var == null) ? false : true);
    }

    public final b2 a(e2 e2Var) {
        Collection collectionUnmodifiableCollection;
        p229v9.a.o("hedging frozen", !this.f2493h);
        p229v9.a.o("already committed", this.f2491f == null);
        Collection collection = this.f2489d;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(e2Var);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(e2Var);
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new b2(this.f2487b, this.f2488c, collectionUnmodifiableCollection, this.f2491f, this.f2492g, this.f2486a, this.f2493h, this.f2490e + 1);
    }

    public final b2 b(e2 e2Var) {
        ArrayList arrayList = new ArrayList(this.f2489d);
        arrayList.remove(e2Var);
        return new b2(this.f2487b, this.f2488c, Collections.unmodifiableCollection(arrayList), this.f2491f, this.f2492g, this.f2486a, this.f2493h, this.f2490e);
    }

    public final b2 c(e2 e2Var, e2 e2Var2) {
        ArrayList arrayList = new ArrayList(this.f2489d);
        arrayList.remove(e2Var);
        arrayList.add(e2Var2);
        return new b2(this.f2487b, this.f2488c, Collections.unmodifiableCollection(arrayList), this.f2491f, this.f2492g, this.f2486a, this.f2493h, this.f2490e);
    }

    public final b2 d(e2 e2Var) {
        e2Var.f2592b = true;
        Collection collection = this.f2488c;
        if (!collection.contains(e2Var)) {
            return this;
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.remove(e2Var);
        return new b2(this.f2487b, Collections.unmodifiableCollection(arrayList), this.f2489d, this.f2491f, this.f2492g, this.f2486a, this.f2493h, this.f2490e);
    }

    public final b2 e(e2 e2Var) {
        List list;
        p229v9.a.o("Already passThrough", !this.f2486a);
        boolean z10 = e2Var.f2592b;
        Collection collectionUnmodifiableCollection = this.f2488c;
        if (!z10) {
            if (collectionUnmodifiableCollection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(e2Var);
            } else {
                ArrayList arrayList = new ArrayList(collectionUnmodifiableCollection);
                arrayList.add(e2Var);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection = collectionUnmodifiableCollection;
        e2 e2Var2 = this.f2491f;
        boolean z11 = e2Var2 != null;
        if (z11) {
            p229v9.a.o("Another RPC attempt has already committed", e2Var2 == e2Var);
            list = null;
        } else {
            list = this.f2487b;
        }
        return new b2(list, collection, this.f2489d, this.f2491f, this.f2492g, z11, this.f2493h, this.f2490e);
    }
}
