package p160o7;

import F.C0356a;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o7.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2190t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f23794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f23795d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0356a f23797b;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f23794c = timeUnit.toMillis(1L);
        f23795d = timeUnit.toMillis(5L);
    }

    public C2190t(K k, C0356a c0356a) {
        this.f23796a = k;
        this.f23797b = c0356a;
    }
}
