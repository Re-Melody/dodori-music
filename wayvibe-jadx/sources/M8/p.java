package M8;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements h, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8417c = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Z8.a f8418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f8419b;

    @Override // M8.h
    public final Object getValue() {
        Object obj = this.f8419b;
        z zVar = z.f8435a;
        if (obj != zVar) {
            return obj;
        }
        Z8.a aVar = this.f8418a;
        if (aVar != null) {
            Object objInvoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8417c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, zVar, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != zVar) {
                }
            }
            this.f8418a = null;
            return objInvoke;
        }
        return this.f8419b;
    }

    public final String toString() {
        return this.f8419b != z.f8435a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
