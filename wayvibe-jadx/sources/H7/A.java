package H7;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class A extends E7.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6137a;

    public /* synthetic */ A(int i10) {
        this.f6137a = i10;
    }

    @Override // E7.y
    public final Object read(M7.b bVar) {
        switch (this.f6137a) {
            case 0:
                return new AtomicBoolean(bVar.D());
            default:
                try {
                    return new AtomicInteger(bVar.F());
                } catch (NumberFormatException e2) {
                    throw new E7.n(e2);
                }
        }
    }

    @Override // E7.y
    public final void write(M7.d dVar, Object obj) throws IOException {
        switch (this.f6137a) {
            case 0:
                dVar.G(((AtomicBoolean) obj).get());
                break;
            default:
                dVar.C(((AtomicInteger) obj).get());
                break;
        }
    }
}
