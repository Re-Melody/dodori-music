package p037d0;

import Z8.a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class i extends n implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f19039b = new i(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f19040c = new i(0, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19041a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, int i11) {
        super(i10);
        this.f19041a = i11;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f19041a) {
            case 0:
                return new h(new LinkedHashMap());
            default:
                return null;
        }
    }
}
