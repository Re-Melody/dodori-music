package okhttp3.internal.http2;

import E9.C0351l;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class Header {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0351l f24384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0351l f24385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0351l f24386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0351l f24387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0351l f24388h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0351l f24389i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0351l f24390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0351l f24391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24392c;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        C0351l c0351l = C0351l.f3388d;
        f24384d = p217u7.d.l(":");
        f24385e = p217u7.d.l(":status");
        f24386f = p217u7.d.l(":method");
        f24387g = p217u7.d.l(":path");
        f24388h = p217u7.d.l(":scheme");
        f24389i = p217u7.d.l(":authority");
    }

    public Header(C0351l name, C0351l value) {
        m.f(name, "name");
        m.f(value, "value");
        this.f24390a = name;
        this.f24391b = value;
        this.f24392c = value.k() + name.k() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return m.b(this.f24390a, header.f24390a) && m.b(this.f24391b, header.f24391b);
    }

    public final int hashCode() {
        return this.f24391b.hashCode() + (this.f24390a.hashCode() * 31);
    }

    public final String toString() {
        return this.f24390a.A() + ": " + this.f24391b.A();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String str, String str2) {
        this(p217u7.d.l(str), p217u7.d.l(str2));
        C0351l c0351l = C0351l.f3388d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(C0351l name, String value) {
        this(name, p217u7.d.l(value));
        m.f(name, "name");
        m.f(value, "value");
        C0351l c0351l = C0351l.f3388d;
    }
}
