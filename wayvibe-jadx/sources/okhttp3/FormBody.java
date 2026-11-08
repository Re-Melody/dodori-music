package okhttp3;

import E9.E;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class FormBody extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MediaType f24023a;

    public static final class Builder {
        public Builder() {
            new ArrayList();
            new ArrayList();
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        MediaType.f24050b.getClass();
        f24023a = MediaType.Companion.a("application/x-www-form-urlencoded");
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final MediaType b() {
        return f24023a;
    }

    @Override // okhttp3.RequestBody
    public final void d(E e2) {
        throw null;
    }
}
