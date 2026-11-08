package com.revenuecat.purchases.utils;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public class SerializationException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerializationException(String message, Throwable th) {
        super(message, th);
        m.f(message, "message");
    }

    public /* synthetic */ SerializationException(String str, Throwable th, int i10, f fVar) {
        this(str, (i10 & 2) != 0 ? null : th);
    }
}
