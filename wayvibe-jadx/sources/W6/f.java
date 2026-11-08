package W6;

import com.google.android.gms.common.api.internal.InterfaceC1136c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC1136c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f12860a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.InterfaceC1136c
    public final void a(boolean z10) {
        synchronized (h.k) {
            try {
                for (h hVar : new ArrayList(h.f12863l.values())) {
                    if (hVar.f12868e.get()) {
                        hVar.j(z10);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
