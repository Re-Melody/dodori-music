package p036d;

import K1.C0610l;
import M8.D;
import X2.w;
import Z8.a;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.X;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class m extends n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f18991b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i10) {
        super(0);
        this.f18990a = i10;
        this.f18991b = nVar;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f18990a) {
            case 0:
                n nVar = this.f18991b;
                return new X(nVar.getApplication(), nVar, nVar.getIntent() != null ? nVar.getIntent().getExtras() : null);
            case 1:
                this.f18991b.reportFullyDrawn();
                return D.f8402a;
            case 2:
                n nVar2 = this.f18991b;
                return new w(nVar2.reportFullyDrawnExecutor, new m(nVar2, 1));
            default:
                n nVar3 = this.f18991b;
                G g3 = new G(new RunnableC1896d(nVar3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (kotlin.jvm.internal.m.b(Looper.myLooper(), Looper.getMainLooper())) {
                        nVar3.getLifecycle().addObserver(new C0610l(1, g3, nVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new w(18, nVar3, g3));
                    }
                }
                return g3;
        }
    }
}
