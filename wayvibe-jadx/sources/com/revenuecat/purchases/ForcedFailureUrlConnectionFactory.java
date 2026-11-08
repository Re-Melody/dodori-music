package com.revenuecat.purchases;

import com.revenuecat.purchases.utils.UrlConnection;
import com.revenuecat.purchases.utils.UrlConnectionFactory;
import java.io.IOException;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class ForcedFailureUrlConnectionFactory implements UrlConnectionFactory {
    private final UrlConnectionFactory delegate;
    private final ForceServerErrorStrategy strategy;

    public ForcedFailureUrlConnectionFactory(UrlConnectionFactory delegate, ForceServerErrorStrategy strategy) {
        m.f(delegate, "delegate");
        m.f(strategy, "strategy");
        this.delegate = delegate;
        this.strategy = strategy;
    }

    @Override // com.revenuecat.purchases.utils.UrlConnectionFactory
    public UrlConnection createConnection(String url, int i10, int i11, String requestMethod) throws IOException {
        m.f(url, "url");
        m.f(requestMethod, "requestMethod");
        if (this.strategy.shouldForceConnectionFailure(url)) {
            throw new IOException("Forced connection failure for ".concat(url));
        }
        return this.delegate.createConnection(url, i10, i11, requestMethod);
    }
}
