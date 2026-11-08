package O6;

import G6.C0521h;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f9319b = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9320a = new HashMap();

    public final synchronized void a(C0521h c0521h, Class cls) {
        try {
            C0521h c0521h2 = (C0521h) this.f9320a.get(cls);
            if (c0521h2 != null && !c0521h2.equals(c0521h)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f9320a.put(cls, c0521h);
        } catch (Throwable th) {
            throw th;
        }
    }
}
