package com.revenuecat.purchases.hybridcommon.mappers;

import M8.l;
import N8.y;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class EntitlementInfoMapperKt {
    public static final Map<String, Object> map(EntitlementInfo entitlementInfo) {
        Long lValueOf;
        String str;
        String iso8601;
        String str2;
        m.f(entitlementInfo, "<this>");
        l lVar = new l("identifier", entitlementInfo.getIdentifier());
        l lVar2 = new l("isActive", Boolean.valueOf(entitlementInfo.isActive()));
        l lVar3 = new l("willRenew", Boolean.valueOf(entitlementInfo.getWillRenew()));
        l lVar4 = new l("periodType", entitlementInfo.getPeriodType().name());
        l lVar5 = new l("latestPurchaseDateMillis", Long.valueOf(MappersHelpersKt.toMillis(entitlementInfo.getLatestPurchaseDate())));
        l lVar6 = new l("latestPurchaseDate", MappersHelpersKt.toIso8601(entitlementInfo.getLatestPurchaseDate()));
        l lVar7 = new l("originalPurchaseDateMillis", Long.valueOf(MappersHelpersKt.toMillis(entitlementInfo.getOriginalPurchaseDate())));
        l lVar8 = new l("originalPurchaseDate", MappersHelpersKt.toIso8601(entitlementInfo.getOriginalPurchaseDate()));
        Date expirationDate = entitlementInfo.getExpirationDate();
        if (expirationDate != null) {
            lValueOf = Long.valueOf(MappersHelpersKt.toMillis(expirationDate));
            str = null;
        } else {
            lValueOf = null;
            str = null;
        }
        l lVar9 = new l("expirationDateMillis", lValueOf);
        Date expirationDate2 = entitlementInfo.getExpirationDate();
        if (expirationDate2 != null) {
            iso8601 = MappersHelpersKt.toIso8601(expirationDate2);
            str2 = str;
        } else {
            iso8601 = str;
            str2 = iso8601;
        }
        l lVar10 = new l("expirationDate", iso8601);
        l lVar11 = new l(ProductResponseJsonKeys.STORE, entitlementInfo.getStore().name());
        l lVar12 = new l("productIdentifier", entitlementInfo.getProductIdentifier());
        l lVar13 = new l("productPlanIdentifier", entitlementInfo.getProductPlanIdentifier());
        l lVar14 = new l("isSandbox", Boolean.valueOf(entitlementInfo.isSandbox()));
        Date unsubscribeDetectedAt = entitlementInfo.getUnsubscribeDetectedAt();
        l lVar15 = new l("unsubscribeDetectedAt", unsubscribeDetectedAt != null ? MappersHelpersKt.toIso8601(unsubscribeDetectedAt) : null);
        Date unsubscribeDetectedAt2 = entitlementInfo.getUnsubscribeDetectedAt();
        l lVar16 = new l("unsubscribeDetectedAtMillis", unsubscribeDetectedAt2 != null ? Long.valueOf(MappersHelpersKt.toMillis(unsubscribeDetectedAt2)) : null);
        Date billingIssueDetectedAt = entitlementInfo.getBillingIssueDetectedAt();
        l lVar17 = new l("billingIssueDetectedAt", billingIssueDetectedAt != null ? MappersHelpersKt.toIso8601(billingIssueDetectedAt) : null);
        Date billingIssueDetectedAt2 = entitlementInfo.getBillingIssueDetectedAt();
        return y.g0(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12, lVar13, lVar14, lVar15, lVar16, lVar17, new l("billingIssueDetectedAtMillis", billingIssueDetectedAt2 != null ? Long.valueOf(MappersHelpersKt.toMillis(billingIssueDetectedAt2)) : null), new l("ownershipType", entitlementInfo.getOwnershipType().name()), new l("verification", entitlementInfo.getVerification().name()));
    }
}
