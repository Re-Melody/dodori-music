package D8;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: D8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0278h implements N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f2650a;

    public C0278h(int i10) {
        switch (i10) {
            case 1:
                this.f2650a = new AtomicLong();
                break;
            default:
                this.f2650a = new AtomicLong();
                break;
        }
    }

    @Override // D8.N0
    public void a() {
        this.f2650a.getAndAdd(1L);
    }
}
