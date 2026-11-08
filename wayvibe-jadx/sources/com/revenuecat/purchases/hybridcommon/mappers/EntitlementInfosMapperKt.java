package com.revenuecat.purchases.hybridcommon.mappers;

import M8.l;
import N8.o;
import N8.y;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.EntitlementInfos;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class EntitlementInfosMapperKt {
    public static final Map<String, Object> map(EntitlementInfos entitlementInfos) {
        m.f(entitlementInfos, "<this>");
        Set<Map.Entry<String, EntitlementInfo>> setEntrySet = entitlementInfos.getAll().entrySet();
        int iE0 = y.e0(o.o0(setEntrySet, 10));
        if (iE0 < 16) {
            iE0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iE0);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), EntitlementInfoMapperKt.map((EntitlementInfo) entry.getValue()));
        }
        l lVar = new l("all", linkedHashMap);
        Set<Map.Entry<String, EntitlementInfo>> setEntrySet2 = entitlementInfos.getActive().entrySet();
        int iE1 = y.e0(o.o0(setEntrySet2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iE1 >= 16 ? iE1 : 16);
        Iterator<T> it2 = setEntrySet2.iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            linkedHashMap2.put(entry2.getKey(), EntitlementInfoMapperKt.map((EntitlementInfo) entry2.getValue()));
        }
        return y.g0(lVar, new l("active", linkedHashMap2), new l("verification", entitlementInfos.getVerification().name()));
    }
}
