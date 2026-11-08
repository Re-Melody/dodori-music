package Ca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        Request request = realInterceptorChain.f24345e;
        Request.Builder builderB = request.b();
        String str = request.f24102a.f24041h;
        ArrayList arrayList = c.f1506b;
        boolean zIsEmpty = arrayList.isEmpty();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (Pattern.matches((String) it.next(), str)) {
                zIsEmpty = true;
                break;
            }
        }
        if (zIsEmpty) {
            for (Map.Entry entry : c.f1505a.entrySet()) {
                if (entry.getKey() != null && !((String) entry.getKey()).trim().isEmpty()) {
                    if (entry.getValue() == null || ((String) entry.getValue()).trim().isEmpty()) {
                        builderB.e((String) entry.getKey());
                    } else {
                        builderB.c((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
        }
        return realInterceptorChain.b(new Request(builderB));
    }
}
