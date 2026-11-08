package t9;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p9.q;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f27003e;

    public l(long j10, l lVar, int i10) {
        super(j10, lVar, i10);
        this.f27003e = new AtomicReferenceArray(k.f27002f);
    }

    @Override // p9.q
    public final int g() {
        return k.f27002f;
    }

    @Override // p9.q
    public final void h(int i10, Q8.i iVar) {
        this.f27003e.set(i10, k.f27001e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f25339c + ", hashCode=" + hashCode() + ']';
    }
}
