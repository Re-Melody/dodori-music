package com.revenuecat.purchases.common.remoteconfig;

import Z8.c;
import java.util.Arrays;
import kotlin.jvm.internal.n;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfigTopic$Companion$sha256Hex$1 extends n implements c {
    public static final ConfigTopic$Companion$sha256Hex$1 INSTANCE = new ConfigTopic$Companion$sha256Hex$1();

    public ConfigTopic$Companion$sha256Hex$1() {
        super(1);
    }

    public final CharSequence invoke(byte b10) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(b10 & ForkServer.ERROR)}, 1));
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).byteValue());
    }
}
