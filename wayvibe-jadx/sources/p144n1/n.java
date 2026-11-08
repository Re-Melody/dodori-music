package p144n1;

import com.apple.android.music.playback.model.MediaPlayerException;
import java.util.HashMap;
import p111k1.a;
import p174q1.g;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f22889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f22894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f22895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f22896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f22897i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f22898j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f22899l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f22900m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f22901n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f22902o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f22903p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22904q;
    public final HashMap r;

    public n(g gVar) {
        this.f22889a = null;
        this.f22890b = 0;
        this.f22891c = 0;
        this.f22892d = 0;
        this.f22893e = 0;
        this.f22894f = Float.NaN;
        this.f22895g = Float.NaN;
        this.f22896h = Float.NaN;
        this.f22897i = Float.NaN;
        this.f22898j = Float.NaN;
        this.k = Float.NaN;
        this.f22899l = Float.NaN;
        this.f22900m = Float.NaN;
        this.f22901n = Float.NaN;
        this.f22902o = Float.NaN;
        this.f22903p = Float.NaN;
        this.f22904q = 0;
        this.r = new HashMap();
        this.f22889a = gVar;
    }

    public static void a(float f10, String str, StringBuilder sb) {
        if (Float.isNaN(f10)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f10);
        sb.append(",\n");
    }

    public static void b(StringBuilder sb, int i10, String str) {
        sb.append(str);
        sb.append(": ");
        sb.append(i10);
        sb.append(",\n");
    }

    public final void c(n nVar) {
        if (nVar == null) {
            return;
        }
        this.f22894f = nVar.f22894f;
        this.f22895g = nVar.f22895g;
        this.f22896h = nVar.f22896h;
        this.f22897i = nVar.f22897i;
        this.f22898j = nVar.f22898j;
        this.k = nVar.k;
        this.f22899l = nVar.f22899l;
        this.f22900m = nVar.f22900m;
        this.f22901n = nVar.f22901n;
        this.f22902o = nVar.f22902o;
        this.f22903p = nVar.f22903p;
        this.f22904q = nVar.f22904q;
        HashMap map = this.r;
        map.clear();
        for (a aVar : nVar.r.values()) {
            String str = aVar.f21563a;
            a aVar2 = new a();
            aVar2.f21565c = MediaPlayerException.ERROR_UNKNOWN;
            aVar2.f21566d = Float.NaN;
            aVar2.f21563a = str;
            aVar2.f21564b = aVar.f21564b;
            aVar2.f21565c = aVar.f21565c;
            aVar2.f21566d = aVar.f21566d;
            map.put(str, aVar2);
        }
    }

    public n(n nVar) {
        this.f22889a = null;
        this.f22890b = 0;
        this.f22891c = 0;
        this.f22892d = 0;
        this.f22893e = 0;
        this.f22894f = Float.NaN;
        this.f22895g = Float.NaN;
        this.f22896h = Float.NaN;
        this.f22897i = Float.NaN;
        this.f22898j = Float.NaN;
        this.k = Float.NaN;
        this.f22899l = Float.NaN;
        this.f22900m = Float.NaN;
        this.f22901n = Float.NaN;
        this.f22902o = Float.NaN;
        this.f22903p = Float.NaN;
        this.f22904q = 0;
        this.r = new HashMap();
        this.f22889a = nVar.f22889a;
        this.f22890b = nVar.f22890b;
        this.f22891c = nVar.f22891c;
        this.f22892d = nVar.f22892d;
        this.f22893e = nVar.f22893e;
        c(nVar);
    }
}
