package p119k9;

import A9.A;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: k9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2006c extends AbstractC2025l0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21719h = AtomicReferenceFieldUpdater.newUpdater(C2006c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2028n f21720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Q f21721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2010e f21722g;

    public C2006c(C2010e c2010e, C2028n c2028n) {
        this.f21722g = c2010e;
        this.f21720e = c2028n;
    }

    @Override // p119k9.AbstractC2025l0
    public final boolean i() {
        return false;
    }

    @Override // p119k9.AbstractC2025l0
    public final void j(Throwable th) {
        C2028n c2028n = this.f21720e;
        if (th != null) {
            c2028n.getClass();
            A aD = c2028n.D(new C2038w(false, th), null);
            if (aD != null) {
                c2028n.n(aD);
                C2008d c2008d = (C2008d) f21719h.get(this);
                if (c2008d != null) {
                    c2008d.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C2010e.f21726b;
        C2010e c2010e = this.f21722g;
        if (atomicIntegerFieldUpdater.decrementAndGet(c2010e) == 0) {
            I[] iArr = c2010e.f21727a;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (I i10 : iArr) {
                arrayList.add(i10.getCompleted());
            }
            c2028n.resumeWith(arrayList);
        }
    }
}
