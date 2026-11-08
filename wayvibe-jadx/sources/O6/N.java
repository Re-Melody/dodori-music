package O6;

import G0.C0467f0;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0467f0 f9268a = new C0467f0(3);

    public static byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) f9268a.get()).nextBytes(bArr);
        return bArr;
    }
}
