package com.revenuecat.purchases.utils;

import Z8.c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import p097i9.k;

/* JADX INFO: loaded from: classes2.dex */
public final class MapExtensionsKt {
    public static final <K, V> Map<K, V> filterNotNullValues(Map<K, ? extends V> map) {
        m.f(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final String getStringValueForPrimitive(Map<?, ?> map, String key) {
        m.f(map, "<this>");
        m.f(key, "key");
        Object obj = map.get(key);
        if (obj == null) {
            return null;
        }
        if (obj instanceof String ? true : obj instanceof Number ? true : obj instanceof Boolean ? true : obj instanceof Character) {
            String string = obj.toString();
            if (!k.x0(string)) {
                return string;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R> Map<R, V> mapNotNullKeys(Map<K, ? extends V> map, c transform) {
        m.f(map, "<this>");
        m.f(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            Object objInvoke = transform.invoke(entry);
            if (objInvoke != null) {
                linkedHashMap.put(objInvoke, entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
