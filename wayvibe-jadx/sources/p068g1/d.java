package p068g1;

import Z8.a;
import java.util.UUID;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class d extends n implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f19985b = new d(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f19986c = new d(0, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f19987d = new d(0, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19988a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11) {
        super(i10);
        this.f19988a = i11;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f19988a) {
            case 0:
                return UUID.randomUUID();
            case 1:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}
