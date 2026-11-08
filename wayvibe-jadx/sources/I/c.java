package I;

import M8.D;
import M8.InterfaceC0643e;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n implements Z8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6249a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0643e f6251c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Z8.a aVar, boolean z10) {
        super(0);
        this.f6250b = z10;
        this.f6251c = (n) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [Z8.a, kotlin.jvm.internal.n] */
    @Override // Z8.a
    public final Object invoke() {
        switch (this.f6249a) {
            case 0:
                ((Z8.c) this.f6251c).invoke(Boolean.valueOf(!this.f6250b));
                break;
            default:
                if (this.f6250b) {
                    ((n) this.f6251c).invoke();
                }
                break;
        }
        return D.f8402a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z10, Z8.c cVar) {
        super(0);
        this.f6251c = cVar;
        this.f6250b = z10;
    }
}
