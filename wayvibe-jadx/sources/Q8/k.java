package Q8;

import M8.n;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements d, S8.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10596b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "result");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f10597a;
    private volatile Object result;

    public k(d dVar, R8.a aVar) {
        this.f10597a = dVar;
        this.result = aVar;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        R8.a aVar = R8.a.UNDECIDED;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10596b;
            R8.a aVar2 = R8.a.COROUTINE_SUSPENDED;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return R8.a.COROUTINE_SUSPENDED;
        }
        if (obj == R8.a.RESUMED) {
            return R8.a.COROUTINE_SUSPENDED;
        }
        if (obj instanceof n) {
            throw ((n) obj).f8415a;
        }
        return obj;
    }

    @Override // S8.d
    public final S8.d getCallerFrame() {
        d dVar = this.f10597a;
        if (dVar instanceof S8.d) {
            return (S8.d) dVar;
        }
        return null;
    }

    @Override // Q8.d
    public final i getContext() {
        return this.f10597a.getContext();
    }

    @Override // Q8.d
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            R8.a aVar = R8.a.UNDECIDED;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10596b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    }
                }
                return;
            }
            R8.a aVar2 = R8.a.COROUTINE_SUSPENDED;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10596b;
            R8.a aVar3 = R8.a.RESUMED;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                    this.f10597a.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == aVar2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f10597a;
    }
}
