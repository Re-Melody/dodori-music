package p170p7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f25277b = new p(Collections.EMPTY_LIST);

    public static p l(String str) {
        if (str.contains("//")) {
            throw new IllegalArgumentException(V0.p.o("Invalid path (", str, "). Paths must not contain // in them."));
        }
        String[] strArrSplit = str.split("/");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (!str2.isEmpty()) {
                arrayList.add(str2);
            }
        }
        return new p(arrayList);
    }

    @Override // p170p7.e
    public final String c() {
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (true) {
            List list = this.f25258a;
            if (i10 >= list.size()) {
                return sb.toString();
            }
            if (i10 > 0) {
                sb.append("/");
            }
            sb.append((String) list.get(i10));
            i10++;
        }
    }

    @Override // p170p7.e
    public final e e(List list) {
        return new p(list);
    }
}
