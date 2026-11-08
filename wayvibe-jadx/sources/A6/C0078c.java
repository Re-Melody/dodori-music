package A6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: A6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0078c implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f350b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f351c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f352d = K.INSTANCE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S f353e;

    public C0078c(S s8) {
        this.f353e = s8;
        this.f349a = s8.f323d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f349a.hasNext() || this.f352d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f352d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f349a.next();
            this.f350b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f351c = collection;
            this.f352d = collection.iterator();
        }
        return this.f352d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f352d.remove();
        Collection collection = this.f351c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f349a.remove();
        }
        this.f353e.f324e--;
    }
}
