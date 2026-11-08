package p134m1;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f22203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22204b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22204b < this.f22203a.f22197e.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        e eVar = (e) this.f22203a.f22197e.get(this.f22204b);
        this.f22204b++;
        return eVar;
    }
}
