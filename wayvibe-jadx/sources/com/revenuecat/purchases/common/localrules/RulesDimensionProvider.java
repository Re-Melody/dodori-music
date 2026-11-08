package com.revenuecat.purchases.common.localrules;

import Q8.d;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public interface RulesDimensionProvider {
    Object dimensions(Date date, d dVar);

    RulesDimensionNamespace getNamespace();
}
