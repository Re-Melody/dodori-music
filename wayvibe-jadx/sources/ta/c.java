package ta;

import Ca.w;
import org.maplibre.android.snapshotter.MapSnapshotter;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27012c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f27010a = i10;
        this.f27011b = obj;
        this.f27012c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27010a) {
            case 0:
                ((w) this.f27011b).onError((String) this.f27012c);
                break;
            default:
                ((MapSnapshotter) this.f27011b).getClass();
                break;
        }
    }
}
