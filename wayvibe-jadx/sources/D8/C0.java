package D8;

import B8.AbstractC0120g;
import B8.EnumC0119f;
import java.text.MessageFormat;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class C0 extends AbstractC0120g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public B8.H f2200d;

    @Override // B8.AbstractC0120g
    public final void m(EnumC0119f enumC0119f, String str) {
        B8.H h10 = this.f2200d;
        Level levelV = C0305q.v(enumC0119f);
        if (C0313t.f2783c.isLoggable(levelV)) {
            C0313t.a(h10, levelV, str);
        }
    }

    @Override // B8.AbstractC0120g
    public final void n(EnumC0119f enumC0119f, String str, Object... objArr) {
        B8.H h10 = this.f2200d;
        Level levelV = C0305q.v(enumC0119f);
        if (C0313t.f2783c.isLoggable(levelV)) {
            C0313t.a(h10, levelV, MessageFormat.format(str, objArr));
        }
    }
}
