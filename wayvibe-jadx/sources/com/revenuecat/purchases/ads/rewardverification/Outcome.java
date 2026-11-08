package com.revenuecat.purchases.ads.rewardverification;

import V0.p;
import com.revenuecat.purchases.ads.events.types.AdRewardFailureReason;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p097i9.k;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public interface Outcome {

    public static final class Verified implements Outcome {
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

    public interface Failed extends Outcome {

        public static final class Cancelled implements Failed {
            public static final Cancelled INSTANCE = new Cancelled();

            private Cancelled() {
            }

            @Override // com.revenuecat.purchases.ads.rewardverification.Outcome.Failed
            public String getLogMessage() {
                return "Reward verification was cancelled before it could complete.";
            }

            @Override // com.revenuecat.purchases.ads.rewardverification.Outcome.Failed
            public AdRewardFailureReason getTrackingFailureReason() {
                return AdRewardFailureReason.Cancelled.INSTANCE;
            }

            @Override // com.revenuecat.purchases.ads.rewardverification.Outcome.Failed
            public boolean isUnexpected() {
                return false;
            }
        }

        public static final class ExhaustedWhilePending implements Failed {
            public static final ExhaustedWhilePending INSTANCE = new ExhaustedWhilePending();

            private ExhaustedWhilePending() {
            }

            @Override // com.revenuecat.purchases.ads.rewardverification.Outcome.Failed
            public String getLogMessage() {
                return "Reward verification timed out: the AdMob server-side verification (SSV) callback was not received in time. Possible causes: SSV is not enabled/configured for this ad unit in the AdMob Dashboard, the SSV callback URL is misconfigured in the AdMob Dashboard, AdMob delayed delivering the callback, or RevenueCat failed to process the SSV webhook.";
            }

            @Override // com.revenuecat.purchases.ads.rewardverification.Outcome.Failed
            public AdRewardFailureReason getTrackingFailureReason() {
                return AdRewardFailureReason.Timeout.INSTANCE;
            }

            @Override // com.revenuecat.purchases.ads.rewardverification.Outcome.Failed
            public boolean isUnexpected() {
                return false;
            }
        }

        public static final class ExhaustedWhileTransientErroring implements Failed {
            public static final ExhaustedWhileTransientErroring INSTANCE = new ExhaustedWhileTransientErroring();

            private ExhaustedWhileTransientErroring() {
            }

            @Override // com.revenuecat.purchases.ads.rewardverification.Outcome.Failed
            public String getLogMessage() {
                return "Reward verification timed out after repeated transient errors while polling — typically unstable device network connectivity. The reward couldn't be verified.";
            }

            @Override // com.revenuecat.purchases.ads.rewardverification.Outcome.Failed
            public AdRewardFailureReason getTrackingFailureReason() {
                return AdRewardFailureReason.NetworkError.INSTANCE;
            }

            @Override // com.revenuecat.purchases.ads.rewardverification.Outcome.Failed
            public boolean isUnexpected() {
                return false;
            }
        }

        public static final class TerminalError implements Failed {
            private final String error;

            public TerminalError(String error) {
                m.f(error, "error");
                this.error = error;
            }

            @Override // com.revenuecat.purchases.ads.rewardverification.Outcome.Failed
            public String getLogMessage() {
                return b.m(new StringBuilder("Reward verification stopped after an unrecoverable error: "), this.error, ". This is unexpected; if it persists, contact RevenueCat support with the error above.");
            }

            @Override // com.revenuecat.purchases.ads.rewardverification.Outcome.Failed
            public AdRewardFailureReason getTrackingFailureReason() {
                return AdRewardFailureReason.Unknown.INSTANCE;
            }

            @Override // com.revenuecat.purchases.ads.rewardverification.Outcome.Failed
            public boolean isUnexpected() {
                return true;
            }
        }

        public static final class UnexpectedResponse implements Failed {
            public static final UnexpectedResponse INSTANCE = new UnexpectedResponse();

            private UnexpectedResponse() {
            }

            @Override // com.revenuecat.purchases.ads.rewardverification.Outcome.Failed
            public String getLogMessage() {
                return "Reward verification stopped after the server returned a status this SDK version doesn't recognize. Update to the latest SDK version; if you're already on the latest, contact RevenueCat support.";
            }

            @Override // com.revenuecat.purchases.ads.rewardverification.Outcome.Failed
            public AdRewardFailureReason getTrackingFailureReason() {
                return AdRewardFailureReason.Unknown.INSTANCE;
            }

            @Override // com.revenuecat.purchases.ads.rewardverification.Outcome.Failed
            public boolean isUnexpected() {
                return true;
            }
        }

        String getLogMessage();

        AdRewardFailureReason getTrackingFailureReason();

        boolean isUnexpected();

        public static final class BackendRejected implements Failed {
            private final String backendMessage;
            private final String failureReason;

            public BackendRejected(String str, String str2) {
                this.backendMessage = str;
                this.failureReason = str2;
            }

            @Override // com.revenuecat.purchases.ads.rewardverification.Outcome.Failed
            public String getLogMessage() {
                String str = this.backendMessage;
                if (str != null) {
                    if (k.x0(str)) {
                        str = null;
                    }
                    if (str != null) {
                        return str;
                    }
                }
                String str2 = this.failureReason;
                if (str2 == null) {
                    return "Reward verification was rejected by AdMob server-side verification.";
                }
                String str3 = k.x0(str2) ? null : str2;
                return str3 != null ? p.o("Reward verification was rejected by AdMob server-side verification (reason: ", str3, ").") : "Reward verification was rejected by AdMob server-side verification.";
            }

            @Override // com.revenuecat.purchases.ads.rewardverification.Outcome.Failed
            public AdRewardFailureReason getTrackingFailureReason() {
                return new AdRewardFailureReason.BackendError(this.failureReason);
            }

            @Override // com.revenuecat.purchases.ads.rewardverification.Outcome.Failed
            public boolean isUnexpected() {
                return false;
            }

            public /* synthetic */ BackendRejected(String str, String str2, int i10, f fVar) {
                this(str, (i10 & 2) != 0 ? null : str2);
            }
        }
    }
}
