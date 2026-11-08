package com.revenuecat.purchases.common.networking;

import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.utils.DefaultUrlConnectionFactory;
import com.revenuecat.purchases.utils.UrlConnection;
import com.revenuecat.purchases.utils.UrlConnectionFactory;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p064f9.g;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class SourceHealthChecker {
    private static final Companion Companion = new Companion(null);
    private static final g HEALTHY_RESPONSE_CODES = new g(200, 299, 1);

    @Deprecated
    public static final int HEALTH_CHECK_TIMEOUT_MS = 5000;

    @Deprecated
    public static final String HEALTH_PATH = "v1/health/connectivity";

    @Deprecated
    public static final long RESULT_VALIDITY_MS = 10000;
    private final Map<String, CachedResult> cachedResults;
    private final DateProvider dateProvider;
    private final Object lock;
    private final Map<String, PendingCheck> pendingChecks;
    private final UrlConnectionFactory urlConnectionFactory;

    public static final class CachedResult {
        private final boolean isHealthy;
        private final long timestampMs;

        public CachedResult(long j10, boolean z10) {
            this.timestampMs = j10;
            this.isHealthy = z10;
        }

        public static /* synthetic */ CachedResult copy$default(CachedResult cachedResult, long j10, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = cachedResult.timestampMs;
            }
            if ((i10 & 2) != 0) {
                z10 = cachedResult.isHealthy;
            }
            return cachedResult.copy(j10, z10);
        }

        public final long component1() {
            return this.timestampMs;
        }

        public final boolean component2() {
            return this.isHealthy;
        }

        public final CachedResult copy(long j10, boolean z10) {
            return new CachedResult(j10, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CachedResult)) {
                return false;
            }
            CachedResult cachedResult = (CachedResult) obj;
            return this.timestampMs == cachedResult.timestampMs && this.isHealthy == cachedResult.isHealthy;
        }

        public final long getTimestampMs() {
            return this.timestampMs;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isHealthy) + (Long.hashCode(this.timestampMs) * 31);
        }

        public final boolean isHealthy() {
            return this.isHealthy;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CachedResult(timestampMs=");
            sb.append(this.timestampMs);
            sb.append(", isHealthy=");
            return b.o(sb, this.isHealthy, ')');
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final g getHEALTHY_RESPONSE_CODES() {
            return SourceHealthChecker.HEALTHY_RESPONSE_CODES;
        }

        private Companion() {
        }
    }

    public static final class PendingCheck {
        private volatile boolean isHealthy;
        private final CountDownLatch latch = new CountDownLatch(1);

        public final CountDownLatch getLatch() {
            return this.latch;
        }

        public final boolean isHealthy() {
            return this.isHealthy;
        }

        public final void setHealthy(boolean z10) {
            this.isHealthy = z10;
        }
    }

    public SourceHealthChecker() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final String healthUrl(String str) {
        CharSequence charSequenceSubSequence;
        StringBuilder sb = new StringBuilder();
        char[] cArr = {'/'};
        m.f(str, "<this>");
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i10 = length - 1;
            char cCharAt = str.charAt(length);
            int i11 = 0;
            while (true) {
                if (i11 >= 1) {
                    i11 = -1;
                    break;
                }
                if (cCharAt == cArr[i11]) {
                    break;
                }
                i11++;
            }
            if (i11 < 0) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i10 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i10;
        }
        sb.append(charSequenceSubSequence.toString());
        sb.append("/v1/health/connectivity");
        return sb.toString();
    }

    private final boolean performCheck(String str) {
        String str2;
        UrlConnection urlConnectionCreateConnection$default = null;
        try {
            try {
                str2 = str;
                try {
                    urlConnectionCreateConnection$default = UrlConnectionFactory.createConnection$default(this.urlConnectionFactory, str2, 5000, 5000, null, 8, null);
                    int responseCode = urlConnectionCreateConnection$default.getResponseCode();
                    g gVar = HEALTHY_RESPONSE_CODES;
                    boolean z10 = responseCode <= gVar.f19893b && gVar.f19892a <= responseCode;
                    LogLevel logLevel = LogLevel.VERBOSE;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.v("[Purchases] - " + logLevel.name(), "Health check for " + str2 + " returned " + responseCode + " (healthy=" + z10 + ')');
                    }
                    urlConnectionCreateConnection$default.disconnect();
                    return z10;
                } catch (IOException e2) {
                    e = e2;
                    IOException iOException = e;
                    LogLevel logLevel2 = LogLevel.VERBOSE;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.v("[Purchases] - " + logLevel2.name(), "Health check for " + str2 + " failed to connect: " + iOException);
                    }
                    if (urlConnectionCreateConnection$default != null) {
                        urlConnectionCreateConnection$default.disconnect();
                    }
                    return false;
                }
            } catch (Throwable th) {
                if (urlConnectionCreateConnection$default == null) {
                    throw th;
                }
                urlConnectionCreateConnection$default.disconnect();
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            str2 = str;
        }
    }

    private final boolean performOwnedCheck(String str, PendingCheck pendingCheck) {
        try {
            pendingCheck.setHealthy(performCheck(str));
            synchronized (this.lock) {
                this.cachedResults.put(str, new CachedResult(this.dateProvider.getNow().getTime(), pendingCheck.isHealthy()));
                this.pendingChecks.remove(str);
            }
            return pendingCheck.isHealthy();
        } finally {
            synchronized (this.lock) {
                this.cachedResults.put(str, new CachedResult(this.dateProvider.getNow().getTime(), pendingCheck.isHealthy()));
                this.pendingChecks.remove(str);
                pendingCheck.getLatch().countDown();
            }
        }
    }

    private final Boolean validCachedResult(String str) {
        CachedResult cachedResult = this.cachedResults.get(str);
        if (cachedResult != null) {
            Boolean boolValueOf = Boolean.valueOf(cachedResult.isHealthy());
            if (this.dateProvider.getNow().getTime() - cachedResult.getTimestampMs() < 10000) {
                return boolValueOf;
            }
        }
        return null;
    }

    public final boolean isHealthy(String sourceBaseUrl) throws InterruptedException {
        boolean z10;
        m.f(sourceBaseUrl, "sourceBaseUrl");
        String strHealthUrl = healthUrl(sourceBaseUrl);
        synchronized (this.lock) {
            Boolean boolValidCachedResult = validCachedResult(strHealthUrl);
            if (boolValidCachedResult != null) {
                return boolValidCachedResult.booleanValue();
            }
            Map<String, PendingCheck> map = this.pendingChecks;
            PendingCheck pendingCheck = map.get(strHealthUrl);
            if (pendingCheck == null) {
                pendingCheck = new PendingCheck();
                map.put(strHealthUrl, pendingCheck);
                z10 = true;
            } else {
                z10 = false;
            }
            PendingCheck pendingCheck2 = pendingCheck;
            if (z10) {
                return performOwnedCheck(strHealthUrl, pendingCheck2);
            }
            pendingCheck2.getLatch().await();
            return pendingCheck2.isHealthy();
        }
    }

    public SourceHealthChecker(UrlConnectionFactory urlConnectionFactory, DateProvider dateProvider) {
        m.f(urlConnectionFactory, "urlConnectionFactory");
        m.f(dateProvider, "dateProvider");
        this.urlConnectionFactory = urlConnectionFactory;
        this.dateProvider = dateProvider;
        this.lock = new Object();
        this.pendingChecks = new LinkedHashMap();
        this.cachedResults = new LinkedHashMap();
    }

    public /* synthetic */ SourceHealthChecker(UrlConnectionFactory urlConnectionFactory, DateProvider dateProvider, int i10, f fVar) {
        this((i10 & 1) != 0 ? new DefaultUrlConnectionFactory() : urlConnectionFactory, (i10 & 2) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
