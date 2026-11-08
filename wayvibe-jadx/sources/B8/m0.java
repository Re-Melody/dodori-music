package B8;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.logging.Logger;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f835d = Logger.getLogger(m0.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static m0 f836e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f837a = "unknown";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f838b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A6.b0 f839c = A6.b0.f342g;

    public final synchronized void a() {
        try {
            HashMap map = new HashMap();
            String str = "unknown";
            byte b10 = ForkServer.DONE;
            for (l0 l0Var : this.f838b) {
                l0Var.getClass();
                if (((l0) map.get("dns")) == null) {
                    map.put("dns", l0Var);
                }
                if (b10 < 5) {
                    str = "dns";
                    b10 = 5;
                }
            }
            this.f839c = A6.b0.a(map);
            this.f837a = str;
        } catch (Throwable th) {
            throw th;
        }
    }
}
