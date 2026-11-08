package p119k9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: k9.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2023k0 extends u0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21747c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2023k0(InterfaceC2019i0 interfaceC2019i0) {
        super(true);
        boolean z10 = true;
        E(interfaceC2019i0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u0.f21778b;
        InterfaceC2033q interfaceC2033q = (InterfaceC2033q) atomicReferenceFieldUpdater.get(this);
        r rVar = interfaceC2033q instanceof r ? (r) interfaceC2033q : null;
        if (rVar == null) {
            z10 = false;
            break;
        }
        u0 u0VarH = rVar.h();
        while (!u0VarH.z()) {
            InterfaceC2033q interfaceC2033q2 = (InterfaceC2033q) atomicReferenceFieldUpdater.get(u0VarH);
            r rVar2 = interfaceC2033q2 instanceof r ? (r) interfaceC2033q2 : null;
            if (rVar2 == null) {
                z10 = false;
                break;
            }
            u0VarH = rVar2.h();
        }
        this.f21747c = z10;
    }

    @Override // p119k9.u0
    public final boolean A() {
        return true;
    }

    @Override // p119k9.u0
    public final boolean z() {
        return this.f21747c;
    }
}
