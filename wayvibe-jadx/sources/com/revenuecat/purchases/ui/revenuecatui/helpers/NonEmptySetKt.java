package com.revenuecat.purchases.ui.revenuecatui.helpers;

import N8.l;
import N8.s;
import java.util.Iterator;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class NonEmptySetKt {
    public static final NonEmptySet nonEmptySetOf(Object obj, Object... t10) {
        m.f(t10, "t");
        return new NonEmptySet(obj, (Iterable<? extends Object>) (t10.length == 0 ? s.f8650a : new l(t10, 0)));
    }

    public static final /* synthetic */ NonEmptySet toNonEmptySetOrNull(Iterable iterable) {
        m.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return new NonEmptySet(it.next(), new NonEmptySetKt$toNonEmptySetOrNull$$inlined$Iterable$1(it));
        }
        return null;
    }
}
