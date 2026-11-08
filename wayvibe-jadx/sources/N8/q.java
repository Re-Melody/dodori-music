package N8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q extends p {
    public static void q0(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void r0(List list, Comparator comparator) {
        kotlin.jvm.internal.m.f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
