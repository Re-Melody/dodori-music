package p9;

import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p119k9.A0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q extends b implements A0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f25338d = AtomicIntegerFieldUpdater.newUpdater(q.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25339c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public q(long j10, q qVar, int i10) {
        super(qVar);
        this.f25339c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // p9.b
    public final boolean d() {
        return f25338d.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return f25338d.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i10, Q8.i iVar);

    public final void i() {
        if (f25338d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f25338d;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ETagPayloadStore.CHUNK_CHARS + i10));
        return true;
    }
}
