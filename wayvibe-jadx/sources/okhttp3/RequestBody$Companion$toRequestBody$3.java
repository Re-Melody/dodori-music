package okhttp3;

import E9.E;
import kotlin.jvm.internal.m;
import org.apache.tika.metadata.ClimateForcast;

/* JADX INFO: loaded from: classes2.dex */
public final class RequestBody$Companion$toRequestBody$3 extends RequestBody {
    @Override // okhttp3.RequestBody
    public final long a() {
        return 0;
    }

    @Override // okhttp3.RequestBody
    public final MediaType b() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public final void d(E e2) {
        m.f(null, ClimateForcast.SOURCE);
        if (e2.f3343c) {
            throw new IllegalStateException("closed");
        }
        e2.f3342b.I(null, 0, 0);
        throw null;
    }
}
