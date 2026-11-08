package D0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.n implements Z8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1774b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i10, ArrayList arrayList) {
        super(1);
        this.f1773a = i10;
        this.f1774b = arrayList;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f1773a) {
            case 0:
                W w10 = (W) obj;
                ArrayList arrayList = this.f1774b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    W.g(w10, (X) arrayList.get(i10), 0, 0);
                }
                break;
            case 1:
                W w11 = (W) obj;
                ArrayList arrayList2 = this.f1774b;
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    W.f(w11, (X) arrayList2.get(i11), 0, 0);
                }
                break;
            case 2:
                W w12 = (W) obj;
                ArrayList arrayList3 = this.f1774b;
                int size3 = arrayList3.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    W.d(w12, (X) arrayList3.get(i12), 0, 0);
                }
                break;
            case 3:
                W w13 = (W) obj;
                ArrayList arrayList4 = this.f1774b;
                int size4 = arrayList4.size();
                for (int i13 = 0; i13 < size4; i13++) {
                    W.f(w13, (X) arrayList4.get(i13), 0, 0);
                }
                break;
            case 4:
                W w14 = (W) obj;
                ArrayList arrayList5 = this.f1774b;
                int iG = D7.W.G(arrayList5);
                if (iG >= 0) {
                    int i14 = 0;
                    while (true) {
                        W.f(w14, (X) arrayList5.get(i14), 0, 0);
                        if (i14 != iG) {
                            i14++;
                        }
                    }
                }
                break;
            default:
                W w15 = (W) obj;
                ArrayList arrayList6 = this.f1774b;
                int size5 = arrayList6.size();
                for (int i15 = 0; i15 < size5; i15++) {
                    W.d(w15, (X) arrayList6.get(i15), 0, 0);
                }
                break;
        }
        return M8.D.f8402a;
    }
}
