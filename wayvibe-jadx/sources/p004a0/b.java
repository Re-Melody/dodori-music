package p004a0;

import N8.i;
import X.e;
import Z.c;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f14073d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f14076c;

    static {
        p016b0.b bVar = p016b0.b.f15714a;
        f14073d = new b(bVar, bVar, c.f13414c);
    }

    public b(Object obj, Object obj2, c cVar) {
        this.f14074a = obj;
        this.f14075b = obj2;
        this.f14076c = cVar;
    }

    @Override // N8.AbstractC0644a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f14076c.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new c(this.f14074a, this.f14076c);
    }

    @Override // N8.AbstractC0644a
    public final int k() {
        c cVar = this.f14076c;
        cVar.getClass();
        return cVar.f13416b;
    }
}
