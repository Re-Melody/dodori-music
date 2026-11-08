package com.revenuecat.purchases.hybridcommon;

import B2.AbstractC0112b;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
final class CommonPurchaseParams {
    private final List<Map<String, Object>> addOnPackages;
    private final List<Map<String, Object>> addOnStoreProducts;
    private final List<Map<String, Object>> addOnSubscriptionOptions;
    private final Boolean googleIsPersonalizedPrice;
    private final String googleOldProductId;
    private final Integer googleReplacementMode;
    private final Map<String, Object> presentedOfferingContext;
    private final PurchasableItem purchasableItem;
    private final String storeReplacementMode;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonPurchaseParams(PurchasableItem purchasableItem, String str, Integer num, Boolean bool, String str2, Map<String, ? extends Object> map, List<? extends Map<String, ? extends Object>> list, List<? extends Map<String, ? extends Object>> list2, List<? extends Map<String, ? extends Object>> list3) {
        m.f(purchasableItem, "purchasableItem");
        this.purchasableItem = purchasableItem;
        this.googleOldProductId = str;
        this.googleReplacementMode = num;
        this.googleIsPersonalizedPrice = bool;
        this.storeReplacementMode = str2;
        this.presentedOfferingContext = map;
        this.addOnStoreProducts = list;
        this.addOnSubscriptionOptions = list2;
        this.addOnPackages = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommonPurchaseParams copy$default(CommonPurchaseParams commonPurchaseParams, PurchasableItem purchasableItem, String str, Integer num, Boolean bool, String str2, Map map, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            purchasableItem = commonPurchaseParams.purchasableItem;
        }
        if ((i10 & 2) != 0) {
            str = commonPurchaseParams.googleOldProductId;
        }
        if ((i10 & 4) != 0) {
            num = commonPurchaseParams.googleReplacementMode;
        }
        if ((i10 & 8) != 0) {
            bool = commonPurchaseParams.googleIsPersonalizedPrice;
        }
        if ((i10 & 16) != 0) {
            str2 = commonPurchaseParams.storeReplacementMode;
        }
        if ((i10 & 32) != 0) {
            map = commonPurchaseParams.presentedOfferingContext;
        }
        if ((i10 & 64) != 0) {
            list = commonPurchaseParams.addOnStoreProducts;
        }
        if ((i10 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0) {
            list2 = commonPurchaseParams.addOnSubscriptionOptions;
        }
        if ((i10 & 256) != 0) {
            list3 = commonPurchaseParams.addOnPackages;
        }
        List list4 = list2;
        List list5 = list3;
        Map map2 = map;
        List list6 = list;
        String str3 = str2;
        Integer num2 = num;
        return commonPurchaseParams.copy(purchasableItem, str, num2, bool, str3, map2, list6, list4, list5);
    }

    public final PurchasableItem component1() {
        return this.purchasableItem;
    }

    public final String component2() {
        return this.googleOldProductId;
    }

    public final Integer component3() {
        return this.googleReplacementMode;
    }

    public final Boolean component4() {
        return this.googleIsPersonalizedPrice;
    }

    public final String component5() {
        return this.storeReplacementMode;
    }

    public final Map<String, Object> component6() {
        return this.presentedOfferingContext;
    }

    public final List<Map<String, Object>> component7() {
        return this.addOnStoreProducts;
    }

    public final List<Map<String, Object>> component8() {
        return this.addOnSubscriptionOptions;
    }

    public final List<Map<String, Object>> component9() {
        return this.addOnPackages;
    }

    public final CommonPurchaseParams copy(PurchasableItem purchasableItem, String str, Integer num, Boolean bool, String str2, Map<String, ? extends Object> map, List<? extends Map<String, ? extends Object>> list, List<? extends Map<String, ? extends Object>> list2, List<? extends Map<String, ? extends Object>> list3) {
        m.f(purchasableItem, "purchasableItem");
        return new CommonPurchaseParams(purchasableItem, str, num, bool, str2, map, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonPurchaseParams)) {
            return false;
        }
        CommonPurchaseParams commonPurchaseParams = (CommonPurchaseParams) obj;
        return m.b(this.purchasableItem, commonPurchaseParams.purchasableItem) && m.b(this.googleOldProductId, commonPurchaseParams.googleOldProductId) && m.b(this.googleReplacementMode, commonPurchaseParams.googleReplacementMode) && m.b(this.googleIsPersonalizedPrice, commonPurchaseParams.googleIsPersonalizedPrice) && m.b(this.storeReplacementMode, commonPurchaseParams.storeReplacementMode) && m.b(this.presentedOfferingContext, commonPurchaseParams.presentedOfferingContext) && m.b(this.addOnStoreProducts, commonPurchaseParams.addOnStoreProducts) && m.b(this.addOnSubscriptionOptions, commonPurchaseParams.addOnSubscriptionOptions) && m.b(this.addOnPackages, commonPurchaseParams.addOnPackages);
    }

    public final List<Map<String, Object>> getAddOnPackages() {
        return this.addOnPackages;
    }

    public final List<Map<String, Object>> getAddOnStoreProducts() {
        return this.addOnStoreProducts;
    }

    public final List<Map<String, Object>> getAddOnSubscriptionOptions() {
        return this.addOnSubscriptionOptions;
    }

    public final Boolean getGoogleIsPersonalizedPrice() {
        return this.googleIsPersonalizedPrice;
    }

    public final String getGoogleOldProductId() {
        return this.googleOldProductId;
    }

    public final Integer getGoogleReplacementMode() {
        return this.googleReplacementMode;
    }

    public final Map<String, Object> getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final PurchasableItem getPurchasableItem() {
        return this.purchasableItem;
    }

    public final String getStoreReplacementMode() {
        return this.storeReplacementMode;
    }

    public int hashCode() {
        int iHashCode = this.purchasableItem.hashCode() * 31;
        String str = this.googleOldProductId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.googleReplacementMode;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.googleIsPersonalizedPrice;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.storeReplacementMode;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, Object> map = this.presentedOfferingContext;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        List<Map<String, Object>> list = this.addOnStoreProducts;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<Map<String, Object>> list2 = this.addOnSubscriptionOptions;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Map<String, Object>> list3 = this.addOnPackages;
        return iHashCode8 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CommonPurchaseParams(purchasableItem=");
        sb.append(this.purchasableItem);
        sb.append(", googleOldProductId=");
        sb.append(this.googleOldProductId);
        sb.append(", googleReplacementMode=");
        sb.append(this.googleReplacementMode);
        sb.append(", googleIsPersonalizedPrice=");
        sb.append(this.googleIsPersonalizedPrice);
        sb.append(", storeReplacementMode=");
        sb.append(this.storeReplacementMode);
        sb.append(", presentedOfferingContext=");
        sb.append(this.presentedOfferingContext);
        sb.append(", addOnStoreProducts=");
        sb.append(this.addOnStoreProducts);
        sb.append(", addOnSubscriptionOptions=");
        sb.append(this.addOnSubscriptionOptions);
        sb.append(", addOnPackages=");
        return AbstractC0112b.m(sb, this.addOnPackages, ')');
    }
}
