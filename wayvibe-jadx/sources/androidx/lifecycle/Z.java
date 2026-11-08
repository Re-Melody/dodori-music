package androidx.lifecycle;

import M8.InterfaceC0641c;
import java.io.Closeable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {
    private final p183r2.b impl = new p183r2.b();

    public final void addCloseable(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        kotlin.jvm.internal.m.f(key, "key");
        kotlin.jvm.internal.m.f(closeable, "closeable");
        p183r2.b bVar = this.impl;
        if (bVar != null) {
            if (bVar.f25758d) {
                p183r2.b.b(closeable);
                return;
            }
            synchronized (bVar.f25755a) {
                autoCloseable = (AutoCloseable) bVar.f25756b.put(key, closeable);
            }
            p183r2.b.b(autoCloseable);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        p183r2.b bVar = this.impl;
        if (bVar != null && !bVar.f25758d) {
            bVar.f25758d = true;
            synchronized (bVar.f25755a) {
                try {
                    Iterator it = bVar.f25756b.values().iterator();
                    while (it.hasNext()) {
                        p183r2.b.b((AutoCloseable) it.next());
                    }
                    Iterator it2 = bVar.f25757c.iterator();
                    while (it2.hasNext()) {
                        p183r2.b.b((AutoCloseable) it2.next());
                    }
                    bVar.f25757c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String key) {
        T t10;
        kotlin.jvm.internal.m.f(key, "key");
        p183r2.b bVar = this.impl;
        if (bVar == null) {
            return null;
        }
        synchronized (bVar.f25755a) {
            t10 = (T) bVar.f25756b.get(key);
        }
        return t10;
    }

    public void onCleared() {
    }

    public void addCloseable(AutoCloseable closeable) {
        kotlin.jvm.internal.m.f(closeable, "closeable");
        p183r2.b bVar = this.impl;
        if (bVar != null) {
            bVar.a(closeable);
        }
    }

    @InterfaceC0641c
    public /* synthetic */ void addCloseable(Closeable closeable) {
        kotlin.jvm.internal.m.f(closeable, "closeable");
        p183r2.b bVar = this.impl;
        if (bVar != null) {
            bVar.a(closeable);
        }
    }
}
