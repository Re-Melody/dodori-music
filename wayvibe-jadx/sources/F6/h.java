package F6;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f4567a = new CopyOnWriteArrayList();

    public static N6.c a(String str) throws GeneralSecurityException {
        for (N6.c cVar : f4567a) {
            cVar.getClass();
            if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
                return cVar;
            }
        }
        throw new GeneralSecurityException(p134m1.b.k("No KMS client does support: ", str));
    }
}
