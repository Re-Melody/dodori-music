package M0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.n f8020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.n f8021b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(Z8.a aVar, Z8.a aVar2) {
        this.f8020a = (kotlin.jvm.internal.n) aVar;
        this.f8021b = (kotlin.jvm.internal.n) aVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Z8.a, kotlin.jvm.internal.n] */
    public final Z8.a a() {
        return this.f8021b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Z8.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r1v6, types: [Z8.a, kotlin.jvm.internal.n] */
    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f8020a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f8021b.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}
