package r9;

import java.util.concurrent.TimeUnit;
import org.apache.tika.pipes.PipesConfigBase;
import p9.s;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f26015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f26016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f26017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f26018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f26019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f26020f;

    static {
        String property;
        int i10 = s.f25341a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f26015a = property;
        f26016b = p9.a.i("kotlinx.coroutines.scheduler.resolution.ns", PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH, 1L, Long.MAX_VALUE);
        int i11 = s.f25341a;
        if (i11 < 2) {
            i11 = 2;
        }
        f26017c = p9.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f26018d = p9.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f26019e = TimeUnit.SECONDS.toNanos(p9.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f26020f = h.f26010a;
    }
}
