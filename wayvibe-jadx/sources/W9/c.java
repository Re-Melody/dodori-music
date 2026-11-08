package W9;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f12944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f12948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f12949g;

    public c(ArrayList arrayList, char c3, boolean z10, boolean z11, c cVar) {
        this.f12943a = arrayList;
        this.f12944b = c3;
        this.f12946d = z10;
        this.f12947e = z11;
        this.f12948f = cVar;
        this.f12945c = arrayList.size();
    }

    public final List a(int i10) {
        ArrayList arrayList = this.f12943a;
        if (i10 >= 1 && i10 <= arrayList.size()) {
            return arrayList.subList(0, i10);
        }
        throw new IllegalArgumentException("length must be between 1 and " + arrayList.size() + ", was " + i10);
    }

    public final List b(int i10) {
        ArrayList arrayList = this.f12943a;
        if (i10 >= 1 && i10 <= arrayList.size()) {
            return arrayList.subList(arrayList.size() - i10, arrayList.size());
        }
        throw new IllegalArgumentException("length must be between 1 and " + arrayList.size() + ", was " + i10);
    }
}
