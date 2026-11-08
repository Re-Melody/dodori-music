package p119k9;

import Q8.i;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: k9.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2016h extends AbstractC2002a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Thread f21739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Z f21740e;

    public C2016h(i iVar, Thread thread, Z z10) {
        super(iVar, true);
        this.f21739d = thread;
        this.f21740e = z10;
    }

    @Override // p119k9.u0
    public final void j(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f21739d;
        if (m.b(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
