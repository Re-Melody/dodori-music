package D;

import U.Y0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.t implements p075g9.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1630b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, int i11, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i10);
        this.f1630b = i11;
    }

    @Override // kotlin.jvm.internal.c
    public final p075g9.b computeReflected() {
        kotlin.jvm.internal.z.f21874a.getClass();
        return this;
    }

    @Override // p075g9.h
    public final Object get() {
        switch (this.f1630b) {
            case 0:
                return ((Y0) this.receiver).getValue();
            case 1:
                return ((Y0) this.receiver).getValue();
            case 2:
                return ((Y0) this.receiver).getValue();
            case 3:
                return ((Y0) this.receiver).getValue();
            default:
                return this.receiver.getClass().getSimpleName();
        }
    }

    @Override // Z8.a
    public final Object invoke() {
        return get();
    }
}
