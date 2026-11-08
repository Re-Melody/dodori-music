package com.revenuecat.purchases.ui.revenuecatui.data;

import V0.p;
import com.revenuecat.purchases.ui.revenuecatui.workflow.NavigationDirection;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkflowPendingTransition {
    public static final int $stable = 0;
    private final NavigationDirection direction;
    private final String fromStepId;
    private final int id;

    public WorkflowPendingTransition(String fromStepId, NavigationDirection direction, int i10) {
        m.f(fromStepId, "fromStepId");
        m.f(direction, "direction");
        this.fromStepId = fromStepId;
        this.direction = direction;
        this.id = i10;
    }

    public static /* synthetic */ WorkflowPendingTransition copy$default(WorkflowPendingTransition workflowPendingTransition, String str, NavigationDirection navigationDirection, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = workflowPendingTransition.fromStepId;
        }
        if ((i11 & 2) != 0) {
            navigationDirection = workflowPendingTransition.direction;
        }
        if ((i11 & 4) != 0) {
            i10 = workflowPendingTransition.id;
        }
        return workflowPendingTransition.copy(str, navigationDirection, i10);
    }

    public final String component1() {
        return this.fromStepId;
    }

    public final NavigationDirection component2() {
        return this.direction;
    }

    public final int component3() {
        return this.id;
    }

    public final WorkflowPendingTransition copy(String fromStepId, NavigationDirection direction, int i10) {
        m.f(fromStepId, "fromStepId");
        m.f(direction, "direction");
        return new WorkflowPendingTransition(fromStepId, direction, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkflowPendingTransition)) {
            return false;
        }
        WorkflowPendingTransition workflowPendingTransition = (WorkflowPendingTransition) obj;
        return m.b(this.fromStepId, workflowPendingTransition.fromStepId) && this.direction == workflowPendingTransition.direction && this.id == workflowPendingTransition.id;
    }

    public final NavigationDirection getDirection() {
        return this.direction;
    }

    public final String getFromStepId() {
        return this.fromStepId;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return Integer.hashCode(this.id) + ((this.direction.hashCode() + (this.fromStepId.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WorkflowPendingTransition(fromStepId=");
        sb.append(this.fromStepId);
        sb.append(", direction=");
        sb.append(this.direction);
        sb.append(", id=");
        return p.q(sb, this.id, ')');
    }
}
