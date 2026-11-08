package J1;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6460c;

    public d() {
        super(12);
        this.f6460c = new Object();
    }

    @Override // J1.c
    public final Object a() {
        Object objA;
        synchronized (this.f6460c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // J1.c
    public final boolean c(Object obj) {
        boolean zC;
        synchronized (this.f6460c) {
            zC = super.c(obj);
        }
        return zC;
    }
}
