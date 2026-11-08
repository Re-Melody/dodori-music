package p173q0;

import android.graphics.Outline;
import p143n0.C2083j;
import p143n0.U;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f25472a = new j();

    public final void a(Outline outline, U u10) {
        if (!(u10 instanceof C2083j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C2083j) u10).f22776a);
    }
}
