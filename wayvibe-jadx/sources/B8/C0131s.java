package B8;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: B8.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0131s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f862a = Logger.getLogger(C0131s.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0131s f863b = new C0131s();

    public static C0131s b() {
        ((y0) AbstractC0130q.f846a).getClass();
        C0131s c0131s = (C0131s) y0.f900b.get();
        C0131s c0131s2 = f863b;
        if (c0131s == null) {
            c0131s = c0131s2;
        }
        return c0131s == null ? c0131s2 : c0131s;
    }

    public final C0131s a() {
        ((y0) AbstractC0130q.f846a).getClass();
        ThreadLocal threadLocal = y0.f900b;
        C0131s c0131s = (C0131s) threadLocal.get();
        C0131s c0131s2 = f863b;
        if (c0131s == null) {
            c0131s = c0131s2;
        }
        threadLocal.set(this);
        return c0131s == null ? c0131s2 : c0131s;
    }

    public final void c(C0131s c0131s) {
        if (c0131s == null) {
            throw new NullPointerException("toAttach");
        }
        ((y0) AbstractC0130q.f846a).getClass();
        ThreadLocal threadLocal = y0.f900b;
        C0131s c0131s2 = (C0131s) threadLocal.get();
        C0131s c0131s3 = f863b;
        if (c0131s2 == null) {
            c0131s2 = c0131s3;
        }
        if (c0131s2 != this) {
            y0.f899a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (c0131s != c0131s3) {
            threadLocal.set(c0131s);
        } else {
            threadLocal.set(null);
        }
    }
}
