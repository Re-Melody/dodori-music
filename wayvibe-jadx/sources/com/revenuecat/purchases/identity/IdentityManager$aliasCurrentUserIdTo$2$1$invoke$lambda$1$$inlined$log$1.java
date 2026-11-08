package com.revenuecat.purchases.identity;

import B2.AbstractC0112b;
import Z8.a;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.IdentityStrings;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class IdentityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1 extends n implements a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ String $newAppUserID$inlined;
    final /* synthetic */ String $oldAppUserID$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1(LogIntent logIntent, String str, String str2) {
        super(0);
        this.$intent = logIntent;
        this.$oldAppUserID$inlined = str;
        this.$newAppUserID$inlined = str2;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{this.$oldAppUserID$inlined, this.$newAppUserID$inlined}, 2, IdentityStrings.ALIAS_OLD_USER_ID_TO_CURRENT_SUCCESSFUL, sb);
    }
}
