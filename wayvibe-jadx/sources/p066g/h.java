package p066g;

import Z8.a;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import d9.d;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class h extends n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f19919a = new h(0);

    @Override // Z8.a
    public final Object invoke() {
        return Integer.valueOf(d.f19430b.g(2147418112) + ETagPayloadStore.CHUNK_CHARS);
    }
}
