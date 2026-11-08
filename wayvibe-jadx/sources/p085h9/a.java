package p085h9;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f20340a;

    public a(h hVar) {
        this.f20340a = new AtomicReference(hVar);
    }

    @Override // p085h9.h
    public final Iterator iterator() {
        h hVar = (h) this.f20340a.getAndSet(null);
        if (hVar != null) {
            return hVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
