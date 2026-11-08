package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n implements h, Serializable {
    private final int arity;

    public n(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        z.f21874a.getClass();
        String strA = A.a(this);
        m.e(strA, "renderLambdaToString(...)");
        return strA;
    }
}
