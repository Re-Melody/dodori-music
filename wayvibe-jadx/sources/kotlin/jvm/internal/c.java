package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements p075g9.b, Serializable {
    public static final Object NO_RECEIVER = C2043b.f21862a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient p075g9.b reflected;
    private final String signature;

    public c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // p075g9.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // p075g9.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public p075g9.b compute() {
        p075g9.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        p075g9.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    public abstract p075g9.b computeReflected();

    @Override // p075g9.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // p075g9.b
    public String getName() {
        return this.name;
    }

    public p075g9.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return z.a(cls);
        }
        z.f21874a.getClass();
        return new r(cls);
    }

    @Override // p075g9.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract p075g9.b getReflected();

    @Override // p075g9.b
    public p075g9.k getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // p075g9.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // p075g9.b
    public p075g9.l getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // p075g9.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // p075g9.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // p075g9.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
