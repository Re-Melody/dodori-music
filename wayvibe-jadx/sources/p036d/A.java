package p036d;

import Z8.a;
import android.window.OnBackInvokedCallback;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f18945b;

    public /* synthetic */ A(int i10, a aVar) {
        this.f18944a = i10;
        this.f18945b = aVar;
    }

    public final void onBackInvoked() {
        switch (this.f18944a) {
            case 0:
                a onBackInvoked = this.f18945b;
                m.f(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
            default:
                a aVar = this.f18945b;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
        }
    }
}
