package p182r1;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f25724d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25727g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f25721a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25722b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25723c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f25725e = e.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25728h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f25729i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25730j = false;
    public final ArrayList k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f25731l = new ArrayList();

    public f(q qVar) {
        this.f25724d = qVar;
    }

    @Override // p182r1.d
    public final void a(d dVar) {
        ArrayList<f> arrayList = this.f25731l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f25730j) {
                return;
            }
        }
        this.f25723c = true;
        q qVar = this.f25721a;
        if (qVar != null) {
            qVar.a(this);
        }
        if (this.f25722b) {
            this.f25724d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : arrayList) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f25730j) {
            g gVar = this.f25729i;
            if (gVar != null) {
                if (!gVar.f25730j) {
                    return;
                } else {
                    this.f25726f = this.f25728h * gVar.f25727g;
                }
            }
            d(fVar.f25727g + this.f25726f);
        }
        q qVar2 = this.f25721a;
        if (qVar2 != null) {
            qVar2.a(this);
        }
    }

    public final void b(q qVar) {
        this.k.add(qVar);
        if (this.f25730j) {
            qVar.a(qVar);
        }
    }

    public final void c() {
        this.f25731l.clear();
        this.k.clear();
        this.f25730j = false;
        this.f25727g = 0;
        this.f25723c = false;
        this.f25722b = false;
    }

    public void d(int i10) {
        if (this.f25730j) {
            return;
        }
        this.f25730j = true;
        this.f25727g = i10;
        for (d dVar : this.k) {
            dVar.a(dVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f25724d.f25745b.f25554f0);
        sb.append(":");
        sb.append(this.f25725e);
        sb.append("(");
        sb.append(this.f25730j ? Integer.valueOf(this.f25727g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f25731l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
