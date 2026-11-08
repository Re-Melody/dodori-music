package p036d;

import M8.D;
import Z8.a;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class z extends n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f19008b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(G g3, int i10) {
        super(0);
        this.f19007a = i10;
        this.f19008b = g3;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f19007a) {
            case 0:
                this.f19008b.c();
                break;
            case 1:
                this.f19008b.b();
                break;
            default:
                this.f19008b.c();
                break;
        }
        return D.f8402a;
    }
}
