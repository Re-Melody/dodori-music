package N;

import O0.C0678g;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0678g f8479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0678g f8480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8481c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f8482d = null;

    public f(C0678g c0678g, C0678g c0678g2) {
        this.f8479a = c0678g;
        this.f8480b = c0678g2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return m.b(this.f8479a, fVar.f8479a) && m.b(this.f8480b, fVar.f8480b) && this.f8481c == fVar.f8481c && m.b(this.f8482d, fVar.f8482d);
    }

    public final int hashCode() {
        int iF = p134m1.b.f((this.f8480b.hashCode() + (this.f8479a.hashCode() * 31)) * 31, 31, this.f8481c);
        d dVar = this.f8482d;
        return iF + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f8479a) + ", substitution=" + ((Object) this.f8480b) + ", isShowingSubstitution=" + this.f8481c + ", layoutCache=" + this.f8482d + ')';
    }
}
