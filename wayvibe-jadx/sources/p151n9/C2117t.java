package p151n9;

import Q8.d;
import kotlin.jvm.internal.y;
import o9.a;

/* JADX INFO: renamed from: n9.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2117t implements InterfaceC2106h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f23153b;

    public /* synthetic */ C2117t(y yVar, int i10) {
        this.f23152a = i10;
        this.f23153b = yVar;
    }

    @Override // p151n9.InterfaceC2106h
    public final Object emit(Object obj, d dVar) {
        switch (this.f23152a) {
            case 0:
                this.f23153b.f21873a = obj;
                throw new a(this);
            default:
                this.f23153b.f21873a = obj;
                throw new a(this);
        }
    }
}
