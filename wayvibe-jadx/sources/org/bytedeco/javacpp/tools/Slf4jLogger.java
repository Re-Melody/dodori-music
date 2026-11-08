package org.bytedeco.javacpp.tools;

import Ea.b;
import Ea.d;

/* JADX INFO: loaded from: classes2.dex */
public class Slf4jLogger extends Logger {
    final b logger;

    public Slf4jLogger(Class cls) {
        this.logger = d.b(cls);
    }

    @Override // org.bytedeco.javacpp.tools.Logger
    public void debug(String str) {
        this.logger.n(str);
    }

    @Override // org.bytedeco.javacpp.tools.Logger
    public void error(String str) {
        this.logger.h(str);
    }

    @Override // org.bytedeco.javacpp.tools.Logger
    public void info(String str) {
        this.logger.x(str);
    }

    @Override // org.bytedeco.javacpp.tools.Logger
    public boolean isDebugEnabled() {
        return this.logger.g();
    }

    @Override // org.bytedeco.javacpp.tools.Logger
    public boolean isErrorEnabled() {
        return this.logger.k();
    }

    @Override // org.bytedeco.javacpp.tools.Logger
    public boolean isInfoEnabled() {
        return this.logger.m();
    }

    @Override // org.bytedeco.javacpp.tools.Logger
    public boolean isWarnEnabled() {
        return this.logger.f();
    }

    @Override // org.bytedeco.javacpp.tools.Logger
    public void warn(String str) {
        this.logger.warn(str);
    }
}
