package M8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class E implements h, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Z8.a f8403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8404b;

    @Override // M8.h
    public final Object getValue() {
        if (this.f8404b == z.f8435a) {
            Z8.a aVar = this.f8403a;
            kotlin.jvm.internal.m.c(aVar);
            this.f8404b = aVar.invoke();
            this.f8403a = null;
        }
        return this.f8404b;
    }

    public final String toString() {
        return this.f8404b != z.f8435a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
