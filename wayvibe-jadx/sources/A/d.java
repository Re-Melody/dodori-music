package A;

import M8.D;
import kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.n implements Z8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f48b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.n f49c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(v vVar, Z8.c cVar, int i10) {
        super(1);
        this.f47a = i10;
        switch (i10) {
            case 1:
                this.f48b = vVar;
                this.f49c = (kotlin.jvm.internal.n) cVar;
                super(1);
                break;
            default:
                this.f48b = vVar;
                this.f49c = (kotlin.jvm.internal.n) cVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Z8.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r0v4, types: [Z8.c, kotlin.jvm.internal.n] */
    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f47a) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                v vVar = this.f48b;
                float f10 = vVar.f21870a - fFloatValue;
                vVar.f21870a = f10;
                this.f49c.invoke(Float.valueOf(f10));
                break;
            default:
                float fFloatValue2 = ((Number) obj).floatValue();
                v vVar2 = this.f48b;
                float f11 = vVar2.f21870a - fFloatValue2;
                vVar2.f21870a = f11;
                this.f49c.invoke(Float.valueOf(f11));
                break;
        }
        return D.f8402a;
    }
}
