package D2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class u extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1906c;

    public u() {
        super(2008);
        this.f1906c = 1;
    }

    public static u a(IOException iOException, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else {
            i11 = (message == null || !p224v4.i.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i11 == 2007 ? new t("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new u(iOException, i11, i10);
    }

    public u(String str, int i10) {
        super(str, i10 == 2000 ? 2001 : i10);
        this.f1906c = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u(IOException iOException, int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            i10 = 2001;
        }
        super(i10, iOException);
        this.f1906c = i11;
    }

    public u(String str, IOException iOException, int i10) {
        super(str, iOException, i10 == 2000 ? 2001 : i10);
        this.f1906c = 1;
    }
}
