package p023b7;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    default Object a(Class cls) {
        return g(q.a(cls));
    }

    o b(q qVar);

    p227v7.b c(q qVar);

    default p227v7.b d(Class cls) {
        return c(q.a(cls));
    }

    p227v7.b e(q qVar);

    default Set f(q qVar) {
        return (Set) e(qVar).get();
    }

    default Object g(q qVar) {
        p227v7.b bVarC = c(qVar);
        if (bVarC == null) {
            return null;
        }
        return bVarC.get();
    }

    default o h(Class cls) {
        return b(q.a(cls));
    }
}
