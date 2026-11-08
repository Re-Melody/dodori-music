package p255y2;

import B2.AbstractC0112b;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class D extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28757b;

    public D(String str, Exception exc, boolean z10, int i10) {
        super(str, exc);
        this.f28756a = z10;
        this.f28757b = i10;
    }

    public static D a(RuntimeException runtimeException, String str) {
        return new D(str, runtimeException, true, 1);
    }

    public static D b(String str, Exception exc) {
        return new D(str, exc, true, 4);
    }

    public static D d(String str) {
        return new D(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append("{contentIsMalformed=");
        sb.append(this.f28756a);
        sb.append(", dataType=");
        return AbstractC0112b.i(sb, this.f28757b, "}");
    }
}
