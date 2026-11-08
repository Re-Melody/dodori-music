package com.revenuecat.purchases.ui.revenuecatui.components;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p230w.A;
import p230w.B;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WorkflowTransitionAnimation {
    public static final int $stable = 0;

    public static final class SlideInOut extends WorkflowTransitionAnimation {
        public static final int $stable = 0;
        private final int durationMs;
        private final A easing;

        public SlideInOut() {
            this(0, null, 3, null);
        }

        public static /* synthetic */ SlideInOut copy$default(SlideInOut slideInOut, int i10, A a10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = slideInOut.durationMs;
            }
            if ((i11 & 2) != 0) {
                a10 = slideInOut.easing;
            }
            return slideInOut.copy(i10, a10);
        }

        public final int component1() {
            return this.durationMs;
        }

        public final A component2() {
            return this.easing;
        }

        public final SlideInOut copy(int i10, A easing) {
            m.f(easing, "easing");
            return new SlideInOut(i10, easing);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SlideInOut)) {
                return false;
            }
            SlideInOut slideInOut = (SlideInOut) obj;
            return this.durationMs == slideInOut.durationMs && m.b(this.easing, slideInOut.easing);
        }

        public final int getDurationMs() {
            return this.durationMs;
        }

        public final A getEasing() {
            return this.easing;
        }

        public int hashCode() {
            return this.easing.hashCode() + (Integer.hashCode(this.durationMs) * 31);
        }

        public String toString() {
            return "SlideInOut(durationMs=" + this.durationMs + ", easing=" + this.easing + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SlideInOut(int i10, A easing) {
            super(null);
            m.f(easing, "easing");
            this.durationMs = i10;
            this.easing = easing;
        }

        public SlideInOut(int i10, A a10, int i11, f fVar) {
            this((i11 & 1) != 0 ? WorkflowTransitionState.SLIDE_DURATION_MS : i10, (i11 & 2) != 0 ? B.f27546a : a10);
        }
    }

    public /* synthetic */ WorkflowTransitionAnimation(f fVar) {
        this();
    }

    private WorkflowTransitionAnimation() {
    }
}
