package p246x4;

import B2.AbstractC0112b;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public d(int i10, int i11, int i12) {
        StringBuilder sbP = AbstractC0112b.p("Unhandled format: ", i10, " Hz, ", i11, " channels in encoding ");
        sbP.append(i12);
        super(sbP.toString());
    }
}
