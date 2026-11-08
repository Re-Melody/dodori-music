package J2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f6508d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f6505a = str;
        this.f6506b = j10;
        this.f6507c = Collections.unmodifiableList(arrayList);
        this.f6508d = Collections.unmodifiableList(list);
    }
}
