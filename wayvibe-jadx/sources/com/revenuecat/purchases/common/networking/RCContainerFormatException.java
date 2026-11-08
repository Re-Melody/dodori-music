package com.revenuecat.purchases.common.networking;

import com.revenuecat.purchases.utils.SerializationException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class RCContainerFormatException extends SerializationException {
    public /* synthetic */ RCContainerFormatException(String str, Throwable th, int i10, f fVar) {
        this(str, (i10 & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RCContainerFormatException(String message, Throwable th) {
        super(message, th);
        m.f(message, "message");
    }
}
