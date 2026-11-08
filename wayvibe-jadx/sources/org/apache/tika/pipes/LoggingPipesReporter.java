package org.apache.tika.pipes;

import Ea.b;
import Ea.d;

/* JADX INFO: loaded from: classes2.dex */
public class LoggingPipesReporter extends PipesReporter {
    b LOGGER = d.b(LoggingPipesReporter.class);

    @Override // org.apache.tika.pipes.PipesReporter
    public void error(Throwable th) {
        this.LOGGER.i("pipes error", th);
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void report(FetchEmitTuple fetchEmitTuple, PipesResult pipesResult, long j10) {
        this.LOGGER.r("{} {} {}", fetchEmitTuple, pipesResult, Long.valueOf(j10));
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void error(String str) {
        this.LOGGER.q("error {}", str);
    }
}
