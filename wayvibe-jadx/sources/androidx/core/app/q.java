package androidx.core.app;

import android.content.ComponentName;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f14946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14948c;

    public q(ComponentName componentName) {
        this.f14946a = componentName;
    }

    public abstract void a(Intent intent);

    public final void b(int i10) {
        if (!this.f14947b) {
            this.f14947b = true;
            this.f14948c = i10;
        } else {
            if (this.f14948c == i10) {
                return;
            }
            StringBuilder sbP = p134m1.b.p(i10, "Given job ID ", " is different than previous ");
            sbP.append(this.f14948c);
            throw new IllegalArgumentException(sbP.toString());
        }
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }
}
