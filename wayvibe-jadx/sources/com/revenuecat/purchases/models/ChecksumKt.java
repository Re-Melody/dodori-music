package com.revenuecat.purchases.models;

import Z8.c;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class ChecksumKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.models.ChecksumKt$toHexString$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements c {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final CharSequence invoke(byte b10) {
            return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        }

        @Override // Z8.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).byteValue());
        }
    }

    public static final String toHexString(byte[] bArr) {
        m.f(bArr, "<this>");
        return N8.m.x0(bArr, "", AnonymousClass1.INSTANCE, 30);
    }
}
