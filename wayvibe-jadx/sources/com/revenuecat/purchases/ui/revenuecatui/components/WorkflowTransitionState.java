package com.revenuecat.purchases.ui.revenuecatui.components;

import com.revenuecat.purchases.ui.revenuecatui.workflow.NavigationDirection;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p230w.C2271d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WorkflowTransitionState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int SLIDE_DURATION_MS = 350;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class SlideInOut extends WorkflowTransitionState {
        public static final int $stable = 8;
        private final C2271d animatable;
        private final NavigationDirection animatingDirection;
        private final String animatingFromStepId;
        private final String animatingToStepId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SlideInOut(String str, String animatingToStepId, NavigationDirection navigationDirection, C2271d animatable) {
            super(null);
            m.f(animatingToStepId, "animatingToStepId");
            m.f(animatable, "animatable");
            this.animatingFromStepId = str;
            this.animatingToStepId = animatingToStepId;
            this.animatingDirection = navigationDirection;
            this.animatable = animatable;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.components.WorkflowTransitionState
        public C2271d getAnimatable() {
            return this.animatable;
        }

        public final NavigationDirection getAnimatingDirection() {
            return this.animatingDirection;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.components.WorkflowTransitionState
        public String getAnimatingFromStepId() {
            return this.animatingFromStepId;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.components.WorkflowTransitionState
        public String getAnimatingToStepId() {
            return this.animatingToStepId;
        }
    }

    public /* synthetic */ WorkflowTransitionState(f fVar) {
        this();
    }

    public abstract C2271d getAnimatable();

    public abstract String getAnimatingFromStepId();

    public abstract String getAnimatingToStepId();

    private WorkflowTransitionState() {
    }
}
