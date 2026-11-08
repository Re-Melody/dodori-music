package p119k9;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: k9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2030o extends C2038w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21761c = AtomicIntegerFieldUpdater.newUpdater(C2030o.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C2030o(C2028n c2028n, Throwable th, boolean z10) {
        if (th == null) {
            th = new CancellationException("Continuation " + c2028n + " was cancelled normally");
        }
        super(z10, th);
        this._resumed$volatile = 0;
    }
}
