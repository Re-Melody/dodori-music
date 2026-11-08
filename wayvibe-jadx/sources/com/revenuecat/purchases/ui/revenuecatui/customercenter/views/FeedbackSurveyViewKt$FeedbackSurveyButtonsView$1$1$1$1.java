package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import M8.D;
import Z8.a;
import Z8.c;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class FeedbackSurveyViewKt$FeedbackSurveyButtonsView$1$1$1$1 extends n implements a {
    final /* synthetic */ c $onAnswerSubmit;
    final /* synthetic */ CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option $option;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackSurveyViewKt$FeedbackSurveyButtonsView$1$1$1$1(c cVar, CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option option) {
        super(0);
        this.$onAnswerSubmit = cVar;
        this.$option = option;
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m702invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m702invoke() {
        this.$onAnswerSubmit.invoke(this.$option);
    }
}
