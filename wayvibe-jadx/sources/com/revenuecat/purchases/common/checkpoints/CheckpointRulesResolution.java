package com.revenuecat.purchases.common.checkpoints;

import V0.p;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CheckpointRulesResolution {

    public static final class Disabled extends CheckpointRulesResolution {
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
            super(null);
        }
    }

    public static final class Found extends CheckpointRulesResolution {
        private final CheckpointResponse checkpoint;
        private final int configGeneration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Found(CheckpointResponse checkpoint, int i10) {
            super(null);
            m.f(checkpoint, "checkpoint");
            this.checkpoint = checkpoint;
            this.configGeneration = i10;
        }

        public static /* synthetic */ Found copy$default(Found found, CheckpointResponse checkpointResponse, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                checkpointResponse = found.checkpoint;
            }
            if ((i11 & 2) != 0) {
                i10 = found.configGeneration;
            }
            return found.copy(checkpointResponse, i10);
        }

        public final CheckpointResponse component1() {
            return this.checkpoint;
        }

        public final int component2() {
            return this.configGeneration;
        }

        public final Found copy(CheckpointResponse checkpoint, int i10) {
            m.f(checkpoint, "checkpoint");
            return new Found(checkpoint, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Found)) {
                return false;
            }
            Found found = (Found) obj;
            return m.b(this.checkpoint, found.checkpoint) && this.configGeneration == found.configGeneration;
        }

        public final CheckpointResponse getCheckpoint() {
            return this.checkpoint;
        }

        public final int getConfigGeneration() {
            return this.configGeneration;
        }

        public int hashCode() {
            return Integer.hashCode(this.configGeneration) + (this.checkpoint.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Found(checkpoint=");
            sb.append(this.checkpoint);
            sb.append(", configGeneration=");
            return p.q(sb, this.configGeneration, ')');
        }
    }

    public static final class NotConfigured extends CheckpointRulesResolution {
        public static final NotConfigured INSTANCE = new NotConfigured();

        private NotConfigured() {
            super(null);
        }
    }

    public static final class Unavailable extends CheckpointRulesResolution {
        public static final Unavailable INSTANCE = new Unavailable();

        private Unavailable() {
            super(null);
        }
    }

    public /* synthetic */ CheckpointRulesResolution(f fVar) {
        this();
    }

    private CheckpointRulesResolution() {
    }
}
