package p080h4;

import M8.D;
import Z8.c;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class b extends n implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f20254b = new b(1, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f20255c = new b(1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20256a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f20256a = i11;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f20256a) {
            case 0:
                return D.f8402a;
            default:
                return (i) obj;
        }
    }
}
