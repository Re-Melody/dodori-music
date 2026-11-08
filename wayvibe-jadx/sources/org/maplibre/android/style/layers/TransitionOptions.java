package org.maplibre.android.style.layers;

import androidx.annotation.Keep;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public class TransitionOptions {

    @Keep
    private long delay;

    @Keep
    private long duration;

    @Keep
    private boolean enablePlacementTransitions;

    public TransitionOptions(long j10, long j11, boolean z10) {
        this.duration = j10;
        this.delay = j11;
        this.enablePlacementTransitions = z10;
    }

    @Keep
    @Deprecated
    public static TransitionOptions fromTransitionOptions(long j10, long j11) {
        return new TransitionOptions(j10, j11, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TransitionOptions transitionOptions = (TransitionOptions) obj;
            if (this.duration == transitionOptions.duration && this.delay == transitionOptions.delay && this.enablePlacementTransitions == transitionOptions.enablePlacementTransitions) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.duration;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.delay;
        return ((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.enablePlacementTransitions ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionOptions{duration=");
        sb.append(this.duration);
        sb.append(", delay=");
        sb.append(this.delay);
        sb.append(", enablePlacementTransitions=");
        return b.o(sb, this.enablePlacementTransitions, '}');
    }

    @Keep
    public static TransitionOptions fromTransitionOptions(long j10, long j11, boolean z10) {
        return new TransitionOptions(j10, j11, z10);
    }
}
