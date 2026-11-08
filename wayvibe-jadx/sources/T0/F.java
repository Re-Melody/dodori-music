package T0;

/* JADX INFO: loaded from: classes.dex */
public final class F implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11448a;

    public F(float f10) {
        this.f11448a = f10;
    }

    @Override // T0.E
    public final float a() {
        return this.f11448a;
    }

    @Override // T0.E
    public final String b() {
        return "ital";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        f10.getClass();
        return this.f11448a == f10.f11448a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11448a) + 100522026;
    }

    public final String toString() {
        return p134m1.b.l(new StringBuilder("FontVariation.Setting(axisName='ital', value="), this.f11448a, ')');
    }
}
