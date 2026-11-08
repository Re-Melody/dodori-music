package androidx.emoji2.text;

import H5.j;
import N3.a;
import N3.b;
import android.content.Context;
import androidx.lifecycle.AbstractC1121p;
import androidx.lifecycle.InterfaceC1125u;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p078h2.g;
import p078h2.h;
import p078h2.n;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // N3.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // N3.b
    public final Object b(Context context) {
        Object objB;
        n nVar = new n(new j(context, 2));
        nVar.f20206b = 1;
        if (g.k == null) {
            synchronized (g.f20180j) {
                try {
                    if (g.k == null) {
                        g.k = new g(nVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f8587e) {
            try {
                objB = aVarC.f8588a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC1121p lifecycle = ((InterfaceC1125u) objB).getLifecycle();
        lifecycle.addObserver(new h(this, lifecycle));
        return Boolean.TRUE;
    }
}
