package p134m1;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h extends c implements Iterable {
    @Override // p134m1.c
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h a() {
        return (h) super.a();
    }

    @Override // p134m1.c, p134m1.d
    public final Object clone() {
        return (h) super.a();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        g gVar = new g();
        gVar.f22204b = 0;
        gVar.f22203a = this;
        return gVar;
    }
}
