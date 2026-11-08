package com.revenuecat.purchases.checkpoints;

import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.common.workflows.PublishedWorkflow;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class CheckpointResolution {

    public static final class MatchedOffering extends CheckpointResolution {
        private final Offering offering;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MatchedOffering(Offering offering) {
            super(null);
            m.f(offering, "offering");
            this.offering = offering;
        }

        public static /* synthetic */ MatchedOffering copy$default(MatchedOffering matchedOffering, Offering offering, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                offering = matchedOffering.offering;
            }
            return matchedOffering.copy(offering);
        }

        public final Offering component1() {
            return this.offering;
        }

        public final MatchedOffering copy(Offering offering) {
            m.f(offering, "offering");
            return new MatchedOffering(offering);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MatchedOffering) && m.b(this.offering, ((MatchedOffering) obj).offering);
        }

        public final Offering getOffering() {
            return this.offering;
        }

        public int hashCode() {
            return this.offering.hashCode();
        }

        public String toString() {
            return "MatchedOffering(offering=" + this.offering + ')';
        }
    }

    public static final class MatchedWorkflow extends CheckpointResolution {
        private final Offering offering;
        private final UiConfig uiConfig;
        private final PublishedWorkflow workflow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MatchedWorkflow(PublishedWorkflow workflow, UiConfig uiConfig, Offering offering) {
            super(null);
            m.f(workflow, "workflow");
            m.f(uiConfig, "uiConfig");
            m.f(offering, "offering");
            this.workflow = workflow;
            this.uiConfig = uiConfig;
            this.offering = offering;
        }

        public static /* synthetic */ MatchedWorkflow copy$default(MatchedWorkflow matchedWorkflow, PublishedWorkflow publishedWorkflow, UiConfig uiConfig, Offering offering, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                publishedWorkflow = matchedWorkflow.workflow;
            }
            if ((i10 & 2) != 0) {
                uiConfig = matchedWorkflow.uiConfig;
            }
            if ((i10 & 4) != 0) {
                offering = matchedWorkflow.offering;
            }
            return matchedWorkflow.copy(publishedWorkflow, uiConfig, offering);
        }

        public final PublishedWorkflow component1() {
            return this.workflow;
        }

        public final UiConfig component2() {
            return this.uiConfig;
        }

        public final Offering component3() {
            return this.offering;
        }

        public final MatchedWorkflow copy(PublishedWorkflow workflow, UiConfig uiConfig, Offering offering) {
            m.f(workflow, "workflow");
            m.f(uiConfig, "uiConfig");
            m.f(offering, "offering");
            return new MatchedWorkflow(workflow, uiConfig, offering);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MatchedWorkflow)) {
                return false;
            }
            MatchedWorkflow matchedWorkflow = (MatchedWorkflow) obj;
            return m.b(this.workflow, matchedWorkflow.workflow) && m.b(this.uiConfig, matchedWorkflow.uiConfig) && m.b(this.offering, matchedWorkflow.offering);
        }

        public final Offering getOffering() {
            return this.offering;
        }

        public final UiConfig getUiConfig() {
            return this.uiConfig;
        }

        public final PublishedWorkflow getWorkflow() {
            return this.workflow;
        }

        public int hashCode() {
            return this.offering.hashCode() + ((this.uiConfig.hashCode() + (this.workflow.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "MatchedWorkflow(workflow=" + this.workflow + ", uiConfig=" + this.uiConfig + ", offering=" + this.offering + ')';
        }
    }

    public static final class NoAction extends CheckpointResolution {
        private final Reason reason;

        public enum Reason {
            NO_MATCH,
            CONFIGURATION_UNAVAILABLE,
            UNKNOWN_CHECKPOINT
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoAction(Reason reason) {
            super(null);
            m.f(reason, "reason");
            this.reason = reason;
        }

        public static /* synthetic */ NoAction copy$default(NoAction noAction, Reason reason, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                reason = noAction.reason;
            }
            return noAction.copy(reason);
        }

        public final Reason component1() {
            return this.reason;
        }

        public final NoAction copy(Reason reason) {
            m.f(reason, "reason");
            return new NoAction(reason);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoAction) && this.reason == ((NoAction) obj).reason;
        }

        public final Reason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return "NoAction(reason=" + this.reason + ')';
        }
    }

    public /* synthetic */ CheckpointResolution(f fVar) {
        this();
    }

    private CheckpointResolution() {
    }
}
