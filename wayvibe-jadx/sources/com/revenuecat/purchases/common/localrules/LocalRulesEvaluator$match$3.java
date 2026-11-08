package com.revenuecat.purchases.common.localrules;

import M8.o;
import Q8.d;
import R8.a;
import S8.c;
import S8.e;
import com.apple.android.music.playback.model.MediaPlayerException;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: loaded from: classes2.dex */
@e(c = "com.revenuecat.purchases.common.localrules.LocalRulesEvaluator", f = "LocalRulesEvaluator.kt", l = {PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS, 69}, m = "match-BWLJW6A")
public final class LocalRulesEvaluator$match$3<Rule> extends c {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocalRulesEvaluator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalRulesEvaluator$match$3(LocalRulesEvaluator localRulesEvaluator, d dVar) {
        super(dVar);
        this.this$0 = localRulesEvaluator;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= MediaPlayerException.ERROR_UNKNOWN;
        Object objM185matchBWLJW6A = this.this$0.m185matchBWLJW6A(null, null, null, this);
        return objM185matchBWLJW6A == a.COROUTINE_SUSPENDED ? objM185matchBWLJW6A : new o(objM185matchBWLJW6A);
    }
}
