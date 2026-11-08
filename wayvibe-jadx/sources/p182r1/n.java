package p182r1;

import B2.AbstractC0112b;
import V0.p;
import com.amazon.a.a.o.b.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.tika.utils.StringUtils;
import p098j.u;
import p100j1.c;
import p174q1.g;
import p174q1.h;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f25737f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f25738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f25741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25742e;

    public final void a(ArrayList arrayList) {
        int size = this.f25738a.size();
        if (this.f25742e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                n nVar = (n) arrayList.get(i10);
                if (this.f25742e == nVar.f25739b) {
                    c(this.f25740c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(c cVar, int i10) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f25738a;
        if (arrayList.size() == 0) {
            return 0;
        }
        h hVar = ((g) arrayList.get(0)).f25534R;
        cVar.t();
        hVar.c(cVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((g) arrayList.get(i11)).c(cVar, false);
        }
        if (i10 == 0 && hVar.f25589t0 > 0) {
            p174q1.n.a(hVar, cVar, arrayList, 0);
        }
        if (i10 == 1 && hVar.f25590u0 > 0) {
            p174q1.n.a(hVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e2) {
            System.err.println(e2.toString() + "\n" + Arrays.toString(e2.getStackTrace()).replace("[", "   at ").replace(f.f16451a, "\n   at").replace("]", ""));
        }
        this.f25741d = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            g gVar = (g) arrayList.get(i12);
            u uVar = new u();
            new WeakReference(gVar);
            c.n(gVar.f25522F);
            c.n(gVar.f25523G);
            c.n(gVar.f25524H);
            c.n(gVar.f25525I);
            c.n(gVar.f25526J);
            this.f25741d.add(uVar);
        }
        if (i10 == 0) {
            iN = c.n(hVar.f25522F);
            iN2 = c.n(hVar.f25524H);
            cVar.t();
        } else {
            iN = c.n(hVar.f25523G);
            iN2 = c.n(hVar.f25525I);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i10, n nVar) {
        for (g gVar : this.f25738a) {
            ArrayList arrayList = nVar.f25738a;
            if (!arrayList.contains(gVar)) {
                arrayList.add(gVar);
            }
            int i11 = nVar.f25739b;
            if (i10 == 0) {
                gVar.f25565l0 = i11;
            } else {
                gVar.f25567m0 = i11;
            }
        }
        this.f25742e = nVar.f25739b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i10 = this.f25740c;
        if (i10 == 0) {
            str = "Horizontal";
        } else if (i10 == 1) {
            str = "Vertical";
        } else {
            str = i10 == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strI = AbstractC0112b.i(sb, this.f25739b, "] <");
        for (g gVar : this.f25738a) {
            StringBuilder sbT = p.t(strI, StringUtils.SPACE);
            sbT.append(gVar.f25554f0);
            strI = sbT.toString();
        }
        return p.n(strI, " >");
    }
}
