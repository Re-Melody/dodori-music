package T3;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11618b;

    public /* synthetic */ o(Object obj, int i10) {
        this.f11617a = i10;
        this.f11618b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f11617a) {
            case 0:
                BiConsumer biConsumer = (BiConsumer) obj;
                S3.g gVar = (S3.g) this.f11618b;
                biConsumer.accept(0, gVar.f11088a);
                biConsumer.accept(2, gVar.f11089b);
                break;
            default:
                ((Z8.c) this.f11618b).invoke(obj);
                break;
        }
    }
}
