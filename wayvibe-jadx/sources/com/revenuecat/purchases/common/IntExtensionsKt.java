package com.revenuecat.purchases.common;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class IntExtensionsKt {
    public static final int fromLittleEndianBytes(k kVar, byte[] byteArray) {
        m.f(kVar, "<this>");
        m.f(byteArray, "byteArray");
        return ByteBuffer.wrap(byteArray).order(ByteOrder.LITTLE_ENDIAN).getInt();
    }
}
