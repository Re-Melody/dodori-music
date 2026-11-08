package okhttp3.internal.http;

import java.util.ArrayList;
import kotlin.jvm.internal.m;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes2.dex */
public final class RealInterceptorChain implements Interceptor.Chain {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealCall f24341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f24342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Exchange f24344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Request f24345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24349i;

    public RealInterceptorChain(RealCall call, ArrayList arrayList, int i10, Exchange exchange, Request request, int i11, int i12, int i13) {
        m.f(call, "call");
        m.f(request, "request");
        this.f24341a = call;
        this.f24342b = arrayList;
        this.f24343c = i10;
        this.f24344d = exchange;
        this.f24345e = request;
        this.f24346f = i11;
        this.f24347g = i12;
        this.f24348h = i13;
    }

    public static RealInterceptorChain a(RealInterceptorChain realInterceptorChain, int i10, Exchange exchange, Request request, int i11) {
        if ((i11 & 1) != 0) {
            i10 = realInterceptorChain.f24343c;
        }
        int i12 = i10;
        if ((i11 & 2) != 0) {
            exchange = realInterceptorChain.f24344d;
        }
        Exchange exchange2 = exchange;
        if ((i11 & 4) != 0) {
            request = realInterceptorChain.f24345e;
        }
        Request request2 = request;
        m.f(request2, "request");
        return new RealInterceptorChain(realInterceptorChain.f24341a, realInterceptorChain.f24342b, i12, exchange2, request2, realInterceptorChain.f24346f, realInterceptorChain.f24347g, realInterceptorChain.f24348h);
    }

    public final Response b(Request request) {
        m.f(request, "request");
        ArrayList arrayList = this.f24342b;
        int size = arrayList.size();
        int i10 = this.f24343c;
        if (i10 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f24349i++;
        Exchange exchange = this.f24344d;
        if (exchange != null) {
            if (!exchange.f24228c.b().c(request.f24102a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i10 - 1) + " must retain the same host and port").toString());
            }
            if (this.f24349i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i10 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i11 = i10 + 1;
        RealInterceptorChain realInterceptorChainA = a(this, i11, null, request, 58);
        Interceptor interceptor = (Interceptor) arrayList.get(i10);
        Response responseA = interceptor.a(realInterceptorChainA);
        if (responseA == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (exchange == null || i11 >= arrayList.size() || realInterceptorChainA.f24349i == 1) {
            return responseA;
        }
        throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
    }
}
