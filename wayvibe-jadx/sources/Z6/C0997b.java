package Z6;

import B2.AbstractC0112b;
import android.net.Uri;
import com.google.android.gms.internal.p002firebaseauthapi.zzan;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: Z6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0997b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzan f13970d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13973c;

    static {
        HashMap map = new HashMap();
        AbstractC0112b.s(2, map, "recoverEmail", 0, "resetPassword");
        AbstractC0112b.s(4, map, "signIn", 1, "verifyEmail");
        AbstractC0112b.s(5, map, "verifyBeforeChangeEmail", 6, "revertSecondFactorAddition");
        f13970d = zzan.zza(map);
    }

    public C0997b(String str) {
        String strA = a(str, "apiKey");
        String strA2 = a(str, "oobCode");
        String strA3 = a(str, "mode");
        if (strA == null || strA2 == null || strA3 == null) {
            throw new IllegalArgumentException("apiKey, oobCode and mode are required in a valid action code URL");
        }
        com.google.android.gms.common.internal.E.e(strA);
        com.google.android.gms.common.internal.E.e(strA2);
        this.f13971a = strA2;
        com.google.android.gms.common.internal.E.e(strA3);
        this.f13972b = strA3;
        a(str, "continueUrl");
        a(str, "lang");
        this.f13973c = a(str, "tenantId");
    }

    public static String a(String str, String str2) {
        Uri uri = Uri.parse(str);
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return uri.getQueryParameter(str2);
            }
            if (!queryParameterNames.contains("link")) {
                return null;
            }
            String queryParameter = uri.getQueryParameter("link");
            com.google.android.gms.common.internal.E.e(queryParameter);
            return Uri.parse(queryParameter).getQueryParameter(str2);
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
