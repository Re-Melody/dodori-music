package L4;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f7872a;

    public l(int i10) {
        switch (i10) {
            case 1:
                this.f7872a = new SparseArray(10);
                break;
            default:
                this.f7872a = new SparseArray();
                break;
        }
    }
}
