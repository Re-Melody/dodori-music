package okhttp3.internal.http;

import E9.G;
import E9.InterfaceC0350k;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public final class RealResponseBody extends ResponseBody {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G f24352d;

    public RealResponseBody(String str, long j10, G g3) {
        this.f24350b = str;
        this.f24351c = j10;
        this.f24352d = g3;
    }

    @Override // okhttp3.ResponseBody
    public final long c() {
        return this.f24351c;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType e() {
        String str = this.f24350b;
        if (str == null) {
            return null;
        }
        MediaType.f24050b.getClass();
        try {
            return MediaType.Companion.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // okhttp3.ResponseBody
    public final InterfaceC0350k g() {
        return this.f24352d;
    }
}
