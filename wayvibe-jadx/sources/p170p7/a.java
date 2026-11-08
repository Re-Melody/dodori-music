package p170p7;

import E3.d;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f25243e = new c(0, b.f25249d);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f25244f = new d(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f25247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f25248d;

    public a(int i10, String str, ArrayList arrayList, c cVar) {
        this.f25245a = i10;
        if (str == null) {
            throw new NullPointerException("Null collectionGroup");
        }
        this.f25246b = str;
        this.f25247c = arrayList;
        if (cVar == null) {
            throw new NullPointerException("Null indexState");
        }
        this.f25248d = cVar;
    }

    public final d a() {
        for (d dVar : this.f25247c) {
            if (dVar.f25257b.equals(j.CONTAINS)) {
                return dVar;
            }
        }
        return null;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        for (d dVar : this.f25247c) {
            if (!dVar.f25257b.equals(j.CONTAINS)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f25245a == aVar.f25245a && this.f25246b.equals(aVar.f25246b) && this.f25247c.equals(aVar.f25247c) && this.f25248d.equals(aVar.f25248d);
    }

    public final int hashCode() {
        return this.f25248d.hashCode() ^ ((((((this.f25245a ^ 1000003) * 1000003) ^ this.f25246b.hashCode()) * 1000003) ^ this.f25247c.hashCode()) * 1000003);
    }

    public final String toString() {
        return "FieldIndex{indexId=" + this.f25245a + ", collectionGroup=" + this.f25246b + ", segments=" + this.f25247c + ", indexState=" + this.f25248d + "}";
    }
}
