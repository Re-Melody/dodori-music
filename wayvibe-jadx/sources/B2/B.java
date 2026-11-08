package B2;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f559b;

    public /* synthetic */ B(String str, int i10) {
        this.f558a = i10;
        this.f559b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f558a) {
            case 0:
                return new Thread(runnable, this.f559b);
            default:
                Thread thread = new Thread(runnable, this.f559b);
                thread.setPriority(10);
                return thread;
        }
    }
}
