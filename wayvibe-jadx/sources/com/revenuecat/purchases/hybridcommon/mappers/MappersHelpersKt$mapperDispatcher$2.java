package com.revenuecat.purchases.hybridcommon.mappers;

import Z8.a;
import kotlin.jvm.internal.n;
import p119k9.AbstractC2040y;
import p119k9.O;

/* JADX INFO: loaded from: classes2.dex */
public final class MappersHelpersKt$mapperDispatcher$2 extends n implements a {
    public static final MappersHelpersKt$mapperDispatcher$2 INSTANCE = new MappersHelpersKt$mapperDispatcher$2();

    public MappersHelpersKt$mapperDispatcher$2() {
        super(0);
    }

    @Override // Z8.a
    public final AbstractC2040y invoke() {
        AbstractC2040y overrideMapperDispatcher = MappersHelpersKt.getOverrideMapperDispatcher();
        return overrideMapperDispatcher == null ? O.f21697a : overrideMapperDispatcher;
    }
}
