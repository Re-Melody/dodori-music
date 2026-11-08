package A6;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class L extends k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f314b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f315a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f315a != f314b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f315a;
        Object obj2 = f314b;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.f315a = obj2;
        return obj;
    }
}
