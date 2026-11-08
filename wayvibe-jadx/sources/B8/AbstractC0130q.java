package B8;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: renamed from: B8.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0130q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f846a;

    static {
        r y0Var;
        AtomicReference atomicReference = new AtomicReference();
        try {
            y0Var = (r) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(r.class).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e2) {
            atomicReference.set(e2);
            y0Var = new y0();
        } catch (Exception e4) {
            throw new RuntimeException("Storage override failed to initialize", e4);
        }
        f846a = y0Var;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            C0131s.f862a.log(Level.FINE, "Storage override doesn't exist. Using default", th);
        }
    }
}
