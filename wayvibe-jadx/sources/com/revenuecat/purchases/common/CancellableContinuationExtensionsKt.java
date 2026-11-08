package com.revenuecat.purchases.common;

import Q5.b;
import kotlin.jvm.internal.m;
import p119k9.InterfaceC2024l;

/* JADX INFO: loaded from: classes2.dex */
public final class CancellableContinuationExtensionsKt {
    public static final <T> void safeResume(InterfaceC2024l interfaceC2024l, T t10) {
        m.f(interfaceC2024l, "<this>");
        if (interfaceC2024l.isActive()) {
            interfaceC2024l.resumeWith(t10);
        }
    }

    public static final <T> void safeResumeWithException(InterfaceC2024l interfaceC2024l, Throwable exception) {
        m.f(interfaceC2024l, "<this>");
        m.f(exception, "exception");
        if (interfaceC2024l.isActive()) {
            interfaceC2024l.resumeWith(b.r(exception));
        }
    }
}
