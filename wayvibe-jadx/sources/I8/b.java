package I8;

import B8.C0117d;
import java.util.logging.Logger;
import p234w3.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0117d f6428a;

    static {
        Logger.getLogger(b.class.getName());
        if (!c.b(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        f6428a = new C0117d("internal-stub-type", 0);
    }
}
