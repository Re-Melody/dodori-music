package T0;

import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0818v f11477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f11478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11481e;

    public W(AbstractC0818v abstractC0818v, I i10, int i11, int i12, Object obj) {
        this.f11477a = abstractC0818v;
        this.f11478b = i10;
        this.f11479c = i11;
        this.f11480d = i12;
        this.f11481e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w10 = (W) obj;
        return kotlin.jvm.internal.m.b(this.f11477a, w10.f11477a) && kotlin.jvm.internal.m.b(this.f11478b, w10.f11478b) && this.f11479c == w10.f11479c && this.f11480d == w10.f11480d && kotlin.jvm.internal.m.b(this.f11481e, w10.f11481e);
    }

    public final int hashCode() {
        AbstractC0818v abstractC0818v = this.f11477a;
        int iC = p134m1.b.c(this.f11480d, p134m1.b.c(this.f11479c, (((abstractC0818v == null ? 0 : abstractC0818v.hashCode()) * 31) + this.f11478b.f11463a) * 31, 31), 31);
        Object obj = this.f11481e;
        return iC + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f11477a);
        sb.append(", fontWeight=");
        sb.append(this.f11478b);
        sb.append(", fontStyle=");
        sb.append((Object) C.a(this.f11479c));
        sb.append(", fontSynthesis=");
        int i10 = this.f11480d;
        if (i10 == 0) {
            str = OfficeOpenXMLExtended.SECURITY_NONE;
        } else if (i10 == 1) {
            str = "All";
        } else if (i10 == 2) {
            str = "Weight";
        } else {
            str = i10 == 3 ? "Style" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f11481e);
        sb.append(')');
        return sb.toString();
    }
}
