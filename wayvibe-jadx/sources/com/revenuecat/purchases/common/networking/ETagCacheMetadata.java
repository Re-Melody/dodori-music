package com.revenuecat.purchases.common.networking;

import com.revenuecat.purchases.VerificationResult;
import java.util.Date;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class ETagCacheMetadata {
    public static final Companion Companion = new Companion(null);
    private static final String SERIALIZATION_NAME_ETAG = "eTag";
    private static final String SERIALIZATION_NAME_IS_FALLBACK_URL = "isFallbackURL";
    private static final String SERIALIZATION_NAME_IS_LOAD_SHEDDER_RESPONSE = "isLoadShedderResponse";
    private static final String SERIALIZATION_NAME_LAST_REFRESH_TIME = "lastRefreshTime";
    private static final String SERIALIZATION_NAME_PAYLOAD_CHECKSUM = "payloadChecksum";
    private static final String SERIALIZATION_NAME_REQUEST_DATE = "requestDate";
    private static final String SERIALIZATION_NAME_RESPONSE_CODE = "responseCode";
    private static final String SERIALIZATION_NAME_VERIFICATION_RESULT = "verificationResult";
    private final ETagData eTagData;
    private final boolean isFallbackURL;
    private final boolean isLoadShedderResponse;
    private final long payloadChecksum;
    private final Date requestDate;
    private final int responseCode;
    private final VerificationResult verificationResult;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final ETagCacheMetadata deserialize(String serialized) {
            VerificationResult verificationResultValueOf;
            m.f(serialized, "serialized");
            try {
                JSONObject jSONObject = new JSONObject(serialized);
                Long lValueOf = Long.valueOf(jSONObject.optLong(ETagCacheMetadata.SERIALIZATION_NAME_LAST_REFRESH_TIME, -1L));
                if (lValueOf.longValue() == -1) {
                    lValueOf = null;
                }
                Date date = lValueOf != null ? new Date(lValueOf.longValue()) : null;
                Long lValueOf2 = Long.valueOf(jSONObject.optLong(ETagCacheMetadata.SERIALIZATION_NAME_REQUEST_DATE, -1L));
                if (lValueOf2.longValue() == -1) {
                    lValueOf2 = null;
                }
                Date date2 = lValueOf2 != null ? new Date(lValueOf2.longValue()) : null;
                if (jSONObject.has(ETagCacheMetadata.SERIALIZATION_NAME_VERIFICATION_RESULT)) {
                    String string = jSONObject.getString(ETagCacheMetadata.SERIALIZATION_NAME_VERIFICATION_RESULT);
                    m.e(string, "jsonObject.getString(SER…NAME_VERIFICATION_RESULT)");
                    verificationResultValueOf = VerificationResult.valueOf(string);
                } else {
                    verificationResultValueOf = VerificationResult.NOT_REQUESTED;
                }
                VerificationResult verificationResult = verificationResultValueOf;
                String string2 = jSONObject.getString(ETagCacheMetadata.SERIALIZATION_NAME_ETAG);
                m.e(string2, "jsonObject.getString(SERIALIZATION_NAME_ETAG)");
                return new ETagCacheMetadata(new ETagData(string2, date), jSONObject.getInt(ETagCacheMetadata.SERIALIZATION_NAME_RESPONSE_CODE), date2, verificationResult, jSONObject.optBoolean(ETagCacheMetadata.SERIALIZATION_NAME_IS_LOAD_SHEDDER_RESPONSE, false), jSONObject.optBoolean(ETagCacheMetadata.SERIALIZATION_NAME_IS_FALLBACK_URL, false), jSONObject.getLong(ETagCacheMetadata.SERIALIZATION_NAME_PAYLOAD_CHECKSUM));
            } catch (IllegalArgumentException | JSONException unused) {
                return null;
            }
        }

        public final ETagCacheMetadata fromResult(HTTPResult result, ETagData eTagData, long j10) {
            m.f(result, "result");
            m.f(eTagData, "eTagData");
            return new ETagCacheMetadata(eTagData, result.getResponseCode(), result.getRequestDate(), result.getVerificationResult(), result.isLoadShedderResponse(), result.isFallbackURL(), j10);
        }

        private Companion() {
        }
    }

    public ETagCacheMetadata(ETagData eTagData, int i10, Date date, VerificationResult verificationResult, boolean z10, boolean z11, long j10) {
        m.f(eTagData, "eTagData");
        m.f(verificationResult, "verificationResult");
        this.eTagData = eTagData;
        this.responseCode = i10;
        this.requestDate = date;
        this.verificationResult = verificationResult;
        this.isLoadShedderResponse = z10;
        this.isFallbackURL = z11;
        this.payloadChecksum = j10;
    }

    public static /* synthetic */ ETagCacheMetadata copy$default(ETagCacheMetadata eTagCacheMetadata, ETagData eTagData, int i10, Date date, VerificationResult verificationResult, boolean z10, boolean z11, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            eTagData = eTagCacheMetadata.eTagData;
        }
        if ((i11 & 2) != 0) {
            i10 = eTagCacheMetadata.responseCode;
        }
        if ((i11 & 4) != 0) {
            date = eTagCacheMetadata.requestDate;
        }
        if ((i11 & 8) != 0) {
            verificationResult = eTagCacheMetadata.verificationResult;
        }
        if ((i11 & 16) != 0) {
            z10 = eTagCacheMetadata.isLoadShedderResponse;
        }
        if ((i11 & 32) != 0) {
            z11 = eTagCacheMetadata.isFallbackURL;
        }
        if ((i11 & 64) != 0) {
            j10 = eTagCacheMetadata.payloadChecksum;
        }
        long j11 = j10;
        boolean z12 = z10;
        boolean z13 = z11;
        return eTagCacheMetadata.copy(eTagData, i10, date, verificationResult, z12, z13, j11);
    }

    public final ETagData component1() {
        return this.eTagData;
    }

    public final int component2() {
        return this.responseCode;
    }

    public final Date component3() {
        return this.requestDate;
    }

    public final VerificationResult component4() {
        return this.verificationResult;
    }

    public final boolean component5() {
        return this.isLoadShedderResponse;
    }

    public final boolean component6() {
        return this.isFallbackURL;
    }

    public final long component7() {
        return this.payloadChecksum;
    }

    public final ETagCacheMetadata copy(ETagData eTagData, int i10, Date date, VerificationResult verificationResult, boolean z10, boolean z11, long j10) {
        m.f(eTagData, "eTagData");
        m.f(verificationResult, "verificationResult");
        return new ETagCacheMetadata(eTagData, i10, date, verificationResult, z10, z11, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ETagCacheMetadata)) {
            return false;
        }
        ETagCacheMetadata eTagCacheMetadata = (ETagCacheMetadata) obj;
        return m.b(this.eTagData, eTagCacheMetadata.eTagData) && this.responseCode == eTagCacheMetadata.responseCode && m.b(this.requestDate, eTagCacheMetadata.requestDate) && this.verificationResult == eTagCacheMetadata.verificationResult && this.isLoadShedderResponse == eTagCacheMetadata.isLoadShedderResponse && this.isFallbackURL == eTagCacheMetadata.isFallbackURL && this.payloadChecksum == eTagCacheMetadata.payloadChecksum;
    }

    public final ETagData getETagData() {
        return this.eTagData;
    }

    public final long getPayloadChecksum() {
        return this.payloadChecksum;
    }

    public final Date getRequestDate() {
        return this.requestDate;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final VerificationResult getVerificationResult() {
        return this.verificationResult;
    }

    public int hashCode() {
        int iC = b.c(this.responseCode, this.eTagData.hashCode() * 31, 31);
        Date date = this.requestDate;
        return Long.hashCode(this.payloadChecksum) + b.f(b.f((this.verificationResult.hashCode() + ((iC + (date == null ? 0 : date.hashCode())) * 31)) * 31, 31, this.isLoadShedderResponse), 31, this.isFallbackURL);
    }

    public final boolean isFallbackURL() {
        return this.isFallbackURL;
    }

    public final boolean isLoadShedderResponse() {
        return this.isLoadShedderResponse;
    }

    public final String serialize() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SERIALIZATION_NAME_ETAG, this.eTagData.getETag());
        Date lastRefreshTime = this.eTagData.getLastRefreshTime();
        if (lastRefreshTime != null) {
            jSONObject.put(SERIALIZATION_NAME_LAST_REFRESH_TIME, lastRefreshTime.getTime());
        }
        jSONObject.put(SERIALIZATION_NAME_RESPONSE_CODE, this.responseCode);
        Date date = this.requestDate;
        if (date != null) {
            jSONObject.put(SERIALIZATION_NAME_REQUEST_DATE, date.getTime());
        }
        jSONObject.put(SERIALIZATION_NAME_VERIFICATION_RESULT, this.verificationResult.name());
        jSONObject.put(SERIALIZATION_NAME_IS_LOAD_SHEDDER_RESPONSE, this.isLoadShedderResponse);
        jSONObject.put(SERIALIZATION_NAME_IS_FALLBACK_URL, this.isFallbackURL);
        jSONObject.put(SERIALIZATION_NAME_PAYLOAD_CHECKSUM, this.payloadChecksum);
        String string = jSONObject.toString();
        m.e(string, "JSONObject().apply {\n   …sum)\n        }.toString()");
        return string;
    }

    public final HTTPResult toHTTPResult(String payload) {
        m.f(payload, "payload");
        return new HTTPResult(this.responseCode, payload, HTTPResult.Origin.CACHE, this.requestDate, this.verificationResult, this.isLoadShedderResponse, this.isFallbackURL);
    }

    public String toString() {
        return "ETagCacheMetadata(eTagData=" + this.eTagData + ", responseCode=" + this.responseCode + ", requestDate=" + this.requestDate + ", verificationResult=" + this.verificationResult + ", isLoadShedderResponse=" + this.isLoadShedderResponse + ", isFallbackURL=" + this.isFallbackURL + ", payloadChecksum=" + this.payloadChecksum + ')';
    }
}
