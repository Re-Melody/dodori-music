package okhttp3.internal.ws;

import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class WebSocketExtensions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24599a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f24600b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24601c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f24602d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f24603e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f24604f = false;

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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.f24599a == webSocketExtensions.f24599a && m.b(this.f24600b, webSocketExtensions.f24600b) && this.f24601c == webSocketExtensions.f24601c && m.b(this.f24602d, webSocketExtensions.f24602d) && this.f24603e == webSocketExtensions.f24603e && this.f24604f == webSocketExtensions.f24604f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f24599a) * 31;
        Integer num = this.f24600b;
        int iF = b.f((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f24601c);
        Integer num2 = this.f24602d;
        return Boolean.hashCode(this.f24604f) + b.f((iF + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.f24603e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb.append(this.f24599a);
        sb.append(", clientMaxWindowBits=");
        sb.append(this.f24600b);
        sb.append(", clientNoContextTakeover=");
        sb.append(this.f24601c);
        sb.append(", serverMaxWindowBits=");
        sb.append(this.f24602d);
        sb.append(", serverNoContextTakeover=");
        sb.append(this.f24603e);
        sb.append(", unknownValues=");
        return b.o(sb, this.f24604f, ')');
    }
}
