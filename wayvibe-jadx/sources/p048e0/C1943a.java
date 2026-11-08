package p048e0;

import M8.D;
import Z8.c;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: renamed from: e0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1943a extends n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19469b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1943a(Object obj, int i10) {
        super(1);
        this.f19468a = i10;
        this.f19469b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f19468a) {
            case 0:
                ?? r10 = this.f19469b;
                int size = r10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((c) r10.get(i10)).invoke(obj);
                }
                return D.f8402a;
            default:
                return Boolean.valueOf(m.b(obj, this.f19469b));
        }
    }
}
