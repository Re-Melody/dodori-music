package io.grpc.okhttp.internal;

import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements PrivilegedExceptionAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21176a;

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        switch (this.f21176a) {
            case 0:
                return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
            case 1:
                return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            default:
                return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }
}
