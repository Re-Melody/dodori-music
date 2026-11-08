package H2;

import B2.AbstractC0112b;
import p255y2.C2339o;

/* JADX INFO: loaded from: classes.dex */
public final class r extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5935b;

    /* JADX WARN: Illegal instructions before constructor call */
    public r(int i10, int i11, int i12, int i13, C2339o c2339o, boolean z10, RuntimeException runtimeException) {
        StringBuilder sbP = AbstractC0112b.p("AudioTrack init failed ", i10, " Config(", i11, ", ");
        sbP.append(i12);
        sbP.append(", ");
        sbP.append(i13);
        sbP.append(") ");
        sbP.append(c2339o);
        sbP.append(z10 ? " (recoverable)" : "");
        super(sbP.toString(), runtimeException);
        this.f5934a = i10;
        this.f5935b = z10;
    }
}
