package com.revenuecat.purchases.ui.revenuecatui.components.video;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaPlayerThreadOwner f18898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z8.e f18899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18901e;

    public /* synthetic */ b(MediaPlayerThreadOwner mediaPlayerThreadOwner, Z8.e eVar, int i10, int i11, int i12) {
        this.f18897a = i12;
        this.f18898b = mediaPlayerThreadOwner;
        this.f18899c = eVar;
        this.f18900d = i10;
        this.f18901e = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18897a) {
            case 0:
                MediaPlayerThreadOwner.C16511.invoke$lambda$14$lambda$8$lambda$7(this.f18898b, this.f18899c, this.f18900d, this.f18901e);
                break;
            default:
                MediaPlayerThreadOwner.C16511.invoke$lambda$14$lambda$10$lambda$9(this.f18898b, this.f18899c, this.f18900d, this.f18901e);
                break;
        }
    }
}
