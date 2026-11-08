package p201t1;

import p192s1.d;
import p192s1.e;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f26569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f26570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f26571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f26572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f26575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f26577i;

    public f(i iVar, e eVar) {
        o oVar = new o();
        oVar.f26677h = 0;
        oVar.f26679j = null;
        oVar.k = 1;
        oVar.f26680l = null;
        oVar.f26672c = this;
        this.f26569a = oVar;
        this.f26573e = 0;
        this.f26574f = -1;
        this.f26575g = d.NONE;
        this.f26576h = 0;
        this.f26570b = iVar;
        this.f26571c = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    public final boolean a(f fVar, int i10, int i11, d dVar, int i12, boolean z10) {
        boolean z11;
        if (fVar == null) {
            this.f26572d = null;
            this.f26573e = 0;
            this.f26574f = -1;
            this.f26575g = d.NONE;
            this.f26576h = 2;
            return true;
        }
        if (!z10) {
            e eVar = this.f26571c;
            i iVar = fVar.f26570b;
            e eVar2 = fVar.f26571c;
            if (eVar2 != eVar) {
                switch (c.f26568a[eVar.ordinal()]) {
                    case 1:
                        if (eVar2 == e.BASELINE || eVar2 == e.CENTER_X || eVar2 == e.CENTER_Y) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        break;
                    case 2:
                    case 3:
                        z11 = eVar2 == e.LEFT || eVar2 == e.RIGHT;
                        if (iVar instanceof m) {
                            if (z11 || eVar2 == e.CENTER_X) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                        break;
                    case 4:
                    case 5:
                        z11 = eVar2 == e.TOP || eVar2 == e.BOTTOM;
                        if (iVar instanceof m) {
                            if (z11 || eVar2 == e.CENTER_Y) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        z11 = false;
                        break;
                    default:
                        throw new AssertionError(eVar.name());
                }
            } else if (eVar != e.BASELINE || (iVar.f26596Q > 0 && this.f26570b.f26596Q > 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return false;
            }
        }
        this.f26572d = fVar;
        if (i10 > 0) {
            this.f26573e = i10;
        } else {
            this.f26573e = 0;
        }
        this.f26574f = i11;
        this.f26575g = dVar;
        this.f26576h = i12;
        return true;
    }

    public final int b() {
        f fVar;
        if (this.f26570b.f26604Y == 8) {
            return 0;
        }
        int i10 = this.f26574f;
        return (i10 <= -1 || (fVar = this.f26572d) == null || fVar.f26570b.f26604Y != 8) ? this.f26573e : i10;
    }

    public final boolean c() {
        return this.f26572d != null;
    }

    public final void d() {
        this.f26572d = null;
        this.f26573e = 0;
        this.f26574f = -1;
        this.f26575g = d.STRONG;
        this.f26576h = 0;
        this.f26569a.j();
    }

    public final void e() {
        e eVar = this.f26577i;
        if (eVar == null) {
            this.f26577i = new e(d.UNRESTRICTED);
        } else {
            eVar.c();
        }
    }

    public final String toString() {
        return this.f26570b.f26605Z + ":" + this.f26571c.toString();
    }
}
