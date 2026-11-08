package p154o1;

import java.util.HashMap;
import p089i1.q;
import p144n1.g;
import p144n1.i;
import p144n1.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends g {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public float f23579n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final HashMap f23580o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final HashMap f23581p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final HashMap f23582q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public HashMap f23583r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public HashMap f23584s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public i f23585t0;

    public d(q qVar, l lVar) {
        super(qVar, lVar);
        this.f23579n0 = 0.5f;
        this.f23580o0 = new HashMap();
        this.f23581p0 = new HashMap();
        this.f23582q0 = new HashMap();
        this.f23585t0 = i.SPREAD;
    }

    public final float t(String str) {
        HashMap map = this.f23584s0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.f23584s0.get(str)).floatValue();
    }

    public final float u(String str) {
        HashMap map = this.f23582q0;
        if (map.containsKey(str)) {
            return ((Float) map.get(str)).floatValue();
        }
        return 0.0f;
    }

    public final float v(String str) {
        HashMap map = this.f23583r0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.f23583r0.get(str)).floatValue();
    }

    public final float w(String str) {
        HashMap map = this.f23581p0;
        if (map.containsKey(str)) {
            return ((Float) map.get(str)).floatValue();
        }
        return 0.0f;
    }
}
