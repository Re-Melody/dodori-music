package p067g0;

import F0.AbstractC0388f;
import F0.InterfaceC0394l;
import F0.h0;
import F0.m0;
import G0.A;
import U.T;
import W.d;
import Z8.a;
import p119k9.C;
import p119k9.C2023k0;
import p119k9.C2041z;
import p119k9.F;
import p119k9.InterfaceC2019i0;
import p206t6.b;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class q implements InterfaceC0394l {
    public static final int $stable = 8;
    private q child;
    private h0 coordinator;
    private boolean insertedNodeAwaitingAttachForInvalidation;
    private boolean isAttached;
    private int kindSet;
    private boolean onAttachRunExpected;
    private boolean onDetachRunExpected;
    private m0 ownerScope;
    private q parent;
    private C scope;
    private boolean updatedNodeAwaitingAttachForInvalidation;
    private q node = this;
    private int aggregateChildKindSet = -1;

    public final int getAggregateChildKindSet$ui_release() {
        return this.aggregateChildKindSet;
    }

    public final q getChild$ui_release() {
        return this.child;
    }

    public final h0 getCoordinator$ui_release() {
        return this.coordinator;
    }

    public final C getCoroutineScope() {
        C c3 = this.scope;
        if (c3 != null) {
            return c3;
        }
        c cVarB = F.b(((A) AbstractC0388f.s(this)).getCoroutineContext().plus(new C2023k0((InterfaceC2019i0) ((A) AbstractC0388f.s(this)).getCoroutineContext().get(C2041z.f21793b))));
        this.scope = cVarB;
        return cVarB;
    }

    public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui_release() {
        return this.insertedNodeAwaitingAttachForInvalidation;
    }

    public final int getKindSet$ui_release() {
        return this.kindSet;
    }

    @Override // F0.InterfaceC0394l
    public final q getNode() {
        return this.node;
    }

    public final m0 getOwnerScope$ui_release() {
        return this.ownerScope;
    }

    public final q getParent$ui_release() {
        return this.parent;
    }

    public boolean getShouldAutoInvalidate() {
        return true;
    }

    public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui_release() {
        return this.updatedNodeAwaitingAttachForInvalidation;
    }

    public final boolean isAttached() {
        return this.isAttached;
    }

    /* JADX INFO: renamed from: isKind-H91voCI$ui_release, reason: not valid java name */
    public final boolean m909isKindH91voCI$ui_release(int i10) {
        return (i10 & getKindSet$ui_release()) != 0;
    }

    public boolean m() {
        return isAttached();
    }

    public void markAsAttached$ui_release() {
        if (this.isAttached) {
            b.g0("node attached multiple times");
            throw null;
        }
        if (!(this.coordinator != null)) {
            b.g0("attach invoked on a node without a coordinator");
            throw null;
        }
        this.isAttached = true;
        this.onAttachRunExpected = true;
    }

    public void markAsDetached$ui_release() {
        if (!this.isAttached) {
            b.g0("Cannot detach a node that is not attached");
            throw null;
        }
        if (this.onAttachRunExpected) {
            b.g0("Must run runAttachLifecycle() before markAsDetached()");
            throw null;
        }
        if (this.onDetachRunExpected) {
            b.g0("Must run runDetachLifecycle() before markAsDetached()");
            throw null;
        }
        this.isAttached = false;
        C c3 = this.scope;
        if (c3 != null) {
            F.f(c3, new T("The Modifier.Node was detached", 1));
            this.scope = null;
        }
    }

    public void reset$ui_release() {
        if (this.isAttached) {
            onReset();
        } else {
            b.g0("reset() called on an unattached node");
            throw null;
        }
    }

    public void runAttachLifecycle$ui_release() {
        if (!this.isAttached) {
            b.g0("Must run markAsAttached() prior to runAttachLifecycle");
            throw null;
        }
        if (!this.onAttachRunExpected) {
            b.g0("Must run runAttachLifecycle() only once after markAsAttached()");
            throw null;
        }
        this.onAttachRunExpected = false;
        onAttach();
        this.onDetachRunExpected = true;
    }

    public void runDetachLifecycle$ui_release() {
        if (!this.isAttached) {
            b.g0("node detached multiple times");
            throw null;
        }
        if (this.coordinator == null) {
            b.g0("detach invoked on a node without a coordinator");
            throw null;
        }
        if (!this.onDetachRunExpected) {
            b.g0("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            throw null;
        }
        this.onDetachRunExpected = false;
        onDetach();
    }

    public final void setAggregateChildKindSet$ui_release(int i10) {
        this.aggregateChildKindSet = i10;
    }

    public void setAsDelegateTo$ui_release(q qVar) {
        this.node = qVar;
    }

    public final void setChild$ui_release(q qVar) {
        this.child = qVar;
    }

    public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean z10) {
        this.insertedNodeAwaitingAttachForInvalidation = z10;
    }

    public final void setKindSet$ui_release(int i10) {
        this.kindSet = i10;
    }

    public final void setOwnerScope$ui_release(m0 m0Var) {
        this.ownerScope = m0Var;
    }

    public final void setParent$ui_release(q qVar) {
        this.parent = qVar;
    }

    public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean z10) {
        this.updatedNodeAwaitingAttachForInvalidation = z10;
    }

    public final void sideEffect(a aVar) {
        d dVar = ((A) AbstractC0388f.s(this)).H0;
        if (dVar.i(aVar)) {
            return;
        }
        dVar.b(aVar);
    }

    public void updateCoordinator$ui_release(h0 h0Var) {
        this.coordinator = h0Var;
    }

    public static /* synthetic */ void getNode$annotations() {
    }

    public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onReset() {
    }
}
