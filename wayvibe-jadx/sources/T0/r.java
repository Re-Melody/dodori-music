package T0;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC0800c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f11536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11537c;

    public r(String str, I i10, int i11, H h10) {
        super(1, C0805h.f11501c, h10);
        this.f11535a = str;
        this.f11536b = i10;
        this.f11537c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!kotlin.jvm.internal.m.b(this.f11535a, rVar.f11535a)) {
            return false;
        }
        if (kotlin.jvm.internal.m.b(this.f11536b, rVar.f11536b)) {
            return this.f11537c == rVar.f11537c && kotlin.jvm.internal.m.b(getVariationSettings(), rVar.getVariationSettings());
        }
        return false;
    }

    @Override // T0.InterfaceC0816t
    /* JADX INFO: renamed from: getStyle-_-LCdwA */
    public final int mo9getStyle_LCdwA() {
        return this.f11537c;
    }

    @Override // T0.InterfaceC0816t
    public final I getWeight() {
        return this.f11536b;
    }

    public final int hashCode() {
        return getVariationSettings().f11450a.hashCode() + p134m1.b.c(this.f11537c, ((this.f11535a.hashCode() * 31) + this.f11536b.f11463a) * 31, 31);
    }

    public final String toString() {
        return "Font(familyName=\"" + ((Object) ("DeviceFontFamilyName(name=" + this.f11535a + ')')) + "\", weight=" + this.f11536b + ", style=" + ((Object) C.a(this.f11537c)) + ')';
    }
}
