package p097i9;

import R3.a;
import Z.l;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.m;
import p064f9.g;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f20582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f20584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f20585d;

    public h(Matcher matcher, String input) {
        m.f(input, "input");
        this.f20582a = matcher;
        this.f20583b = input;
        this.f20584c = new l(this, 1);
    }

    public final List a() {
        if (this.f20585d == null) {
            this.f20585d = new g(this);
        }
        g gVar = this.f20585d;
        m.c(gVar);
        return gVar;
    }

    public final g b() {
        Matcher matcher = this.f20582a;
        return a.j0(matcher.start(), matcher.end());
    }

    public final h c() {
        Matcher matcher = this.f20582a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        String str = this.f20583b;
        if (iEnd > str.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(str);
        m.e(matcher2, "matcher(...)");
        if (matcher2.find(iEnd)) {
            return new h(matcher2, str);
        }
        return null;
    }
}
