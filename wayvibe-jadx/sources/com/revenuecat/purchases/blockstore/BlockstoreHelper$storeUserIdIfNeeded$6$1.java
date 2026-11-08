package com.revenuecat.purchases.blockstore;

import M8.D;
import V0.p;
import Z8.c;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.CancellableContinuationExtensionsKt;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.jvm.internal.n;
import p119k9.InterfaceC2024l;

/* JADX INFO: loaded from: classes.dex */
public final class BlockstoreHelper$storeUserIdIfNeeded$6$1 extends n implements c {
    final /* synthetic */ InterfaceC2024l $cont;
    final /* synthetic */ String $userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockstoreHelper$storeUserIdIfNeeded$6$1(InterfaceC2024l interfaceC2024l, String str) {
        super(1);
        this.$cont = interfaceC2024l;
        this.$userId = str;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Integer) obj);
        return D.f8402a;
    }

    public final void invoke(Integer num) {
        String str = this.$userId;
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d(p.l(logLevel, new StringBuilder("[Purchases] - ")), "Block store: User ID: " + str + " stored in Block store.");
        }
        CancellableContinuationExtensionsKt.safeResume(this.$cont, D.f8402a);
    }
}
