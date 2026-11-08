package p119k9;

import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: k9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2008d implements InterfaceC2022k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2006c[] f21724a;

    public C2008d(C2006c[] c2006cArr) {
        this.f21724a = c2006cArr;
    }

    @Override // p119k9.InterfaceC2022k
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (C2006c c2006c : this.f21724a) {
            Q q5 = c2006c.f21721f;
            if (q5 == null) {
                m.l("handle");
                throw null;
            }
            q5.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f21724a + ']';
    }
}
