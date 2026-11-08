package R2;

import B2.AbstractC0111a;
import java.util.List;

/* JADX INFO: renamed from: R2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0784l implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A6.W f10839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10840b;

    public C0784l(List list, List list2) {
        A6.B bQ = A6.E.q();
        AbstractC0111a.d(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            bQ.a(new C0783k((X) list.get(i10), (List) list2.get(i10)));
        }
        this.f10839a = bQ.f();
        this.f10840b = -9223372036854775807L;
    }

    @Override // R2.X
    public final long d() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            A6.W w10 = this.f10839a;
            if (i10 >= w10.f331d) {
                break;
            }
            long jD = ((C0783k) w10.get(i10)).f10837a.d();
            if (jD != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jD);
            }
            i10++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // R2.X
    public final boolean l() {
        int i10 = 0;
        while (true) {
            A6.W w10 = this.f10839a;
            if (i10 >= w10.f331d) {
                return false;
            }
            if (((C0783k) w10.get(i10)).f10837a.l()) {
                return true;
            }
            i10++;
        }
    }

    @Override // R2.X
    public final boolean m(F2.O o10) {
        boolean zM;
        boolean z10 = false;
        do {
            long jD = d();
            if (jD == Long.MIN_VALUE) {
                return z10;
            }
            int i10 = 0;
            zM = false;
            while (true) {
                A6.W w10 = this.f10839a;
                if (i10 >= w10.f331d) {
                    break;
                }
                long jD2 = ((C0783k) w10.get(i10)).f10837a.d();
                boolean z11 = jD2 != Long.MIN_VALUE && jD2 <= o10.f3983a;
                if (jD2 == jD || z11) {
                    zM |= ((C0783k) w10.get(i10)).f10837a.m(o10);
                }
                i10++;
            }
            z10 |= zM;
        } while (zM);
        return z10;
    }

    @Override // R2.X
    public final long t() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            A6.W w10 = this.f10839a;
            if (i10 >= w10.f331d) {
                break;
            }
            C0783k c0783k = (C0783k) w10.get(i10);
            long jT = c0783k.f10837a.t();
            A6.E e2 = c0783k.f10838b;
            if ((e2.contains(1) || e2.contains(2) || e2.contains(4)) && jT != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jT);
            }
            if (jT != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jT);
            }
            i10++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f10840b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f10840b;
        return j10 != -9223372036854775807L ? j10 : jMin2;
    }

    @Override // R2.X
    public final void v(long j10) {
        int i10 = 0;
        while (true) {
            A6.W w10 = this.f10839a;
            if (i10 >= w10.f331d) {
                return;
            }
            ((C0783k) w10.get(i10)).v(j10);
            i10++;
        }
    }
}
