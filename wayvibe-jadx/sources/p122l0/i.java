package p122l0;

import M8.D;
import Z8.a;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class i extends n implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f21894b = new i(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f21895c = new i(0, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21896a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, int i11) {
        super(i10);
        this.f21896a = i11;
    }

    @Override // Z8.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f21896a) {
            case 0:
                return Boolean.FALSE;
            default:
                return D.f8402a;
        }
    }
}
