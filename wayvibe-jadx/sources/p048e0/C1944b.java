package p048e0;

import M8.D;
import Z8.c;
import kotlin.jvm.internal.n;

/* JADX INFO: renamed from: e0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1944b extends n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f19471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f19472c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1944b(c cVar, c cVar2, int i10) {
        super(1);
        this.f19470a = i10;
        this.f19471b = cVar;
        this.f19472c = cVar2;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        int i10;
        switch (this.f19470a) {
            case 0:
                m mVar = (m) obj;
                synchronized (o.f19510b) {
                    i10 = o.f19512d;
                    o.f19512d = i10 + 1;
                }
                return new C1947e(i10, mVar, this.f19471b, this.f19472c);
            case 1:
                this.f19471b.invoke(obj);
                this.f19472c.invoke(obj);
                return D.f8402a;
            default:
                this.f19471b.invoke(obj);
                this.f19472c.invoke(obj);
                return D.f8402a;
        }
    }
}
