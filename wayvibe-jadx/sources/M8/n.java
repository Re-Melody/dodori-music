package M8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f8415a;

    public n(Throwable exception) {
        kotlin.jvm.internal.m.f(exception, "exception");
        this.f8415a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return kotlin.jvm.internal.m.b(this.f8415a, ((n) obj).f8415a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8415a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f8415a + ')';
    }
}
