package com.revenuecat.purchases.common;

import B2.AbstractC0112b;
import D7.W;
import N8.s;
import V0.p;
import android.content.Context;
import com.revenuecat.purchases.APIKeyValidator;
import com.revenuecat.purchases.DangerousSettings;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.PurchasesAreCompletedByKt;
import com.revenuecat.purchases.Store;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class AppConfig {
    public static final String baseUrlString = "https://api.revenuecat.com/";
    private final AtomicBoolean _isAppBackgrounded;
    private final APIKeyValidator.ValidationResult apiKeyValidationResult;
    private final URL baseURL;
    private final DangerousSettings dangerousSettings;
    private final boolean enableOfflineEntitlements;
    private final List<URL> fallbackBaseURLs;
    private boolean finishTransactions;
    private boolean forceSigningErrors;
    private final boolean hasProxyURL;
    private final boolean isDebugBuild;
    private final String languageTag;
    private final String packageName;
    private final PlatformInfo platformInfo;
    private final String playServicesVersionName;
    private final String playStoreVersionName;
    private final PurchasesAreCompletedBy purchasesAreCompletedBy;
    private final boolean runningTests;
    private final boolean showInAppMessagesAutomatically;
    private final Store store;
    private final String versionName;
    public static final Companion Companion = new Companion(null);
    private static final URL diagnosticsURL = new URL("https://api-diagnostics.revenuecat.com/");
    private static final URL paywallEventsURL = new URL("https://api-paywalls.revenuecat.com/");
    private static final URL adEventsURL = new URL("https://a.revenue.cat/");
    private static final URL fallbackURL = new URL("https://api-production.8-lives-cat.io/");

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final URL getAdEventsURL() {
            return AppConfig.adEventsURL;
        }

        public final URL getDiagnosticsURL() {
            return AppConfig.diagnosticsURL;
        }

        public final URL getFallbackURL() {
            return AppConfig.fallbackURL;
        }

        public final URL getPaywallEventsURL() {
            return AppConfig.paywallEventsURL;
        }

        private Companion() {
        }
    }

    public AppConfig(Context context, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z10, PlatformInfo platformInfo, URL url, Store store, boolean z11, APIKeyValidator.ValidationResult apiKeyValidationResult, DangerousSettings dangerousSettings, boolean z12, boolean z13, String baseUrlString2) {
        URL url2;
        LogHandler currentLogHandler;
        String strL;
        String str;
        m.f(context, "context");
        m.f(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        m.f(platformInfo, "platformInfo");
        m.f(store, "store");
        m.f(apiKeyValidationResult, "apiKeyValidationResult");
        m.f(dangerousSettings, "dangerousSettings");
        m.f(baseUrlString2, "baseUrlString");
        this.purchasesAreCompletedBy = purchasesAreCompletedBy;
        this.showInAppMessagesAutomatically = z10;
        this.platformInfo = platformInfo;
        this.store = store;
        this.isDebugBuild = z11;
        this.apiKeyValidationResult = apiKeyValidationResult;
        this.dangerousSettings = dangerousSettings;
        this.runningTests = z12;
        this.forceSigningErrors = z13;
        this._isAppBackgrounded = new AtomicBoolean(true);
        this.enableOfflineEntitlements = true;
        Locale locale = UtilsKt.getLocale(context);
        String languageTag = locale != null ? locale.toLanguageTag() : null;
        this.languageTag = languageTag == null ? "" : languageTag;
        String versionName = UtilsKt.getVersionName(context);
        this.versionName = versionName != null ? versionName : "";
        String packageName = context.getPackageName();
        m.e(packageName, "context.packageName");
        this.packageName = packageName;
        this.finishTransactions = PurchasesAreCompletedByKt.getFinishTransactions(purchasesAreCompletedBy);
        this.hasProxyURL = url != null;
        if (url != null) {
            LogIntent logIntent = LogIntent.INFO;
            AppConfig$baseURL$lambda$1$$inlined$log$1 appConfig$baseURL$lambda$1$$inlined$log$1 = new AppConfig$baseURL$lambda$1$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strL = p.l(logLevel, new StringBuilder("[Purchases] - "));
                        str = (String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke();
                        currentLogHandler.d(strL, str);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(p.l(logLevel2, new StringBuilder("[Purchases] - ")), (String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(p.l(logLevel3, new StringBuilder("[Purchases] - ")), (String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strL = p.l(logLevel4, new StringBuilder("[Purchases] - "));
                        str = (String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke();
                        currentLogHandler.d(strL, str);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(p.l(logLevel5, new StringBuilder("[Purchases] - ")), (String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strL = p.l(logLevel6, new StringBuilder("[Purchases] - "));
                        str = (String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke();
                        currentLogHandler.d(strL, str);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strL = p.l(logLevel7, new StringBuilder("[Purchases] - "));
                        str = (String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke();
                        currentLogHandler.d(strL, str);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(p.l(logLevel8, new StringBuilder("[Purchases] - ")), (String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(p.l(logLevel9, new StringBuilder("[Purchases] - ")), (String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(p.l(logLevel10, new StringBuilder("[Purchases] - ")), (String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke(), null);
                    break;
            }
            url2 = url;
        } else {
            url2 = new URL(baseUrlString2);
        }
        this.baseURL = url2;
        this.fallbackBaseURLs = url != null ? s.f8650a : W.T(fallbackURL);
        this.playStoreVersionName = UtilsKt.getPlayStoreVersionName(context);
        this.playServicesVersionName = UtilsKt.getPlayServicesVersionName(context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AppConfig.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m.d(obj, "null cannot be cast to non-null type com.revenuecat.purchases.common.AppConfig");
        AppConfig appConfig = (AppConfig) obj;
        return m.b(this.platformInfo, appConfig.platformInfo) && this.store == appConfig.store && this.isDebugBuild == appConfig.isDebugBuild && m.b(this.dangerousSettings, appConfig.dangerousSettings) && m.b(this.languageTag, appConfig.languageTag) && m.b(this.versionName, appConfig.versionName) && m.b(this.packageName, appConfig.packageName) && this.finishTransactions == appConfig.finishTransactions && getForceSigningErrors() == appConfig.getForceSigningErrors() && m.b(this.baseURL, appConfig.baseURL) && this.showInAppMessagesAutomatically == appConfig.showInAppMessagesAutomatically && isAppBackgrounded() == appConfig.isAppBackgrounded() && this.apiKeyValidationResult == appConfig.apiKeyValidationResult;
    }

    public final APIKeyValidator.ValidationResult getApiKeyValidationResult() {
        return this.apiKeyValidationResult;
    }

    public final boolean getApplyObfuscatedAccountIdToSubscriptionChanges() {
        return this.dangerousSettings.getApplyObfuscatedAccountIdToSubscriptionChanges$purchases_defaultsRelease();
    }

    public final URL getBaseURL() {
        return this.baseURL;
    }

    public final boolean getCustomEntitlementComputation() {
        return this.dangerousSettings.getCustomEntitlementComputation$purchases_defaultsRelease();
    }

    public final DangerousSettings getDangerousSettings() {
        return this.dangerousSettings;
    }

    public final boolean getEnableOfflineEntitlements() {
        return this.enableOfflineEntitlements;
    }

    public final List<URL> getFallbackBaseURLs() {
        return this.fallbackBaseURLs;
    }

    public final boolean getFinishTransactions() {
        return this.finishTransactions;
    }

    public final boolean getForceSigningErrors() {
        return this.runningTests && this.forceSigningErrors;
    }

    public final boolean getHasProxyURL() {
        return this.hasProxyURL;
    }

    public final String getLanguageTag() {
        return this.languageTag;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final PlatformInfo getPlatformInfo() {
        return this.platformInfo;
    }

    public final String getPlayServicesVersionName() {
        return this.playServicesVersionName;
    }

    public final String getPlayStoreVersionName() {
        return this.playStoreVersionName;
    }

    public final PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchasesAreCompletedBy;
    }

    public final boolean getRunningTests() {
        return this.runningTests;
    }

    public final boolean getShowInAppMessagesAutomatically() {
        return this.showInAppMessagesAutomatically;
    }

    public final Store getStore() {
        return this.store;
    }

    public final boolean getUiPreviewMode() {
        return this.dangerousSettings.getUiPreviewMode$purchases_defaultsRelease();
    }

    public final boolean getUsesRemoteConfigAPISources() {
        return this.dangerousSettings.getUsesRemoteConfigAPISources$purchases_defaultsRelease();
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return this.apiKeyValidationResult.hashCode() + ((Boolean.hashCode(isAppBackgrounded()) + b.f((this.baseURL.hashCode() + ((Boolean.hashCode(getForceSigningErrors()) + b.f(AbstractC0112b.a(AbstractC0112b.a(AbstractC0112b.a((this.dangerousSettings.hashCode() + b.f((this.store.hashCode() + (this.platformInfo.hashCode() * 31)) * 31, 31, this.isDebugBuild)) * 31, 31, this.languageTag), 31, this.versionName), 31, this.packageName), 31, this.finishTransactions)) * 31)) * 31, 31, this.showInAppMessagesAutomatically)) * 31);
    }

    public final boolean isAppBackgrounded() {
        return this._isAppBackgrounded.get();
    }

    public final boolean isDebugBuild() {
        return this.isDebugBuild;
    }

    public final void setAppBackgrounded(boolean z10) {
        this._isAppBackgrounded.set(z10);
    }

    public final void setFinishTransactions(boolean z10) {
        this.finishTransactions = z10;
    }

    public final void setForceSigningErrors(boolean z10) {
        this.forceSigningErrors = z10;
    }

    public String toString() {
        return "AppConfig(platformInfo=" + this.platformInfo + ", store=" + this.store + ", isDebugBuild=" + this.isDebugBuild + ", dangerousSettings=" + this.dangerousSettings + ", languageTag='" + this.languageTag + "', versionName='" + this.versionName + "', packageName='" + this.packageName + "', finishTransactions=" + this.finishTransactions + ", showInAppMessagesAutomatically=" + this.showInAppMessagesAutomatically + ", apiKeyValidationResult=" + this.apiKeyValidationResult + ", baseURL=" + this.baseURL + ')';
    }

    public /* synthetic */ AppConfig(Context context, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z10, PlatformInfo platformInfo, URL url, Store store, boolean z11, APIKeyValidator.ValidationResult validationResult, DangerousSettings dangerousSettings, boolean z12, boolean z13, String str, int i10, f fVar) {
        this(context, purchasesAreCompletedBy, z10, platformInfo, url, store, z11, validationResult, (i10 & 256) != 0 ? new DangerousSettings(true) : dangerousSettings, (i10 & 512) != 0 ? false : z12, (i10 & 1024) != 0 ? false : z13, (i10 & 2048) != 0 ? baseUrlString : str);
    }
}
