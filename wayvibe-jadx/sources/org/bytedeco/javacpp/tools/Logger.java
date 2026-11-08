package org.bytedeco.javacpp.tools;

import com.amazon.a.a.o.b;

/* JADX INFO: loaded from: classes2.dex */
public class Logger {
    static boolean debug = false;

    static {
        String lowerCase = System.getProperty("org.bytedeco.javacpp.logger.debug", b.ag).toLowerCase();
        debug = lowerCase.equals(b.af) || lowerCase.equals("t") || lowerCase.equals("");
    }

    public static Logger create(Class cls) {
        String lowerCase = System.getProperty("org.bytedeco.javacpp.logger", "").toLowerCase();
        return (lowerCase.equals("slf4j") || lowerCase.equals("slf4jlogger")) ? new Slf4jLogger(cls) : new Logger();
    }

    public void debug(String str) {
        System.out.println(str);
    }

    public void error(String str) {
        System.err.println("Error: " + str);
    }

    public void info(String str) {
        System.out.println(str);
    }

    public boolean isDebugEnabled() {
        return debug;
    }

    public boolean isErrorEnabled() {
        return true;
    }

    public boolean isInfoEnabled() {
        return true;
    }

    public boolean isWarnEnabled() {
        return true;
    }

    public void warn(String str) {
        System.err.println("Warning: " + str);
    }
}
