package L0;

import M8.D;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class d extends n implements Z8.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f7441b = new d(1, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f7442c = new d(1, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f7443d = new d(1, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7444a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11) {
        super(i10);
        this.f7444a = i11;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f7444a) {
            case 0:
                ((Number) obj).longValue();
                return D.f8402a;
            case 1:
                return Integer.valueOf(((m) obj).f7465b);
            default:
                p028c1.i iVar = ((m) obj).f7466c;
                return Integer.valueOf(iVar.f15857d - iVar.f15855b);
        }
    }
}
