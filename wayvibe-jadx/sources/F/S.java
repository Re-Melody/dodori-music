package F;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class S extends kotlin.jvm.internal.n implements Z8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p037d0.k f3485b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(p037d0.k kVar, int i10) {
        super(1);
        this.f3484a = i10;
        this.f3485b = kVar;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f3484a) {
            case 0:
                p037d0.k kVar = this.f3485b;
                return Boolean.valueOf(kVar != null ? kVar.a(obj) : true);
            default:
                return new U(this.f3485b, (Map) obj);
        }
    }
}
