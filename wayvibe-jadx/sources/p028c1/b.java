package p028c1;

import S5.d;
import com.google.android.gms.common.api.f;
import p038d1.a;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    default float B(float f10) {
        return f10 / a();
    }

    float K();

    default float O(float f10) {
        return a() * f10;
    }

    default int Y(float f10) {
        float fO = O(f10);
        return Float.isInfinite(fO) ? f.API_PRIORITY_OTHER : Math.round(fO);
    }

    float a();

    default long g0(long j10) {
        if (j10 != 9205357640488583168L) {
            return d.i(O(g.b(j10)), O(g.a(j10)));
        }
        return 9205357640488583168L;
    }

    default long i(float f10) {
        float[] fArr = p038d1.b.f19047a;
        if (!(K() >= 1.03f)) {
            return p046da.b.S(f10 / K(), 4294967296L);
        }
        a aVarA = p038d1.b.a(K());
        return p046da.b.S(aVarA != null ? aVarA.a(f10) : f10 / K(), 4294967296L);
    }

    default float i0(long j10) {
        if (n.a(m.b(j10), 4294967296L)) {
            return O(p(j10));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    default long j(long j10) {
        if (j10 != 9205357640488583168L) {
            return R3.a.a(B(p133m0.f.d(j10)), B(p133m0.f.b(j10)));
        }
        return 9205357640488583168L;
    }

    default float p(long j10) {
        float fC;
        float fK;
        if (!n.a(m.b(j10), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        float[] fArr = p038d1.b.f19047a;
        if (K() >= 1.03f) {
            a aVarA = p038d1.b.a(K());
            fC = m.c(j10);
            if (aVarA != null) {
                return aVarA.b(fC);
            }
            fK = K();
        } else {
            fC = m.c(j10);
            fK = K();
        }
        return fK * fC;
    }

    default long y(float f10) {
        return i(B(f10));
    }

    default float z(int i10) {
        return i10 / a();
    }
}
