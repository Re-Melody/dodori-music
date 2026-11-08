package p177q4;

import kotlin.jvm.internal.n;
import okhttp3.CacheControl;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes.dex */
public final class a extends n implements Z8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f25656a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(0);
        this.f25656a = cVar;
    }

    @Override // Z8.a
    public final Object invoke() {
        CacheControl.Companion companion = CacheControl.f23940n;
        Headers headers = this.f25656a.f25663f;
        companion.getClass();
        return CacheControl.Companion.a(headers);
    }
}
