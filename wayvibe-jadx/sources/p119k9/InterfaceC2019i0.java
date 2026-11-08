package p119k9;

import Q8.d;
import Q8.g;
import Z8.c;
import java.util.concurrent.CancellationException;
import p085h9.h;

/* JADX INFO: renamed from: k9.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2019i0 extends g {
    InterfaceC2033q attachChild(InterfaceC2034s interfaceC2034s);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    h getChildren();

    Q invokeOnCompletion(c cVar);

    Q invokeOnCompletion(boolean z10, boolean z11, c cVar);

    boolean isActive();

    Object join(d dVar);

    boolean start();
}
