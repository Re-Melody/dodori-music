package p063f8;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f19884a;

    public k() {
        Looper mainLooper = Looper.getMainLooper();
        this.f19884a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // p063f8.e
    public final void a(c cVar) {
        this.f19884a.post(cVar);
    }
}
