package com.google.android.gms.internal.play_billing;

import V0.p;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zzfa extends IOException {
    public zzfa() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzfa(long j10, long j11, int i10, Throwable th) {
        Locale locale = Locale.US;
        StringBuilder sbS = p.s("Pos: ", j10, ", limit: ");
        sbS.append(j11);
        sbS.append(", len: ");
        sbS.append(i10);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbS.toString()), th);
    }

    public zzfa(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
