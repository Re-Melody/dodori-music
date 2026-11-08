package G0;

import U.C0921y;
import U.InterfaceC0877b0;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class X extends kotlin.jvm.internal.n implements Z8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0877b0 f5168b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(InterfaceC0877b0 interfaceC0877b0, int i10) {
        super(1);
        this.f5167a = i10;
        this.f5168b = interfaceC0877b0;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        M8.D d10 = M8.D.f8402a;
        InterfaceC0877b0 interfaceC0877b0 = this.f5168b;
        switch (this.f5167a) {
            case 0:
                Configuration configuration = new Configuration((Configuration) obj);
                C0921y c0921y = AndroidCompositionLocals_androidKt.f14837a;
                interfaceC0877b0.setValue(configuration);
                return d10;
            case 1:
                N.f fVar = (N.f) obj;
                interfaceC0877b0.setValue(fVar.f8481c ? fVar.f8480b : fVar.f8479a);
                return d10;
            case 2:
                List list = (List) obj;
                if (interfaceC0877b0 != null) {
                    interfaceC0877b0.setValue(list);
                }
                return d10;
            case 3:
                ((Z8.c) interfaceC0877b0.getValue()).invoke(new p133m0.c(((p133m0.c) obj).f22182a));
                return d10;
            case 4:
                ((Z8.c) interfaceC0877b0.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
                return d10;
            default:
                return (Float) ((Z8.c) interfaceC0877b0.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
        }
    }
}
