package com.revenuecat.purchases.common.networking;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public enum ConnectionErrorReason {
    TIMEOUT,
    NO_NETWORK,
    OTHER;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final ConnectionErrorReason fromIOException(IOException ioException) {
            m.f(ioException, "ioException");
            if (ioException instanceof SocketTimeoutException) {
                return ConnectionErrorReason.TIMEOUT;
            }
            return ioException instanceof ConnectException ? true : ioException instanceof UnknownHostException ? ConnectionErrorReason.NO_NETWORK : ConnectionErrorReason.OTHER;
        }

        private Companion() {
        }
    }
}
