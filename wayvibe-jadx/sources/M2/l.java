package M2;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p255y2.C2339o;
import p255y2.K;

/* JADX INFO: loaded from: classes.dex */
public final class l extends m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l f8189n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f8190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f8191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f8192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f8193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f8194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f8195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C2339o f8196j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f8197l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f8198m;

    static {
        List list = Collections.EMPTY_LIST;
        f8189n = new l("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public l(String str, List list, List list2, List list3, List list4, List list5, List list6, C2339o c2339o, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = ((k) list2.get(i10)).f8183a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.f8190d = Collections.unmodifiableList(arrayList);
        this.f8191e = Collections.unmodifiableList(list2);
        this.f8192f = Collections.unmodifiableList(list3);
        this.f8193g = Collections.unmodifiableList(list4);
        this.f8194h = Collections.unmodifiableList(list5);
        this.f8195i = Collections.unmodifiableList(list6);
        this.f8196j = c2339o;
        this.k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f8197l = Collections.unmodifiableMap(map);
        this.f8198m = Collections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((j) list.get(i10)).f8180a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i10, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            for (int i12 = 0; i12 < list2.size(); i12++) {
                K k = (K) list2.get(i12);
                if (k.f28776b == i10 && k.f28777c == i11) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // Q2.a
    public final Object a(List list) {
        ArrayList arrayListC = c(0, this.f8191e, list);
        List list2 = Collections.EMPTY_LIST;
        return new l(this.f8199a, this.f8200b, arrayListC, list2, c(1, this.f8193g, list), c(2, this.f8194h, list), list2, this.f8196j, this.k, this.f8201c, this.f8197l, this.f8198m);
    }
}
