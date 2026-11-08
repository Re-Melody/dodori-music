package p119k9;

import M8.D;
import U1.e;
import Z8.f;
import t9.i;

/* JADX INFO: renamed from: k9.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2026m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21750b;

    public /* synthetic */ C2026m(Object obj, int i10) {
        this.f21749a = i10;
        this.f21750b = obj;
    }

    @Override // Z8.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj;
        switch (this.f21749a) {
            case 0:
                ((e) this.f21750b).invoke(th);
                break;
            default:
                ((i) this.f21750b).b();
                break;
        }
        return D.f8402a;
    }
}
