package p200t0;

import M8.D;
import Z8.a;
import android.graphics.PathMeasure;
import kotlin.jvm.internal.n;
import p143n0.C2084k;

/* JADX INFO: renamed from: t0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2240g extends n implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2240g f26469b = new C2240g(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2240g f26470c = new C2240g(0, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26471a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2240g(int i10, int i11) {
        super(i10);
        this.f26471a = i11;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f26471a) {
            case 0:
                return new C2084k(new PathMeasure());
            default:
                return D.f8402a;
        }
    }
}
