package com.revenuecat.purchases.ads.events;

import com.revenuecat.purchases.VerifiedReward;
import com.revenuecat.purchases.ads.events.types.AdRewardFailureReason;
import com.revenuecat.purchases.common.events.FeatureEvent;
import java.util.UUID;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public interface AdEvent extends FeatureEvent {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean isPriorityEvent(AdEvent adEvent) {
            return AdEvent.super.isPriorityEvent();
        }
    }

    public static final class Displayed implements AdEvent {
        private final String adFormat;
        private final String adUnitId;
        private final AdCaptureMethod captureMethod;
        private final int eventVersion;
        private final String id;
        private final String impressionId;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final long timestamp;
        private final AdEventType type;

        public /* synthetic */ Displayed(String str, int i10, AdEventType adEventType, long j10, String str2, String str3, String str4, String str5, String str6, String str7, AdCaptureMethod adCaptureMethod, f fVar) {
            this(str, i10, adEventType, j10, str2, str3, str4, str5, str6, str7, adCaptureMethod);
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getAdFormat-y0COY5Q */
        public String mo86getAdFormaty0COY5Q() {
            return this.adFormat;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getAdUnitId() {
            return this.adUnitId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdCaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public int getEventVersion() {
            return this.eventVersion;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getId() {
            return this.id;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getImpressionId() {
            return this.impressionId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getMediatorName-GyoM_N4 */
        public String mo87getMediatorNameGyoM_N4() {
            return this.mediatorName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getNetworkName() {
            return this.networkName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getPlacement() {
            return this.placement;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdEventType getType() {
            return this.type;
        }

        private Displayed(String id, int i10, AdEventType type, long j10, String str, String mediatorName, String adFormat, String str2, String adUnitId, String impressionId, AdCaptureMethod captureMethod) {
            m.f(id, "id");
            m.f(type, "type");
            m.f(mediatorName, "mediatorName");
            m.f(adFormat, "adFormat");
            m.f(adUnitId, "adUnitId");
            m.f(impressionId, "impressionId");
            m.f(captureMethod, "captureMethod");
            this.id = id;
            this.eventVersion = i10;
            this.type = type;
            this.timestamp = j10;
            this.networkName = str;
            this.mediatorName = mediatorName;
            this.adFormat = adFormat;
            this.placement = str2;
            this.adUnitId = adUnitId;
            this.impressionId = impressionId;
            this.captureMethod = captureMethod;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Displayed(String str, int i10, AdEventType adEventType, long j10, String str2, String str3, String str4, String str5, String str6, String str7, AdCaptureMethod adCaptureMethod, int i11, f fVar) {
            String str8;
            if ((i11 & 1) != 0) {
                String string = UUID.randomUUID().toString();
                m.e(string, "randomUUID().toString()");
                str8 = string;
            } else {
                str8 = str;
            }
            this(str8, (i11 & 2) != 0 ? 1 : i10, (i11 & 4) != 0 ? AdEventType.DISPLAYED : adEventType, (i11 & 8) != 0 ? System.currentTimeMillis() : j10, str2, str3, str4, str5, str6, str7, adCaptureMethod, null);
        }
    }

    public static final class FailedToLoad implements AdEvent {
        private final String adFormat;
        private final String adUnitId;
        private final AdCaptureMethod captureMethod;
        private final int eventVersion;
        private final String id;
        private final String impressionId;
        private final Integer mediatorErrorCode;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final long timestamp;
        private final AdEventType type;

        public /* synthetic */ FailedToLoad(String str, int i10, AdEventType adEventType, long j10, String str2, String str3, String str4, String str5, String str6, AdCaptureMethod adCaptureMethod, Integer num, f fVar) {
            this(str, i10, adEventType, j10, str2, str3, str4, str5, str6, adCaptureMethod, num);
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getAdFormat-y0COY5Q */
        public String mo86getAdFormaty0COY5Q() {
            return this.adFormat;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getAdUnitId() {
            return this.adUnitId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdCaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public int getEventVersion() {
            return this.eventVersion;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getId() {
            return this.id;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getImpressionId() {
            return this.impressionId;
        }

        public final Integer getMediatorErrorCode() {
            return this.mediatorErrorCode;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getMediatorName-GyoM_N4 */
        public String mo87getMediatorNameGyoM_N4() {
            return this.mediatorName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getNetworkName() {
            return this.networkName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getPlacement() {
            return this.placement;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdEventType getType() {
            return this.type;
        }

        private FailedToLoad(String id, int i10, AdEventType type, long j10, String mediatorName, String adFormat, String str, String adUnitId, String str2, AdCaptureMethod captureMethod, Integer num) {
            m.f(id, "id");
            m.f(type, "type");
            m.f(mediatorName, "mediatorName");
            m.f(adFormat, "adFormat");
            m.f(adUnitId, "adUnitId");
            m.f(captureMethod, "captureMethod");
            this.id = id;
            this.eventVersion = i10;
            this.type = type;
            this.timestamp = j10;
            this.mediatorName = mediatorName;
            this.adFormat = adFormat;
            this.placement = str;
            this.adUnitId = adUnitId;
            this.impressionId = str2;
            this.captureMethod = captureMethod;
            this.mediatorErrorCode = num;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ FailedToLoad(String str, int i10, AdEventType adEventType, long j10, String str2, String str3, String str4, String str5, String str6, AdCaptureMethod adCaptureMethod, Integer num, int i11, f fVar) {
            String str7;
            if ((i11 & 1) != 0) {
                String string = UUID.randomUUID().toString();
                m.e(string, "randomUUID().toString()");
                str7 = string;
            } else {
                str7 = str;
            }
            this(str7, (i11 & 2) != 0 ? 1 : i10, (i11 & 4) != 0 ? AdEventType.FAILED_TO_LOAD : adEventType, (i11 & 8) != 0 ? System.currentTimeMillis() : j10, str2, str3, str4, str5, (i11 & 256) != 0 ? null : str6, adCaptureMethod, num, null);
        }
    }

    public static final class Loaded implements AdEvent {
        private final String adFormat;
        private final String adUnitId;
        private final AdCaptureMethod captureMethod;
        private final int eventVersion;
        private final String id;
        private final String impressionId;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final long timestamp;
        private final AdEventType type;

        public /* synthetic */ Loaded(String str, int i10, AdEventType adEventType, long j10, String str2, String str3, String str4, String str5, String str6, String str7, AdCaptureMethod adCaptureMethod, f fVar) {
            this(str, i10, adEventType, j10, str2, str3, str4, str5, str6, str7, adCaptureMethod);
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getAdFormat-y0COY5Q */
        public String mo86getAdFormaty0COY5Q() {
            return this.adFormat;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getAdUnitId() {
            return this.adUnitId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdCaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public int getEventVersion() {
            return this.eventVersion;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getId() {
            return this.id;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getImpressionId() {
            return this.impressionId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getMediatorName-GyoM_N4 */
        public String mo87getMediatorNameGyoM_N4() {
            return this.mediatorName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getNetworkName() {
            return this.networkName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getPlacement() {
            return this.placement;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdEventType getType() {
            return this.type;
        }

        private Loaded(String id, int i10, AdEventType type, long j10, String str, String mediatorName, String adFormat, String str2, String adUnitId, String impressionId, AdCaptureMethod captureMethod) {
            m.f(id, "id");
            m.f(type, "type");
            m.f(mediatorName, "mediatorName");
            m.f(adFormat, "adFormat");
            m.f(adUnitId, "adUnitId");
            m.f(impressionId, "impressionId");
            m.f(captureMethod, "captureMethod");
            this.id = id;
            this.eventVersion = i10;
            this.type = type;
            this.timestamp = j10;
            this.networkName = str;
            this.mediatorName = mediatorName;
            this.adFormat = adFormat;
            this.placement = str2;
            this.adUnitId = adUnitId;
            this.impressionId = impressionId;
            this.captureMethod = captureMethod;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Loaded(String str, int i10, AdEventType adEventType, long j10, String str2, String str3, String str4, String str5, String str6, String str7, AdCaptureMethod adCaptureMethod, int i11, f fVar) {
            String str8;
            if ((i11 & 1) != 0) {
                String string = UUID.randomUUID().toString();
                m.e(string, "randomUUID().toString()");
                str8 = string;
            } else {
                str8 = str;
            }
            this(str8, (i11 & 2) != 0 ? 1 : i10, (i11 & 4) != 0 ? AdEventType.LOADED : adEventType, (i11 & 8) != 0 ? System.currentTimeMillis() : j10, str2, str3, str4, str5, str6, str7, adCaptureMethod, null);
        }
    }

    public static final class Open implements AdEvent {
        private final String adFormat;
        private final String adUnitId;
        private final AdCaptureMethod captureMethod;
        private final int eventVersion;
        private final String id;
        private final String impressionId;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final long timestamp;
        private final AdEventType type;

        public /* synthetic */ Open(String str, int i10, AdEventType adEventType, long j10, String str2, String str3, String str4, String str5, String str6, String str7, AdCaptureMethod adCaptureMethod, f fVar) {
            this(str, i10, adEventType, j10, str2, str3, str4, str5, str6, str7, adCaptureMethod);
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getAdFormat-y0COY5Q */
        public String mo86getAdFormaty0COY5Q() {
            return this.adFormat;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getAdUnitId() {
            return this.adUnitId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdCaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public int getEventVersion() {
            return this.eventVersion;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getId() {
            return this.id;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getImpressionId() {
            return this.impressionId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getMediatorName-GyoM_N4 */
        public String mo87getMediatorNameGyoM_N4() {
            return this.mediatorName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getNetworkName() {
            return this.networkName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getPlacement() {
            return this.placement;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdEventType getType() {
            return this.type;
        }

        private Open(String id, int i10, AdEventType type, long j10, String str, String mediatorName, String adFormat, String str2, String adUnitId, String impressionId, AdCaptureMethod captureMethod) {
            m.f(id, "id");
            m.f(type, "type");
            m.f(mediatorName, "mediatorName");
            m.f(adFormat, "adFormat");
            m.f(adUnitId, "adUnitId");
            m.f(impressionId, "impressionId");
            m.f(captureMethod, "captureMethod");
            this.id = id;
            this.eventVersion = i10;
            this.type = type;
            this.timestamp = j10;
            this.networkName = str;
            this.mediatorName = mediatorName;
            this.adFormat = adFormat;
            this.placement = str2;
            this.adUnitId = adUnitId;
            this.impressionId = impressionId;
            this.captureMethod = captureMethod;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Open(String str, int i10, AdEventType adEventType, long j10, String str2, String str3, String str4, String str5, String str6, String str7, AdCaptureMethod adCaptureMethod, int i11, f fVar) {
            String str8;
            if ((i11 & 1) != 0) {
                String string = UUID.randomUUID().toString();
                m.e(string, "randomUUID().toString()");
                str8 = string;
            } else {
                str8 = str;
            }
            this(str8, (i11 & 2) != 0 ? 1 : i10, (i11 & 4) != 0 ? AdEventType.OPENED : adEventType, (i11 & 8) != 0 ? System.currentTimeMillis() : j10, str2, str3, str4, str5, str6, str7, adCaptureMethod, null);
        }
    }

    public static final class Revenue implements AdEvent {
        private final String adFormat;
        private final String adUnitId;
        private final AdCaptureMethod captureMethod;
        private final String currency;
        private final int eventVersion;
        private final String id;
        private final String impressionId;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final String precision;
        private final long revenueMicros;
        private final long timestamp;
        private final AdEventType type;

        public /* synthetic */ Revenue(String str, int i10, AdEventType adEventType, long j10, String str2, String str3, String str4, String str5, String str6, String str7, AdCaptureMethod adCaptureMethod, long j11, String str8, String str9, f fVar) {
            this(str, i10, adEventType, j10, str2, str3, str4, str5, str6, str7, adCaptureMethod, j11, str8, str9);
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getAdFormat-y0COY5Q */
        public String mo86getAdFormaty0COY5Q() {
            return this.adFormat;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getAdUnitId() {
            return this.adUnitId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdCaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        public final String getCurrency() {
            return this.currency;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public int getEventVersion() {
            return this.eventVersion;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getId() {
            return this.id;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getImpressionId() {
            return this.impressionId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getMediatorName-GyoM_N4 */
        public String mo87getMediatorNameGyoM_N4() {
            return this.mediatorName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getNetworkName() {
            return this.networkName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getPlacement() {
            return this.placement;
        }

        /* JADX INFO: renamed from: getPrecision-rAcPn4k, reason: not valid java name */
        public final String m88getPrecisionrAcPn4k() {
            return this.precision;
        }

        public final long getRevenueMicros() {
            return this.revenueMicros;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdEventType getType() {
            return this.type;
        }

        private Revenue(String id, int i10, AdEventType type, long j10, String str, String mediatorName, String adFormat, String str2, String adUnitId, String impressionId, AdCaptureMethod captureMethod, long j11, String currency, String precision) {
            m.f(id, "id");
            m.f(type, "type");
            m.f(mediatorName, "mediatorName");
            m.f(adFormat, "adFormat");
            m.f(adUnitId, "adUnitId");
            m.f(impressionId, "impressionId");
            m.f(captureMethod, "captureMethod");
            m.f(currency, "currency");
            m.f(precision, "precision");
            this.id = id;
            this.eventVersion = i10;
            this.type = type;
            this.timestamp = j10;
            this.networkName = str;
            this.mediatorName = mediatorName;
            this.adFormat = adFormat;
            this.placement = str2;
            this.adUnitId = adUnitId;
            this.impressionId = impressionId;
            this.captureMethod = captureMethod;
            this.revenueMicros = j11;
            this.currency = currency;
            this.precision = precision;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Revenue(String str, int i10, AdEventType adEventType, long j10, String str2, String str3, String str4, String str5, String str6, String str7, AdCaptureMethod adCaptureMethod, long j11, String str8, String str9, int i11, f fVar) {
            String str10;
            if ((i11 & 1) != 0) {
                String string = UUID.randomUUID().toString();
                m.e(string, "randomUUID().toString()");
                str10 = string;
            } else {
                str10 = str;
            }
            this(str10, (i11 & 2) != 0 ? 1 : i10, (i11 & 4) != 0 ? AdEventType.REVENUE : adEventType, (i11 & 8) != 0 ? System.currentTimeMillis() : j10, str2, str3, str4, str5, str6, str7, adCaptureMethod, j11, str8, str9, null);
        }
    }

    public static final class RewardEarnedUnverified implements AdEvent {
        private final String adFormat;
        private final String adUnitId;
        private final AdCaptureMethod captureMethod;
        private final int eventVersion;
        private final String id;
        private final String impressionId;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final boolean rewardVerificationEnabled;
        private final long timestamp;
        private final AdEventType type;

        public /* synthetic */ RewardEarnedUnverified(String str, int i10, AdEventType adEventType, long j10, String str2, String str3, String str4, String str5, String str6, String str7, AdCaptureMethod adCaptureMethod, boolean z10, f fVar) {
            this(str, i10, adEventType, j10, str2, str3, str4, str5, str6, str7, adCaptureMethod, z10);
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getAdFormat-y0COY5Q */
        public String mo86getAdFormaty0COY5Q() {
            return this.adFormat;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getAdUnitId() {
            return this.adUnitId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdCaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public int getEventVersion() {
            return this.eventVersion;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getId() {
            return this.id;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getImpressionId() {
            return this.impressionId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getMediatorName-GyoM_N4 */
        public String mo87getMediatorNameGyoM_N4() {
            return this.mediatorName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getNetworkName() {
            return this.networkName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getPlacement() {
            return this.placement;
        }

        public final boolean getRewardVerificationEnabled() {
            return this.rewardVerificationEnabled;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdEventType getType() {
            return this.type;
        }

        private RewardEarnedUnverified(String id, int i10, AdEventType type, long j10, String str, String mediatorName, String adFormat, String str2, String adUnitId, String impressionId, AdCaptureMethod captureMethod, boolean z10) {
            m.f(id, "id");
            m.f(type, "type");
            m.f(mediatorName, "mediatorName");
            m.f(adFormat, "adFormat");
            m.f(adUnitId, "adUnitId");
            m.f(impressionId, "impressionId");
            m.f(captureMethod, "captureMethod");
            this.id = id;
            this.eventVersion = i10;
            this.type = type;
            this.timestamp = j10;
            this.networkName = str;
            this.mediatorName = mediatorName;
            this.adFormat = adFormat;
            this.placement = str2;
            this.adUnitId = adUnitId;
            this.impressionId = impressionId;
            this.captureMethod = captureMethod;
            this.rewardVerificationEnabled = z10;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ RewardEarnedUnverified(String str, int i10, AdEventType adEventType, long j10, String str2, String str3, String str4, String str5, String str6, String str7, AdCaptureMethod adCaptureMethod, boolean z10, int i11, f fVar) {
            String str8;
            if ((i11 & 1) != 0) {
                String string = UUID.randomUUID().toString();
                m.e(string, "randomUUID().toString()");
                str8 = string;
            } else {
                str8 = str;
            }
            this(str8, (i11 & 2) != 0 ? 1 : i10, (i11 & 4) != 0 ? AdEventType.REWARD_EARNED_UNVERIFIED : adEventType, (i11 & 8) != 0 ? System.currentTimeMillis() : j10, str2, str3, str4, str5, str6, str7, adCaptureMethod, z10, null);
        }
    }

    public static final class RewardFailedToVerify implements AdEvent {
        private final String adFormat;
        private final String adUnitId;
        private final AdCaptureMethod captureMethod;
        private final int eventVersion;
        private final AdRewardFailureReason failureReason;
        private final String id;
        private final String impressionId;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final long timestamp;
        private final AdEventType type;

        public /* synthetic */ RewardFailedToVerify(String str, int i10, AdEventType adEventType, long j10, String str2, String str3, String str4, String str5, String str6, String str7, AdCaptureMethod adCaptureMethod, AdRewardFailureReason adRewardFailureReason, f fVar) {
            this(str, i10, adEventType, j10, str2, str3, str4, str5, str6, str7, adCaptureMethod, adRewardFailureReason);
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getAdFormat-y0COY5Q */
        public String mo86getAdFormaty0COY5Q() {
            return this.adFormat;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getAdUnitId() {
            return this.adUnitId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdCaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public int getEventVersion() {
            return this.eventVersion;
        }

        public final AdRewardFailureReason getFailureReason() {
            return this.failureReason;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getId() {
            return this.id;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getImpressionId() {
            return this.impressionId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getMediatorName-GyoM_N4 */
        public String mo87getMediatorNameGyoM_N4() {
            return this.mediatorName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getNetworkName() {
            return this.networkName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getPlacement() {
            return this.placement;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdEventType getType() {
            return this.type;
        }

        private RewardFailedToVerify(String id, int i10, AdEventType type, long j10, String str, String mediatorName, String adFormat, String str2, String adUnitId, String impressionId, AdCaptureMethod captureMethod, AdRewardFailureReason failureReason) {
            m.f(id, "id");
            m.f(type, "type");
            m.f(mediatorName, "mediatorName");
            m.f(adFormat, "adFormat");
            m.f(adUnitId, "adUnitId");
            m.f(impressionId, "impressionId");
            m.f(captureMethod, "captureMethod");
            m.f(failureReason, "failureReason");
            this.id = id;
            this.eventVersion = i10;
            this.type = type;
            this.timestamp = j10;
            this.networkName = str;
            this.mediatorName = mediatorName;
            this.adFormat = adFormat;
            this.placement = str2;
            this.adUnitId = adUnitId;
            this.impressionId = impressionId;
            this.captureMethod = captureMethod;
            this.failureReason = failureReason;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ RewardFailedToVerify(String str, int i10, AdEventType adEventType, long j10, String str2, String str3, String str4, String str5, String str6, String str7, AdCaptureMethod adCaptureMethod, AdRewardFailureReason adRewardFailureReason, int i11, f fVar) {
            String str8;
            if ((i11 & 1) != 0) {
                String string = UUID.randomUUID().toString();
                m.e(string, "randomUUID().toString()");
                str8 = string;
            } else {
                str8 = str;
            }
            this(str8, (i11 & 2) != 0 ? 1 : i10, (i11 & 4) != 0 ? AdEventType.REWARD_FAILED_TO_VERIFY : adEventType, (i11 & 8) != 0 ? System.currentTimeMillis() : j10, str2, str3, str4, str5, str6, str7, adCaptureMethod, adRewardFailureReason, null);
        }
    }

    public static final class RewardGranted implements AdEvent {
        private final String adFormat;
        private final String adUnitId;
        private final AdCaptureMethod captureMethod;
        private final int eventVersion;
        private final String id;
        private final String impressionId;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final VerifiedReward reward;
        private final long timestamp;
        private final AdEventType type;

        public /* synthetic */ RewardGranted(String str, int i10, AdEventType adEventType, long j10, String str2, String str3, String str4, String str5, String str6, String str7, AdCaptureMethod adCaptureMethod, VerifiedReward verifiedReward, f fVar) {
            this(str, i10, adEventType, j10, str2, str3, str4, str5, str6, str7, adCaptureMethod, verifiedReward);
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getAdFormat-y0COY5Q */
        public String mo86getAdFormaty0COY5Q() {
            return this.adFormat;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getAdUnitId() {
            return this.adUnitId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdCaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public int getEventVersion() {
            return this.eventVersion;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getId() {
            return this.id;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getImpressionId() {
            return this.impressionId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getMediatorName-GyoM_N4 */
        public String mo87getMediatorNameGyoM_N4() {
            return this.mediatorName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getNetworkName() {
            return this.networkName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getPlacement() {
            return this.placement;
        }

        public final VerifiedReward getReward() {
            return this.reward;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdEventType getType() {
            return this.type;
        }

        private RewardGranted(String id, int i10, AdEventType type, long j10, String str, String mediatorName, String adFormat, String str2, String adUnitId, String impressionId, AdCaptureMethod captureMethod, VerifiedReward reward) {
            m.f(id, "id");
            m.f(type, "type");
            m.f(mediatorName, "mediatorName");
            m.f(adFormat, "adFormat");
            m.f(adUnitId, "adUnitId");
            m.f(impressionId, "impressionId");
            m.f(captureMethod, "captureMethod");
            m.f(reward, "reward");
            this.id = id;
            this.eventVersion = i10;
            this.type = type;
            this.timestamp = j10;
            this.networkName = str;
            this.mediatorName = mediatorName;
            this.adFormat = adFormat;
            this.placement = str2;
            this.adUnitId = adUnitId;
            this.impressionId = impressionId;
            this.captureMethod = captureMethod;
            this.reward = reward;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ RewardGranted(String str, int i10, AdEventType adEventType, long j10, String str2, String str3, String str4, String str5, String str6, String str7, AdCaptureMethod adCaptureMethod, VerifiedReward verifiedReward, int i11, f fVar) {
            String str8;
            if ((i11 & 1) != 0) {
                String string = UUID.randomUUID().toString();
                m.e(string, "randomUUID().toString()");
                str8 = string;
            } else {
                str8 = str;
            }
            this(str8, (i11 & 2) != 0 ? 1 : i10, (i11 & 4) != 0 ? AdEventType.REWARD_GRANTED : adEventType, (i11 & 8) != 0 ? System.currentTimeMillis() : j10, str2, str3, str4, str5, str6, str7, adCaptureMethod, verifiedReward, null);
        }
    }

    public static final class RewardVerified implements AdEvent {
        private final String adFormat;
        private final String adUnitId;
        private final AdCaptureMethod captureMethod;
        private final int eventVersion;
        private final String id;
        private final String impressionId;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final long timestamp;
        private final AdEventType type;

        public /* synthetic */ RewardVerified(String str, int i10, AdEventType adEventType, long j10, String str2, String str3, String str4, String str5, String str6, String str7, AdCaptureMethod adCaptureMethod, f fVar) {
            this(str, i10, adEventType, j10, str2, str3, str4, str5, str6, str7, adCaptureMethod);
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getAdFormat-y0COY5Q */
        public String mo86getAdFormaty0COY5Q() {
            return this.adFormat;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getAdUnitId() {
            return this.adUnitId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdCaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public int getEventVersion() {
            return this.eventVersion;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getId() {
            return this.id;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getImpressionId() {
            return this.impressionId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getMediatorName-GyoM_N4 */
        public String mo87getMediatorNameGyoM_N4() {
            return this.mediatorName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getNetworkName() {
            return this.networkName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getPlacement() {
            return this.placement;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdEventType getType() {
            return this.type;
        }

        private RewardVerified(String id, int i10, AdEventType type, long j10, String str, String mediatorName, String adFormat, String str2, String adUnitId, String impressionId, AdCaptureMethod captureMethod) {
            m.f(id, "id");
            m.f(type, "type");
            m.f(mediatorName, "mediatorName");
            m.f(adFormat, "adFormat");
            m.f(adUnitId, "adUnitId");
            m.f(impressionId, "impressionId");
            m.f(captureMethod, "captureMethod");
            this.id = id;
            this.eventVersion = i10;
            this.type = type;
            this.timestamp = j10;
            this.networkName = str;
            this.mediatorName = mediatorName;
            this.adFormat = adFormat;
            this.placement = str2;
            this.adUnitId = adUnitId;
            this.impressionId = impressionId;
            this.captureMethod = captureMethod;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ RewardVerified(String str, int i10, AdEventType adEventType, long j10, String str2, String str3, String str4, String str5, String str6, String str7, AdCaptureMethod adCaptureMethod, int i11, f fVar) {
            String str8;
            if ((i11 & 1) != 0) {
                String string = UUID.randomUUID().toString();
                m.e(string, "randomUUID().toString()");
                str8 = string;
            } else {
                str8 = str;
            }
            this(str8, (i11 & 2) != 0 ? 1 : i10, (i11 & 4) != 0 ? AdEventType.REWARD_VERIFIED : adEventType, (i11 & 8) != 0 ? System.currentTimeMillis() : j10, str2, str3, str4, str5, str6, str7, adCaptureMethod, null);
        }
    }

    /* JADX INFO: renamed from: getAdFormat-y0COY5Q, reason: not valid java name */
    String mo86getAdFormaty0COY5Q();

    String getAdUnitId();

    AdCaptureMethod getCaptureMethod();

    int getEventVersion();

    String getId();

    String getImpressionId();

    /* JADX INFO: renamed from: getMediatorName-GyoM_N4, reason: not valid java name */
    String mo87getMediatorNameGyoM_N4();

    String getNetworkName();

    String getPlacement();

    long getTimestamp();

    AdEventType getType();
}
