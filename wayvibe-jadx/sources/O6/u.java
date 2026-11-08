package O6;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f9324b = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9325a = new HashMap();

    public final synchronized void a(String str, F6.j jVar) {
        try {
            if (!this.f9325a.containsKey(str)) {
                this.f9325a.put(str, jVar);
                return;
            }
            if (((F6.j) this.f9325a.get(str)).equals(jVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + this.f9325a.get(str) + "), cannot insert " + jVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (F6.j) entry.getValue());
        }
    }
}
