package okhttp3.internal.ws;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.m;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class RealWebSocket$connect$1 implements Callback {
    @Override // okhttp3.Callback
    public final void a(Call call, Response response) {
        m.f(call, "call");
        throw null;
    }

    @Override // okhttp3.Callback
    public final void b(Call call, IOException iOException) {
        m.f(call, "call");
        List list = RealWebSocket.f24598a;
        throw null;
    }
}
