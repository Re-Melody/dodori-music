package io.grpc.okhttp.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f21183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Method f21184f;

    public h(Provider provider, Method method, Method method2) {
        super(provider);
        this.f21183e = method;
        this.f21184f = method2;
    }

    @Override // io.grpc.okhttp.internal.k
    public final void c(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            if (lVar != l.HTTP_1_0) {
                arrayList.add(lVar.toString());
            }
        }
        try {
            this.f21183e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // io.grpc.okhttp.internal.k
    public final String d(SSLSocket sSLSocket) {
        try {
            return (String) this.f21184f.invoke(sSLSocket, new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // io.grpc.okhttp.internal.k
    public final j e() {
        return j.ALPN_AND_NPN;
    }
}
