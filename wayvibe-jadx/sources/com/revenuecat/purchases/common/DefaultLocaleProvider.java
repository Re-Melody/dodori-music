package com.revenuecat.purchases.common;

import G1.e;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultLocaleProvider implements LocaleProvider {
    private String preferredLocaleOverride;

    @Override // com.revenuecat.purchases.common.LocaleProvider
    public String getCurrentLocalesLanguageTags() {
        String str = this.preferredLocaleOverride;
        if (str != null) {
            String languageTags = e.c().f5348a.f5349a.toLanguageTags();
            m.e(languageTags, "getDefault().toLanguageTags()");
            if (languageTags.length() != 0) {
                str = str + ',' + languageTags;
            }
            if (str != null) {
                return str;
            }
        }
        String languageTags2 = e.c().f5348a.f5349a.toLanguageTags();
        m.e(languageTags2, "getDefault().toLanguageTags()");
        return languageTags2;
    }

    public final void setPreferredLocaleOverride(String str) {
        this.preferredLocaleOverride = str;
    }
}
