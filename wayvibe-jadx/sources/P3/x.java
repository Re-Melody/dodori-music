package P3;

import Ca.C0168a;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class x extends s {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9621x;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f9619v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9620w = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9622y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9623z = 0;

    @Override // P3.s
    public final void A() {
        if (this.f9619v.isEmpty()) {
            G();
            m();
            return;
        }
        h hVar = new h();
        hVar.f9572b = this;
        Iterator it = this.f9619v.iterator();
        while (it.hasNext()) {
            ((s) it.next()).a(hVar);
        }
        this.f9621x = this.f9619v.size();
        if (this.f9620w) {
            Iterator it2 = this.f9619v.iterator();
            while (it2.hasNext()) {
                ((s) it2.next()).A();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f9619v.size(); i10++) {
            ((s) this.f9619v.get(i10 - 1)).a(new h((s) this.f9619v.get(i10), 1));
        }
        s sVar = (s) this.f9619v.get(0);
        if (sVar != null) {
            sVar.A();
        }
    }

    @Override // P3.s
    public final void B(p242x0.c cVar) {
        this.f9611q = cVar;
        this.f9623z |= 8;
        int size = this.f9619v.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s) this.f9619v.get(i10)).B(cVar);
        }
    }

    @Override // P3.s
    public final void C() {
        this.f9623z |= 1;
        ArrayList arrayList = this.f9619v;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((s) this.f9619v.get(i10)).C();
            }
        }
    }

    @Override // P3.s
    public final void D(p217u7.d dVar) {
        super.D(dVar);
        this.f9623z |= 4;
        if (this.f9619v != null) {
            for (int i10 = 0; i10 < this.f9619v.size(); i10++) {
                ((s) this.f9619v.get(i10)).D(dVar);
            }
        }
    }

    @Override // P3.s
    public final void E() {
        this.f9623z |= 2;
        int size = this.f9619v.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s) this.f9619v.get(i10)).E();
        }
    }

    @Override // P3.s
    public final void F(long j10) {
        this.f9597b = j10;
    }

    @Override // P3.s
    public final String H(String str) {
        String strH = super.H(str);
        for (int i10 = 0; i10 < this.f9619v.size(); i10++) {
            StringBuilder sbT = V0.p.t(strH, "\n");
            sbT.append(((s) this.f9619v.get(i10)).H(str + "  "));
            strH = sbT.toString();
        }
        return strH;
    }

    public final void I(s sVar) {
        this.f9619v.add(sVar);
        sVar.f9602g = this;
        if ((this.f9623z & 1) != 0) {
            sVar.C();
        }
        if ((this.f9623z & 2) != 0) {
            sVar.E();
        }
        if ((this.f9623z & 4) != 0) {
            sVar.D(this.r);
        }
        if ((this.f9623z & 8) != 0) {
            sVar.B(this.f9611q);
        }
    }

    @Override // P3.s
    public final void b(View view) {
        for (int i10 = 0; i10 < this.f9619v.size(); i10++) {
            ((s) this.f9619v.get(i10)).b(view);
        }
        this.f9599d.add(view);
    }

    @Override // P3.s
    public final void cancel() {
        super.cancel();
        int size = this.f9619v.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s) this.f9619v.get(i10)).cancel();
        }
    }

    @Override // P3.s
    public final void d(z zVar) {
        if (t(zVar.f9628b)) {
            for (s sVar : this.f9619v) {
                if (sVar.t(zVar.f9628b)) {
                    sVar.d(zVar);
                    zVar.f9629c.add(sVar);
                }
            }
        }
    }

    @Override // P3.s
    public final void f(z zVar) {
        int size = this.f9619v.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s) this.f9619v.get(i10)).f(zVar);
        }
    }

    @Override // P3.s
    public final void g(z zVar) {
        if (t(zVar.f9628b)) {
            for (s sVar : this.f9619v) {
                if (sVar.t(zVar.f9628b)) {
                    sVar.g(zVar);
                    zVar.f9629c.add(sVar);
                }
            }
        }
    }

    @Override // P3.s
    /* JADX INFO: renamed from: j */
    public final s clone() {
        x xVar = (x) super.clone();
        xVar.f9619v = new ArrayList();
        int size = this.f9619v.size();
        for (int i10 = 0; i10 < size; i10++) {
            s sVarClone = ((s) this.f9619v.get(i10)).clone();
            xVar.f9619v.add(sVarClone);
            sVarClone.f9602g = xVar;
        }
        return xVar;
    }

    @Override // P3.s
    public final void l(ViewGroup viewGroup, C0168a c0168a, C0168a c0168a2, ArrayList arrayList, ArrayList arrayList2) {
        long j10 = this.f9597b;
        int size = this.f9619v.size();
        for (int i10 = 0; i10 < size; i10++) {
            s sVar = (s) this.f9619v.get(i10);
            if (j10 > 0 && (this.f9620w || i10 == 0)) {
                long j11 = sVar.f9597b;
                if (j11 > 0) {
                    sVar.F(j11 + j10);
                } else {
                    sVar.F(j10);
                }
            }
            sVar.l(viewGroup, c0168a, c0168a2, arrayList, arrayList2);
        }
    }

    @Override // P3.s
    public final void v(ViewGroup viewGroup) {
        super.v(viewGroup);
        int size = this.f9619v.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s) this.f9619v.get(i10)).v(viewGroup);
        }
    }

    @Override // P3.s
    public final void y(View view) {
        for (int i10 = 0; i10 < this.f9619v.size(); i10++) {
            ((s) this.f9619v.get(i10)).y(view);
        }
        this.f9599d.remove(view);
    }

    @Override // P3.s
    public final void z(View view) {
        super.z(view);
        int size = this.f9619v.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s) this.f9619v.get(i10)).z(view);
        }
    }
}
