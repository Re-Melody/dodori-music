package com.revenuecat.purchases.common.networking;

import B2.AbstractC0112b;
import B8.V;
import D7.W;
import M8.h;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.BackendHelperKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.Arrays;
import java.util.Date;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;
import p097i9.k;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class HTTPResult {
    public static final Companion Companion = new Companion(null);
    public static final String ETAG_HEADER_NAME = "X-RevenueCat-ETag";
    public static final String LOAD_SHEDDER_HEADER_NAME = "x-revenuecat-fortress";
    public static final String REQUEST_TIME_HEADER_NAME = "X-RevenueCat-Request-Time";
    public static final String SIGNATURE_HEADER_NAME = "X-Signature";
    private final Integer backendErrorCode;
    private final String backendErrorMessage;
    private final h body$delegate;
    private final boolean isFallbackURL;
    private final boolean isLoadShedderResponse;
    private final Origin origin;
    private final Payload payload;
    private final String payloadText;
    private final Date requestDate;
    private final int responseCode;
    private final VerificationResult verificationResult;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public enum Origin {
        BACKEND,
        CACHE
    }

    public interface Payload {

        public static final class DefaultImpls {
            @Deprecated
            public static String getText(Payload payload) {
                return Payload.super.getText();
            }
        }

        public static final class RCFormat implements Payload {
            private final byte[] bytes;

            public RCFormat(byte[] bytes) {
                m.f(bytes, "bytes");
                this.bytes = bytes;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof RCFormat) && Arrays.equals(this.bytes, ((RCFormat) obj).bytes);
                }
                return true;
            }

            public final byte[] getBytes() {
                return this.bytes;
            }

            public int hashCode() {
                return Arrays.hashCode(this.bytes);
            }
        }

        public static final class Text implements Payload {
            private final String value;

            public Text(String value) {
                m.f(value, "value");
                this.value = value;
            }

            public static /* synthetic */ Text copy$default(Text text, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = text.value;
                }
                return text.copy(str);
            }

            public final String component1() {
                return this.value;
            }

            public final Text copy(String value) {
                m.f(value, "value");
                return new Text(value);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Text) && m.b(this.value, ((Text) obj).value);
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return AbstractC0112b.j(new StringBuilder("Text(value="), this.value, ')');
            }
        }

        default String getText() {
            if (this instanceof Text) {
                return ((Text) this).getValue();
            }
            if (this instanceof RCFormat) {
                return "";
            }
            throw new V();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0049  */
    public HTTPResult(int i10, Payload payload, Origin origin, Date date, VerificationResult verificationResult, boolean z10, boolean z11) {
        Integer numValueOf;
        m.f(payload, "payload");
        m.f(origin, "origin");
        m.f(verificationResult, "verificationResult");
        this.responseCode = i10;
        this.payload = payload;
        this.origin = origin;
        this.requestDate = date;
        this.verificationResult = verificationResult;
        this.isLoadShedderResponse = z10;
        this.isFallbackURL = z11;
        this.payloadText = payload.getText();
        this.body$delegate = W.S(new HTTPResult$body$2(this));
        String str = null;
        if (!BackendHelperKt.isSuccessful(this)) {
            int iOptInt = getBody().optInt("code");
            numValueOf = iOptInt <= 0 ? null : Integer.valueOf(iOptInt);
        }
        this.backendErrorCode = numValueOf;
        if (!BackendHelperKt.isSuccessful(this)) {
            String it = getBody().optString("message");
            m.e(it, "it");
            if (!k.x0(it)) {
                str = it;
            }
        }
        this.backendErrorMessage = str;
    }

    public static /* synthetic */ HTTPResult copy$default(HTTPResult hTTPResult, int i10, Payload payload, Origin origin, Date date, VerificationResult verificationResult, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = hTTPResult.responseCode;
        }
        if ((i11 & 2) != 0) {
            payload = hTTPResult.payload;
        }
        if ((i11 & 4) != 0) {
            origin = hTTPResult.origin;
        }
        if ((i11 & 8) != 0) {
            date = hTTPResult.requestDate;
        }
        if ((i11 & 16) != 0) {
            verificationResult = hTTPResult.verificationResult;
        }
        if ((i11 & 32) != 0) {
            z10 = hTTPResult.isLoadShedderResponse;
        }
        if ((i11 & 64) != 0) {
            z11 = hTTPResult.isFallbackURL;
        }
        boolean z12 = z10;
        boolean z13 = z11;
        VerificationResult verificationResult2 = verificationResult;
        Origin origin2 = origin;
        return hTTPResult.copy(i10, payload, origin2, date, verificationResult2, z12, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject parseBody() {
        String str = this.payloadText;
        JSONObject jSONObject = null;
        if (k.x0(str)) {
            str = null;
        }
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e2) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to parse payload as JSON: ".concat(str), e2);
            }
            if (jSONObject != null) {
                return jSONObject;
            }
        }
        return new JSONObject();
    }

    public final int component1() {
        return this.responseCode;
    }

    public final Payload component2() {
        return this.payload;
    }

    public final Origin component3() {
        return this.origin;
    }

    public final Date component4() {
        return this.requestDate;
    }

    public final VerificationResult component5() {
        return this.verificationResult;
    }

    public final boolean component6() {
        return this.isLoadShedderResponse;
    }

    public final boolean component7() {
        return this.isFallbackURL;
    }

    public final HTTPResult copy(int i10, Payload payload, Origin origin, Date date, VerificationResult verificationResult, boolean z10, boolean z11) {
        m.f(payload, "payload");
        m.f(origin, "origin");
        m.f(verificationResult, "verificationResult");
        return new HTTPResult(i10, payload, origin, date, verificationResult, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HTTPResult)) {
            return false;
        }
        HTTPResult hTTPResult = (HTTPResult) obj;
        return this.responseCode == hTTPResult.responseCode && m.b(this.payload, hTTPResult.payload) && this.origin == hTTPResult.origin && m.b(this.requestDate, hTTPResult.requestDate) && this.verificationResult == hTTPResult.verificationResult && this.isLoadShedderResponse == hTTPResult.isLoadShedderResponse && this.isFallbackURL == hTTPResult.isFallbackURL;
    }

    public final Integer getBackendErrorCode() {
        return this.backendErrorCode;
    }

    public final String getBackendErrorMessage() {
        return this.backendErrorMessage;
    }

    public final JSONObject getBody() {
        return (JSONObject) this.body$delegate.getValue();
    }

    public final Origin getOrigin() {
        return this.origin;
    }

    public final Payload getPayload() {
        return this.payload;
    }

    public final String getPayloadText() {
        return this.payloadText;
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
        int iHashCode = (this.origin.hashCode() + ((this.payload.hashCode() + (Integer.hashCode(this.responseCode) * 31)) * 31)) * 31;
        Date date = this.requestDate;
        return Boolean.hashCode(this.isFallbackURL) + b.f((this.verificationResult.hashCode() + ((iHashCode + (date == null ? 0 : date.hashCode())) * 31)) * 31, 31, this.isLoadShedderResponse);
    }

    public final boolean isFallbackURL() {
        return this.isFallbackURL;
    }

    public final boolean isLoadShedderResponse() {
        return this.isLoadShedderResponse;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HTTPResult(responseCode=");
        sb.append(this.responseCode);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", requestDate=");
        sb.append(this.requestDate);
        sb.append(", verificationResult=");
        sb.append(this.verificationResult);
        sb.append(", isLoadShedderResponse=");
        sb.append(this.isLoadShedderResponse);
        sb.append(", isFallbackURL=");
        return b.o(sb, this.isFallbackURL, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HTTPResult(int i10, String payload, Origin origin, Date date, VerificationResult verificationResult, boolean z10, boolean z11) {
        this(i10, new Payload.Text(payload), origin, date, verificationResult, z10, z11);
        m.f(payload, "payload");
        m.f(origin, "origin");
        m.f(verificationResult, "verificationResult");
    }
}
