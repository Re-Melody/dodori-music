package p241x;

import Z8.a;
import kotlin.jvm.internal.n;

/* JADX INFO: renamed from: x.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2300c0 extends n implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2300c0 f28176b = new C2300c0(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2300c0 f28177c = new C2300c0(0, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28178a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2300c0(int i10, int i11) {
        super(i10);
        this.f28178a = i11;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f28178a) {
            case 0:
                return H.f28113a;
            case 1:
                return new p0();
            default:
                return new B0(0);
        }
    }
}
