package p260y9;

import java.util.Iterator;
import kotlin.jvm.internal.m;
import p219u9.a;
import p251x9.c;

/* JADX INFO: renamed from: y9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2365a implements a {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // p219u9.a
    public Object deserialize(c decoder) {
        m.f(decoder, "decoder");
        return e(decoder);
    }

    public final Object e(c decoder) {
        m.f(decoder, "decoder");
        Object objA = a();
        int iB = b(objA);
        p251x9.a aVarA = decoder.a(getDescriptor());
        while (true) {
            int iQ = aVarA.q(getDescriptor());
            if (iQ == -1) {
                aVarA.c(getDescriptor());
                return h(objA);
            }
            f(aVarA, iQ + iB, objA);
        }
    }

    public abstract void f(p251x9.a aVar, int i10, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
