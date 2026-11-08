package p218u8;

import java.util.HashMap;
import p161o8.h;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f27272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HashMap f27273c;

    public /* synthetic */ c(h hVar, HashMap map, int i10) {
        this.f27271a = i10;
        this.f27272b = hVar;
        this.f27273c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27271a) {
            case 0:
                h hVar = this.f27272b;
                hVar.c(this.f27273c);
                hVar.a();
                break;
            default:
                this.f27272b.c(this.f27273c);
                break;
        }
    }
}
