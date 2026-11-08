package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1121p {
    private AtomicReference<Object> internalScopeRef = new AtomicReference<>(null);

    public abstract void addObserver(InterfaceC1124t interfaceC1124t);

    public abstract EnumC1120o getCurrentState();

    public p151n9.S getCurrentStateFlow() {
        p151n9.U uB = p151n9.J.b(getCurrentState());
        addObserver(new M3.c(uB, 1));
        return new p151n9.E(uB);
    }

    public final AtomicReference<Object> getInternalScopeRef() {
        return this.internalScopeRef;
    }

    public abstract void removeObserver(InterfaceC1124t interfaceC1124t);

    public final void setInternalScopeRef(AtomicReference<Object> atomicReference) {
        kotlin.jvm.internal.m.f(atomicReference, "<set-?>");
        this.internalScopeRef = atomicReference;
    }
}
