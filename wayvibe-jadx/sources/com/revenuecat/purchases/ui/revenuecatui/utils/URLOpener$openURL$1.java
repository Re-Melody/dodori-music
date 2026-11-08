package com.revenuecat.purchases.ui.revenuecatui.utils;

import M8.D;
import Z8.c;
import android.content.Context;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class URLOpener$openURL$1 extends j implements c {
    final /* synthetic */ Context $context;
    final /* synthetic */ u $opened;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public URLOpener$openURL$1(u uVar, Context context) {
        super(1, l.class, "handleException", "openURL$handleException(Lkotlin/jvm/internal/Ref$BooleanRef;Landroid/content/Context;Ljava/lang/Exception;)V", 0);
        this.$opened = uVar;
        this.$context = context;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Exception) obj);
        return D.f8402a;
    }

    public final void invoke(Exception p10) {
        m.f(p10, "p0");
        URLOpener.openURL$handleException(this.$opened, this.$context, p10);
    }
}
