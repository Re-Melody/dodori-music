package io.flutter.embedding.engine.renderer;

import io.flutter.view.u;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f20594b;

    public /* synthetic */ d(u uVar, int i10) {
        this.f20593a = i10;
        this.f20594b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20593a) {
            case 0:
                ((FlutterRenderer$ImageReaderSurfaceProducer) this.f20594b).lambda$dequeueImage$0();
                break;
            default:
                ((i) this.f20594b).getClass();
                break;
        }
    }
}
