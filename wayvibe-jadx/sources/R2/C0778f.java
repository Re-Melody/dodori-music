package R2;

import java.io.IOException;

/* JADX INFO: renamed from: R2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0778f extends IOException {
    public C0778f(int i10) {
        super("Illegal clipping: ".concat(i10 != 0 ? i10 != 1 ? i10 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
    }
}
