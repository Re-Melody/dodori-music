package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LocaleProvider;
import com.revenuecat.purchases.common.caching.DateExtensionsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.caching.InMemoryCachedObject;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class OfferingsCache {
    private String cachedLanguageTags;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;
    private final LocaleProvider localeProvider;
    private final InMemoryCachedObject<Offerings> offeringsCachedObject;

    public OfferingsCache(DeviceCache deviceCache, DateProvider dateProvider, InMemoryCachedObject<Offerings> offeringsCachedObject, LocaleProvider localeProvider) {
        m.f(deviceCache, "deviceCache");
        m.f(dateProvider, "dateProvider");
        m.f(offeringsCachedObject, "offeringsCachedObject");
        m.f(localeProvider, "localeProvider");
        this.deviceCache = deviceCache;
        this.dateProvider = dateProvider;
        this.offeringsCachedObject = offeringsCachedObject;
        this.localeProvider = localeProvider;
    }

    public final synchronized void cacheOfferings(Offerings offerings, String str) {
        try {
            m.f(offerings, "offerings");
            this.offeringsCachedObject.cacheInstance(offerings);
            if (str != null) {
                this.deviceCache.cacheOfferingsResponse$purchases_defaultsRelease(str);
            }
            this.offeringsCachedObject.updateCacheTimestamp(this.dateProvider.getNow());
            char[] charArray = this.localeProvider.getCurrentLocalesLanguageTags().toCharArray();
            m.e(charArray, "toCharArray(...)");
            this.cachedLanguageTags = new String(charArray);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void clearCache() {
        this.offeringsCachedObject.clearCache();
        this.deviceCache.clearOfferingsResponseCache$purchases_defaultsRelease();
        this.cachedLanguageTags = null;
    }

    public final synchronized void clearInMemoryOfferingsCache() {
        this.offeringsCachedObject.clearCache();
        this.cachedLanguageTags = null;
    }

    public final synchronized void forceCacheStale() {
        this.offeringsCachedObject.clearCacheTimestamp();
        this.cachedLanguageTags = null;
    }

    public final synchronized Offerings getCachedOfferings() {
        return this.offeringsCachedObject.getCachedInstance();
    }

    public final synchronized JSONObject getCachedOfferingsResponse() {
        return this.deviceCache.getOfferingsResponseCache$purchases_defaultsRelease();
    }

    public final synchronized boolean isOfferingsCacheStale(boolean z10) {
        return DateExtensionsKt.isCacheStale$default(this.offeringsCachedObject.getLastUpdatedAt$purchases_defaultsRelease(), z10, this.dateProvider, null, 4, null) || !m.b(this.cachedLanguageTags, this.localeProvider.getCurrentLocalesLanguageTags());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OfferingsCache(DeviceCache deviceCache, DateProvider dateProvider, InMemoryCachedObject inMemoryCachedObject, LocaleProvider localeProvider, int i10, f fVar) {
        dateProvider = (i10 & 2) != 0 ? new DefaultDateProvider() : dateProvider;
        this(deviceCache, dateProvider, (i10 & 4) != 0 ? new InMemoryCachedObject(null, dateProvider, 1, null) : inMemoryCachedObject, localeProvider);
    }
}
