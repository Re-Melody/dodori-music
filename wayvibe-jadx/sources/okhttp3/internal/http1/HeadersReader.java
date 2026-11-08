package okhttp3.internal.http1;

import E9.InterfaceC0350k;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class HeadersReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0350k f24359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f24360b;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public HeadersReader(InterfaceC0350k source) {
        m.f(source, "source");
        this.f24359a = source;
        this.f24360b = 262144L;
    }
}
