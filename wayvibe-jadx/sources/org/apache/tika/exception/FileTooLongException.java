package org.apache.tika.exception;

import V0.p;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class FileTooLongException extends IOException {
    public FileTooLongException(String str) {
        super(str);
    }

    private static String msg(long j10, long j11) {
        return p.k(j11, " is the maximum length allowed.  You can modify maxLength via the setter on the fetcher.", p.s("File is ", j10, " bytes, but "));
    }

    public FileTooLongException(long j10, long j11) {
        super(msg(j10, j11));
    }
}
