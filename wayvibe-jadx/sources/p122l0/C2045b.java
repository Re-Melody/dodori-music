package p122l0;

import Z8.c;
import kotlin.jvm.internal.m;
import p067g0.q;

/* JADX INFO: renamed from: l0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2045b extends q implements InterfaceC2047d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f21883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f21884b;

    @Override // p122l0.InterfaceC2047d
    public final void n(w wVar) {
        if (m.b(this.f21884b, wVar)) {
            return;
        }
        this.f21884b = wVar;
        this.f21883a.invoke(wVar);
    }
}
