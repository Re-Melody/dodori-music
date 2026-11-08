package p099j0;

import C.C0140a0;
import D7.W;
import F0.A0;
import F0.AbstractC0388f;
import F0.InterfaceC0394l;
import android.view.DragEvent;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;
import p012a8.b;
import p025b9.a;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
public final class e extends q implements A0, InterfaceC0394l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f21387a;

    @Override // F0.A0
    public final Object g() {
        return c.f21384a;
    }

    public final boolean o0(b bVar) {
        e eVar = this.f21387a;
        if (eVar == null) {
            return false;
        }
        return eVar.o0(bVar);
    }

    @Override // p067g0.q
    public final void onDetach() {
        this.f21387a = null;
    }

    public final void p0(b bVar) {
        e eVar = this.f21387a;
        if (eVar != null) {
            eVar.p0(bVar);
        }
    }

    public final void q0(b bVar) {
        e eVar = this.f21387a;
        if (eVar != null) {
            eVar.q0(bVar);
        }
        this.f21387a = null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public final void r0(b bVar) {
        A0 a10;
        e eVar;
        e eVar2 = this.f21387a;
        if (eVar2 != null) {
            DragEvent dragEvent = (DragEvent) bVar.f14302b;
            if (a.k(eVar2, W.c(dragEvent.getX(), dragEvent.getY()))) {
                eVar = eVar2;
            } else {
                if (getNode().isAttached()) {
                    y yVar = new y();
                    AbstractC0388f.v(this, new C0140a0(yVar, this, bVar, 13));
                    a10 = (A0) yVar.f21873a;
                } else {
                    a10 = null;
                }
                eVar = (e) a10;
            }
        } else {
            if (getNode().isAttached()) {
                a10 = null;
            } else {
                y yVar2 = new y();
                AbstractC0388f.v(this, new C0140a0(yVar2, this, bVar, 13));
                a10 = (A0) yVar2.f21873a;
            }
            eVar = (e) a10;
        }
        if (eVar != null && eVar2 == null) {
            eVar.p0(bVar);
            eVar.r0(bVar);
        } else if (eVar == null && eVar2 != null) {
            eVar2.q0(bVar);
        } else if (!m.b(eVar, eVar2)) {
            if (eVar != null) {
                eVar.p0(bVar);
                eVar.r0(bVar);
            }
            if (eVar2 != null) {
                eVar2.q0(bVar);
            }
        } else if (eVar != null) {
            eVar.r0(bVar);
        }
        this.f21387a = eVar;
    }

    public final void s0(b bVar) {
        e eVar = this.f21387a;
        if (eVar != null) {
            eVar.s0(bVar);
        }
    }
}
