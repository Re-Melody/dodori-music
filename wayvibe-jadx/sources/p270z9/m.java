package p270z9;

import Z8.a;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends n implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f29932b = new m(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f29933c = new m(0, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f29934d = new m(0, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f29935e = new m(0, 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f29936f = new m(0, 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f29937g = new m(0, 5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29938a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i10, int i11) {
        super(i10);
        this.f29938a = i11;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f29938a) {
            case 0:
                return D.f29914b;
            case 1:
                return w.f29952b;
            case 2:
                return t.f29949b;
            case 3:
                return A.f29912b;
            case 4:
                return f.f29924b;
            default:
                return w.f29951a;
        }
    }
}
