package org.maplibre.android.log;

import android.util.Log;
import androidx.annotation.Keep;
import na.a;
import p096i8.c;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class Logger {
    public static final int DEBUG = 3;
    private static final a DEFAULT;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int NONE = 99;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static int logLevel;
    private static volatile a logger;

    static {
        c cVar = new c();
        DEFAULT = cVar;
        logger = cVar;
    }

    public static void d(String str, String str2) {
        if (logLevel <= 3) {
            ((c) logger).getClass();
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (logLevel <= 6) {
            ((c) logger).getClass();
            Log.e(str, str2);
        }
    }

    public static void i(String str, String str2) {
        if (logLevel <= 4) {
            ((c) logger).getClass();
            Log.i(str, str2);
        }
    }

    public static void log(int i10, String str, String str2) {
        if (i10 == 2) {
            v(str, str2);
            return;
        }
        if (i10 == 3) {
            d(str, str2);
            return;
        }
        if (i10 == 4) {
            i(str, str2);
        } else if (i10 == 5) {
            w(str, str2);
        } else {
            if (i10 != 6) {
                throw new UnsupportedOperationException();
            }
            e(str, str2);
        }
    }

    public static void setLoggerDefinition(a aVar) {
        logger = aVar;
    }

    public static void setVerbosity(int i10) {
        logLevel = i10;
    }

    public static void v(String str, String str2) {
        if (logLevel <= 2) {
            ((c) logger).getClass();
            Log.v(str, str2);
        }
    }

    public static void w(String str, String str2) {
        if (logLevel <= 5) {
            ((c) logger).getClass();
            Log.w(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (logLevel <= 3) {
            ((c) logger).getClass();
            Log.d(str, str2, th);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (logLevel <= 6) {
            ((c) logger).getClass();
            Log.e(str, str2, th);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (logLevel <= 4) {
            ((c) logger).getClass();
            Log.i(str, str2, th);
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (logLevel <= 2) {
            ((c) logger).getClass();
            Log.v(str, str2, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (logLevel <= 5) {
            ((c) logger).getClass();
            Log.w(str, str2, th);
        }
    }
}
