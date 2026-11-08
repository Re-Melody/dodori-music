package F9;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f4674a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? p097i9.k.n0(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }
}
