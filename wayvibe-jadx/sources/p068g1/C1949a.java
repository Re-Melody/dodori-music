package p068g1;

import F.C0374t;
import M8.D;
import Z8.c;
import kotlin.jvm.internal.n;

/* JADX INFO: renamed from: g1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1949a extends n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f19975b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1949a(r rVar, int i10) {
        super(1);
        this.f19974a = i10;
        this.f19975b = rVar;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f19974a) {
            case 0:
                r rVar = this.f19975b;
                rVar.show();
                return new C0374t(rVar, 6);
            default:
                r rVar2 = this.f19975b;
                if (rVar2.f20019e.f20012a) {
                    rVar2.f20018d.invoke();
                }
                return D.f8402a;
        }
    }
}
