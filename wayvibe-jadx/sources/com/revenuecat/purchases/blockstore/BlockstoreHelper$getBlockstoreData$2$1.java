package com.revenuecat.purchases.blockstore;

import G5.e;
import M8.D;
import Z8.c;
import com.revenuecat.purchases.common.CancellableContinuationExtensionsKt;
import java.util.Collections;
import kotlin.jvm.internal.n;
import p119k9.InterfaceC2024l;

/* JADX INFO: loaded from: classes.dex */
public final class BlockstoreHelper$getBlockstoreData$2$1 extends n implements c {
    final /* synthetic */ InterfaceC2024l $cont;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockstoreHelper$getBlockstoreData$2$1(InterfaceC2024l interfaceC2024l) {
        super(1);
        this.$cont = interfaceC2024l;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((e) obj);
        return D.f8402a;
    }

    public final void invoke(e eVar) {
        CancellableContinuationExtensionsKt.safeResume(this.$cont, Collections.unmodifiableMap(eVar.f5474c));
    }
}
