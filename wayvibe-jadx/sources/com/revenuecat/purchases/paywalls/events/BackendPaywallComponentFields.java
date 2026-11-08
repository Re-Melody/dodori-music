package com.revenuecat.purchases.paywalls.events;

import B2.AbstractC0112b;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class BackendPaywallComponentFields {
    private final String componentName;
    private final String componentType;
    private final String componentUrl;
    private final String componentValue;
    private final String currentPackageIdentifier;
    private final String currentProductIdentifier;
    private final Integer defaultIndex;
    private final String defaultPackageIdentifier;
    private final String defaultProductIdentifier;
    private final String destinationContextName;
    private final Integer destinationIndex;
    private final String destinationPackageIdentifier;
    private final String destinationProductIdentifier;
    private final String originContextName;
    private final Integer originIndex;
    private final String originPackageIdentifier;
    private final String originProductIdentifier;
    private final String resultingPackageIdentifier;
    private final String resultingProductIdentifier;

    public BackendPaywallComponentFields() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public static /* synthetic */ BackendPaywallComponentFields copy$default(BackendPaywallComponentFields backendPaywallComponentFields, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, Integer num3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i10, Object obj) {
        String str17;
        String str18;
        String str19 = (i10 & 1) != 0 ? backendPaywallComponentFields.componentType : str;
        String str20 = (i10 & 2) != 0 ? backendPaywallComponentFields.componentName : str2;
        String str21 = (i10 & 4) != 0 ? backendPaywallComponentFields.componentValue : str3;
        String str22 = (i10 & 8) != 0 ? backendPaywallComponentFields.componentUrl : str4;
        Integer num4 = (i10 & 16) != 0 ? backendPaywallComponentFields.originIndex : num;
        Integer num5 = (i10 & 32) != 0 ? backendPaywallComponentFields.destinationIndex : num2;
        String str23 = (i10 & 64) != 0 ? backendPaywallComponentFields.originContextName : str5;
        String str24 = (i10 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0 ? backendPaywallComponentFields.destinationContextName : str6;
        Integer num6 = (i10 & 256) != 0 ? backendPaywallComponentFields.defaultIndex : num3;
        String str25 = (i10 & 512) != 0 ? backendPaywallComponentFields.originPackageIdentifier : str7;
        String str26 = (i10 & 1024) != 0 ? backendPaywallComponentFields.destinationPackageIdentifier : str8;
        String str27 = (i10 & 2048) != 0 ? backendPaywallComponentFields.defaultPackageIdentifier : str9;
        String str28 = (i10 & 4096) != 0 ? backendPaywallComponentFields.originProductIdentifier : str10;
        String str29 = (i10 & 8192) != 0 ? backendPaywallComponentFields.destinationProductIdentifier : str11;
        String str30 = str19;
        String str31 = (i10 & 16384) != 0 ? backendPaywallComponentFields.defaultProductIdentifier : str12;
        String str32 = (i10 & 32768) != 0 ? backendPaywallComponentFields.currentPackageIdentifier : str13;
        String str33 = (i10 & ETagPayloadStore.CHUNK_CHARS) != 0 ? backendPaywallComponentFields.resultingPackageIdentifier : str14;
        String str34 = (i10 & 131072) != 0 ? backendPaywallComponentFields.currentProductIdentifier : str15;
        if ((i10 & ETagPayloadStore.WRITE_BUFFER_BYTES) != 0) {
            str18 = str34;
            str17 = backendPaywallComponentFields.resultingProductIdentifier;
        } else {
            str17 = str16;
            str18 = str34;
        }
        return backendPaywallComponentFields.copy(str30, str20, str21, str22, num4, num5, str23, str24, num6, str25, str26, str27, str28, str29, str31, str32, str33, str18, str17);
    }

    public final String component1() {
        return this.componentType;
    }

    public final String component10() {
        return this.originPackageIdentifier;
    }

    public final String component11() {
        return this.destinationPackageIdentifier;
    }

    public final String component12() {
        return this.defaultPackageIdentifier;
    }

    public final String component13() {
        return this.originProductIdentifier;
    }

    public final String component14() {
        return this.destinationProductIdentifier;
    }

    public final String component15() {
        return this.defaultProductIdentifier;
    }

    public final String component16() {
        return this.currentPackageIdentifier;
    }

    public final String component17() {
        return this.resultingPackageIdentifier;
    }

    public final String component18() {
        return this.currentProductIdentifier;
    }

    public final String component19() {
        return this.resultingProductIdentifier;
    }

    public final String component2() {
        return this.componentName;
    }

    public final String component3() {
        return this.componentValue;
    }

    public final String component4() {
        return this.componentUrl;
    }

    public final Integer component5() {
        return this.originIndex;
    }

    public final Integer component6() {
        return this.destinationIndex;
    }

    public final String component7() {
        return this.originContextName;
    }

    public final String component8() {
        return this.destinationContextName;
    }

    public final Integer component9() {
        return this.defaultIndex;
    }

    public final BackendPaywallComponentFields copy(String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, Integer num3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        return new BackendPaywallComponentFields(str, str2, str3, str4, num, num2, str5, str6, num3, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackendPaywallComponentFields)) {
            return false;
        }
        BackendPaywallComponentFields backendPaywallComponentFields = (BackendPaywallComponentFields) obj;
        return m.b(this.componentType, backendPaywallComponentFields.componentType) && m.b(this.componentName, backendPaywallComponentFields.componentName) && m.b(this.componentValue, backendPaywallComponentFields.componentValue) && m.b(this.componentUrl, backendPaywallComponentFields.componentUrl) && m.b(this.originIndex, backendPaywallComponentFields.originIndex) && m.b(this.destinationIndex, backendPaywallComponentFields.destinationIndex) && m.b(this.originContextName, backendPaywallComponentFields.originContextName) && m.b(this.destinationContextName, backendPaywallComponentFields.destinationContextName) && m.b(this.defaultIndex, backendPaywallComponentFields.defaultIndex) && m.b(this.originPackageIdentifier, backendPaywallComponentFields.originPackageIdentifier) && m.b(this.destinationPackageIdentifier, backendPaywallComponentFields.destinationPackageIdentifier) && m.b(this.defaultPackageIdentifier, backendPaywallComponentFields.defaultPackageIdentifier) && m.b(this.originProductIdentifier, backendPaywallComponentFields.originProductIdentifier) && m.b(this.destinationProductIdentifier, backendPaywallComponentFields.destinationProductIdentifier) && m.b(this.defaultProductIdentifier, backendPaywallComponentFields.defaultProductIdentifier) && m.b(this.currentPackageIdentifier, backendPaywallComponentFields.currentPackageIdentifier) && m.b(this.resultingPackageIdentifier, backendPaywallComponentFields.resultingPackageIdentifier) && m.b(this.currentProductIdentifier, backendPaywallComponentFields.currentProductIdentifier) && m.b(this.resultingProductIdentifier, backendPaywallComponentFields.resultingProductIdentifier);
    }

    public final String getComponentName() {
        return this.componentName;
    }

    public final String getComponentType() {
        return this.componentType;
    }

    public final String getComponentUrl() {
        return this.componentUrl;
    }

    public final String getComponentValue() {
        return this.componentValue;
    }

    public final String getCurrentPackageIdentifier() {
        return this.currentPackageIdentifier;
    }

    public final String getCurrentProductIdentifier() {
        return this.currentProductIdentifier;
    }

    public final Integer getDefaultIndex() {
        return this.defaultIndex;
    }

    public final String getDefaultPackageIdentifier() {
        return this.defaultPackageIdentifier;
    }

    public final String getDefaultProductIdentifier() {
        return this.defaultProductIdentifier;
    }

    public final String getDestinationContextName() {
        return this.destinationContextName;
    }

    public final Integer getDestinationIndex() {
        return this.destinationIndex;
    }

    public final String getDestinationPackageIdentifier() {
        return this.destinationPackageIdentifier;
    }

    public final String getDestinationProductIdentifier() {
        return this.destinationProductIdentifier;
    }

    public final String getOriginContextName() {
        return this.originContextName;
    }

    public final Integer getOriginIndex() {
        return this.originIndex;
    }

    public final String getOriginPackageIdentifier() {
        return this.originPackageIdentifier;
    }

    public final String getOriginProductIdentifier() {
        return this.originProductIdentifier;
    }

    public final String getResultingPackageIdentifier() {
        return this.resultingPackageIdentifier;
    }

    public final String getResultingProductIdentifier() {
        return this.resultingProductIdentifier;
    }

    public int hashCode() {
        String str = this.componentType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.componentName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.componentValue;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.componentUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.originIndex;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.destinationIndex;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.originContextName;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.destinationContextName;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.defaultIndex;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.originPackageIdentifier;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.destinationPackageIdentifier;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.defaultPackageIdentifier;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.originProductIdentifier;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.destinationProductIdentifier;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.defaultProductIdentifier;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.currentPackageIdentifier;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.resultingPackageIdentifier;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.currentProductIdentifier;
        int iHashCode18 = (iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.resultingProductIdentifier;
        return iHashCode18 + (str16 != null ? str16.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BackendPaywallComponentFields(componentType=");
        sb.append(this.componentType);
        sb.append(", componentName=");
        sb.append(this.componentName);
        sb.append(", componentValue=");
        sb.append(this.componentValue);
        sb.append(", componentUrl=");
        sb.append(this.componentUrl);
        sb.append(", originIndex=");
        sb.append(this.originIndex);
        sb.append(", destinationIndex=");
        sb.append(this.destinationIndex);
        sb.append(", originContextName=");
        sb.append(this.originContextName);
        sb.append(", destinationContextName=");
        sb.append(this.destinationContextName);
        sb.append(", defaultIndex=");
        sb.append(this.defaultIndex);
        sb.append(", originPackageIdentifier=");
        sb.append(this.originPackageIdentifier);
        sb.append(", destinationPackageIdentifier=");
        sb.append(this.destinationPackageIdentifier);
        sb.append(", defaultPackageIdentifier=");
        sb.append(this.defaultPackageIdentifier);
        sb.append(", originProductIdentifier=");
        sb.append(this.originProductIdentifier);
        sb.append(", destinationProductIdentifier=");
        sb.append(this.destinationProductIdentifier);
        sb.append(", defaultProductIdentifier=");
        sb.append(this.defaultProductIdentifier);
        sb.append(", currentPackageIdentifier=");
        sb.append(this.currentPackageIdentifier);
        sb.append(", resultingPackageIdentifier=");
        sb.append(this.resultingPackageIdentifier);
        sb.append(", currentProductIdentifier=");
        sb.append(this.currentProductIdentifier);
        sb.append(", resultingProductIdentifier=");
        return AbstractC0112b.j(sb, this.resultingProductIdentifier, ')');
    }

    public BackendPaywallComponentFields(String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, Integer num3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.componentType = str;
        this.componentName = str2;
        this.componentValue = str3;
        this.componentUrl = str4;
        this.originIndex = num;
        this.destinationIndex = num2;
        this.originContextName = str5;
        this.destinationContextName = str6;
        this.defaultIndex = num3;
        this.originPackageIdentifier = str7;
        this.destinationPackageIdentifier = str8;
        this.defaultPackageIdentifier = str9;
        this.originProductIdentifier = str10;
        this.destinationProductIdentifier = str11;
        this.defaultProductIdentifier = str12;
        this.currentPackageIdentifier = str13;
        this.resultingPackageIdentifier = str14;
        this.currentProductIdentifier = str15;
        this.resultingProductIdentifier = str16;
    }

    public /* synthetic */ BackendPaywallComponentFields(String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, Integer num3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : num2, (i10 & 64) != 0 ? null : str5, (i10 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0 ? null : str6, (i10 & 256) != 0 ? null : num3, (i10 & 512) != 0 ? null : str7, (i10 & 1024) != 0 ? null : str8, (i10 & 2048) != 0 ? null : str9, (i10 & 4096) != 0 ? null : str10, (i10 & 8192) != 0 ? null : str11, (i10 & 16384) != 0 ? null : str12, (i10 & 32768) != 0 ? null : str13, (i10 & ETagPayloadStore.CHUNK_CHARS) != 0 ? null : str14, (i10 & 131072) != 0 ? null : str15, (i10 & ETagPayloadStore.WRITE_BUFFER_BYTES) != 0 ? null : str16);
    }
}
