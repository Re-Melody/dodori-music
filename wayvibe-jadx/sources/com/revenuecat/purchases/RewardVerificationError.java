package com.revenuecat.purchases;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class RewardVerificationError {
    private final PurchasesError error;
    private final boolean isServerError;

    public RewardVerificationError(PurchasesError error, boolean z10) {
        m.f(error, "error");
        this.error = error;
        this.isServerError = z10;
    }

    public static /* synthetic */ RewardVerificationError copy$default(RewardVerificationError rewardVerificationError, PurchasesError purchasesError, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            purchasesError = rewardVerificationError.error;
        }
        if ((i10 & 2) != 0) {
            z10 = rewardVerificationError.isServerError;
        }
        return rewardVerificationError.copy(purchasesError, z10);
    }

    public final PurchasesError component1() {
        return this.error;
    }

    public final boolean component2() {
        return this.isServerError;
    }

    public final RewardVerificationError copy(PurchasesError error, boolean z10) {
        m.f(error, "error");
        return new RewardVerificationError(error, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardVerificationError)) {
            return false;
        }
        RewardVerificationError rewardVerificationError = (RewardVerificationError) obj;
        return m.b(this.error, rewardVerificationError.error) && this.isServerError == rewardVerificationError.isServerError;
    }

    public final PurchasesError getError() {
        return this.error;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isServerError) + (this.error.hashCode() * 31);
    }

    public final boolean isServerError() {
        return this.isServerError;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RewardVerificationError(error=");
        sb.append(this.error);
        sb.append(", isServerError=");
        return p134m1.b.o(sb, this.isServerError, ')');
    }
}
