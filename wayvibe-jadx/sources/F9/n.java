package F9;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4673a;

    public /* synthetic */ n(int i10) {
        this.f4673a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r3 >= r4) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r7 >= r8) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        if (r3 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        if (r3 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return -1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            r2 = -1
            int r3 = r6.f4673a
            switch(r3) {
                case 0: goto L93;
                case 1: goto L8a;
                case 2: goto L56;
                case 3: goto L4c;
                case 4: goto L2c;
                case 5: goto L22;
                default: goto L8;
            }
        L8:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            java.util.WeakHashMap r3 = K1.T.f7251a
            float r7 = K1.K.g(r7)
            float r8 = K1.K.g(r8)
            int r3 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r3 <= 0) goto L1c
            r0 = r2
            goto L21
        L1c:
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L21
            r0 = r1
        L21:
            return r0
        L22:
            j1.f r7 = (p100j1.f) r7
            j1.f r8 = (p100j1.f) r8
            int r7 = r7.f21424b
            int r8 = r8.f21424b
            int r7 = r7 - r8
            return r7
        L2c:
            Z5.b r7 = (Z5.C0987b) r7
            Z5.b r8 = (Z5.C0987b) r8
            com.google.android.gms.common.internal.E.h(r7)
            com.google.android.gms.common.internal.E.h(r8)
            int r3 = r7.f13827a
            int r4 = r8.f13827a
            if (r3 == r4) goto L3f
            if (r3 < r4) goto L4a
            goto L48
        L3f:
            int r7 = r7.f13828b
            int r8 = r8.f13828b
            if (r7 != r8) goto L46
            goto L4b
        L46:
            if (r7 < r8) goto L4a
        L48:
            r0 = r1
            goto L4b
        L4a:
            r0 = r2
        L4b:
            return r0
        L4c:
            w4.n r7 = (p235w4.n) r7
            w4.n r8 = (p235w4.n) r8
            int r8 = r8.f27997b
            int r7 = r7.f27997b
            int r8 = r8 - r7
            return r8
        L56:
            L3.h r7 = (L3.C0631h) r7
            L3.h r8 = (L3.C0631h) r8
            androidx.recyclerview.widget.RecyclerView r3 = r7.f7741d
            if (r3 != 0) goto L60
            r4 = r1
            goto L61
        L60:
            r4 = r0
        L61:
            androidx.recyclerview.widget.RecyclerView r5 = r8.f7741d
            if (r5 != 0) goto L67
            r5 = r1
            goto L68
        L67:
            r5 = r0
        L68:
            if (r4 == r5) goto L6d
            if (r3 != 0) goto L75
            goto L77
        L6d:
            boolean r3 = r7.f7738a
            boolean r4 = r8.f7738a
            if (r3 == r4) goto L79
            if (r3 == 0) goto L77
        L75:
            r0 = r2
            goto L89
        L77:
            r0 = r1
            goto L89
        L79:
            int r1 = r8.f7739b
            int r2 = r7.f7739b
            int r1 = r1 - r2
            if (r1 == 0) goto L81
            goto L77
        L81:
            int r7 = r7.f7740c
            int r8 = r8.f7740c
            int r7 = r7 - r8
            if (r7 == 0) goto L89
            r0 = r7
        L89:
            return r0
        L8a:
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            java.lang.Comparable r8 = (java.lang.Comparable) r8
            int r7 = r7.compareTo(r8)
            return r7
        L93:
            F9.k r7 = (F9.k) r7
            E9.C r7 = r7.f4643a
            F9.k r8 = (F9.k) r8
            E9.C r8 = r8.f4643a
            int r7 = R3.a.v(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: F9.n.compare(java.lang.Object, java.lang.Object):int");
    }
}
