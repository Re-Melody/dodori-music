package O0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: O0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0675d implements Appendable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f8911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f8913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f8914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f8915e;

    public C0675d() {
        this.f8911a = new StringBuilder(16);
        this.f8912b = new ArrayList();
        this.f8913c = new ArrayList();
        this.f8914d = new ArrayList();
        this.f8915e = new ArrayList();
    }

    public final void a(E e2, int i10, int i11) {
        this.f8912b.add(new C0674c(e2, i10, i11, 8));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C0678g) {
            b((C0678g) charSequence);
            return this;
        }
        this.f8911a.append(charSequence);
        return this;
    }

    public final void b(C0678g c0678g) {
        StringBuilder sb = this.f8911a;
        int length = sb.length();
        sb.append(c0678g.f8920a);
        List list = c0678g.f8921b;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C0676e c0676e = (C0676e) list.get(i10);
                a((E) c0676e.f8916a, c0676e.f8917b + length, c0676e.f8918c + length);
            }
        }
        List list2 = c0678g.f8922c;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C0676e c0676e2 = (C0676e) list2.get(i11);
                this.f8913c.add(new C0674c((t) c0676e2.f8916a, c0676e2.f8917b + length, c0676e2.f8918c + length, 8));
            }
        }
        List list3 = c0678g.f8923d;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                C0676e c0676e3 = (C0676e) list3.get(i12);
                this.f8914d.add(new C0674c(c0676e3.f8917b + length, c0676e3.f8918c + length, c0676e3.f8916a, c0676e3.f8919d));
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.f8915e;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("Nothing to pop.");
        }
        ((C0674c) arrayList.remove(arrayList.size() - 1)).f8909c = this.f8911a.length();
    }

    public final void d(int i10) {
        ArrayList arrayList = this.f8915e;
        if (i10 < arrayList.size()) {
            while (arrayList.size() - 1 >= i10) {
                c();
            }
        } else {
            throw new IllegalStateException((i10 + " should be less than " + arrayList.size()).toString());
        }
    }

    public final void e(E e2) {
        C0674c c0674c = new C0674c(e2, this.f8911a.length(), 0, 12);
        ArrayList arrayList = this.f8915e;
        arrayList.add(c0674c);
        this.f8912b.add(c0674c);
        arrayList.size();
    }

    public final C0678g f() {
        StringBuilder sb = this.f8911a;
        String string = sb.toString();
        ArrayList arrayList = this.f8912b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((C0674c) arrayList.get(i10)).a(sb.length()));
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        ArrayList arrayList3 = this.f8913c;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList4.add(((C0674c) arrayList3.get(i11)).a(sb.length()));
        }
        if (arrayList4.isEmpty()) {
            arrayList4 = null;
        }
        ArrayList arrayList5 = this.f8914d;
        ArrayList arrayList6 = new ArrayList(arrayList5.size());
        int size3 = arrayList5.size();
        for (int i12 = 0; i12 < size3; i12++) {
            arrayList6.add(((C0674c) arrayList5.get(i12)).a(sb.length()));
        }
        return new C0678g(string, arrayList2, arrayList4, arrayList6.isEmpty() ? null : arrayList6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List] */
    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        ?? arrayList;
        ?? r10;
        ?? arrayList2;
        boolean z10 = charSequence instanceof C0678g;
        StringBuilder sb = this.f8911a;
        if (z10) {
            C0678g c0678g = (C0678g) charSequence;
            int length = sb.length();
            sb.append((CharSequence) c0678g.f8920a, i10, i11);
            List listB = AbstractC0679h.b(c0678g, i10, i11);
            if (listB != null) {
                int size = listB.size();
                for (int i12 = 0; i12 < size; i12++) {
                    C0676e c0676e = (C0676e) listB.get(i12);
                    a((E) c0676e.f8916a, c0676e.f8917b + length, c0676e.f8918c + length);
                }
            }
            String str = c0678g.f8920a;
            if (i10 == i11 || (arrayList = c0678g.f8922c) == 0) {
                arrayList = 0;
            } else if (i10 != 0 || i11 < str.length()) {
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                int size2 = arrayList.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    Object obj = arrayList.get(i13);
                    C0676e c0676e2 = (C0676e) obj;
                    if (AbstractC0679h.c(i10, i11, c0676e2.f8917b, c0676e2.f8918c)) {
                        arrayList3.add(obj);
                    }
                }
                arrayList = new ArrayList(arrayList3.size());
                int size3 = arrayList3.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    C0676e c0676e3 = (C0676e) arrayList3.get(i14);
                    arrayList.add(new C0676e(c0676e3.f8916a, R3.a.n(c0676e3.f8917b, i10, i11) - i10, R3.a.n(c0676e3.f8918c, i10, i11) - i10));
                }
            }
            if (arrayList != 0) {
                int size4 = arrayList.size();
                for (int i15 = 0; i15 < size4; i15++) {
                    C0676e c0676e4 = (C0676e) arrayList.get(i15);
                    this.f8913c.add(new C0674c((t) c0676e4.f8916a, c0676e4.f8917b + length, c0676e4.f8918c + length, 8));
                }
            }
            if (i10 == i11 || (arrayList2 = c0678g.f8923d) == 0) {
                r10 = 0;
            } else {
                if (i10 != 0 || i11 < str.length()) {
                    ArrayList arrayList4 = new ArrayList(arrayList2.size());
                    int size5 = arrayList2.size();
                    for (int i16 = 0; i16 < size5; i16++) {
                        Object obj2 = arrayList2.get(i16);
                        C0676e c0676e5 = (C0676e) obj2;
                        if (AbstractC0679h.c(i10, i11, c0676e5.f8917b, c0676e5.f8918c)) {
                            arrayList4.add(obj2);
                        }
                    }
                    arrayList2 = new ArrayList(arrayList4.size());
                    int size6 = arrayList4.size();
                    for (int i17 = 0; i17 < size6; i17++) {
                        C0676e c0676e6 = (C0676e) arrayList4.get(i17);
                        arrayList2.add(new C0676e(R3.a.n(c0676e6.f8917b, i10, i11) - i10, R3.a.n(c0676e6.f8918c, i10, i11) - i10, c0676e6.f8916a, c0676e6.f8919d));
                    }
                }
                r10 = arrayList2;
            }
            if (r10 != 0) {
                int size7 = r10.size();
                for (int i18 = 0; i18 < size7; i18++) {
                    C0676e c0676e7 = (C0676e) r10.get(i18);
                    this.f8914d.add(new C0674c(c0676e7.f8917b + length, c0676e7.f8918c + length, c0676e7.f8916a, c0676e7.f8919d));
                }
            }
            return this;
        }
        sb.append(charSequence, i10, i11);
        return this;
    }

    public C0675d(C0678g c0678g) {
        this();
        b(c0678g);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c3) {
        this.f8911a.append(c3);
        return this;
    }
}
