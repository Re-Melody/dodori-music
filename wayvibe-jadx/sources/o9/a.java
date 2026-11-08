package o9;

import java.util.concurrent.CancellationException;
import p151n9.InterfaceC2106h;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient InterfaceC2106h f23842a;

    public a(InterfaceC2106h interfaceC2106h) {
        super("Flow was aborted, no more elements needed");
        this.f23842a = interfaceC2106h;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
