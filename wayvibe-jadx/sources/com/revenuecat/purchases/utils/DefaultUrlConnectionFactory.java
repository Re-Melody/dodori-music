package com.revenuecat.purchases.utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultUrlConnectionFactory implements UrlConnectionFactory {
    @Override // com.revenuecat.purchases.utils.UrlConnectionFactory
    public UrlConnection createConnection(String url, int i10, int i11, String requestMethod) throws IOException {
        m.f(url, "url");
        m.f(requestMethod, "requestMethod");
        URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
        m.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setConnectTimeout(i10);
        httpURLConnection.setReadTimeout(i11);
        httpURLConnection.setRequestMethod(requestMethod);
        httpURLConnection.setDoInput(true);
        return new DefaultUrlConnection(httpURLConnection);
    }
}
