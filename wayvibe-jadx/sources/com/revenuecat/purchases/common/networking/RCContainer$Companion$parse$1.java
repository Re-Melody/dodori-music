package com.revenuecat.purchases.common.networking;

import com.amazon.a.a.o.c.a.b;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class RCContainer$Companion$parse$1 extends n implements Z8.a {
    final /* synthetic */ ByteBuffer $source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RCContainer$Companion$parse$1(ByteBuffer byteBuffer) {
        super(0);
        this.$source = byteBuffer;
    }

    @Override // Z8.a
    public final String invoke() {
        return "Buffer too small for header: need at least 8 bytes, got " + this.$source.remaining() + b.f16463a;
    }
}
