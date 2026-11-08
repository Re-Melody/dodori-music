package p009a5;

import Z8.a;
import p259y8.C2351b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14147a;

    public /* synthetic */ e(int i10) {
        this.f14147a = i10;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f14147a) {
            case 0:
                return new b(0);
            case 1:
                return new b(1);
            default:
                return new C2351b(1);
        }
    }
}
