package M4;

import G0.AbstractC0454b;
import java.util.Collections;
import java.util.List;
import p235w4.n;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0454b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f8277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f8278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f8279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f8280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f8281g;

    public b(String str, List list, List list2, List list3, List list4, n nVar, List list5) {
        super(str, list);
        this.f8277c = Collections.unmodifiableList(list2);
        this.f8278d = Collections.unmodifiableList(list3);
        this.f8279e = Collections.unmodifiableList(list4);
        this.f8280f = nVar;
        this.f8281g = list5 != null ? Collections.unmodifiableList(list5) : null;
    }
}
