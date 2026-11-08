package p183r2;

import Q8.i;
import kotlin.jvm.internal.m;
import p119k9.C;
import p119k9.C2041z;
import p119k9.InterfaceC2019i0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements AutoCloseable, C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f25754a;

    public a(i coroutineContext) {
        m.f(coroutineContext, "coroutineContext");
        this.f25754a = coroutineContext;
    }

    @Override // p119k9.C
    public final i c() {
        return this.f25754a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        InterfaceC2019i0 interfaceC2019i0 = (InterfaceC2019i0) this.f25754a.get(C2041z.f21793b);
        if (interfaceC2019i0 != null) {
            interfaceC2019i0.cancel(null);
        }
    }
}
