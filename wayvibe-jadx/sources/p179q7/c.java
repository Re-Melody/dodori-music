package p179q7;

import D7.p1;
import W6.p;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25681a;

    public c(List list) {
        this.f25681a = Collections.unmodifiableList(list);
    }

    @Override // p179q7.p
    public final p1 a(p1 p1Var) {
        return null;
    }

    @Override // p179q7.p
    public final p1 b(p1 p1Var, p1 p1Var2) {
        return d(p1Var);
    }

    @Override // p179q7.p
    public final p1 c(p1 p1Var, p pVar) {
        return d(p1Var);
    }

    public abstract p1 d(p1 p1Var);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f25681a.equals(((c) obj).f25681a);
    }

    public final int hashCode() {
        return this.f25681a.hashCode() + (getClass().hashCode() * 31);
    }
}
