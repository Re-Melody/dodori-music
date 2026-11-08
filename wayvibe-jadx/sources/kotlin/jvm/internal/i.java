package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i extends c implements h, p075g9.e {
    private final int arity;
    private final int flags;

    public i(int i10, int i11, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.c
    public p075g9.b computeReflected() {
        z.f21874a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return getName().equals(iVar.getName()) && getSignature().equals(iVar.getSignature()) && this.flags == iVar.flags && this.arity == iVar.arity && m.b(getBoundReceiver(), iVar.getBoundReceiver()) && m.b(getOwner(), iVar.getOwner());
        }
        if (obj instanceof p075g9.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // p075g9.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // p075g9.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // p075g9.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // p075g9.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // p075g9.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        p075g9.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.c
    public p075g9.e getReflected() {
        p075g9.b bVarCompute = compute();
        if (bVarCompute != this) {
            return (p075g9.e) bVarCompute;
        }
        throw new Y8.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
