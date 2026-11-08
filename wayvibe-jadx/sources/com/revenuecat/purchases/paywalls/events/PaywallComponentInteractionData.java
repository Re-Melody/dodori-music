package com.revenuecat.purchases.paywalls.events;

import B2.AbstractC0112b;
import M8.InterfaceC0641c;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p260y9.E;
import p260y9.O;
import p260y9.Y;
import p260y9.c0;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class PaywallComponentInteractionData {
    private final String componentName;
    private final PaywallComponentType componentType;
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
    public static final Companion Companion = new Companion(null);
    private static final a[] $childSerializers = {PaywallComponentType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return PaywallComponentInteractionData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC0641c
    public /* synthetic */ PaywallComponentInteractionData(int i10, PaywallComponentType paywallComponentType, String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, Integer num3, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Y y6) {
        if (5 != (i10 & 5)) {
            O.g(i10, 5, PaywallComponentInteractionData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.componentType = paywallComponentType;
        if ((i10 & 2) == 0) {
            this.componentName = null;
        } else {
            this.componentName = str;
        }
        this.componentValue = str2;
        if ((i10 & 8) == 0) {
            this.componentUrl = null;
        } else {
            this.componentUrl = str3;
        }
        if ((i10 & 16) == 0) {
            this.originIndex = null;
        } else {
            this.originIndex = num;
        }
        if ((i10 & 32) == 0) {
            this.destinationIndex = null;
        } else {
            this.destinationIndex = num2;
        }
        if ((i10 & 64) == 0) {
            this.originContextName = null;
        } else {
            this.originContextName = str4;
        }
        if ((i10 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) == 0) {
            this.destinationContextName = null;
        } else {
            this.destinationContextName = str5;
        }
        if ((i10 & 256) == 0) {
            this.defaultIndex = null;
        } else {
            this.defaultIndex = num3;
        }
        if ((i10 & 512) == 0) {
            this.originPackageIdentifier = null;
        } else {
            this.originPackageIdentifier = str6;
        }
        if ((i10 & 1024) == 0) {
            this.destinationPackageIdentifier = null;
        } else {
            this.destinationPackageIdentifier = str7;
        }
        if ((i10 & 2048) == 0) {
            this.defaultPackageIdentifier = null;
        } else {
            this.defaultPackageIdentifier = str8;
        }
        if ((i10 & 4096) == 0) {
            this.originProductIdentifier = null;
        } else {
            this.originProductIdentifier = str9;
        }
        if ((i10 & 8192) == 0) {
            this.destinationProductIdentifier = null;
        } else {
            this.destinationProductIdentifier = str10;
        }
        if ((i10 & 16384) == 0) {
            this.defaultProductIdentifier = null;
        } else {
            this.defaultProductIdentifier = str11;
        }
        if ((32768 & i10) == 0) {
            this.currentPackageIdentifier = null;
        } else {
            this.currentPackageIdentifier = str12;
        }
        if ((65536 & i10) == 0) {
            this.resultingPackageIdentifier = null;
        } else {
            this.resultingPackageIdentifier = str13;
        }
        if ((131072 & i10) == 0) {
            this.currentProductIdentifier = null;
        } else {
            this.currentProductIdentifier = str14;
        }
        if ((i10 & ETagPayloadStore.WRITE_BUFFER_BYTES) == 0) {
            this.resultingProductIdentifier = null;
        } else {
            this.resultingProductIdentifier = str15;
        }
    }

    public static /* synthetic */ PaywallComponentInteractionData copy$default(PaywallComponentInteractionData paywallComponentInteractionData, PaywallComponentType paywallComponentType, String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, Integer num3, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i10, Object obj) {
        String str16;
        String str17;
        PaywallComponentType paywallComponentType2 = (i10 & 1) != 0 ? paywallComponentInteractionData.componentType : paywallComponentType;
        String str18 = (i10 & 2) != 0 ? paywallComponentInteractionData.componentName : str;
        String str19 = (i10 & 4) != 0 ? paywallComponentInteractionData.componentValue : str2;
        String str20 = (i10 & 8) != 0 ? paywallComponentInteractionData.componentUrl : str3;
        Integer num4 = (i10 & 16) != 0 ? paywallComponentInteractionData.originIndex : num;
        Integer num5 = (i10 & 32) != 0 ? paywallComponentInteractionData.destinationIndex : num2;
        String str21 = (i10 & 64) != 0 ? paywallComponentInteractionData.originContextName : str4;
        String str22 = (i10 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0 ? paywallComponentInteractionData.destinationContextName : str5;
        Integer num6 = (i10 & 256) != 0 ? paywallComponentInteractionData.defaultIndex : num3;
        String str23 = (i10 & 512) != 0 ? paywallComponentInteractionData.originPackageIdentifier : str6;
        String str24 = (i10 & 1024) != 0 ? paywallComponentInteractionData.destinationPackageIdentifier : str7;
        String str25 = (i10 & 2048) != 0 ? paywallComponentInteractionData.defaultPackageIdentifier : str8;
        String str26 = (i10 & 4096) != 0 ? paywallComponentInteractionData.originProductIdentifier : str9;
        String str27 = (i10 & 8192) != 0 ? paywallComponentInteractionData.destinationProductIdentifier : str10;
        PaywallComponentType paywallComponentType3 = paywallComponentType2;
        String str28 = (i10 & 16384) != 0 ? paywallComponentInteractionData.defaultProductIdentifier : str11;
        String str29 = (i10 & 32768) != 0 ? paywallComponentInteractionData.currentPackageIdentifier : str12;
        String str30 = (i10 & ETagPayloadStore.CHUNK_CHARS) != 0 ? paywallComponentInteractionData.resultingPackageIdentifier : str13;
        String str31 = (i10 & 131072) != 0 ? paywallComponentInteractionData.currentProductIdentifier : str14;
        if ((i10 & ETagPayloadStore.WRITE_BUFFER_BYTES) != 0) {
            str17 = str31;
            str16 = paywallComponentInteractionData.resultingProductIdentifier;
        } else {
            str16 = str15;
            str17 = str31;
        }
        return paywallComponentInteractionData.copy(paywallComponentType3, str18, str19, str20, num4, num5, str21, str22, num6, str23, str24, str25, str26, str27, str28, str29, str30, str17, str16);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(PaywallComponentInteractionData paywallComponentInteractionData, b bVar, g gVar) {
        bVar.m(gVar, 0, $childSerializers[0], paywallComponentInteractionData.componentType);
        if (bVar.l(gVar) || paywallComponentInteractionData.componentName != null) {
            bVar.t(gVar, 1, c0.f29272a, paywallComponentInteractionData.componentName);
        }
        bVar.u(gVar, 2, paywallComponentInteractionData.componentValue);
        if (bVar.l(gVar) || paywallComponentInteractionData.componentUrl != null) {
            bVar.t(gVar, 3, c0.f29272a, paywallComponentInteractionData.componentUrl);
        }
        if (bVar.l(gVar) || paywallComponentInteractionData.originIndex != null) {
            bVar.t(gVar, 4, E.f29225a, paywallComponentInteractionData.originIndex);
        }
        if (bVar.l(gVar) || paywallComponentInteractionData.destinationIndex != null) {
            bVar.t(gVar, 5, E.f29225a, paywallComponentInteractionData.destinationIndex);
        }
        if (bVar.l(gVar) || paywallComponentInteractionData.originContextName != null) {
            bVar.t(gVar, 6, c0.f29272a, paywallComponentInteractionData.originContextName);
        }
        if (bVar.l(gVar) || paywallComponentInteractionData.destinationContextName != null) {
            bVar.t(gVar, 7, c0.f29272a, paywallComponentInteractionData.destinationContextName);
        }
        if (bVar.l(gVar) || paywallComponentInteractionData.defaultIndex != null) {
            bVar.t(gVar, 8, E.f29225a, paywallComponentInteractionData.defaultIndex);
        }
        if (bVar.l(gVar) || paywallComponentInteractionData.originPackageIdentifier != null) {
            bVar.t(gVar, 9, c0.f29272a, paywallComponentInteractionData.originPackageIdentifier);
        }
        if (bVar.l(gVar) || paywallComponentInteractionData.destinationPackageIdentifier != null) {
            bVar.t(gVar, 10, c0.f29272a, paywallComponentInteractionData.destinationPackageIdentifier);
        }
        if (bVar.l(gVar) || paywallComponentInteractionData.defaultPackageIdentifier != null) {
            bVar.t(gVar, 11, c0.f29272a, paywallComponentInteractionData.defaultPackageIdentifier);
        }
        if (bVar.l(gVar) || paywallComponentInteractionData.originProductIdentifier != null) {
            bVar.t(gVar, 12, c0.f29272a, paywallComponentInteractionData.originProductIdentifier);
        }
        if (bVar.l(gVar) || paywallComponentInteractionData.destinationProductIdentifier != null) {
            bVar.t(gVar, 13, c0.f29272a, paywallComponentInteractionData.destinationProductIdentifier);
        }
        if (bVar.l(gVar) || paywallComponentInteractionData.defaultProductIdentifier != null) {
            bVar.t(gVar, 14, c0.f29272a, paywallComponentInteractionData.defaultProductIdentifier);
        }
        if (bVar.l(gVar) || paywallComponentInteractionData.currentPackageIdentifier != null) {
            bVar.t(gVar, 15, c0.f29272a, paywallComponentInteractionData.currentPackageIdentifier);
        }
        if (bVar.l(gVar) || paywallComponentInteractionData.resultingPackageIdentifier != null) {
            bVar.t(gVar, 16, c0.f29272a, paywallComponentInteractionData.resultingPackageIdentifier);
        }
        if (bVar.l(gVar) || paywallComponentInteractionData.currentProductIdentifier != null) {
            bVar.t(gVar, 17, c0.f29272a, paywallComponentInteractionData.currentProductIdentifier);
        }
        if (!bVar.l(gVar) && paywallComponentInteractionData.resultingProductIdentifier == null) {
            return;
        }
        bVar.t(gVar, 18, c0.f29272a, paywallComponentInteractionData.resultingProductIdentifier);
    }

    public final PaywallComponentType component1() {
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

    public final PaywallComponentInteractionData copy(PaywallComponentType componentType, String str, String componentValue, String str2, Integer num, Integer num2, String str3, String str4, Integer num3, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        m.f(componentType, "componentType");
        m.f(componentValue, "componentValue");
        return new PaywallComponentInteractionData(componentType, str, componentValue, str2, num, num2, str3, str4, num3, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallComponentInteractionData)) {
            return false;
        }
        PaywallComponentInteractionData paywallComponentInteractionData = (PaywallComponentInteractionData) obj;
        return this.componentType == paywallComponentInteractionData.componentType && m.b(this.componentName, paywallComponentInteractionData.componentName) && m.b(this.componentValue, paywallComponentInteractionData.componentValue) && m.b(this.componentUrl, paywallComponentInteractionData.componentUrl) && m.b(this.originIndex, paywallComponentInteractionData.originIndex) && m.b(this.destinationIndex, paywallComponentInteractionData.destinationIndex) && m.b(this.originContextName, paywallComponentInteractionData.originContextName) && m.b(this.destinationContextName, paywallComponentInteractionData.destinationContextName) && m.b(this.defaultIndex, paywallComponentInteractionData.defaultIndex) && m.b(this.originPackageIdentifier, paywallComponentInteractionData.originPackageIdentifier) && m.b(this.destinationPackageIdentifier, paywallComponentInteractionData.destinationPackageIdentifier) && m.b(this.defaultPackageIdentifier, paywallComponentInteractionData.defaultPackageIdentifier) && m.b(this.originProductIdentifier, paywallComponentInteractionData.originProductIdentifier) && m.b(this.destinationProductIdentifier, paywallComponentInteractionData.destinationProductIdentifier) && m.b(this.defaultProductIdentifier, paywallComponentInteractionData.defaultProductIdentifier) && m.b(this.currentPackageIdentifier, paywallComponentInteractionData.currentPackageIdentifier) && m.b(this.resultingPackageIdentifier, paywallComponentInteractionData.resultingPackageIdentifier) && m.b(this.currentProductIdentifier, paywallComponentInteractionData.currentProductIdentifier) && m.b(this.resultingProductIdentifier, paywallComponentInteractionData.resultingProductIdentifier);
    }

    public final String getComponentName() {
        return this.componentName;
    }

    public final PaywallComponentType getComponentType() {
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
        int iHashCode = this.componentType.hashCode() * 31;
        String str = this.componentName;
        int iA = AbstractC0112b.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.componentValue);
        String str2 = this.componentUrl;
        int iHashCode2 = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.originIndex;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.destinationIndex;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.originContextName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.destinationContextName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.defaultIndex;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.originPackageIdentifier;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.destinationPackageIdentifier;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.defaultPackageIdentifier;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.originProductIdentifier;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.destinationProductIdentifier;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.defaultProductIdentifier;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.currentPackageIdentifier;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.resultingPackageIdentifier;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.currentProductIdentifier;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.resultingProductIdentifier;
        return iHashCode16 + (str14 != null ? str14.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaywallComponentInteractionData(componentType=");
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

    public PaywallComponentInteractionData(PaywallComponentType componentType, String str, String componentValue, String str2, Integer num, Integer num2, String str3, String str4, Integer num3, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        m.f(componentType, "componentType");
        m.f(componentValue, "componentValue");
        this.componentType = componentType;
        this.componentName = str;
        this.componentValue = componentValue;
        this.componentUrl = str2;
        this.originIndex = num;
        this.destinationIndex = num2;
        this.originContextName = str3;
        this.destinationContextName = str4;
        this.defaultIndex = num3;
        this.originPackageIdentifier = str5;
        this.destinationPackageIdentifier = str6;
        this.defaultPackageIdentifier = str7;
        this.originProductIdentifier = str8;
        this.destinationProductIdentifier = str9;
        this.defaultProductIdentifier = str10;
        this.currentPackageIdentifier = str11;
        this.resultingPackageIdentifier = str12;
        this.currentProductIdentifier = str13;
        this.resultingProductIdentifier = str14;
    }

    public /* synthetic */ PaywallComponentInteractionData(PaywallComponentType paywallComponentType, String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, Integer num3, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i10, f fVar) {
        this(paywallComponentType, (i10 & 2) != 0 ? null : str, str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : num2, (i10 & 64) != 0 ? null : str4, (i10 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0 ? null : str5, (i10 & 256) != 0 ? null : num3, (i10 & 512) != 0 ? null : str6, (i10 & 1024) != 0 ? null : str7, (i10 & 2048) != 0 ? null : str8, (i10 & 4096) != 0 ? null : str9, (i10 & 8192) != 0 ? null : str10, (i10 & 16384) != 0 ? null : str11, (32768 & i10) != 0 ? null : str12, (65536 & i10) != 0 ? null : str13, (131072 & i10) != 0 ? null : str14, (i10 & ETagPayloadStore.WRITE_BUFFER_BYTES) != 0 ? null : str15);
    }
}
