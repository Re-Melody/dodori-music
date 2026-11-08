package p119k9;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: k9.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2021j0 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient InterfaceC2019i0 f21746a;

    public C2021j0(String str, Throwable th, InterfaceC2019i0 interfaceC2019i0) {
        super(str);
        this.f21746a = interfaceC2019i0;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2021j0)) {
            return false;
        }
        C2021j0 c2021j0 = (C2021j0) obj;
        return m.b(c2021j0.getMessage(), getMessage()) && m.b(c2021j0.f21746a, this.f21746a) && m.b(c2021j0.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        m.c(message);
        int iHashCode = (this.f21746a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f21746a;
    }
}
