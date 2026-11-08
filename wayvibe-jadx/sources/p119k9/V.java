package p119k9;

/* JADX INFO: loaded from: classes2.dex */
public final class V extends W {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I0 f21705c;

    public V(long j10, I0 i10) {
        super(j10);
        this.f21705c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21705c.run();
    }

    @Override // p119k9.W
    public final String toString() {
        return super.toString() + this.f21705c;
    }
}
