package p023b7;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p227v7.b;

/* JADX INFO: loaded from: classes.dex */
public final class n implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set f15802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set f15803b;

    @Override // p227v7.b
    public final Object get() {
        if (this.f15803b == null) {
            synchronized (this) {
                try {
                    if (this.f15803b == null) {
                        this.f15803b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            try {
                                Iterator it = this.f15802a.iterator();
                                while (it.hasNext()) {
                                    this.f15803b.add(((b) it.next()).get());
                                }
                                this.f15802a = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.f15803b);
    }
}
