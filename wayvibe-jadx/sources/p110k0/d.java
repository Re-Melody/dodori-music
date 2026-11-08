package p110k0;

import Z8.c;
import kotlin.jvm.internal.n;
import p028c1.b;

/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f21549a = i.f21554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f21550b;

    @Override // p028c1.b
    public final float K() {
        return this.f21549a.a().K();
    }

    @Override // p028c1.b
    public final float a() {
        return this.f21549a.a().a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g b(c cVar) {
        g gVar = new g();
        gVar.f21552a = (n) cVar;
        this.f21550b = gVar;
        return gVar;
    }
}
