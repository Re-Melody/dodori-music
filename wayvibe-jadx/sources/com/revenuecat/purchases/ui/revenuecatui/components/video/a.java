package com.revenuecat.purchases.ui.revenuecatui.components.video;

import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaPlayerThreadOwner f18895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18896c;

    public /* synthetic */ a(MediaPlayerThreadOwner mediaPlayerThreadOwner, Object obj, int i10) {
        this.f18894a = i10;
        this.f18895b = mediaPlayerThreadOwner;
        this.f18896c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18894a) {
            case 0:
                MediaPlayerThreadOwner.post$lambda$17(this.f18895b, (Z8.a) this.f18896c);
                break;
            default:
                MediaPlayerThreadOwner.release$lambda$6(this.f18895b, (Surface) this.f18896c);
                break;
        }
    }
}
