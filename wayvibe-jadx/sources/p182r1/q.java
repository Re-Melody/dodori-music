package p182r1;

import U.C0899m0;
import p174q1.d;
import p174q1.f;
import p174q1.g;
import p174q1.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class q implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f25745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0899m0 f25746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f25747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f25748e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25749f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25750g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f25751h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f25752i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p f25753j = p.NONE;

    public q(g gVar) {
        this.f25745b = gVar;
    }

    public static void b(f fVar, f fVar2, int i10) {
        fVar.f25731l.add(fVar2);
        fVar.f25726f = i10;
        fVar2.k.add(fVar);
    }

    public static f g(d dVar) {
        d dVar2 = dVar.f25512f;
        if (dVar2 == null) {
            return null;
        }
        g gVar = dVar2.f25510d;
        int i10 = o.f25743a[dVar2.f25511e.ordinal()];
        if (i10 == 1) {
            return gVar.f25549d.f25751h;
        }
        if (i10 == 2) {
            return gVar.f25549d.f25752i;
        }
        if (i10 == 3) {
            return gVar.f25551e.f25751h;
        }
        if (i10 == 4) {
            return gVar.f25551e.k;
        }
        if (i10 != 5) {
            return null;
        }
        return gVar.f25551e.f25752i;
    }

    public static f h(d dVar, int i10) {
        d dVar2 = dVar.f25512f;
        if (dVar2 == null) {
            return null;
        }
        g gVar = dVar2.f25510d;
        q qVar = i10 == 0 ? gVar.f25549d : gVar.f25551e;
        int i11 = o.f25743a[dVar2.f25511e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return qVar.f25752i;
        }
        return qVar.f25751h;
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f25731l.add(fVar2);
        fVar.f25731l.add(this.f25748e);
        fVar.f25728h = i10;
        fVar.f25729i = gVar;
        fVar2.k.add(fVar);
        gVar.k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public final int f(int i10, int i11) {
        if (i11 == 0) {
            g gVar = this.f25745b;
            int i12 = gVar.f25575v;
            int iMax = Math.max(gVar.f25574u, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            g gVar2 = this.f25745b;
            int i13 = gVar2.f25578y;
            int iMax2 = Math.max(gVar2.f25577x, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    public final void i(d dVar, d dVar2, int i10) {
        g gVar;
        float f10;
        int i11;
        f fVarG = g(dVar);
        f fVarG2 = g(dVar2);
        if (fVarG.f25730j && fVarG2.f25730j) {
            int iE = dVar.e() + fVarG.f25727g;
            int iE2 = fVarG2.f25727g - dVar2.e();
            int i12 = iE2 - iE;
            g gVar2 = this.f25748e;
            if (!gVar2.f25730j) {
                f fVar = this.f25747d;
                f fVar2 = f.MATCH_CONSTRAINT;
                if (fVar == fVar2) {
                    int i13 = this.f25744a;
                    if (i13 == 0) {
                        gVar2.d(f(i12, i10));
                    } else if (i13 == 1) {
                        gVar2.d(Math.min(f(gVar2.f25732m, i10), i12));
                    } else if (i13 == 2) {
                        g gVar3 = this.f25745b;
                        h hVar = gVar3.f25534R;
                        if (hVar != null) {
                            g gVar4 = (i10 == 0 ? hVar.f25549d : hVar.f25551e).f25748e;
                            if (gVar4.f25730j) {
                                gVar2.d(f((int) ((gVar4.f25727g * (i10 == 0 ? gVar3.f25576w : gVar3.f25579z)) + 0.5f), i10));
                            }
                        }
                    } else if (i13 == 3) {
                        g gVar5 = this.f25745b;
                        q qVar = gVar5.f25549d;
                        if (qVar.f25747d == fVar2 && qVar.f25744a == 3) {
                            m mVar = gVar5.f25551e;
                            if (mVar.f25747d != fVar2 || mVar.f25744a != 3) {
                                if (i10 == 0) {
                                    qVar = gVar5.f25551e;
                                }
                                gVar = qVar.f25748e;
                                if (gVar.f25730j) {
                                    f10 = gVar5.f25537U;
                                    if (i10 == 1) {
                                        i11 = (int) ((gVar.f25727g / f10) + 0.5f);
                                    } else {
                                        i11 = (int) ((f10 * gVar.f25727g) + 0.5f);
                                    }
                                    gVar2.d(i11);
                                }
                            }
                        } else {
                            if (i10 == 0) {
                                qVar = gVar5.f25551e;
                            }
                            gVar = qVar.f25748e;
                            if (gVar.f25730j) {
                                f10 = gVar5.f25537U;
                                if (i10 == 1) {
                                    i11 = (int) ((gVar.f25727g / f10) + 0.5f);
                                } else {
                                    i11 = (int) ((f10 * gVar.f25727g) + 0.5f);
                                }
                                gVar2.d(i11);
                            }
                        }
                    }
                }
            }
            if (gVar2.f25730j) {
                int i14 = gVar2.f25727g;
                f fVar3 = this.f25752i;
                f fVar4 = this.f25751h;
                if (i14 == i12) {
                    fVar4.d(iE);
                    fVar3.d(iE2);
                    return;
                }
                float f11 = i10 == 0 ? this.f25745b.f25546b0 : this.f25745b.f25548c0;
                if (fVarG == fVarG2) {
                    iE = fVarG.f25727g;
                    iE2 = fVarG2.f25727g;
                    f11 = 0.5f;
                }
                fVar4.d((int) ((((iE2 - iE) - i14) * f11) + iE + 0.5f));
                fVar3.d(fVar4.f25727g + gVar2.f25727g);
            }
        }
    }
}
