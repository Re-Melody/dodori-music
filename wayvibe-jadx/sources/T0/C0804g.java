package T0;

/* JADX INFO: renamed from: T0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0804g implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11499a;

    public C0804g(int i10) {
        this.f11499a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0804g) && this.f11499a == ((C0804g) obj).f11499a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11499a);
    }

    public final String toString() {
        return V0.p.q(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f11499a, ')');
    }
}
