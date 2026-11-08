package P4;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f9664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f9665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f9666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray f9667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray f9668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f9669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f9670i;

    public i(int i10, int i11, int i12) {
        switch (i12) {
            case 1:
                this.f9662a = i10;
                this.f9663b = i11;
                this.f9664c = new SparseArray();
                this.f9665d = new SparseArray();
                this.f9666e = new SparseArray();
                this.f9667f = new SparseArray();
                this.f9668g = new SparseArray();
                break;
            default:
                this.f9664c = new SparseArray();
                this.f9665d = new SparseArray();
                this.f9666e = new SparseArray();
                this.f9667f = new SparseArray();
                this.f9668g = new SparseArray();
                this.f9662a = i10;
                this.f9663b = i11;
                break;
        }
    }
}
