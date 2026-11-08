package p220v;

import M8.D;
import Z8.a;
import Z8.c;
import kotlin.jvm.internal.n;
import p143n0.I;
import p143n0.Z;

/* JADX INFO: loaded from: classes.dex */
public final class E extends n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f27300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f27301b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(a aVar, boolean z10) {
        super(1);
        this.f27300a = z10;
        this.f27301b = aVar;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        ((Z) ((I) obj)).g(!this.f27300a && ((Boolean) this.f27301b.invoke()).booleanValue());
        return D.f8402a;
    }
}
