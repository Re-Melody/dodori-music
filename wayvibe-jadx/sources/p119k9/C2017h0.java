package p119k9;

import Z8.c;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: k9.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2017h0 extends AbstractC2025l0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21741f = AtomicIntegerFieldUpdater.newUpdater(C2017h0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f21742e;

    public C2017h0(c cVar) {
        this.f21742e = cVar;
    }

    @Override // p119k9.AbstractC2025l0
    public final boolean i() {
        return true;
    }

    @Override // p119k9.AbstractC2025l0
    public final void j(Throwable th) {
        if (f21741f.compareAndSet(this, 0, 1)) {
            this.f21742e.invoke(th);
        }
    }
}
