package com.revenuecat.purchases.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
final class DefaultUrlConnection implements UrlConnection {
    private final HttpURLConnection connection;

    public DefaultUrlConnection(HttpURLConnection connection) {
        m.f(connection, "connection");
        this.connection = connection;
    }

    @Override // com.revenuecat.purchases.utils.UrlConnection
    public void disconnect() {
        this.connection.disconnect();
    }

    @Override // com.revenuecat.purchases.utils.UrlConnection
    public InputStream getInputStream() throws IOException {
        InputStream inputStream = this.connection.getInputStream();
        m.e(inputStream, "connection.inputStream");
        return inputStream;
    }

    @Override // com.revenuecat.purchases.utils.UrlConnection
    public int getResponseCode() {
        return this.connection.getResponseCode();
    }
}
