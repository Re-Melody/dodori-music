package D0;

import F0.InterfaceC0405x;

/* JADX INFO: loaded from: classes.dex */
public final class T extends p067g0.q implements InterfaceC0405x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Z8.c f1758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1759b;

    @Override // p067g0.q
    public final boolean getShouldAutoInvalidate() {
        return true;
    }

    @Override // F0.InterfaceC0405x
    public final void h(long j10) {
        if (p028c1.j.a(this.f1759b, j10)) {
            return;
        }
        this.f1758a.invoke(new p028c1.j(j10));
        this.f1759b = j10;
    }
}
