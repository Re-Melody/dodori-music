package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import Z8.c;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class FeedbackSurveyData {
    public static final int $stable = 8;
    private final CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey;
    private final c onAnswerSubmitted;

    public FeedbackSurveyData(CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey, c onAnswerSubmitted) {
        m.f(feedbackSurvey, "feedbackSurvey");
        m.f(onAnswerSubmitted, "onAnswerSubmitted");
        this.feedbackSurvey = feedbackSurvey;
        this.onAnswerSubmitted = onAnswerSubmitted;
    }

    public static /* synthetic */ FeedbackSurveyData copy$default(FeedbackSurveyData feedbackSurveyData, CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            feedbackSurvey = feedbackSurveyData.feedbackSurvey;
        }
        if ((i10 & 2) != 0) {
            cVar = feedbackSurveyData.onAnswerSubmitted;
        }
        return feedbackSurveyData.copy(feedbackSurvey, cVar);
    }

    public final CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey component1() {
        return this.feedbackSurvey;
    }

    public final c component2() {
        return this.onAnswerSubmitted;
    }

    public final FeedbackSurveyData copy(CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey, c onAnswerSubmitted) {
        m.f(feedbackSurvey, "feedbackSurvey");
        m.f(onAnswerSubmitted, "onAnswerSubmitted");
        return new FeedbackSurveyData(feedbackSurvey, onAnswerSubmitted);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackSurveyData)) {
            return false;
        }
        FeedbackSurveyData feedbackSurveyData = (FeedbackSurveyData) obj;
        return m.b(this.feedbackSurvey, feedbackSurveyData.feedbackSurvey) && m.b(this.onAnswerSubmitted, feedbackSurveyData.onAnswerSubmitted);
    }

    public final /* synthetic */ CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey getFeedbackSurvey() {
        return this.feedbackSurvey;
    }

    public final /* synthetic */ c getOnAnswerSubmitted() {
        return this.onAnswerSubmitted;
    }

    public int hashCode() {
        return this.onAnswerSubmitted.hashCode() + (this.feedbackSurvey.hashCode() * 31);
    }

    public String toString() {
        return "FeedbackSurveyData(feedbackSurvey=" + this.feedbackSurvey + ", onAnswerSubmitted=" + this.onAnswerSubmitted + ')';
    }
}
