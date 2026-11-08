package com.revenuecat.purchases.common.networking;

import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class HTTPTimeoutManager {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_TIMEOUT_MS = 30000;
    public static final long FALLBACK_HOST_TIMEOUT_MS = 30000;
    public static final long MAIN_SOURCE_NO_FALLBACK_REDUCED_TIMEOUT_MS = 5000;
    public static final long MAIN_SOURCE_NO_FALLBACK_TIMEOUT_MS = 15000;
    public static final long REDUCED_TIMEOUT_MS = 2000;
    public static final long SUPPORTED_FALLBACK_TIMEOUT_MS = 5000;
    public static final long TEST_DIVIDER = 10;
    public static final long TIMEOUT_RESET_INTERVAL_MS = 600000;
    private final AppConfig appConfig;
    private final DateProvider dateProvider;
    private final ConcurrentHashMap<String, Long> lastTimeoutByHost;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public enum RequestResult {
        SUCCESS_ON_MAIN_BACKEND,
        MAIN_SOURCE_TIMED_OUT,
        OTHER_RESULT
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestResult.values().length];
            try {
                iArr[RequestResult.SUCCESS_ON_MAIN_BACKEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestResult.MAIN_SOURCE_TIMED_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestResult.OTHER_RESULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HTTPTimeoutManager(AppConfig appConfig, DateProvider dateProvider) {
        m.f(appConfig, "appConfig");
        m.f(dateProvider, "dateProvider");
        this.appConfig = appConfig;
        this.dateProvider = dateProvider;
        this.lastTimeoutByHost = new ConcurrentHashMap<>();
    }

    private final boolean hasRecentTimeout(String str) {
        Long l10 = this.lastTimeoutByHost.get(str);
        if (l10 == null) {
            return false;
        }
        long jLongValue = l10.longValue();
        boolean z10 = this.dateProvider.getNow().getTime() - jLongValue >= TIMEOUT_RESET_INTERVAL_MS;
        if (z10) {
            this.lastTimeoutByHost.remove(str, Long.valueOf(jLongValue));
        }
        return !z10;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001b  */
    public final long getTimeoutForRequest(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        long j10 = 30000;
        if (!z10 && !z12) {
            boolean zHasRecentTimeout = str != null ? hasRecentTimeout(str) : false;
            if (z11 && zHasRecentTimeout) {
                j10 = 2000;
            } else if (z11) {
                j10 = 5000;
            } else if (z13) {
                if (zHasRecentTimeout) {
                    j10 = 5000;
                } else {
                    j10 = MAIN_SOURCE_NO_FALLBACK_TIMEOUT_MS;
                }
            }
        }
        return this.appConfig.getRunningTests() ? j10 / 10 : j10;
    }

    public final void recordRequestResult(String str, RequestResult result) {
        m.f(result, "result");
        if (str == null) {
            return;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[result.ordinal()];
        if (i10 == 1) {
            this.lastTimeoutByHost.remove(str);
        } else {
            if (i10 != 2) {
                return;
            }
            this.lastTimeoutByHost.put(str, Long.valueOf(this.dateProvider.getNow().getTime()));
        }
    }

    public /* synthetic */ HTTPTimeoutManager(AppConfig appConfig, DateProvider dateProvider, int i10, f fVar) {
        this(appConfig, (i10 & 2) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
