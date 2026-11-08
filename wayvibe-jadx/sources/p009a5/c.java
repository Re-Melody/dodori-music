package p009a5;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class c extends WeakReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14136a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Object instance) {
        this(instance, null);
        m.f(instance, "instance");
    }

    public final boolean equals(Object obj) {
        T t10 = get();
        if (t10 != 0) {
            return (obj instanceof c) && ((c) obj).get() == t10;
        }
        return obj == this;
    }

    public final int hashCode() {
        return this.f14136a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Object instance, ReferenceQueue referenceQueue) {
        super(instance, referenceQueue);
        m.f(instance, "instance");
        this.f14136a = System.identityHashCode(instance);
    }
}
