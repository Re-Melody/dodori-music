package com.revenuecat.purchases.common.verification;

import N8.m;

/* JADX INFO: loaded from: classes2.dex */
public final class SignatureKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] copyOf(byte[] bArr, Signature.Component component) {
        return m.n0(bArr, component.getStartByte(), component.getEndByte());
    }
}
