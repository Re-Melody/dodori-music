package com.revenuecat.purchases.ads.rewardverification;

import N8.s;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class RewardVerificationResult {
    public static final Companion Companion = new Companion(null);
    public static final RewardVerificationResult failed = new RewardVerificationResult(Storage.Failed.INSTANCE);
    private final Storage storage;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RewardVerificationResult verified$default(Companion companion, VerifiedReward verifiedReward, List list, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                list = s.f8650a;
            }
            return companion.verified(verifiedReward, list);
        }

        public final RewardVerificationResult verified(VerifiedReward reward) {
            m.f(reward, "reward");
            return verified$default(this, reward, null, 2, null);
        }

        private Companion() {
        }

        public final RewardVerificationResult verified(VerifiedReward reward, List<? extends VerifiedReward> moreRewards) {
            m.f(reward, "reward");
            m.f(moreRewards, "moreRewards");
            return new RewardVerificationResult(new Storage.Verified(reward, moreRewards), null);
        }
    }

    public interface Storage {

        public static final class Failed implements Storage {
            public static final Failed INSTANCE = new Failed();

            private Failed() {
            }
        }

        public static final class Verified implements Storage {
            private final List<VerifiedReward> moreRewards;
            private final VerifiedReward reward;

            /* JADX WARN: Multi-variable type inference failed */
            public Verified(VerifiedReward reward, List<? extends VerifiedReward> moreRewards) {
                m.f(reward, "reward");
                m.f(moreRewards, "moreRewards");
                this.reward = reward;
                this.moreRewards = moreRewards;
            }

            public final List<VerifiedReward> getMoreRewards() {
                return this.moreRewards;
            }

            public final VerifiedReward getReward() {
                return this.reward;
            }
        }
    }

    public /* synthetic */ RewardVerificationResult(Storage storage, f fVar) {
        this(storage);
    }

    public static final RewardVerificationResult verified(VerifiedReward verifiedReward) {
        return Companion.verified(verifiedReward);
    }

    public final boolean getFailed() {
        return this.storage instanceof Storage.Failed;
    }

    public final List<VerifiedReward> getMoreRewards() {
        List<VerifiedReward> moreRewards;
        Storage storage = this.storage;
        Storage.Verified verified = storage instanceof Storage.Verified ? (Storage.Verified) storage : null;
        return (verified == null || (moreRewards = verified.getMoreRewards()) == null) ? s.f8650a : moreRewards;
    }

    public final VerifiedReward getVerifiedReward() {
        Storage storage = this.storage;
        Storage.Verified verified = storage instanceof Storage.Verified ? (Storage.Verified) storage : null;
        if (verified != null) {
            return verified.getReward();
        }
        return null;
    }

    private RewardVerificationResult(Storage storage) {
        this.storage = storage;
    }

    public static final RewardVerificationResult verified(VerifiedReward verifiedReward, List<? extends VerifiedReward> list) {
        return Companion.verified(verifiedReward, list);
    }
}
