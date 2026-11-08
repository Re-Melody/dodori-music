package p177q4;

import Z8.a;
import kotlin.jvm.internal.n;
import okhttp3.MediaType;
import org.apache.tika.metadata.HttpHeaders;

/* JADX INFO: loaded from: classes.dex */
public final class b extends n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f25657a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(0);
        this.f25657a = cVar;
    }

    @Override // Z8.a
    public final Object invoke() {
        String strA = this.f25657a.f25663f.a(HttpHeaders.CONTENT_TYPE);
        if (strA != null) {
            MediaType.f24050b.getClass();
            try {
                return MediaType.Companion.a(strA);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
