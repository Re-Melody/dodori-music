package p172q;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f25363e = new HashMap();

    @Override // p172q.f
    public final c a(Object obj) {
        return (c) this.f25363e.get(obj);
    }

    @Override // p172q.f
    public final Object c(Object obj) {
        Object objC = super.c(obj);
        this.f25363e.remove(obj);
        return objC;
    }
}
