package p011a7;

import K5.a;
import Z6.C1010o;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14280a = new a("GetTokenResultFactory", new String[0]);

    public static C1010o a(String str) {
        Map map;
        try {
            map = t.b(str);
        } catch (zzaag e2) {
            f14280a.b("Error parsing token claims", e2, new Object[0]);
            map = new HashMap();
        }
        C1010o c1010o = new C1010o();
        c1010o.f13988a = str;
        c1010o.f13989b = map;
        return c1010o;
    }
}
