package com.revenuecat.purchases.common.localrules;

import M8.o;
import Q8.d;
import R8.a;
import S8.c;
import S8.e;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes2.dex */
@e(c = "com.revenuecat.purchases.common.localrules.RulesDimensionResolver", f = "RulesDimensionResolver.kt", l = {62}, m = "snapshot-gIAlu-s")
public final class RulesDimensionResolver$snapshot$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RulesDimensionResolver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RulesDimensionResolver$snapshot$1(RulesDimensionResolver rulesDimensionResolver, d dVar) {
        super(dVar);
        this.this$0 = rulesDimensionResolver;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= MediaPlayerException.ERROR_UNKNOWN;
        Object objM187snapshotgIAlus = this.this$0.m187snapshotgIAlus(null, this);
        return objM187snapshotgIAlus == a.COROUTINE_SUSPENDED ? objM187snapshotgIAlus : new o(objM187snapshotgIAlus);
    }
}
