package com.revenuecat.purchases.hybridcommon.mappers;

import M8.l;
import N8.y;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrency;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class VirtualCurrencyMapperKt {
    public static final Map<String, Object> map(VirtualCurrency virtualCurrency) {
        m.f(virtualCurrency, "<this>");
        return y.g0(new l("balance", Integer.valueOf(virtualCurrency.getBalance())), new l("name", virtualCurrency.getName()), new l("code", virtualCurrency.getCode()), new l("serverDescription", virtualCurrency.getServerDescription()));
    }
}
