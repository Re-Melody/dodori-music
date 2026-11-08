package V0;

import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f12435g = new l(false, 0, true, 1, 1, W0.b.f12771c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final W0.b f12441f;

    public l(boolean z10, int i10, boolean z11, int i11, int i12, W0.b bVar) {
        this.f12436a = z10;
        this.f12437b = i10;
        this.f12438c = z11;
        this.f12439d = i11;
        this.f12440e = i12;
        this.f12441f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f12436a == lVar.f12436a && this.f12437b == lVar.f12437b && this.f12438c == lVar.f12438c && this.f12439d == lVar.f12439d && this.f12440e == lVar.f12440e && kotlin.jvm.internal.m.b(this.f12441f, lVar.f12441f);
    }

    public final int hashCode() {
        return this.f12441f.f12772a.hashCode() + p134m1.b.c(this.f12440e, p134m1.b.c(this.f12439d, p134m1.b.f(p134m1.b.c(this.f12437b, Boolean.hashCode(this.f12436a) * 31, 31), 31, this.f12438c), 31), 961);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.f12436a);
        sb.append(", capitalization=");
        int i10 = this.f12437b;
        if (i10 == -1) {
            str = "Unspecified";
        } else if (i10 == 0) {
            str = OfficeOpenXMLExtended.SECURITY_NONE;
        } else if (i10 == 1) {
            str = "Characters";
        } else if (i10 == 2) {
            str = "Words";
        } else {
            str = i10 == 3 ? "Sentences" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", autoCorrect=");
        sb.append(this.f12438c);
        sb.append(", keyboardType=");
        sb.append((Object) m.a(this.f12439d));
        sb.append(", imeAction=");
        sb.append((Object) k.a(this.f12440e));
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f12441f);
        sb.append(')');
        return sb.toString();
    }
}
