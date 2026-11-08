package p119k9;

import Q8.a;
import Z8.c;
import java.util.concurrent.CancellationException;
import p085h9.d;
import p085h9.h;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends a implements InterfaceC2019i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y0 f21791b = new y0(C2041z.f21793b);

    @Override // p119k9.InterfaceC2019i0
    public final InterfaceC2033q attachChild(InterfaceC2034s interfaceC2034s) {
        return z0.f21794a;
    }

    @Override // p119k9.InterfaceC2019i0
    public final CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // p119k9.InterfaceC2019i0
    public final h getChildren() {
        return d.f20344a;
    }

    @Override // p119k9.InterfaceC2019i0
    public final Q invokeOnCompletion(c cVar) {
        return z0.f21794a;
    }

    @Override // p119k9.InterfaceC2019i0
    public final boolean isActive() {
        return true;
    }

    @Override // p119k9.InterfaceC2019i0
    public final Object join(Q8.d dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // p119k9.InterfaceC2019i0
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // p119k9.InterfaceC2019i0
    public final Q invokeOnCompletion(boolean z10, boolean z11, c cVar) {
        return z0.f21794a;
    }

    @Override // p119k9.InterfaceC2019i0
    public final void cancel(CancellationException cancellationException) {
    }
}
