package Q8;

import java.io.Serializable;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f10595a = new j();

    @Override // Q8.i
    public final g get(h key) {
        m.f(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // Q8.i
    public final i minusKey(h key) {
        m.f(key, "key");
        return this;
    }

    @Override // Q8.i
    public final i plus(i context) {
        m.f(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // Q8.i
    public final Object fold(Object obj, Z8.e eVar) {
        return obj;
    }
}
