package D;

import F.InterfaceC0371p;

/* JADX INFO: renamed from: D.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0174f implements InterfaceC0371p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.n f1616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.n f1617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0.b f1618c;

    /* JADX WARN: Multi-variable type inference failed */
    public C0174f(Z8.c cVar, Z8.c cVar2, c0.b bVar) {
        this.f1616a = (kotlin.jvm.internal.n) cVar;
        this.f1617b = (kotlin.jvm.internal.n) cVar2;
        this.f1618c = bVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Z8.c, kotlin.jvm.internal.n] */
    @Override // F.InterfaceC0371p
    public final Z8.c getKey() {
        return this.f1616a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Z8.c, kotlin.jvm.internal.n] */
    @Override // F.InterfaceC0371p
    public final Z8.c getType() {
        return this.f1617b;
    }
}
