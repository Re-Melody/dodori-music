package J8;

import B8.C0129p;
import B8.EnumC0119f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f6691a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f6694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6695e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile M.s f6692b = new M.s(18);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public M.s f6693c = new M.s(18);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f6696f = new HashSet();

    public k(n nVar) {
        this.f6691a = nVar;
    }

    public final void a(r rVar) {
        if (d() && !rVar.f6718c) {
            rVar.r();
        } else if (!d() && rVar.f6718c) {
            rVar.f6718c = false;
            C0129p c0129p = rVar.f6719d;
            if (c0129p != null) {
                rVar.f6720e.a(c0129p);
                rVar.f6721f.n(EnumC0119f.INFO, "Subchannel unejected: {0}", rVar);
            }
        }
        rVar.f6717b = this;
        this.f6696f.add(rVar);
    }

    public final void b(long j10) {
        this.f6694d = Long.valueOf(j10);
        this.f6695e++;
        Iterator it = this.f6696f.iterator();
        while (it.hasNext()) {
            ((r) it.next()).r();
        }
    }

    public final long c() {
        return ((AtomicLong) this.f6693c.f7971c).get() + ((AtomicLong) this.f6693c.f7970b).get();
    }

    public final boolean d() {
        return this.f6694d != null;
    }

    public final void e() {
        p229v9.a.o("not currently ejected", this.f6694d != null);
        this.f6694d = null;
        for (r rVar : this.f6696f) {
            rVar.f6718c = false;
            C0129p c0129p = rVar.f6719d;
            if (c0129p != null) {
                rVar.f6720e.a(c0129p);
                rVar.f6721f.n(EnumC0119f.INFO, "Subchannel unejected: {0}", rVar);
            }
        }
    }

    public final String toString() {
        return "AddressTracker{subchannels=" + this.f6696f + '}';
    }
}
