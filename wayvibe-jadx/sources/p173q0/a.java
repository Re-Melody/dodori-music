package p173q0;

import M8.D;
import Z8.c;
import kotlin.jvm.internal.n;
import p143n0.C2096x;
import p163p0.e;

/* JADX INFO: loaded from: classes.dex */
public final class a extends n implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25378b = new a(1, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25379c = new a(1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25380a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11) {
        super(i10);
        this.f25380a = i11;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f25380a) {
            case 0:
                break;
            default:
                e.T((e) obj, C2096x.f22801l, 0L, 126);
                break;
        }
        return D.f8402a;
    }
}
