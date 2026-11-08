package U2;

import p255y2.C2339o;
import p255y2.P;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P f12137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2339o f12139d;

    public n(int i10, P p10, int i11) {
        this.f12136a = i10;
        this.f12137b = p10;
        this.f12138c = i11;
        this.f12139d = p10.f28805d[i11];
    }

    public abstract int a();

    public abstract boolean b(n nVar);
}
