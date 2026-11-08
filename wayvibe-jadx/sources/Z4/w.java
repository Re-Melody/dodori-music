package Z4;

import java.util.AbstractCollection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractCollection f13809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractCollection f13810b;

    /* JADX WARN: Multi-variable type inference failed */
    public w(List list, List list2) {
        this.f13809a = (AbstractCollection) list;
        this.f13810b = (AbstractCollection) list2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    public final List a() {
        return this.f13809a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    public final List b() {
        return this.f13810b;
    }
}
