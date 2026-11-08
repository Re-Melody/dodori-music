package org.apache.tika.exception;

import V0.p;

/* JADX INFO: loaded from: classes2.dex */
public class TikaMemoryLimitException extends TikaException {
    public TikaMemoryLimitException(String str) {
        super(str);
    }

    private static String msg(long j10, long j11) {
        return p.k(j11, " is the maximum allowed. Please open an issue https://issues.apache.org/jira/projects/TIKA if you believe this file is not corrupt.", p.s("Tried to allocate ", j10, " bytes, but "));
    }

    public TikaMemoryLimitException(long j10, long j11) {
        super(msg(j10, j11));
    }
}
