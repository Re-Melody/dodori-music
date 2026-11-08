package O0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: O0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0678g implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f8922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f8923d;

    static {
        W4.m mVar = D.f8831a;
    }

    public C0678g(String str, List list, List list2, List list3) {
        this.f8920a = str;
        this.f8921b = list;
        this.f8922c = list2;
        this.f8923d = list3;
        if (list2 != null) {
            List listR0 = N8.n.R0(new C0677f(), list2);
            int size = listR0.size();
            int i10 = -1;
            int i11 = 0;
            while (i11 < size) {
                C0676e c0676e = (C0676e) listR0.get(i11);
                if (c0676e.f8917b < i10) {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap");
                }
                int length = this.f8920a.length();
                int i12 = c0676e.f8918c;
                if (i12 > length) {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + c0676e.f8917b + ", " + i12 + ") is out of boundary").toString());
                }
                i11++;
                i10 = i12;
            }
        }
    }

    public final List a(int i10) {
        List list = this.f8923d;
        if (list == null) {
            return N8.s.f8650a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            C0676e c0676e = (C0676e) obj;
            if ((c0676e.f8916a instanceof AbstractC0684m) && AbstractC0679h.c(0, i10, c0676e.f8917b, c0676e.f8918c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List b() {
        List list = this.f8921b;
        return list == null ? N8.s.f8650a : list;
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C0678g subSequence(int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("start (" + i10 + ") should be less or equal to end (" + i11 + ')').toString());
        }
        String str = this.f8920a;
        if (i10 == 0 && i11 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.m.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new C0678g(strSubstring, AbstractC0679h.a(i10, i11, this.f8921b), AbstractC0679h.a(i10, i11, this.f8922c), AbstractC0679h.a(i10, i11, this.f8923d));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f8920a.charAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0678g)) {
            return false;
        }
        C0678g c0678g = (C0678g) obj;
        return kotlin.jvm.internal.m.b(this.f8920a, c0678g.f8920a) && kotlin.jvm.internal.m.b(this.f8921b, c0678g.f8921b) && kotlin.jvm.internal.m.b(this.f8922c, c0678g.f8922c) && kotlin.jvm.internal.m.b(this.f8923d, c0678g.f8923d);
    }

    public final int hashCode() {
        int iHashCode = this.f8920a.hashCode() * 31;
        List list = this.f8921b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f8922c;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.f8923d;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f8920a.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f8920a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0678g(int i10, String str, ArrayList arrayList) {
        List list = (i10 & 2) != 0 ? N8.s.f8650a : arrayList;
        this(str, list.isEmpty() ? null : list, null, null);
    }
}
