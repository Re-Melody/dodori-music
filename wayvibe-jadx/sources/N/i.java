package N;

import B2.AbstractC0112b;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f8500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8501c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f8502d = null;

    public i(String str, String str2) {
        this.f8499a = str;
        this.f8500b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return m.b(this.f8499a, iVar.f8499a) && m.b(this.f8500b, iVar.f8500b) && this.f8501c == iVar.f8501c && m.b(this.f8502d, iVar.f8502d);
    }

    public final int hashCode() {
        int iF = p134m1.b.f(AbstractC0112b.a(this.f8499a.hashCode() * 31, 31, this.f8500b), 31, this.f8501c);
        e eVar = this.f8502d;
        return iF + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
        sb.append(this.f8502d);
        sb.append(", isShowingSubstitution=");
        return p134m1.b.o(sb, this.f8501c, ')');
    }
}
