package com.revenuecat.purchases.common.localrules;

import N8.t;
import Q8.d;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class RulesDimensionResolver {
    private final DateProvider dateProvider;
    private final List<RulesDimensionProvider> providers;

    /* JADX WARN: Multi-variable type inference failed */
    public RulesDimensionResolver(List<? extends RulesDimensionProvider> providers, DateProvider dateProvider) {
        m.f(providers, "providers");
        m.f(dateProvider, "dateProvider");
        this.providers = providers;
        this.dateProvider = dateProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: snapshot-gIAlu-s$default, reason: not valid java name */
    public static /* synthetic */ Object m186snapshotgIAlus$default(RulesDimensionResolver rulesDimensionResolver, Map map, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = t.f8651a;
        }
        return rulesDimensionResolver.m187snapshotgIAlus(map, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007f -> B:28:0x0083). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: snapshot-gIAlu-s, reason: not valid java name */
    public final java.lang.Object m187snapshotgIAlus(java.util.Map<java.lang.String, ? extends com.revenuecat.purchases.common.localrules.RulesDimensionValue> r9, Q8.d r10) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.localrules.RulesDimensionResolver.m187snapshotgIAlus(java.util.Map, Q8.d):java.lang.Object");
    }

    public /* synthetic */ RulesDimensionResolver(List list, DateProvider dateProvider, int i10, f fVar) {
        this(list, (i10 & 2) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
