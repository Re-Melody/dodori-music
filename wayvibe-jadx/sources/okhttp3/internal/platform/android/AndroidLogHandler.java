package okhttp3.internal.platform.android;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidLogHandler extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AndroidLogHandler f24558a = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int i10;
        m.f(record, "record");
        AndroidLog androidLog = AndroidLog.f24555a;
        String loggerName = record.getLoggerName();
        m.e(loggerName, "getLoggerName(...)");
        int iIntValue = record.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i10 = 5;
        } else {
            i10 = record.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = record.getMessage();
        m.e(message, "getMessage(...)");
        Throwable thrown = record.getThrown();
        androidLog.getClass();
        AndroidLog.a(loggerName, i10, message, thrown);
    }
}
