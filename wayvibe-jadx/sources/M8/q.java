package M8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements h, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Z8.a f8420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f8421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8422c;

    public q(Z8.a initializer) {
        kotlin.jvm.internal.m.f(initializer, "initializer");
        this.f8420a = initializer;
        this.f8421b = z.f8435a;
        this.f8422c = this;
    }

    @Override // M8.h
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f8421b;
        z zVar = z.f8435a;
        if (obj != zVar) {
            return obj;
        }
        synchronized (this.f8422c) {
            objInvoke = this.f8421b;
            if (objInvoke == zVar) {
                Z8.a aVar = this.f8420a;
                kotlin.jvm.internal.m.c(aVar);
                objInvoke = aVar.invoke();
                this.f8421b = objInvoke;
                this.f8420a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.f8421b != z.f8435a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
