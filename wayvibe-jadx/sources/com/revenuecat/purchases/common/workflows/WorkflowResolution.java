package com.revenuecat.purchases.common.workflows;

import B2.AbstractC0112b;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public abstract class WorkflowResolution {

    public static final class Disabled extends WorkflowResolution {
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
            super(null);
        }
    }

    public static final class Found extends WorkflowResolution {
        private final String workflowId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Found(String workflowId) {
            super(null);
            m.f(workflowId, "workflowId");
            this.workflowId = workflowId;
        }

        public static /* synthetic */ Found copy$default(Found found, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = found.workflowId;
            }
            return found.copy(str);
        }

        public final String component1() {
            return this.workflowId;
        }

        public final Found copy(String workflowId) {
            m.f(workflowId, "workflowId");
            return new Found(workflowId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Found) && m.b(this.workflowId, ((Found) obj).workflowId);
        }

        public final String getWorkflowId() {
            return this.workflowId;
        }

        public int hashCode() {
            return this.workflowId.hashCode();
        }

        public String toString() {
            return AbstractC0112b.j(new StringBuilder("Found(workflowId="), this.workflowId, ')');
        }
    }

    public static final class NoWorkflow extends WorkflowResolution {
        public static final NoWorkflow INSTANCE = new NoWorkflow();

        private NoWorkflow() {
            super(null);
        }
    }

    public static final class Unavailable extends WorkflowResolution {
        public static final Unavailable INSTANCE = new Unavailable();

        private Unavailable() {
            super(null);
        }
    }

    public /* synthetic */ WorkflowResolution(f fVar) {
        this();
    }

    private WorkflowResolution() {
    }
}
