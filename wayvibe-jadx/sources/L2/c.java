package L2;

import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;
import p255y2.C;
import p255y2.C2338n;
import p255y2.C2339o;

/* JADX INFO: loaded from: classes.dex */
public final class c implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f7497d = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p090i2.c f7498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7499c;

    public static void a(int i10, ArrayList arrayList) {
        if (R3.a.P(f7497d, i10, 0, 7) == -1 || arrayList.contains(Integer.valueOf(i10))) {
            return;
        }
        arrayList.add(Integer.valueOf(i10));
    }

    public final C2339o b(C2339o c2339o) {
        if (!this.f7499c) {
            return c2339o;
        }
        p090i2.c cVar = this.f7498b;
        if (!cVar.c(c2339o)) {
            return c2339o;
        }
        C2338n c2338nA = c2339o.a();
        c2338nA.f28918l = C.l("application/x-media3-cues");
        c2338nA.f28904F = cVar.n(c2339o);
        StringBuilder sb = new StringBuilder();
        sb.append(c2339o.f28954m);
        String str = c2339o.f28952j;
        sb.append(str != null ? StringUtils.SPACE.concat(str) : "");
        c2338nA.f28916i = sb.toString();
        c2338nA.f28923q = Long.MAX_VALUE;
        return new C2339o(c2338nA);
    }
}
