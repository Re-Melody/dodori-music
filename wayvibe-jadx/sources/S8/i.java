package S8;

import kotlin.jvm.internal.A;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i extends c implements kotlin.jvm.internal.h {
    private final int arity;

    public i(int i10, Q8.d dVar) {
        super(dVar);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    @Override // S8.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        z.f21874a.getClass();
        String strA = A.a(this);
        m.e(strA, "renderLambdaToString(...)");
        return strA;
    }
}
