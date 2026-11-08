package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1096p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15403b;

    public /* synthetic */ RunnableC1096p(Object obj, int i10) {
        this.f15402a = i10;
        this.f15403b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15402a) {
            case 0:
                DialogInterfaceOnCancelListenerC1099t dialogInterfaceOnCancelListenerC1099t = (DialogInterfaceOnCancelListenerC1099t) this.f15403b;
                dialogInterfaceOnCancelListenerC1099t.f15428b.onDismiss(dialogInterfaceOnCancelListenerC1099t.f15436j);
                break;
            case 1:
                C1095o c1095o = (C1095o) this.f15403b;
                if (!c1095o.f15397b.isEmpty()) {
                    c1095o.e();
                }
                break;
            default:
                ((AbstractC1083h0) this.f15403b).z(true);
                break;
        }
    }
}
