package F0;

import B8.C0116c;

/* JADX INFO: renamed from: F0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0395m extends p067g0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3812a = i0.f(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p067g0.q f3813b;

    @Override // p067g0.q
    public final void markAsAttached$ui_release() {
        super.markAsAttached$ui_release();
        for (p067g0.q child$ui_release = this.f3813b; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            child$ui_release.updateCoordinator$ui_release(getCoordinator$ui_release());
            if (!child$ui_release.isAttached()) {
                child$ui_release.markAsAttached$ui_release();
            }
        }
    }

    @Override // p067g0.q
    public final void markAsDetached$ui_release() {
        for (p067g0.q child$ui_release = this.f3813b; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            child$ui_release.markAsDetached$ui_release();
        }
        super.markAsDetached$ui_release();
    }

    public final void o0(InterfaceC0394l interfaceC0394l) {
        p067g0.q node = interfaceC0394l.getNode();
        if (node != interfaceC0394l) {
            p067g0.q qVar = interfaceC0394l instanceof p067g0.q ? (p067g0.q) interfaceC0394l : null;
            p067g0.q parent$ui_release = qVar != null ? qVar.getParent$ui_release() : null;
            if (node != getNode() || !kotlin.jvm.internal.m.b(parent$ui_release, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (node.isAttached()) {
            p206t6.b.g0("Cannot delegate to an already attached node");
            throw null;
        }
        node.setAsDelegateTo$ui_release(getNode());
        int kindSet$ui_release = getKindSet$ui_release();
        int iG = i0.g(node);
        node.setKindSet$ui_release(iG);
        int kindSet$ui_release2 = getKindSet$ui_release();
        int i10 = iG & 2;
        if (i10 != 0 && (kindSet$ui_release2 & 2) != 0 && !(this instanceof InterfaceC0406y)) {
            p206t6.b.g0("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + node);
            throw null;
        }
        node.setChild$ui_release(this.f3813b);
        this.f3813b = node;
        node.setParent$ui_release(this);
        q0(iG | getKindSet$ui_release(), false);
        if (isAttached()) {
            if (i10 == 0 || (kindSet$ui_release & 2) != 0) {
                updateCoordinator$ui_release(getCoordinator$ui_release());
            } else {
                C0116c c0116c = AbstractC0388f.r(this).f3609y;
                getNode().updateCoordinator$ui_release(null);
                c0116c.r();
            }
            node.markAsAttached$ui_release();
            node.runAttachLifecycle$ui_release();
            i0.a(node);
        }
    }

    public final void p0(InterfaceC0394l interfaceC0394l) {
        p067g0.q qVar = null;
        for (p067g0.q child$ui_release = this.f3813b; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            if (child$ui_release == interfaceC0394l) {
                if (child$ui_release.isAttached()) {
                    p199t.v vVar = i0.f3810a;
                    if (!child$ui_release.isAttached()) {
                        p206t6.b.g0("autoInvalidateRemovedNode called on unattached node");
                        throw null;
                    }
                    i0.b(child$ui_release, -1, 2);
                    child$ui_release.runDetachLifecycle$ui_release();
                    child$ui_release.markAsDetached$ui_release();
                }
                child$ui_release.setAsDelegateTo$ui_release(child$ui_release);
                child$ui_release.setAggregateChildKindSet$ui_release(0);
                if (qVar == null) {
                    this.f3813b = child$ui_release.getChild$ui_release();
                } else {
                    qVar.setChild$ui_release(child$ui_release.getChild$ui_release());
                }
                child$ui_release.setChild$ui_release(null);
                child$ui_release.setParent$ui_release(null);
                int kindSet$ui_release = getKindSet$ui_release();
                int iG = i0.g(this);
                q0(iG, true);
                if (isAttached() && (kindSet$ui_release & 2) != 0 && (iG & 2) == 0) {
                    C0116c c0116c = AbstractC0388f.r(this).f3609y;
                    getNode().updateCoordinator$ui_release(null);
                    c0116c.r();
                    return;
                }
                return;
            }
            qVar = child$ui_release;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC0394l).toString());
    }

    public final void q0(int i10, boolean z10) {
        p067g0.q child$ui_release;
        int kindSet$ui_release = getKindSet$ui_release();
        setKindSet$ui_release(i10);
        if (kindSet$ui_release != i10) {
            if (getNode() == this) {
                setAggregateChildKindSet$ui_release(i10);
            }
            if (isAttached()) {
                p067g0.q node = getNode();
                p067g0.q parent$ui_release = this;
                while (parent$ui_release != null) {
                    i10 |= parent$ui_release.getKindSet$ui_release();
                    parent$ui_release.setKindSet$ui_release(i10);
                    if (parent$ui_release == node) {
                        break;
                    } else {
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                if (z10 && parent$ui_release == node) {
                    i10 = i0.g(node);
                    node.setKindSet$ui_release(i10);
                }
                int aggregateChildKindSet$ui_release = i10 | ((parent$ui_release == null || (child$ui_release = parent$ui_release.getChild$ui_release()) == null) ? 0 : child$ui_release.getAggregateChildKindSet$ui_release());
                while (parent$ui_release != null) {
                    aggregateChildKindSet$ui_release |= parent$ui_release.getKindSet$ui_release();
                    parent$ui_release.setAggregateChildKindSet$ui_release(aggregateChildKindSet$ui_release);
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
        }
    }

    @Override // p067g0.q
    public final void reset$ui_release() {
        super.reset$ui_release();
        for (p067g0.q child$ui_release = this.f3813b; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            child$ui_release.reset$ui_release();
        }
    }

    @Override // p067g0.q
    public final void runAttachLifecycle$ui_release() {
        for (p067g0.q child$ui_release = this.f3813b; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            child$ui_release.runAttachLifecycle$ui_release();
        }
        super.runAttachLifecycle$ui_release();
    }

    @Override // p067g0.q
    public final void runDetachLifecycle$ui_release() {
        super.runDetachLifecycle$ui_release();
        for (p067g0.q child$ui_release = this.f3813b; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            child$ui_release.runDetachLifecycle$ui_release();
        }
    }

    @Override // p067g0.q
    public final void setAsDelegateTo$ui_release(p067g0.q qVar) {
        super.setAsDelegateTo$ui_release(qVar);
        for (p067g0.q child$ui_release = this.f3813b; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            child$ui_release.setAsDelegateTo$ui_release(qVar);
        }
    }

    @Override // p067g0.q
    public final void updateCoordinator$ui_release(h0 h0Var) {
        super.updateCoordinator$ui_release(h0Var);
        for (p067g0.q child$ui_release = this.f3813b; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            child$ui_release.updateCoordinator$ui_release(h0Var);
        }
    }
}
