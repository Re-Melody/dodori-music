package p119k9;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class P implements Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f21699a;

    public P(ScheduledFuture scheduledFuture) {
        this.f21699a = scheduledFuture;
    }

    @Override // p119k9.Q
    public final void dispose() {
        this.f21699a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f21699a + ']';
    }
}
