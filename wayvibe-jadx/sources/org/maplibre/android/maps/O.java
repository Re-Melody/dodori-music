package org.maplibre.android.maps;

/* JADX INFO: loaded from: classes2.dex */
public final class O implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2218p f24882b;

    public /* synthetic */ O(InterfaceC2218p interfaceC2218p, int i10) {
        this.f24881a = i10;
        this.f24882b = interfaceC2218p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24881a) {
            case 0:
                this.f24882b.a();
                break;
            case 1:
                InterfaceC2218p interfaceC2218p = this.f24882b;
                if (interfaceC2218p != null) {
                    interfaceC2218p.a();
                }
                break;
            default:
                this.f24882b.onCancel();
                break;
        }
    }
}
