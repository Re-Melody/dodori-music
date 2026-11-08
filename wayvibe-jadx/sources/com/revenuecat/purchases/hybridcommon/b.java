package com.revenuecat.purchases.hybridcommon;

import com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult;
import com.revenuecat.purchases.interfaces.PollRewardVerificationCallback;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements PollRewardVerificationCallback, RedeemWebPurchaseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OnResult f18883a;

    public /* synthetic */ b(OnResult onResult) {
        this.f18883a = onResult;
    }

    @Override // com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener
    public void handleResult(RedeemWebPurchaseListener.Result result) {
        CommonKt.redeemWebPurchase$lambda$17(this.f18883a, result);
    }

    @Override // com.revenuecat.purchases.interfaces.PollRewardVerificationCallback
    public void onCompleted(RewardVerificationResult rewardVerificationResult) {
        CommonKt.pollRewardVerification$lambda$48(this.f18883a, rewardVerificationResult);
    }
}
