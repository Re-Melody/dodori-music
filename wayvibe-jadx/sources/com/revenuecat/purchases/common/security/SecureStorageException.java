package com.revenuecat.purchases.common.security;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class SecureStorageException extends Exception {
    public /* synthetic */ SecureStorageException(String str, Throwable th, int i10, f fVar) {
        this(str, (i10 & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureStorageException(String message, Throwable th) {
        super(message, th);
        m.f(message, "message");
    }
}
