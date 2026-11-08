package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t extends c implements p075g9.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21868a;

    public t(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f21868a = false;
    }

    @Override // kotlin.jvm.internal.c
    public final p075g9.b compute() {
        return this.f21868a ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            return getOwner().equals(tVar.getOwner()) && getName().equals(tVar.getName()) && getSignature().equals(tVar.getSignature()) && m.b(getBoundReceiver(), tVar.getBoundReceiver());
        }
        if (obj instanceof p075g9.j) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final p075g9.j getReflected() {
        if (this.f21868a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        p075g9.b bVarCompute = compute();
        if (bVarCompute != this) {
            return (p075g9.j) bVarCompute;
        }
        throw new Y8.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        p075g9.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
