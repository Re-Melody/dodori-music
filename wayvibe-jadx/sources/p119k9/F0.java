package p119k9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f21680a = new ThreadLocal();

    public static Z a() {
        ThreadLocal threadLocal = f21680a;
        Z z10 = (Z) threadLocal.get();
        if (z10 != null) {
            return z10;
        }
        C2018i c2018i = new C2018i(Thread.currentThread());
        threadLocal.set(c2018i);
        return c2018i;
    }
}
