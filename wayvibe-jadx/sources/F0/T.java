package F0;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class T implements D0.N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f3697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z8.c f3698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ V f3699e;

    public T(int i10, int i11, Map map, Z8.c cVar, V v3) {
        this.f3695a = i10;
        this.f3696b = i11;
        this.f3697c = map;
        this.f3698d = cVar;
        this.f3699e = v3;
    }

    @Override // D0.N
    public final Map b() {
        return this.f3697c;
    }

    @Override // D0.N
    public final void c() {
        this.f3698d.invoke(this.f3699e.f3704i);
    }

    @Override // D0.N
    public final Z8.c d() {
        return null;
    }

    @Override // D0.N
    public final int getHeight() {
        return this.f3696b;
    }

    @Override // D0.N
    public final int getWidth() {
        return this.f3695a;
    }
}
