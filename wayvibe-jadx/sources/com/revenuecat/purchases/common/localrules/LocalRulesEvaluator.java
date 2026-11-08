package com.revenuecat.purchases.common.localrules;

import M8.o;
import N8.t;
import Q5.b;
import Q8.d;
import R8.a;
import Z8.e;
import com.apple.android.music.playback.model.MediaPlayerException;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalRulesEvaluator {
    private final RulesDimensionResolver dimensionResolver;

    public LocalRulesEvaluator(List<? extends RulesDimensionProvider> providers, DateProvider dateProvider) {
        m.f(providers, "providers");
        m.f(dateProvider, "dateProvider");
        this.dimensionResolver = new RulesDimensionResolver(providers, dateProvider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: match-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m182match0E7RQCE$default(LocalRulesEvaluator localRulesEvaluator, List list, Map map, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = t.f8651a;
        }
        return localRulesEvaluator.m184match0E7RQCE(list, map, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: match-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m183matchBWLJW6A$default(LocalRulesEvaluator localRulesEvaluator, List list, Map map, e eVar, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = t.f8651a;
        }
        return localRulesEvaluator.m185matchBWLJW6A(list, map, eVar, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: match-0E7RQCE, reason: not valid java name */
    public final <Rule extends LocalRule> Object m184match0E7RQCE(List<? extends Rule> list, Map<String, ? extends RulesDimensionValue> map, d dVar) {
        LocalRulesEvaluator$match$1 localRulesEvaluator$match$1;
        if (dVar instanceof LocalRulesEvaluator$match$1) {
            localRulesEvaluator$match$1 = (LocalRulesEvaluator$match$1) dVar;
            int i10 = localRulesEvaluator$match$1.label;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                localRulesEvaluator$match$1.label = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                localRulesEvaluator$match$1 = new LocalRulesEvaluator$match$1(this, dVar);
            }
        } else {
            localRulesEvaluator$match$1 = new LocalRulesEvaluator$match$1(this, dVar);
        }
        Object obj = localRulesEvaluator$match$1.result;
        Object obj2 = a.COROUTINE_SUSPENDED;
        int i11 = localRulesEvaluator$match$1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.T(obj);
            return ((o) obj).f8416a;
        }
        b.T(obj);
        e localRulesEvaluator$match$2 = new LocalRulesEvaluator$match$2(null);
        localRulesEvaluator$match$1.label = 1;
        Object objM185matchBWLJW6A = m185matchBWLJW6A(list, map, localRulesEvaluator$match$2, localRulesEvaluator$match$1);
        return objM185matchBWLJW6A == obj2 ? obj2 : objM185matchBWLJW6A;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0092  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r11 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
    
        if (r13 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ac -> B:30:0x00af). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: match-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <Rule> java.lang.Object m185matchBWLJW6A(java.util.List<? extends Rule> r10, java.util.Map<java.lang.String, ? extends com.revenuecat.purchases.common.localrules.RulesDimensionValue> r11, Z8.e r12, Q8.d r13) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.localrules.LocalRulesEvaluator.m185matchBWLJW6A(java.util.List, java.util.Map, Z8.e, Q8.d):java.lang.Object");
    }

    public /* synthetic */ LocalRulesEvaluator(List list, DateProvider dateProvider, int i10, f fVar) {
        this(list, (i10 & 2) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
