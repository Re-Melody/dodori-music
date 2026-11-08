package com.revenuecat.purchases.common.localrules;

import M8.o;
import Q8.d;
import R8.a;
import S8.c;
import S8.e;
import com.apple.android.music.playback.model.MediaPlayerException;
import com.revenuecat.purchases.common.localrules.LocalRule;

/* JADX INFO: loaded from: classes2.dex */
@e(c = "com.revenuecat.purchases.common.localrules.LocalRulesEvaluator", f = "LocalRulesEvaluator.kt", l = {50}, m = "match-0E7RQCE")
public final class LocalRulesEvaluator$match$1<Rule extends LocalRule> extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocalRulesEvaluator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalRulesEvaluator$match$1(LocalRulesEvaluator localRulesEvaluator, d dVar) {
        super(dVar);
        this.this$0 = localRulesEvaluator;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= MediaPlayerException.ERROR_UNKNOWN;
        Object objM184match0E7RQCE = this.this$0.m184match0E7RQCE(null, null, this);
        return objM184match0E7RQCE == a.COROUTINE_SUSPENDED ? objM184match0E7RQCE : new o(objM184match0E7RQCE);
    }
}
