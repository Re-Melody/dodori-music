package com.revenuecat.purchases.ui.revenuecatui.helpers;

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
}
