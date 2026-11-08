package P5;

import android.os.Looper;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zzg;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p098j.I;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9683b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f9682a = i10;
        this.f9683b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f9682a) {
            case 0:
                ((zzg) this.f9683b).post(runnable);
                break;
            case 1:
                ((zau) this.f9683b).post(runnable);
                break;
            default:
                ((ExecutorService) this.f9683b).execute(new I(runnable, 1));
                break;
        }
    }

    public a(Looper looper) {
        this.f9682a = 0;
        this.f9683b = new zzg(looper);
    }
}
