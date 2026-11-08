package p241x;

import android.view.View;
import android.widget.Magnifier;
import p028c1.b;

/* JADX INFO: loaded from: classes.dex */
public final class v0 implements t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0 f28303b = new v0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v0 f28304c = new v0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28305a;

    public /* synthetic */ v0(int i10) {
        this.f28305a = i10;
    }

    @Override // p241x.t0
    public final s0 a(View view, b bVar) {
        switch (this.f28305a) {
            case 0:
                return new u0(new Magnifier(view));
            default:
                return new w0(new Magnifier(view));
        }
    }

    @Override // p241x.t0
    public final boolean b() {
        switch (this.f28305a) {
            case 0:
                return false;
            default:
                return true;
        }
    }
}
