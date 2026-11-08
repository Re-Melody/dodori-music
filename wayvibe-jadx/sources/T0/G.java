package T0;

/* JADX INFO: loaded from: classes.dex */
public final class G implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11449a;

    public G(int i10) {
        this.f11449a = i10;
    }

    @Override // T0.E
    public final float a() {
        return this.f11449a;
    }

    @Override // T0.E
    public final String b() {
        return "wght";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g3 = (G) obj;
        g3.getClass();
        return this.f11449a == g3.f11449a;
    }

    public final int hashCode() {
        return 113071012 + this.f11449a;
    }

    public final String toString() {
        return V0.p.q(new StringBuilder("FontVariation.Setting(axisName='wght', value="), this.f11449a, ')');
    }
}
