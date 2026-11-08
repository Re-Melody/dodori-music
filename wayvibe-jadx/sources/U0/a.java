package U0;

import B2.AbstractC0112b;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12036c;

    public a(String str, String str2, int i10) {
        this.f12034a = str;
        this.f12035b = str2;
        this.f12036c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.b(this.f12034a, aVar.f12034a) && m.b(this.f12035b, aVar.f12035b) && this.f12036c == aVar.f12036c;
    }

    public final int hashCode() {
        return AbstractC0112b.a(this.f12034a.hashCode() * 31, 961, this.f12035b) + this.f12036c;
    }
}
