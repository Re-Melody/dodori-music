package com.revenuecat.purchases;

import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import java.net.URL;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public interface ForceServerErrorStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ForceServerErrorStrategy doNotFail;
        private static final ForceServerErrorStrategy failAll;
        private static final ForceServerErrorStrategy failExceptFallbackUrls;

        static {
            final int i10 = 0;
            doNotFail = new ForceServerErrorStrategy() { // from class: com.revenuecat.purchases.b
                @Override // com.revenuecat.purchases.ForceServerErrorStrategy
                public final boolean shouldForceServerError(URL url, Endpoint endpoint) {
                    switch (i10) {
                        case 0:
                            return ForceServerErrorStrategy.Companion.doNotFail$lambda$0(url, endpoint);
                        case 1:
                            return ForceServerErrorStrategy.Companion.failAll$lambda$1(url, endpoint);
                        default:
                            return ForceServerErrorStrategy.Companion.failExceptFallbackUrls$lambda$2(url, endpoint);
                    }
                }
            };
            final int i11 = 1;
            failAll = new ForceServerErrorStrategy() { // from class: com.revenuecat.purchases.b
                @Override // com.revenuecat.purchases.ForceServerErrorStrategy
                public final boolean shouldForceServerError(URL url, Endpoint endpoint) {
                    switch (i11) {
                        case 0:
                            return ForceServerErrorStrategy.Companion.doNotFail$lambda$0(url, endpoint);
                        case 1:
                            return ForceServerErrorStrategy.Companion.failAll$lambda$1(url, endpoint);
                        default:
                            return ForceServerErrorStrategy.Companion.failExceptFallbackUrls$lambda$2(url, endpoint);
                    }
                }
            };
            final int i12 = 2;
            failExceptFallbackUrls = new ForceServerErrorStrategy() { // from class: com.revenuecat.purchases.b
                @Override // com.revenuecat.purchases.ForceServerErrorStrategy
                public final boolean shouldForceServerError(URL url, Endpoint endpoint) {
                    switch (i12) {
                        case 0:
                            return ForceServerErrorStrategy.Companion.doNotFail$lambda$0(url, endpoint);
                        case 1:
                            return ForceServerErrorStrategy.Companion.failAll$lambda$1(url, endpoint);
                        default:
                            return ForceServerErrorStrategy.Companion.failExceptFallbackUrls$lambda$2(url, endpoint);
                    }
                }
            };
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean doNotFail$lambda$0(URL url, Endpoint endpoint) {
            m.f(url, "<anonymous parameter 0>");
            m.f(endpoint, "<anonymous parameter 1>");
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean failAll$lambda$1(URL url, Endpoint endpoint) {
            m.f(url, "<anonymous parameter 0>");
            m.f(endpoint, "<anonymous parameter 1>");
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean failExceptFallbackUrls$lambda$2(URL baseURL, Endpoint endpoint) {
            m.f(baseURL, "baseURL");
            m.f(endpoint, "<anonymous parameter 1>");
            return !m.b(baseURL.toString(), AppConfig.Companion.getFallbackURL().toString());
        }

        public final ForceServerErrorStrategy getDoNotFail() {
            return doNotFail;
        }

        public final ForceServerErrorStrategy getFailAll() {
            return failAll;
        }

        public final ForceServerErrorStrategy getFailExceptFallbackUrls() {
            return failExceptFallbackUrls;
        }
    }

    public static final class DefaultImpls {
        @Deprecated
        public static HTTPResult fakeResponseWithoutPerformingRequest(ForceServerErrorStrategy forceServerErrorStrategy, URL baseURL, Endpoint endpoint) {
            m.f(baseURL, "baseURL");
            m.f(endpoint, "endpoint");
            return ForceServerErrorStrategy.super.fakeResponseWithoutPerformingRequest(baseURL, endpoint);
        }

        @Deprecated
        public static String getServerErrorURL(ForceServerErrorStrategy forceServerErrorStrategy) {
            return ForceServerErrorStrategy.super.getServerErrorURL();
        }

        @Deprecated
        public static URL modifyRequestURL(ForceServerErrorStrategy forceServerErrorStrategy, URL url, Endpoint endpoint) {
            m.f(url, "url");
            m.f(endpoint, "endpoint");
            return ForceServerErrorStrategy.super.modifyRequestURL(url, endpoint);
        }

        @Deprecated
        public static boolean shouldForceConnectionFailure(ForceServerErrorStrategy forceServerErrorStrategy, String url) {
            m.f(url, "url");
            return ForceServerErrorStrategy.super.shouldForceConnectionFailure(url);
        }
    }

    default HTTPResult fakeResponseWithoutPerformingRequest(URL baseURL, Endpoint endpoint) {
        m.f(baseURL, "baseURL");
        m.f(endpoint, "endpoint");
        return null;
    }

    default String getServerErrorURL() {
        return "https://api.revenuecat.com/force-server-failure";
    }

    default URL modifyRequestURL(URL url, Endpoint endpoint) {
        m.f(url, "url");
        m.f(endpoint, "endpoint");
        return url;
    }

    default boolean shouldForceConnectionFailure(String url) {
        m.f(url, "url");
        return false;
    }

    boolean shouldForceServerError(URL url, Endpoint endpoint);
}
