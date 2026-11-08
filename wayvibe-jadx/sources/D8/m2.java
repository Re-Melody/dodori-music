package D8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class m2 extends r2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicIntegerFieldUpdater f2708c;

    public m2(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f2708c = atomicIntegerFieldUpdater;
    }

    @Override // D8.r2
    public final boolean r(o2 o2Var) {
        return this.f2708c.compareAndSet(o2Var, 0, -1);
    }

    @Override // D8.r2
    public final void s(o2 o2Var) {
        this.f2708c.set(o2Var, 0);
    }
}
