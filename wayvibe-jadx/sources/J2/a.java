package J2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f6466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f6467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f6468f;

    public a(long j10, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f6463a = j10;
        this.f6464b = i10;
        this.f6465c = Collections.unmodifiableList(arrayList);
        this.f6466d = Collections.unmodifiableList(list);
        this.f6467e = Collections.unmodifiableList(list2);
        this.f6468f = Collections.unmodifiableList(list3);
    }
}
