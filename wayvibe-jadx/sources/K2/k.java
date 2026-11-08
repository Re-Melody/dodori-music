package K2;

import B2.C;

/* JADX INFO: loaded from: classes.dex */
public abstract class k implements E2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f7363a;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z10;
        if ("Amazon".equals(C.f562c)) {
            String str = C.f563d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        f7363a = z10;
    }
}
