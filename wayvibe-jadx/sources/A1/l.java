package A1;

import A9.G;
import B2.AbstractC0112b;
import F2.C;
import F2.C0410c;
import F2.C0411d;
import F2.F;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.IntConsumer;
import p160o7.C2185n;
import p160o7.W;
import p161o8.s;
import p255y2.C2329e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f139c;

    public /* synthetic */ l(Object obj, int i10, int i11) {
        this.f137a = i11;
        this.f139c = obj;
        this.f138b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f137a) {
            case 0:
                ((b) this.f139c).h(this.f138b);
                break;
            case 1:
                C0411d c0411d = ((C0410c) this.f139c).f4059b;
                c0411d.getClass();
                int i10 = this.f138b;
                if (i10 == -3 || i10 == -2) {
                    if (i10 != -2) {
                        C2329e c2329e = c0411d.f4074d;
                        if (!(c2329e != null && c2329e.f28870a == 1)) {
                            c0411d.c(4);
                        }
                    }
                    C c3 = c0411d.f4073c;
                    if (c3 != null) {
                        F f10 = c3.f3862a;
                        f10.N(0, 1, f10.z());
                    }
                    c0411d.c(3);
                } else if (i10 == -1) {
                    C c9 = c0411d.f4073c;
                    if (c9 != null) {
                        F f11 = c9.f3862a;
                        f11.N(-1, 2, f11.z());
                    }
                    c0411d.a();
                    c0411d.c(1);
                } else if (i10 == 1) {
                    c0411d.c(2);
                    C c10 = c0411d.f4073c;
                    if (c10 != null) {
                        F f12 = c10.f3862a;
                        f12.N(1, 1, f12.z());
                    }
                } else {
                    AbstractC0112b.r(i10, "Unknown focus change type: ", "AudioFocusManager");
                }
                break;
            case 2:
                ((IntConsumer) this.f139c).accept(this.f138b);
                break;
            case 3:
                int i11 = this.f138b & 4;
                G g3 = ((io.flutter.plugin.platform.d) this.f139c).f20714b;
                if (i11 != 0) {
                    W4.m mVar = (W4.m) g3.f438d;
                    mVar.getClass();
                    ((s) mVar.f12825b).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                } else {
                    W4.m mVar2 = (W4.m) g3.f438d;
                    mVar2.getClass();
                    ((s) mVar2.f12825b).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                }
                break;
            default:
                C2185n c2185n = (C2185n) this.f139c;
                SparseArray sparseArray = c2185n.k;
                int i12 = this.f138b;
                W w10 = (W) sparseArray.get(i12);
                p242x0.c.z("Tried to release nonexistent target: %s", w10 != null, Integer.valueOf(i12));
                Iterator it = c2185n.f23779h.Z(i12).iterator();
                while (true) {
                    p044d7.d dVar = (p044d7.d) it;
                    boolean zHasNext = ((Iterator) dVar.f19302b).hasNext();
                    S9.b bVar = c2185n.f23772a;
                    if (!zHasNext) {
                        bVar.I().M(w10);
                        sparseArray.remove(i12);
                        c2185n.f23782l.remove(w10.f23734a);
                    } else {
                        bVar.I().I((p170p7.h) dVar.next());
                    }
                    break;
                }
                break;
        }
    }
}
