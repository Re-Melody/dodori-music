package V5;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.internal.fido.zzia;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC0946l {
    public static final Parcelable.Creator<B> CREATOR = new W(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f12600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f12601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f12603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f12604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L f12605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final N f12606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0940f f12607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f12608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ResultReceiver f12609j;

    /* JADX WARN: Code duplicated, block: B:20:0x007a A[Catch: Y -> 0x0054, JSONException -> 0x0057, TryCatch #3 {Y -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0136, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:21:0x007f A[Catch: Y -> 0x0054, JSONException -> 0x0057, TryCatch #3 {Y -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0136, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0085 A[Catch: Y -> 0x0054, JSONException -> 0x0057, TryCatch #3 {Y -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0136, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:24:0x008a  */
    /* JADX WARN: Code duplicated, block: B:26:0x008d A[Catch: Y -> 0x0054, JSONException -> 0x0057, TryCatch #3 {Y -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0136, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0099 A[Catch: Y -> 0x0054, JSONException -> 0x0057, LOOP:0: B:27:0x0093->B:29:0x0099, LOOP_END, TryCatch #3 {Y -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0136, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2 A[Catch: Y -> 0x0054, JSONException -> 0x0057, TryCatch #3 {Y -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0136, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5 A[Catch: Y -> 0x0054, JSONException -> 0x0057, TryCatch #3 {Y -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0136, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7 A[Catch: Y -> 0x0054, JSONException -> 0x0057, TryCatch #3 {Y -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0136, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00eb A[Catch: Y -> 0x0054, JSONException -> 0x0057, TryCatch #3 {Y -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0136, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fb A[Catch: Y -> 0x0054, JSONException -> 0x0057, TryCatch #3 {Y -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0136, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0106 A[Catch: Y -> 0x0054, JSONException -> 0x0057, TryCatch #3 {Y -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0136, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x010c A[Catch: Y -> 0x0054, JSONException -> 0x0057, TryCatch #3 {Y -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0136, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0115  */
    /* JADX WARN: Code duplicated, block: B:58:0x011d A[Catch: Y -> 0x0054, JSONException -> 0x0057, TryCatch #3 {Y -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0136, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:63:0x0131 A[Catch: Y -> 0x0054, JSONException -> 0x0057, TryCatch #3 {Y -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0136, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    public B(byte[] bArr, Double d10, String str, ArrayList arrayList, Integer num, L l10, String str2, C0940f c0940f, Long l11, String str3, ResultReceiver resultReceiver) {
        Double d11;
        Double dValueOf;
        JSONArray jSONArray;
        ArrayList arrayList2;
        Integer numValueOf;
        L l12;
        N nA;
        C0940f c0940f2;
        C0940f c0940fA;
        Long lValueOf;
        JSONObject jSONObject;
        String string;
        ArrayList arrayList3;
        int i10;
        this.f12609j = resultReceiver;
        if (str3 == null || !zzia.zzc()) {
            com.google.android.gms.common.internal.E.h(bArr);
            this.f12600a = bArr;
            this.f12601b = d10;
            com.google.android.gms.common.internal.E.h(str);
            this.f12602c = str;
            this.f12603d = arrayList;
            this.f12604e = num;
            this.f12605f = l10;
            this.f12608i = l11;
            if (str2 != null) {
                try {
                    this.f12606g = N.a(str2);
                } catch (Y e2) {
                    throw new IllegalArgumentException(e2);
                }
            } else {
                this.f12606g = null;
            }
            this.f12607h = c0940f;
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str3);
            byte[] bArrB = O5.a.b(jSONObject2.getString("challenge"));
            com.google.android.gms.common.internal.E.h(bArrB);
            if (!jSONObject2.has("timeout")) {
                if (jSONObject2.has("timeoutSeconds")) {
                    dValueOf = Double.valueOf(jSONObject2.getDouble("timeoutSeconds"));
                } else {
                    d11 = null;
                }
                String string2 = jSONObject2.getString("rpId");
                com.google.android.gms.common.internal.E.h(string2);
                if (jSONObject2.has("allowList")) {
                    jSONArray = jSONObject2.getJSONArray("allowList");
                } else if (jSONObject2.has("allowCredentials")) {
                    jSONArray = jSONObject2.getJSONArray("allowCredentials");
                } else {
                    jSONArray = null;
                }
                if (jSONArray != null) {
                    arrayList3 = new ArrayList();
                    for (i10 = 0; i10 < jSONArray.length(); i10++) {
                        arrayList3.add(C0959z.a(jSONArray.getJSONObject(i10)));
                    }
                    arrayList2 = arrayList3;
                } else {
                    arrayList2 = null;
                }
                if (jSONObject2.has("requestId")) {
                    numValueOf = Integer.valueOf(jSONObject2.getInt("requestId"));
                } else {
                    numValueOf = null;
                }
                if (jSONObject2.has("tokenBinding")) {
                    jSONObject = jSONObject2.getJSONObject("tokenBinding");
                    String string3 = jSONObject.getString("status");
                    if (jSONObject.has(DiagnosticsEntry.ID_KEY)) {
                        string = jSONObject.getString(DiagnosticsEntry.ID_KEY);
                    } else {
                        string = null;
                    }
                    l12 = new L(string3, string);
                } else {
                    l12 = null;
                }
                if (jSONObject2.has("userVerification")) {
                    nA = N.a(jSONObject2.getString("userVerification"));
                } else {
                    nA = null;
                }
                if (jSONObject2.has("authenticationExtensions")) {
                    if (jSONObject2.has("extensions")) {
                        c0940fA = C0940f.a(jSONObject2.getJSONObject("extensions"));
                    } else {
                        c0940f2 = null;
                    }
                    if (jSONObject2.has("longRequestId")) {
                        lValueOf = Long.valueOf(jSONObject2.getLong("longRequestId"));
                    } else {
                        lValueOf = null;
                    }
                    B b10 = new B(bArrB, d11, string2, arrayList2, numValueOf, l12, nA != null ? nA.toString() : null, c0940f2, lValueOf, null, null);
                    this.f12600a = b10.f12600a;
                    this.f12601b = b10.f12601b;
                    this.f12602c = b10.f12602c;
                    this.f12603d = b10.f12603d;
                    this.f12604e = b10.f12604e;
                    this.f12605f = b10.f12605f;
                    this.f12606g = b10.f12606g;
                    this.f12607h = b10.f12607h;
                    this.f12608i = b10.f12608i;
                }
                c0940fA = C0940f.a(jSONObject2.getJSONObject("authenticationExtensions"));
                c0940f2 = c0940fA;
                if (jSONObject2.has("longRequestId")) {
                    lValueOf = Long.valueOf(jSONObject2.getLong("longRequestId"));
                } else {
                    lValueOf = null;
                }
                B b11 = new B(bArrB, d11, string2, arrayList2, numValueOf, l12, nA != null ? nA.toString() : null, c0940f2, lValueOf, null, null);
                this.f12600a = b11.f12600a;
                this.f12601b = b11.f12601b;
                this.f12602c = b11.f12602c;
                this.f12603d = b11.f12603d;
                this.f12604e = b11.f12604e;
                this.f12605f = b11.f12605f;
                this.f12606g = b11.f12606g;
                this.f12607h = b11.f12607h;
                this.f12608i = b11.f12608i;
            }
            dValueOf = Double.valueOf(jSONObject2.getDouble("timeout") / 1000.0d);
            d11 = dValueOf;
            String string4 = jSONObject2.getString("rpId");
            com.google.android.gms.common.internal.E.h(string4);
            if (jSONObject2.has("allowList")) {
                jSONArray = jSONObject2.getJSONArray("allowList");
            } else if (jSONObject2.has("allowCredentials")) {
                jSONArray = jSONObject2.getJSONArray("allowCredentials");
            } else {
                jSONArray = null;
            }
            if (jSONArray != null) {
                arrayList3 = new ArrayList();
                while (i10 < jSONArray.length()) {
                    arrayList3.add(C0959z.a(jSONArray.getJSONObject(i10)));
                }
                arrayList2 = arrayList3;
            } else {
                arrayList2 = null;
            }
            if (jSONObject2.has("requestId")) {
                numValueOf = Integer.valueOf(jSONObject2.getInt("requestId"));
            } else {
                numValueOf = null;
            }
            if (jSONObject2.has("tokenBinding")) {
                jSONObject = jSONObject2.getJSONObject("tokenBinding");
                String string5 = jSONObject.getString("status");
                if (jSONObject.has(DiagnosticsEntry.ID_KEY)) {
                    string = jSONObject.getString(DiagnosticsEntry.ID_KEY);
                } else {
                    string = null;
                }
                l12 = new L(string5, string);
            } else {
                l12 = null;
            }
            if (jSONObject2.has("userVerification")) {
                nA = N.a(jSONObject2.getString("userVerification"));
            } else {
                nA = null;
            }
            if (jSONObject2.has("authenticationExtensions")) {
                if (jSONObject2.has("extensions")) {
                    c0940fA = C0940f.a(jSONObject2.getJSONObject("extensions"));
                } else {
                    c0940f2 = null;
                }
                if (jSONObject2.has("longRequestId")) {
                    lValueOf = Long.valueOf(jSONObject2.getLong("longRequestId"));
                } else {
                    lValueOf = null;
                }
                B b12 = new B(bArrB, d11, string4, arrayList2, numValueOf, l12, nA != null ? nA.toString() : null, c0940f2, lValueOf, null, null);
                this.f12600a = b12.f12600a;
                this.f12601b = b12.f12601b;
                this.f12602c = b12.f12602c;
                this.f12603d = b12.f12603d;
                this.f12604e = b12.f12604e;
                this.f12605f = b12.f12605f;
                this.f12606g = b12.f12606g;
                this.f12607h = b12.f12607h;
                this.f12608i = b12.f12608i;
            }
            c0940fA = C0940f.a(jSONObject2.getJSONObject("authenticationExtensions"));
            c0940f2 = c0940fA;
            if (jSONObject2.has("longRequestId")) {
                lValueOf = Long.valueOf(jSONObject2.getLong("longRequestId"));
            } else {
                lValueOf = null;
            }
            B b13 = new B(bArrB, d11, string4, arrayList2, numValueOf, l12, nA != null ? nA.toString() : null, c0940f2, lValueOf, null, null);
            this.f12600a = b13.f12600a;
            this.f12601b = b13.f12601b;
            this.f12602c = b13.f12602c;
            this.f12603d = b13.f12603d;
            this.f12604e = b13.f12604e;
            this.f12605f = b13.f12605f;
            this.f12606g = b13.f12606g;
            this.f12607h = b13.f12607h;
            this.f12608i = b13.f12608i;
        } catch (Y e4) {
            e = e4;
            throw new IllegalArgumentException(e);
        } catch (JSONException e7) {
            e = e7;
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        if (!Arrays.equals(this.f12600a, b10.f12600a) || !com.google.android.gms.common.internal.E.k(this.f12601b, b10.f12601b) || !com.google.android.gms.common.internal.E.k(this.f12602c, b10.f12602c)) {
            return false;
        }
        ArrayList arrayList = this.f12603d;
        ArrayList arrayList2 = b10.f12603d;
        return ((arrayList == null && arrayList2 == null) || (arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList))) && com.google.android.gms.common.internal.E.k(this.f12604e, b10.f12604e) && com.google.android.gms.common.internal.E.k(this.f12605f, b10.f12605f) && com.google.android.gms.common.internal.E.k(this.f12606g, b10.f12606g) && com.google.android.gms.common.internal.E.k(this.f12607h, b10.f12607h) && com.google.android.gms.common.internal.E.k(this.f12608i, b10.f12608i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f12600a)), this.f12601b, this.f12602c, this.f12603d, this.f12604e, this.f12605f, this.f12606g, this.f12607h, this.f12608i});
    }

    public final String toString() {
        String strC = O5.a.c(this.f12600a);
        String strValueOf = String.valueOf(this.f12603d);
        String strValueOf2 = String.valueOf(this.f12605f);
        String strValueOf3 = String.valueOf(this.f12606g);
        String strValueOf4 = String.valueOf(this.f12607h);
        StringBuilder sbU = V0.p.u("PublicKeyCredentialRequestOptions{\n challenge=", strC, ", \n timeoutSeconds=");
        sbU.append(this.f12601b);
        sbU.append(", \n rpId='");
        V0.p.y(sbU, this.f12602c, "', \n allowList=", strValueOf, ", \n requestId=");
        sbU.append(this.f12604e);
        sbU.append(", \n tokenBinding=");
        sbU.append(strValueOf2);
        sbU.append(", \n userVerification=");
        V0.p.y(sbU, strValueOf3, ", \n authenticationExtensions=", strValueOf4, ", \n longRequestId=");
        sbU.append(this.f12608i);
        sbU.append("}");
        return sbU.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.P(parcel, 2, this.f12600a, false);
        p242x0.c.Q(parcel, 3, this.f12601b);
        p242x0.c.W(parcel, 4, this.f12602c, false);
        p242x0.c.Z(parcel, 5, this.f12603d, false);
        p242x0.c.T(parcel, 6, this.f12604e);
        p242x0.c.V(parcel, 7, this.f12605f, i10, false);
        N n6 = this.f12606g;
        p242x0.c.W(parcel, 8, n6 == null ? null : n6.toString(), false);
        p242x0.c.V(parcel, 9, this.f12607h, i10, false);
        p242x0.c.U(parcel, 10, this.f12608i);
        p242x0.c.V(parcel, 12, this.f12609j, i10, false);
        p242x0.c.d0(iC0, parcel);
    }
}
