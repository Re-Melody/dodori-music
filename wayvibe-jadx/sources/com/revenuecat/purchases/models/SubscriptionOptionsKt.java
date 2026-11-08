package com.revenuecat.purchases.models;

import M8.l;
import N8.y;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriptionOptionsKt {
    private static final int DAYS_IN_DAY = 1;
    private static final int DAYS_IN_WEEK = 7;
    private static final int DAYS_IN_MONTH = 30;
    private static final int DAYS_IN_YEAR = 365;
    private static final Map<Period.Unit, Integer> DAYS_IN_UNIT = y.g0(new l(Period.Unit.DAY, 1), new l(Period.Unit.WEEK, 7), new l(Period.Unit.MONTH, Integer.valueOf(DAYS_IN_MONTH)), new l(Period.Unit.YEAR, Integer.valueOf(DAYS_IN_YEAR)));
}
