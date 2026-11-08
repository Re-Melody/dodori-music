package B2;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f638b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f639a;

    public y(Handler handler) {
        this.f639a = handler;
    }

    public static x b() {
        x xVar;
        ArrayList arrayList = f638b;
        synchronized (arrayList) {
            try {
                xVar = arrayList.isEmpty() ? new x() : (x) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return xVar;
    }

    public final x a(int i10, Object obj) {
        x xVarB = b();
        xVarB.f637a = this.f639a.obtainMessage(i10, obj);
        return xVarB;
    }

    public final boolean c(Runnable runnable) {
        return this.f639a.post(runnable);
    }

    public final void d(int i10) {
        AbstractC0111a.d(i10 != 0);
        this.f639a.removeMessages(i10);
    }

    public final boolean e(int i10) {
        return this.f639a.sendEmptyMessage(i10);
    }
}
