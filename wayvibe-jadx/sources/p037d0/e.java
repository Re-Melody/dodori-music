package p037d0;

import Z8.c;
import java.util.Map;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class e extends n implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f19025b = new e(1, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f19026c = new e(1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19027a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11) {
        super(i10);
        this.f19027a = i11;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f19027a) {
            case 0:
                return new h((Map) obj);
            default:
                return obj;
        }
    }
}
