package com.revenuecat.purchases.hybridcommon.mappers;

import D7.W;
import M8.h;
import M8.l;
import com.revenuecat.purchases.utils.Iso8601Utils;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p085h9.a;
import p085h9.j;
import p119k9.AbstractC2040y;
import p119k9.C;
import p119k9.F;

/* JADX INFO: loaded from: classes2.dex */
public final class MappersHelpersKt {
    private static AbstractC2040y overrideMapperDispatcher;
    private static final h mapperDispatcher$delegate = W.S(MappersHelpersKt$mapperDispatcher$2.INSTANCE);
    private static final C mainScope = F.c();

    public static final JSONObject convertToJson(Map<String, ?> map) throws JSONException {
        m.f(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                jSONObject.put(key, JSONObject.NULL);
            } else if (value instanceof Map) {
                jSONObject.put(key, convertToJson((Map) value));
            } else if (value instanceof List) {
                jSONObject.put(key, convertToJsonArray((List) value));
            } else if (value instanceof Object[]) {
                jSONObject.put(key, convertToJsonArray(N8.m.B0((Object[]) value)));
            } else {
                jSONObject.put(key, value);
            }
        }
        return jSONObject;
    }

    public static final JSONArray convertToJsonArray(List<?> list) {
        m.f(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj == null) {
                jSONArray.put(JSONObject.NULL);
            } else if (obj instanceof Map) {
                jSONArray.put(convertToJson((Map) obj));
            } else if (obj instanceof Object[]) {
                jSONArray.put(convertToJsonArray(N8.m.e0((Object[]) obj)));
            } else if (obj instanceof List) {
                jSONArray.put(convertToJsonArray((List) obj));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    public static final Map<String, String> convertToMap(JSONObject jSONObject) {
        m.f(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        m.e(itKeys, "this.keys()");
        p085h9.h hVarN0 = j.n0(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : (a) hVarN0) {
            l lVar = jSONObject.isNull(str) ? new l(str, null) : new l(str, jSONObject.getString(str));
            linkedHashMap.put(lVar.f8413a, lVar.f8414b);
        }
        return linkedHashMap;
    }

    public static final String formatUsingDeviceLocale(String priceCurrencyCode, long j10) {
        m.f(priceCurrencyCode, "priceCurrencyCode");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(Currency.getInstance(priceCurrencyCode));
        String str = currencyInstance.format(j10);
        m.e(str, "getCurrencyInstance().ap…ode)\n    }.format(number)");
        return str;
    }

    public static final C getMainScope() {
        return mainScope;
    }

    public static final AbstractC2040y getMapperDispatcher() {
        return (AbstractC2040y) mapperDispatcher$delegate.getValue();
    }

    public static final AbstractC2040y getOverrideMapperDispatcher() {
        return overrideMapperDispatcher;
    }

    public static final void setOverrideMapperDispatcher(AbstractC2040y abstractC2040y) {
        overrideMapperDispatcher = abstractC2040y;
    }

    public static final String toIso8601(Date date) {
        m.f(date, "<this>");
        String str = Iso8601Utils.format(date);
        m.e(str, "format(this)");
        return str;
    }

    public static final long toMillis(Date date) {
        m.f(date, "<this>");
        return date.getTime();
    }
}
