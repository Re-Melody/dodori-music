package com.revenuecat.purchases.ads.events.types;

import B2.AbstractC0112b;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class AdRewardFailureReason {
    private final String value;

    public static final class BackendError extends AdRewardFailureReason {
        private final String reason;

        public BackendError(String str) {
            super(str == null ? "backend_error" : str);
            this.reason = str;
        }

        public static /* synthetic */ BackendError copy$default(BackendError backendError, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = backendError.reason;
            }
            return backendError.copy(str);
        }

        public final String component1() {
            return this.reason;
        }

        public final BackendError copy(String str) {
            return new BackendError(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BackendError) && m.b(this.reason, ((BackendError) obj).reason);
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            String str = this.reason;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC0112b.j(new StringBuilder("BackendError(reason="), this.reason, ')');
        }
    }

    public static final class Cancelled extends AdRewardFailureReason {
        public static final Cancelled INSTANCE = new Cancelled();

        private Cancelled() {
            super("cancelled");
        }
    }

    public static final class NetworkError extends AdRewardFailureReason {
        public static final NetworkError INSTANCE = new NetworkError();

        private NetworkError() {
            super("network_error");
        }
    }

    public static final class Timeout extends AdRewardFailureReason {
        public static final Timeout INSTANCE = new Timeout();

        private Timeout() {
            super("timeout");
        }
    }

    public static final class Unknown extends AdRewardFailureReason {
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super("unknown");
        }
    }

    public AdRewardFailureReason(String value) {
        m.f(value, "value");
        this.value = value;
    }

    public final String getValue$purchases_defaultsRelease() {
        return this.value;
    }
}
