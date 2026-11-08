package D8;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* JADX INFO: renamed from: D8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0275g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f2634c = Logger.getLogger(C0275g.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f2636b;

    public C0275g(long j10) {
        AtomicLong atomicLong = new AtomicLong();
        this.f2636b = atomicLong;
        p229v9.a.g("value must be positive", j10 > 0);
        this.f2635a = "keepalive time nanos";
        atomicLong.set(j10);
    }
}
