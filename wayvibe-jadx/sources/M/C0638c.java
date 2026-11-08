package M;

import D0.InterfaceC0195v;
import M8.D;
import p143n0.M;

/* JADX INFO: renamed from: M.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0638c extends kotlin.jvm.internal.j implements Z8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f7941a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0638c(u uVar) {
        super(1, kotlin.jvm.internal.l.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f7941a = uVar;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        float[] fArr = ((M) obj).f22714a;
        InterfaceC0195v interfaceC0195v = (InterfaceC0195v) this.f7941a.f7978d.getValue();
        if (interfaceC0195v != null) {
            if (!interfaceC0195v.q()) {
                interfaceC0195v = null;
            }
            if (interfaceC0195v != null) {
                interfaceC0195v.s(fArr);
            }
        }
        return D.f8402a;
    }
}
