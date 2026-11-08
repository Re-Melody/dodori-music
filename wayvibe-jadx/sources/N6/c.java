package N6;

import O6.N;
import U6.o;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import org.slf4j.helpers.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f8618a = new Object();

    public static boolean a(String str) {
        synchronized (f8618a) {
            try {
                String strB = o.b(str);
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    if (keyStore.containsAlias(strB)) {
                        return false;
                    }
                    i.w(strB);
                    return true;
                } catch (IOException e2) {
                    throw new GeneralSecurityException(e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final b b(String str) {
        b bVar;
        try {
            synchronized (f8618a) {
                bVar = new b(o.b(str));
                byte[] bArrA = N.a(10);
                byte[] bArr = new byte[0];
                if (!Arrays.equals(bArrA, bVar.b(bVar.a(bArrA, bArr), bArr))) {
                    throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                }
            }
            return bVar;
        } catch (IOException e2) {
            throw new GeneralSecurityException(e2);
        }
    }
}
