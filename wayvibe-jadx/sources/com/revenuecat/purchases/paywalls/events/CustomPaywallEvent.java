package com.revenuecat.purchases.paywalls.events;

import B2.AbstractC0112b;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.common.events.FeatureEvent;
import java.util.Date;
import java.util.UUID;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public abstract class CustomPaywallEvent implements FeatureEvent {
    public /* synthetic */ CustomPaywallEvent(f fVar) {
        this();
    }

    @Override // com.revenuecat.purchases.common.events.FeatureEvent
    public boolean isPriorityEvent() {
        return true;
    }

    public static final class Impression extends CustomPaywallEvent {
        private final CreationData creationData;
        private final Data data;

        public static final class CreationData {
            private final Date date;
            private final UUID id;

            public CreationData() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CreationData)) {
                    return false;
                }
                CreationData creationData = (CreationData) obj;
                return m.b(this.id, creationData.id) && m.b(this.date, creationData.date);
            }

            public final Date getDate() {
                return this.date;
            }

            public final UUID getId() {
                return this.id;
            }

            public int hashCode() {
                return this.date.hashCode() + (this.id.hashCode() * 31);
            }

            public String toString() {
                return "CreationData(id=" + this.id + ", date=" + this.date + ')';
            }

            public CreationData(UUID id, Date date) {
                m.f(id, "id");
                m.f(date, "date");
                this.id = id;
                this.date = date;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ CreationData(UUID uuid, Date date, int i10, f fVar) {
                if ((i10 & 1) != 0) {
                    uuid = UUID.randomUUID();
                    m.e(uuid, "randomUUID()");
                }
                this(uuid, (i10 & 2) != 0 ? new Date() : date);
            }
        }

        public /* synthetic */ Impression(CreationData creationData, Data data, int i10, f fVar) {
            if ((i10 & 1) != 0) {
                creationData = new CreationData(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }
            this(creationData, data);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impression)) {
                return false;
            }
            Impression impression = (Impression) obj;
            return m.b(this.creationData, impression.creationData) && m.b(this.data, impression.data);
        }

        public final CreationData getCreationData() {
            return this.creationData;
        }

        public final Data getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode() + (this.creationData.hashCode() * 31);
        }

        public String toString() {
            return "Impression(creationData=" + this.creationData + ", data=" + this.data + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Impression(CreationData creationData, Data data) {
            super(null);
            m.f(creationData, "creationData");
            m.f(data, "data");
            this.creationData = creationData;
            this.data = data;
        }

        public static final class Data {
            private final String offeringId;
            private final String paywallId;
            private final String placementIdentifier;
            private final Integer targetingRevision;
            private final String targetingRuleId;

            public Data(String str, String str2, String str3, Integer num, String str4) {
                this.paywallId = str;
                this.offeringId = str2;
                this.placementIdentifier = str3;
                this.targetingRevision = num;
                this.targetingRuleId = str4;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Data)) {
                    return false;
                }
                Data data = (Data) obj;
                return m.b(this.paywallId, data.paywallId) && m.b(this.offeringId, data.offeringId) && m.b(this.placementIdentifier, data.placementIdentifier) && m.b(this.targetingRevision, data.targetingRevision) && m.b(this.targetingRuleId, data.targetingRuleId);
            }

            public final String getOfferingId() {
                return this.offeringId;
            }

            public final String getPaywallId() {
                return this.paywallId;
            }

            public final String getPlacementIdentifier() {
                return this.placementIdentifier;
            }

            public final Integer getTargetingRevision() {
                return this.targetingRevision;
            }

            public final String getTargetingRuleId() {
                return this.targetingRuleId;
            }

            public int hashCode() {
                String str = this.paywallId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.offeringId;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.placementIdentifier;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num = this.targetingRevision;
                int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                String str4 = this.targetingRuleId;
                return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Data(paywallId=");
                sb.append(this.paywallId);
                sb.append(", offeringId=");
                sb.append(this.offeringId);
                sb.append(", placementIdentifier=");
                sb.append(this.placementIdentifier);
                sb.append(", targetingRevision=");
                sb.append(this.targetingRevision);
                sb.append(", targetingRuleId=");
                return AbstractC0112b.j(sb, this.targetingRuleId, ')');
            }

            public /* synthetic */ Data(String str, String str2, String str3, Integer num, String str4, int i10, f fVar) {
                this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : str4);
            }
        }
    }

    private CustomPaywallEvent() {
    }
}
