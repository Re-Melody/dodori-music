package p270z9;

import D7.W;
import M8.q;
import N8.s;
import Z8.a;
import java.util.List;
import kotlin.jvm.internal.m;
import p240w9.g;
import p240w9.l;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f29944a;

    public p(a aVar) {
        this.f29944a = W.S(aVar);
    }

    @Override // p240w9.g
    public final String a() {
        return b().a();
    }

    public final g b() {
        return (g) this.f29944a.getValue();
    }

    @Override // p240w9.g
    public final boolean c() {
        return false;
    }

    @Override // p240w9.g
    public final int d(String name) {
        m.f(name, "name");
        return b().d(name);
    }

    @Override // p240w9.g
    public final l e() {
        return b().e();
    }

    @Override // p240w9.g
    public final int f() {
        return b().f();
    }

    @Override // p240w9.g
    public final String g(int i10) {
        return b().g(i10);
    }

    @Override // p240w9.g
    public final List getAnnotations() {
        return s.f8650a;
    }

    @Override // p240w9.g
    public final List h(int i10) {
        return b().h(i10);
    }

    @Override // p240w9.g
    public final g i(int i10) {
        return b().i(i10);
    }

    @Override // p240w9.g
    public final boolean isInline() {
        return false;
    }

    @Override // p240w9.g
    public final boolean j(int i10) {
        return b().j(i10);
    }
}
