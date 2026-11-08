package p199t;

import com.amazon.a.a.o.b.f;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: t.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2228c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26279b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2230e f26281d;

    public C2228c(C2230e c2230e) {
        this.f26281d = c2230e;
        this.f26278a = c2230e.f26268c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f26280c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i10 = this.f26279b;
        C2230e c2230e = this.f26281d;
        return m.b(key, c2230e.g(i10)) && m.b(entry.getValue(), c2230e.j(this.f26279b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f26280c) {
            return this.f26281d.g(this.f26279b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f26280c) {
            return this.f26281d.j(this.f26279b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26279b < this.f26278a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f26280c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i10 = this.f26279b;
        C2230e c2230e = this.f26281d;
        Object objG = c2230e.g(i10);
        Object objJ = c2230e.j(this.f26279b);
        return (objG == null ? 0 : objG.hashCode()) ^ (objJ != null ? objJ.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f26279b++;
        this.f26280c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f26280c) {
            throw new IllegalStateException();
        }
        this.f26281d.h(this.f26279b);
        this.f26279b--;
        this.f26278a--;
        this.f26280c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f26280c) {
            return this.f26281d.i(this.f26279b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + f.f16452b + getValue();
    }
}
