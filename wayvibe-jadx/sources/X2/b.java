package X2;

import p255y2.X;
import p255y2.Y;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f13057a;

    public b(a aVar) {
        this.f13057a = aVar;
    }

    public final void a() throws X {
        try {
            ((b) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(Y.class).newInstance(this.f13057a)).a();
        } catch (Exception e2) {
            int i10 = X.f28853a;
            if (!(e2 instanceof X)) {
                throw new X(e2);
            }
        }
    }
}
