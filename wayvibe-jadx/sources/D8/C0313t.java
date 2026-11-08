package D8;

import B8.AbstractC0120g;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: renamed from: D8.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0313t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f2783c = Logger.getLogger(AbstractC0120g.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2784a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B8.H f2785b;

    public C0313t(B8.H h10, long j10, String str) {
        p229v9.a.k(str, com.amazon.a.a.o.b.f16404c);
        this.f2785b = h10;
        String strConcat = str.concat(" created");
        B8.C c3 = B8.C.CT_INFO;
        p229v9.a.k(strConcat, com.amazon.a.a.o.b.f16404c);
        p229v9.a.k(c3, "severity");
        b(new B8.D(strConcat, c3, j10, null));
    }

    public static void a(B8.H h10, Level level, String str) {
        Logger logger = f2783c;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + h10 + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final void b(B8.D d10) {
        Level level;
        int i10 = AbstractC0310s.f2776a[d10.f723b.ordinal()];
        if (i10 != 1) {
            level = i10 != 2 ? Level.FINEST : Level.FINER;
        } else {
            level = Level.FINE;
        }
        synchronized (this.f2784a) {
        }
        a(this.f2785b, level, d10.f722a);
    }
}
