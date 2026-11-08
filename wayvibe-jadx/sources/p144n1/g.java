package p144n1;

import java.util.ArrayList;
import java.util.Collections;
import p089i1.q;
import p154o1.e;
import p174q1.m;

/* JADX INFO: loaded from: classes.dex */
public class g extends b implements e {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final q f22886k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final l f22887l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final ArrayList f22888m0;

    public g(q qVar, l lVar) {
        super(qVar);
        this.f22888m0 = new ArrayList();
        this.f22886k0 = qVar;
        this.f22887l0 = lVar;
    }

    @Override // p144n1.b, p144n1.h
    public final p174q1.g b() {
        return s();
    }

    public final void q(Object... objArr) {
        Collections.addAll(this.f22888m0, objArr);
    }

    public final void r() {
        super.apply();
    }

    public m s() {
        return null;
    }

    @Override // p144n1.b, p144n1.h
    public void apply() {
    }
}
