package okhttp3.internal.platform;

import N3.b;
import N8.s;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PlatformInitializer implements b {
    @Override // N3.b
    public final List a() {
        return s.f8650a;
    }

    @Override // N3.b
    public final Object b(Context context) {
        m.f(context, "context");
        PlatformRegistry.f24550a.getClass();
        Platform.f24547a.getClass();
        Object obj = Platform.f24548b;
        ContextAwarePlatform contextAwarePlatform = obj != null ? (ContextAwarePlatform) obj : null;
        if (contextAwarePlatform != null) {
            contextAwarePlatform.a(context);
        }
        return Platform.f24548b;
    }
}
