package com.revenuecat.purchases.utils;

import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PrewarmTargetOfferingsKt {
    public static final Set<String> prewarmTargetOfferingIds(Offerings offerings) {
        String identifier;
        m.f(offerings, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Offering current = offerings.getCurrent();
        if (current != null && (identifier = current.getIdentifier()) != null) {
            linkedHashSet.add(identifier);
        }
        Offerings.Placements placements$purchases_defaultsRelease = offerings.getPlacements$purchases_defaultsRelease();
        if (placements$purchases_defaultsRelease != null) {
            Map<String, String> offeringIdsByPlacement = placements$purchases_defaultsRelease.getOfferingIdsByPlacement();
            m.f(offeringIdsByPlacement, "<this>");
            Collection collectionValues = new TreeMap(offeringIdsByPlacement).values();
            m.e(collectionValues, "config.offeringIdsByPlacement.toSortedMap().values");
            for (Object obj : collectionValues) {
                if (obj != null) {
                    linkedHashSet.add(obj);
                }
            }
            String fallbackOfferingId = placements$purchases_defaultsRelease.getFallbackOfferingId();
            if (fallbackOfferingId != null) {
                linkedHashSet.add(fallbackOfferingId);
            }
        }
        return linkedHashSet;
    }

    public static final List<Offering> prewarmTargetOfferings(Offerings offerings) {
        m.f(offerings, "<this>");
        Set<String> setPrewarmTargetOfferingIds = prewarmTargetOfferingIds(offerings);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setPrewarmTargetOfferingIds.iterator();
        while (it.hasNext()) {
            Offering offering = offerings.getOffering((String) it.next());
            if (offering != null) {
                arrayList.add(offering);
            }
        }
        return arrayList;
    }
}
