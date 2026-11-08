package p144n1;

import p174q1.g;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f22874h = new String("FIXED_DIMENSION");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f22875i = new String("WRAP_DIMENSION");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f22876j = new String("SPREAD_DIMENSION");
    public static final String k = new String("PARENT_DIMENSION");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f22877l = new String("PERCENT_DIMENSION");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f22878m = new String("RATIO_DIMENSION");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f22884f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22879a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22880b = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f22881c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22882d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f22883e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22885g = false;

    public f(String str) {
        this.f22884f = str;
    }

    public static f b(int i10) {
        f fVar = new f(f22874h);
        fVar.f22884f = null;
        fVar.f22882d = i10;
        return fVar;
    }

    public static f c(String str) {
        f fVar = new f();
        fVar.f22879a = 0;
        fVar.f22880b = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        fVar.f22881c = 1.0f;
        fVar.f22882d = 0;
        fVar.f22883e = null;
        fVar.f22884f = str;
        fVar.f22885g = true;
        return fVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x008c -> B:40:0x008d). Please report as a decompilation issue!!! */
    public final void a(g gVar, int i10) {
        int i11;
        float fAbs;
        String str = this.f22883e;
        int i12 = 1;
        if (str != null) {
            gVar.getClass();
            if (str.length() == 0) {
                gVar.f25537U = 0.0f;
            } else {
                int length = str.length();
                int iIndexOf = str.indexOf(44);
                int i13 = -1;
                if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                    i11 = 0;
                } else {
                    String strSubstring = str.substring(0, iIndexOf);
                    if (strSubstring.equalsIgnoreCase("W")) {
                        i13 = 0;
                    } else if (strSubstring.equalsIgnoreCase("H")) {
                        i13 = 1;
                    }
                    i11 = iIndexOf + 1;
                }
                int iIndexOf2 = str.indexOf(58);
                try {
                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                        String strSubstring2 = str.substring(i11);
                        if (strSubstring2.length() > 0) {
                            fAbs = Float.parseFloat(strSubstring2);
                        } else {
                            fAbs = 0.0f;
                        }
                    } else {
                        String strSubstring3 = str.substring(i11, iIndexOf2);
                        String strSubstring4 = str.substring(iIndexOf2 + 1);
                        if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                            fAbs = 0.0f;
                        } else {
                            float f10 = Float.parseFloat(strSubstring3);
                            float f11 = Float.parseFloat(strSubstring4);
                            if (f10 <= 0.0f || f11 <= 0.0f) {
                                fAbs = 0.0f;
                            } else {
                                fAbs = i13 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                if (fAbs > 0.0f) {
                    gVar.f25537U = fAbs;
                    gVar.f25538V = i13;
                }
            }
        }
        String str2 = k;
        String str3 = f22877l;
        String str4 = f22875i;
        if (i10 == 0) {
            if (this.f22885g) {
                gVar.I(p174q1.f.MATCH_CONSTRAINT);
                String str5 = this.f22884f;
                if (str5 != str4) {
                    i12 = str5 == str3 ? 2 : 0;
                }
                int i14 = this.f22879a;
                int i15 = this.f22880b;
                float f12 = this.f22881c;
                gVar.r = i12;
                gVar.f25574u = i14;
                gVar.f25575v = i15 != Integer.MAX_VALUE ? i15 : 0;
                gVar.f25576w = f12;
                if (f12 <= 0.0f || f12 >= 1.0f || i12 != 0) {
                    return;
                }
                gVar.r = 2;
                return;
            }
            int i16 = this.f22879a;
            if (i16 > 0) {
                if (i16 < 0) {
                    gVar.f25542Z = 0;
                } else {
                    gVar.f25542Z = i16;
                }
            }
            int i17 = this.f22880b;
            if (i17 < Integer.MAX_VALUE) {
                gVar.f25519C[0] = i17;
            }
            String str6 = this.f22884f;
            if (str6 == str4) {
                gVar.I(p174q1.f.WRAP_CONTENT);
                return;
            }
            if (str6 == str2) {
                gVar.I(p174q1.f.MATCH_PARENT);
                return;
            } else {
                if (str6 == null) {
                    gVar.I(p174q1.f.FIXED);
                    gVar.K(this.f22882d);
                    return;
                }
                return;
            }
        }
        if (this.f22885g) {
            gVar.J(p174q1.f.MATCH_CONSTRAINT);
            String str7 = this.f22884f;
            if (str7 != str4) {
                i12 = str7 == str3 ? 2 : 0;
            }
            int i18 = this.f22879a;
            int i19 = this.f22880b;
            float f13 = this.f22881c;
            gVar.f25572s = i12;
            gVar.f25577x = i18;
            gVar.f25578y = i19 != Integer.MAX_VALUE ? i19 : 0;
            gVar.f25579z = f13;
            if (f13 <= 0.0f || f13 >= 1.0f || i12 != 0) {
                return;
            }
            gVar.f25572s = 2;
            return;
        }
        int i20 = this.f22879a;
        if (i20 > 0) {
            if (i20 < 0) {
                gVar.f25544a0 = 0;
            } else {
                gVar.f25544a0 = i20;
            }
        }
        int i21 = this.f22880b;
        if (i21 < Integer.MAX_VALUE) {
            gVar.f25519C[1] = i21;
        }
        String str8 = this.f22884f;
        if (str8 == str4) {
            gVar.J(p174q1.f.WRAP_CONTENT);
            return;
        }
        if (str8 == str2) {
            gVar.J(p174q1.f.MATCH_PARENT);
        } else if (str8 == null) {
            gVar.J(p174q1.f.FIXED);
            gVar.H(this.f22882d);
        }
    }
}
