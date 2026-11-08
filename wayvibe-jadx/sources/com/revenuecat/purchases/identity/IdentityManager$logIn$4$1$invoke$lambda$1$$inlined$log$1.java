package com.revenuecat.purchases.identity;

import B2.AbstractC0112b;
import Z8.a;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.IdentityStrings;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class IdentityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1 extends n implements a {
    final /* synthetic */ boolean $created$inlined;
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ String $newAppUserID$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1(LogIntent logIntent, String str, boolean z10) {
        super(0);
        this.$intent = logIntent;
        this.$newAppUserID$inlined = str;
        this.$created$inlined = z10;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{this.$newAppUserID$inlined, Boolean.valueOf(this.$created$inlined)}, 2, IdentityStrings.LOG_IN_SUCCESSFUL, sb);
    }
}
