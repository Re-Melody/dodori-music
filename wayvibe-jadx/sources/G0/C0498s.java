package G0;

import U.InterfaceC0877b0;

/* JADX INFO: renamed from: G0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0498s extends kotlin.jvm.internal.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5286b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0498s(int i10, int i11, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i10);
        this.f5286b = i11;
    }

    @Override // kotlin.jvm.internal.o, p075g9.h
    public final Object get() {
        switch (this.f5286b) {
            case 0:
                return ((A) this.receiver).getLayoutDirection();
            default:
                return ((InterfaceC0877b0) this.receiver).getValue();
        }
    }
}
