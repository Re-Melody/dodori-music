package androidx.core.app;

import java.util.ArrayList;
import java.util.Iterator;
import p098j.AbstractActivityC1998k;

/* JADX INFO: loaded from: classes.dex */
public final class L implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14908a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractActivityC1998k f14909b;

    public L(AbstractActivityC1998k abstractActivityC1998k) {
        this.f14909b = abstractActivityC1998k;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f14908a.iterator();
    }
}
