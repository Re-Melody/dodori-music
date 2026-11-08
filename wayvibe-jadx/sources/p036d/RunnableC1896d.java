package p036d;

import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: d.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1896d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f18978b;

    public /* synthetic */ RunnableC1896d(n nVar, int i10) {
        this.f18977a = i10;
        this.f18978b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18977a) {
            case 0:
                n this$0 = this.f18978b;
                m.f(this$0, "this$0");
                this$0.invalidateMenu();
                return;
            default:
                n this$1 = this.f18978b;
                m.f(this$1, "this$0");
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e2) {
                    if (!m.b(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                } catch (NullPointerException e4) {
                    if (!m.b(e4.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e4;
                    }
                    return;
                }
        }
    }
}
