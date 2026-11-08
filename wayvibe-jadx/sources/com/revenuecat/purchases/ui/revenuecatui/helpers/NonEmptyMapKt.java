package com.revenuecat.purchases.ui.revenuecatui.helpers;

import M8.D;
import M8.l;
import N8.t;
import N8.y;
import T3.o;
import Z8.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class NonEmptyMapKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMapKt$toNonEmptyMapOrNull$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements c {
        final /* synthetic */ LinkedHashMap $remaining;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LinkedHashMap linkedHashMap) {
            super(1);
            this.$remaining = linkedHashMap;
        }

        @Override // Z8.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map.Entry) obj);
            return D.f8402a;
        }

        public final void invoke(Map.Entry entry) {
            m.f(entry, "<name for destructuring parameter 0>");
            this.$remaining.put(entry.getKey(), entry.getValue());
        }
    }

    public static final NonEmptyMap nonEmptyMapOf(l entry, l... t10) {
        Map mapF0;
        m.f(entry, "entry");
        m.f(t10, "t");
        int length = t10.length;
        if (length == 0) {
            mapF0 = t.f8651a;
        } else if (length != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(y.e0(t10.length));
            y.m0(linkedHashMap, t10);
            mapF0 = linkedHashMap;
        } else {
            mapF0 = y.f0(t10[0]);
        }
        return new NonEmptyMap(entry, mapF0);
    }

    public static final /* synthetic */ NonEmptyMap toNonEmptyMapOrNull(Map map) {
        m.f(map, "<this>");
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size() - 1);
        it.forEachRemaining(new o(new AnonymousClass1(linkedHashMap), 1));
        return new NonEmptyMap(new l(entry.getKey(), entry.getValue()), linkedHashMap);
    }

    public static final /* synthetic */ NonEmptyMap nonEmptyMapOf(l entry, Map map) {
        m.f(entry, "entry");
        m.f(map, "map");
        return new NonEmptyMap(entry, map);
    }
}
