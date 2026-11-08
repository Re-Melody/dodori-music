package p122l0;

import M8.D;
import Z8.c;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class l extends n implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f21898b = new l(1, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f21899c = new l(1, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f21900d = new l(1, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f21901e = new l(1, 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f21902f = new l(1, 4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21903a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10, int i11) {
        super(i10);
        this.f21903a = i11;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f21903a) {
            case 0:
                ((m) obj).d(false);
                return D.f8402a;
            case 1:
                int i10 = ((C2046c) obj).f21885a;
                return r.f21915b;
            case 2:
                int i11 = ((C2046c) obj).f21885a;
                return r.f21915b;
            case 3:
                Boolean boolC = f.C((y) obj, 7);
                return Boolean.valueOf(boolC != null ? boolC.booleanValue() : false);
            default:
                Boolean boolC2 = f.C((y) obj, 7);
                return Boolean.valueOf(boolC2 != null ? boolC2.booleanValue() : false);
        }
    }
}
