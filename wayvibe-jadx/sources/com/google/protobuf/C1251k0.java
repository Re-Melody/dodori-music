package com.google.protobuf;

import D7.p1;

/* JADX INFO: renamed from: com.google.protobuf.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1251k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1249j0 f18750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18751b;

    public C1251k0(g1 g1Var, g1 g1Var2, Object obj) {
        this.f18750a = new C1249j0(g1Var, g1Var2, obj);
        this.f18751b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
    /* JADX WARN: Code duplicated, block: B:44:0x011b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0121  */
    /* JADX WARN: Code duplicated, block: B:48:0x0125  */
    /* JADX WARN: Code duplicated, block: B:49:0x0132  */
    /* JADX WARN: Code duplicated, block: B:50:0x013f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0150  */
    /* JADX WARN: Code duplicated, block: B:52:0x0162  */
    /* JADX WARN: Code duplicated, block: B:54:0x016b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0174  */
    /* JADX WARN: Code duplicated, block: B:57:0x0181  */
    /* JADX WARN: Code duplicated, block: B:59:0x0185  */
    /* JADX WARN: Code duplicated, block: B:60:0x018e  */
    /* JADX WARN: Code duplicated, block: B:62:0x019a  */
    /* JADX WARN: Code duplicated, block: B:64:0x019e  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01af  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x0200  */
    /* JADX WARN: Code duplicated, block: B:75:0x0208  */
    public static int a(C1249j0 c1249j0, Object obj, Object obj2) {
        int iE;
        int iC;
        int iD;
        int i10;
        int iC2;
        g1 g1Var;
        int iC3;
        int iD2;
        int iE2 = 1;
        int i11 = A.f18648c;
        int iC4 = AbstractC1267t.C(1);
        g1 g1Var2 = g1.GROUP;
        g1 g1Var3 = c1249j0.f18746a;
        if (g1Var3 == g1Var2) {
            iC4 *= 2;
        }
        int[] iArr = AbstractC1279z.f18823b;
        switch (iArr[g1Var3.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                iE = 8;
                i10 = iE + iC4;
                iC2 = AbstractC1267t.C(2);
                g1Var = c1249j0.f18747b;
                if (g1Var == g1Var2) {
                    iC2 *= 2;
                }
                switch (iArr[g1Var.ordinal()]) {
                    case 1:
                        ((Double) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 2:
                        ((Float) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 3:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 4:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 5:
                        iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 6:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 7:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 8:
                        ((Boolean) obj2).getClass();
                        return iE2 + iC2 + i10;
                    case 9:
                        iE2 = ((J) ((AbstractC1230a) obj2)).c(null);
                        return iE2 + iC2 + i10;
                    case 10:
                        iC3 = ((J) ((AbstractC1230a) obj2)).c(null);
                        iD2 = AbstractC1267t.D(iC3);
                        iE2 = iD2 + iC3;
                        return iE2 + iC2 + i10;
                    case 11:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iE2 = AbstractC1267t.B((String) obj2);
                        }
                        return iE2 + iC2 + i10;
                    case 12:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iC3 = ((byte[]) obj2).length;
                            iD2 = AbstractC1267t.D(iC3);
                            iE2 = iD2 + iC3;
                        }
                        return iE2 + iC2 + i10;
                    case 13:
                        iE2 = AbstractC1267t.D(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iE2 = AbstractC1267t.D((iIntValue >> 31) ^ (iIntValue << 1));
                        return iE2 + iC2 + i10;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iE2 = AbstractC1267t.E((jLongValue >> 63) ^ (jLongValue << 1));
                        return iE2 + iC2 + i10;
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        if (obj2 instanceof Q) {
                            iE2 = AbstractC1267t.A(((Q) obj2).f());
                        } else {
                            iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        }
                        return iE2 + iC2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 2:
                ((Float) obj).getClass();
                iE = 4;
                i10 = iE + iC4;
                iC2 = AbstractC1267t.C(2);
                g1Var = c1249j0.f18747b;
                if (g1Var == g1Var2) {
                    iC2 *= 2;
                }
                switch (iArr[g1Var.ordinal()]) {
                    case 1:
                        ((Double) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 2:
                        ((Float) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 3:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 4:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 5:
                        iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 6:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 7:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 8:
                        ((Boolean) obj2).getClass();
                        return iE2 + iC2 + i10;
                    case 9:
                        iE2 = ((J) ((AbstractC1230a) obj2)).c(null);
                        return iE2 + iC2 + i10;
                    case 10:
                        iC3 = ((J) ((AbstractC1230a) obj2)).c(null);
                        iD2 = AbstractC1267t.D(iC3);
                        iE2 = iD2 + iC3;
                        return iE2 + iC2 + i10;
                    case 11:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iE2 = AbstractC1267t.B((String) obj2);
                        }
                        return iE2 + iC2 + i10;
                    case 12:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iC3 = ((byte[]) obj2).length;
                            iD2 = AbstractC1267t.D(iC3);
                            iE2 = iD2 + iC3;
                        }
                        return iE2 + iC2 + i10;
                    case 13:
                        iE2 = AbstractC1267t.D(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iE2 = AbstractC1267t.D((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                        return iE2 + iC2 + i10;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iE2 = AbstractC1267t.E((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                        return iE2 + iC2 + i10;
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        if (obj2 instanceof Q) {
                            iE2 = AbstractC1267t.A(((Q) obj2).f());
                        } else {
                            iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        }
                        return iE2 + iC2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 3:
                iE = AbstractC1267t.E(((Long) obj).longValue());
                i10 = iE + iC4;
                iC2 = AbstractC1267t.C(2);
                g1Var = c1249j0.f18747b;
                if (g1Var == g1Var2) {
                    iC2 *= 2;
                }
                switch (iArr[g1Var.ordinal()]) {
                    case 1:
                        ((Double) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 2:
                        ((Float) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 3:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 4:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 5:
                        iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 6:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 7:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 8:
                        ((Boolean) obj2).getClass();
                        return iE2 + iC2 + i10;
                    case 9:
                        iE2 = ((J) ((AbstractC1230a) obj2)).c(null);
                        return iE2 + iC2 + i10;
                    case 10:
                        iC3 = ((J) ((AbstractC1230a) obj2)).c(null);
                        iD2 = AbstractC1267t.D(iC3);
                        iE2 = iD2 + iC3;
                        return iE2 + iC2 + i10;
                    case 11:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iE2 = AbstractC1267t.B((String) obj2);
                        }
                        return iE2 + iC2 + i10;
                    case 12:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iC3 = ((byte[]) obj2).length;
                            iD2 = AbstractC1267t.D(iC3);
                            iE2 = iD2 + iC3;
                        }
                        return iE2 + iC2 + i10;
                    case 13:
                        iE2 = AbstractC1267t.D(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iE2 = AbstractC1267t.D((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                        return iE2 + iC2 + i10;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iE2 = AbstractC1267t.E((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                        return iE2 + iC2 + i10;
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        if (obj2 instanceof Q) {
                            iE2 = AbstractC1267t.A(((Q) obj2).f());
                        } else {
                            iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        }
                        return iE2 + iC2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 4:
                iE = AbstractC1267t.E(((Long) obj).longValue());
                i10 = iE + iC4;
                iC2 = AbstractC1267t.C(2);
                g1Var = c1249j0.f18747b;
                if (g1Var == g1Var2) {
                    iC2 *= 2;
                }
                switch (iArr[g1Var.ordinal()]) {
                    case 1:
                        ((Double) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 2:
                        ((Float) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 3:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 4:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 5:
                        iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 6:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 7:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 8:
                        ((Boolean) obj2).getClass();
                        return iE2 + iC2 + i10;
                    case 9:
                        iE2 = ((J) ((AbstractC1230a) obj2)).c(null);
                        return iE2 + iC2 + i10;
                    case 10:
                        iC3 = ((J) ((AbstractC1230a) obj2)).c(null);
                        iD2 = AbstractC1267t.D(iC3);
                        iE2 = iD2 + iC3;
                        return iE2 + iC2 + i10;
                    case 11:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iE2 = AbstractC1267t.B((String) obj2);
                        }
                        return iE2 + iC2 + i10;
                    case 12:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iC3 = ((byte[]) obj2).length;
                            iD2 = AbstractC1267t.D(iC3);
                            iE2 = iD2 + iC3;
                        }
                        return iE2 + iC2 + i10;
                    case 13:
                        iE2 = AbstractC1267t.D(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iE2 = AbstractC1267t.D((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                        return iE2 + iC2 + i10;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iE2 = AbstractC1267t.E((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                        return iE2 + iC2 + i10;
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        if (obj2 instanceof Q) {
                            iE2 = AbstractC1267t.A(((Q) obj2).f());
                        } else {
                            iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        }
                        return iE2 + iC2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 5:
                iE = AbstractC1267t.A(((Integer) obj).intValue());
                i10 = iE + iC4;
                iC2 = AbstractC1267t.C(2);
                g1Var = c1249j0.f18747b;
                if (g1Var == g1Var2) {
                    iC2 *= 2;
                }
                switch (iArr[g1Var.ordinal()]) {
                    case 1:
                        ((Double) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 2:
                        ((Float) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 3:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 4:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 5:
                        iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 6:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 7:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 8:
                        ((Boolean) obj2).getClass();
                        return iE2 + iC2 + i10;
                    case 9:
                        iE2 = ((J) ((AbstractC1230a) obj2)).c(null);
                        return iE2 + iC2 + i10;
                    case 10:
                        iC3 = ((J) ((AbstractC1230a) obj2)).c(null);
                        iD2 = AbstractC1267t.D(iC3);
                        iE2 = iD2 + iC3;
                        return iE2 + iC2 + i10;
                    case 11:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iE2 = AbstractC1267t.B((String) obj2);
                        }
                        return iE2 + iC2 + i10;
                    case 12:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iC3 = ((byte[]) obj2).length;
                            iD2 = AbstractC1267t.D(iC3);
                            iE2 = iD2 + iC3;
                        }
                        return iE2 + iC2 + i10;
                    case 13:
                        iE2 = AbstractC1267t.D(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iE2 = AbstractC1267t.D((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                        return iE2 + iC2 + i10;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iE2 = AbstractC1267t.E((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                        return iE2 + iC2 + i10;
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        if (obj2 instanceof Q) {
                            iE2 = AbstractC1267t.A(((Q) obj2).f());
                        } else {
                            iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        }
                        return iE2 + iC2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 6:
                ((Long) obj).getClass();
                iE = 8;
                i10 = iE + iC4;
                iC2 = AbstractC1267t.C(2);
                g1Var = c1249j0.f18747b;
                if (g1Var == g1Var2) {
                    iC2 *= 2;
                }
                switch (iArr[g1Var.ordinal()]) {
                    case 1:
                        ((Double) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 2:
                        ((Float) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 3:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 4:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 5:
                        iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 6:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 7:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 8:
                        ((Boolean) obj2).getClass();
                        return iE2 + iC2 + i10;
                    case 9:
                        iE2 = ((J) ((AbstractC1230a) obj2)).c(null);
                        return iE2 + iC2 + i10;
                    case 10:
                        iC3 = ((J) ((AbstractC1230a) obj2)).c(null);
                        iD2 = AbstractC1267t.D(iC3);
                        iE2 = iD2 + iC3;
                        return iE2 + iC2 + i10;
                    case 11:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iE2 = AbstractC1267t.B((String) obj2);
                        }
                        return iE2 + iC2 + i10;
                    case 12:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iC3 = ((byte[]) obj2).length;
                            iD2 = AbstractC1267t.D(iC3);
                            iE2 = iD2 + iC3;
                        }
                        return iE2 + iC2 + i10;
                    case 13:
                        iE2 = AbstractC1267t.D(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iE2 = AbstractC1267t.D((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                        return iE2 + iC2 + i10;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iE2 = AbstractC1267t.E((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                        return iE2 + iC2 + i10;
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        if (obj2 instanceof Q) {
                            iE2 = AbstractC1267t.A(((Q) obj2).f());
                        } else {
                            iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        }
                        return iE2 + iC2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 7:
                ((Integer) obj).getClass();
                iE = 4;
                i10 = iE + iC4;
                iC2 = AbstractC1267t.C(2);
                g1Var = c1249j0.f18747b;
                if (g1Var == g1Var2) {
                    iC2 *= 2;
                }
                switch (iArr[g1Var.ordinal()]) {
                    case 1:
                        ((Double) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 2:
                        ((Float) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 3:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 4:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 5:
                        iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 6:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 7:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 8:
                        ((Boolean) obj2).getClass();
                        return iE2 + iC2 + i10;
                    case 9:
                        iE2 = ((J) ((AbstractC1230a) obj2)).c(null);
                        return iE2 + iC2 + i10;
                    case 10:
                        iC3 = ((J) ((AbstractC1230a) obj2)).c(null);
                        iD2 = AbstractC1267t.D(iC3);
                        iE2 = iD2 + iC3;
                        return iE2 + iC2 + i10;
                    case 11:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iE2 = AbstractC1267t.B((String) obj2);
                        }
                        return iE2 + iC2 + i10;
                    case 12:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iC3 = ((byte[]) obj2).length;
                            iD2 = AbstractC1267t.D(iC3);
                            iE2 = iD2 + iC3;
                        }
                        return iE2 + iC2 + i10;
                    case 13:
                        iE2 = AbstractC1267t.D(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iE2 = AbstractC1267t.D((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                        return iE2 + iC2 + i10;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iE2 = AbstractC1267t.E((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                        return iE2 + iC2 + i10;
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        if (obj2 instanceof Q) {
                            iE2 = AbstractC1267t.A(((Q) obj2).f());
                        } else {
                            iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        }
                        return iE2 + iC2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 8:
                ((Boolean) obj).getClass();
                iE = 1;
                i10 = iE + iC4;
                iC2 = AbstractC1267t.C(2);
                g1Var = c1249j0.f18747b;
                if (g1Var == g1Var2) {
                    iC2 *= 2;
                }
                switch (iArr[g1Var.ordinal()]) {
                    case 1:
                        ((Double) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 2:
                        ((Float) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 3:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 4:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 5:
                        iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 6:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 7:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 8:
                        ((Boolean) obj2).getClass();
                        return iE2 + iC2 + i10;
                    case 9:
                        iE2 = ((J) ((AbstractC1230a) obj2)).c(null);
                        return iE2 + iC2 + i10;
                    case 10:
                        iC3 = ((J) ((AbstractC1230a) obj2)).c(null);
                        iD2 = AbstractC1267t.D(iC3);
                        iE2 = iD2 + iC3;
                        return iE2 + iC2 + i10;
                    case 11:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iE2 = AbstractC1267t.B((String) obj2);
                        }
                        return iE2 + iC2 + i10;
                    case 12:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iC3 = ((byte[]) obj2).length;
                            iD2 = AbstractC1267t.D(iC3);
                            iE2 = iD2 + iC3;
                        }
                        return iE2 + iC2 + i10;
                    case 13:
                        iE2 = AbstractC1267t.D(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iE2 = AbstractC1267t.D((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                        return iE2 + iC2 + i10;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iE2 = AbstractC1267t.E((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                        return iE2 + iC2 + i10;
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        if (obj2 instanceof Q) {
                            iE2 = AbstractC1267t.A(((Q) obj2).f());
                        } else {
                            iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        }
                        return iE2 + iC2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 9:
                iE = ((J) ((AbstractC1230a) obj)).c(null);
                i10 = iE + iC4;
                iC2 = AbstractC1267t.C(2);
                g1Var = c1249j0.f18747b;
                if (g1Var == g1Var2) {
                    iC2 *= 2;
                }
                switch (iArr[g1Var.ordinal()]) {
                    case 1:
                        ((Double) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 2:
                        ((Float) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 3:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 4:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 5:
                        iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 6:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 7:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 8:
                        ((Boolean) obj2).getClass();
                        return iE2 + iC2 + i10;
                    case 9:
                        iE2 = ((J) ((AbstractC1230a) obj2)).c(null);
                        return iE2 + iC2 + i10;
                    case 10:
                        iC3 = ((J) ((AbstractC1230a) obj2)).c(null);
                        iD2 = AbstractC1267t.D(iC3);
                        iE2 = iD2 + iC3;
                        return iE2 + iC2 + i10;
                    case 11:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iE2 = AbstractC1267t.B((String) obj2);
                        }
                        return iE2 + iC2 + i10;
                    case 12:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iC3 = ((byte[]) obj2).length;
                            iD2 = AbstractC1267t.D(iC3);
                            iE2 = iD2 + iC3;
                        }
                        return iE2 + iC2 + i10;
                    case 13:
                        iE2 = AbstractC1267t.D(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iE2 = AbstractC1267t.D((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                        return iE2 + iC2 + i10;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iE2 = AbstractC1267t.E((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                        return iE2 + iC2 + i10;
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        if (obj2 instanceof Q) {
                            iE2 = AbstractC1267t.A(((Q) obj2).f());
                        } else {
                            iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        }
                        return iE2 + iC2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 10:
                iC = ((J) ((AbstractC1230a) obj)).c(null);
                iD = AbstractC1267t.D(iC);
                iE = iC + iD;
                i10 = iE + iC4;
                iC2 = AbstractC1267t.C(2);
                g1Var = c1249j0.f18747b;
                if (g1Var == g1Var2) {
                    iC2 *= 2;
                }
                switch (iArr[g1Var.ordinal()]) {
                    case 1:
                        ((Double) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 2:
                        ((Float) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 3:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 4:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 5:
                        iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 6:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 7:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 8:
                        ((Boolean) obj2).getClass();
                        return iE2 + iC2 + i10;
                    case 9:
                        iE2 = ((J) ((AbstractC1230a) obj2)).c(null);
                        return iE2 + iC2 + i10;
                    case 10:
                        iC3 = ((J) ((AbstractC1230a) obj2)).c(null);
                        iD2 = AbstractC1267t.D(iC3);
                        iE2 = iD2 + iC3;
                        return iE2 + iC2 + i10;
                    case 11:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iE2 = AbstractC1267t.B((String) obj2);
                        }
                        return iE2 + iC2 + i10;
                    case 12:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iC3 = ((byte[]) obj2).length;
                            iD2 = AbstractC1267t.D(iC3);
                            iE2 = iD2 + iC3;
                        }
                        return iE2 + iC2 + i10;
                    case 13:
                        iE2 = AbstractC1267t.D(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iE2 = AbstractC1267t.D((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                        return iE2 + iC2 + i10;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iE2 = AbstractC1267t.E((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                        return iE2 + iC2 + i10;
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        if (obj2 instanceof Q) {
                            iE2 = AbstractC1267t.A(((Q) obj2).f());
                        } else {
                            iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        }
                        return iE2 + iC2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 11:
                iE = obj instanceof AbstractC1252l ? AbstractC1267t.z((AbstractC1252l) obj) : AbstractC1267t.B((String) obj);
                i10 = iE + iC4;
                iC2 = AbstractC1267t.C(2);
                g1Var = c1249j0.f18747b;
                if (g1Var == g1Var2) {
                    iC2 *= 2;
                }
                switch (iArr[g1Var.ordinal()]) {
                    case 1:
                        ((Double) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 2:
                        ((Float) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 3:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 4:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 5:
                        iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 6:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 7:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 8:
                        ((Boolean) obj2).getClass();
                        return iE2 + iC2 + i10;
                    case 9:
                        iE2 = ((J) ((AbstractC1230a) obj2)).c(null);
                        return iE2 + iC2 + i10;
                    case 10:
                        iC3 = ((J) ((AbstractC1230a) obj2)).c(null);
                        iD2 = AbstractC1267t.D(iC3);
                        iE2 = iD2 + iC3;
                        return iE2 + iC2 + i10;
                    case 11:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iE2 = AbstractC1267t.B((String) obj2);
                        }
                        return iE2 + iC2 + i10;
                    case 12:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iC3 = ((byte[]) obj2).length;
                            iD2 = AbstractC1267t.D(iC3);
                            iE2 = iD2 + iC3;
                        }
                        return iE2 + iC2 + i10;
                    case 13:
                        iE2 = AbstractC1267t.D(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iE2 = AbstractC1267t.D((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                        return iE2 + iC2 + i10;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iE2 = AbstractC1267t.E((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                        return iE2 + iC2 + i10;
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        if (obj2 instanceof Q) {
                            iE2 = AbstractC1267t.A(((Q) obj2).f());
                        } else {
                            iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        }
                        return iE2 + iC2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 12:
                if (obj instanceof AbstractC1252l) {
                    iE = AbstractC1267t.z((AbstractC1252l) obj);
                } else {
                    iC = ((byte[]) obj).length;
                    iD = AbstractC1267t.D(iC);
                    iE = iC + iD;
                }
                i10 = iE + iC4;
                iC2 = AbstractC1267t.C(2);
                g1Var = c1249j0.f18747b;
                if (g1Var == g1Var2) {
                    iC2 *= 2;
                }
                switch (iArr[g1Var.ordinal()]) {
                    case 1:
                        ((Double) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 2:
                        ((Float) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 3:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 4:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 5:
                        iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 6:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 7:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 8:
                        ((Boolean) obj2).getClass();
                        return iE2 + iC2 + i10;
                    case 9:
                        iE2 = ((J) ((AbstractC1230a) obj2)).c(null);
                        return iE2 + iC2 + i10;
                    case 10:
                        iC3 = ((J) ((AbstractC1230a) obj2)).c(null);
                        iD2 = AbstractC1267t.D(iC3);
                        iE2 = iD2 + iC3;
                        return iE2 + iC2 + i10;
                    case 11:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iE2 = AbstractC1267t.B((String) obj2);
                        }
                        return iE2 + iC2 + i10;
                    case 12:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iC3 = ((byte[]) obj2).length;
                            iD2 = AbstractC1267t.D(iC3);
                            iE2 = iD2 + iC3;
                        }
                        return iE2 + iC2 + i10;
                    case 13:
                        iE2 = AbstractC1267t.D(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iE2 = AbstractC1267t.D((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                        return iE2 + iC2 + i10;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iE2 = AbstractC1267t.E((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                        return iE2 + iC2 + i10;
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        if (obj2 instanceof Q) {
                            iE2 = AbstractC1267t.A(((Q) obj2).f());
                        } else {
                            iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        }
                        return iE2 + iC2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 13:
                iE = AbstractC1267t.D(((Integer) obj).intValue());
                i10 = iE + iC4;
                iC2 = AbstractC1267t.C(2);
                g1Var = c1249j0.f18747b;
                if (g1Var == g1Var2) {
                    iC2 *= 2;
                }
                switch (iArr[g1Var.ordinal()]) {
                    case 1:
                        ((Double) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 2:
                        ((Float) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 3:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 4:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 5:
                        iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 6:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 7:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 8:
                        ((Boolean) obj2).getClass();
                        return iE2 + iC2 + i10;
                    case 9:
                        iE2 = ((J) ((AbstractC1230a) obj2)).c(null);
                        return iE2 + iC2 + i10;
                    case 10:
                        iC3 = ((J) ((AbstractC1230a) obj2)).c(null);
                        iD2 = AbstractC1267t.D(iC3);
                        iE2 = iD2 + iC3;
                        return iE2 + iC2 + i10;
                    case 11:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iE2 = AbstractC1267t.B((String) obj2);
                        }
                        return iE2 + iC2 + i10;
                    case 12:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iC3 = ((byte[]) obj2).length;
                            iD2 = AbstractC1267t.D(iC3);
                            iE2 = iD2 + iC3;
                        }
                        return iE2 + iC2 + i10;
                    case 13:
                        iE2 = AbstractC1267t.D(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iE2 = AbstractC1267t.D((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                        return iE2 + iC2 + i10;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iE2 = AbstractC1267t.E((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                        return iE2 + iC2 + i10;
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        if (obj2 instanceof Q) {
                            iE2 = AbstractC1267t.A(((Q) obj2).f());
                        } else {
                            iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        }
                        return iE2 + iC2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 14:
                ((Integer) obj).getClass();
                iE = 4;
                i10 = iE + iC4;
                iC2 = AbstractC1267t.C(2);
                g1Var = c1249j0.f18747b;
                if (g1Var == g1Var2) {
                    iC2 *= 2;
                }
                switch (iArr[g1Var.ordinal()]) {
                    case 1:
                        ((Double) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 2:
                        ((Float) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 3:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 4:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 5:
                        iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 6:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 7:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 8:
                        ((Boolean) obj2).getClass();
                        return iE2 + iC2 + i10;
                    case 9:
                        iE2 = ((J) ((AbstractC1230a) obj2)).c(null);
                        return iE2 + iC2 + i10;
                    case 10:
                        iC3 = ((J) ((AbstractC1230a) obj2)).c(null);
                        iD2 = AbstractC1267t.D(iC3);
                        iE2 = iD2 + iC3;
                        return iE2 + iC2 + i10;
                    case 11:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iE2 = AbstractC1267t.B((String) obj2);
                        }
                        return iE2 + iC2 + i10;
                    case 12:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iC3 = ((byte[]) obj2).length;
                            iD2 = AbstractC1267t.D(iC3);
                            iE2 = iD2 + iC3;
                        }
                        return iE2 + iC2 + i10;
                    case 13:
                        iE2 = AbstractC1267t.D(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iE2 = AbstractC1267t.D((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                        return iE2 + iC2 + i10;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iE2 = AbstractC1267t.E((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                        return iE2 + iC2 + i10;
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        if (obj2 instanceof Q) {
                            iE2 = AbstractC1267t.A(((Q) obj2).f());
                        } else {
                            iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        }
                        return iE2 + iC2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 15:
                ((Long) obj).getClass();
                iE = 8;
                i10 = iE + iC4;
                iC2 = AbstractC1267t.C(2);
                g1Var = c1249j0.f18747b;
                if (g1Var == g1Var2) {
                    iC2 *= 2;
                }
                switch (iArr[g1Var.ordinal()]) {
                    case 1:
                        ((Double) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 2:
                        ((Float) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 3:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 4:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 5:
                        iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 6:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 7:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 8:
                        ((Boolean) obj2).getClass();
                        return iE2 + iC2 + i10;
                    case 9:
                        iE2 = ((J) ((AbstractC1230a) obj2)).c(null);
                        return iE2 + iC2 + i10;
                    case 10:
                        iC3 = ((J) ((AbstractC1230a) obj2)).c(null);
                        iD2 = AbstractC1267t.D(iC3);
                        iE2 = iD2 + iC3;
                        return iE2 + iC2 + i10;
                    case 11:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iE2 = AbstractC1267t.B((String) obj2);
                        }
                        return iE2 + iC2 + i10;
                    case 12:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iC3 = ((byte[]) obj2).length;
                            iD2 = AbstractC1267t.D(iC3);
                            iE2 = iD2 + iC3;
                        }
                        return iE2 + iC2 + i10;
                    case 13:
                        iE2 = AbstractC1267t.D(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iE2 = AbstractC1267t.D((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                        return iE2 + iC2 + i10;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iE2 = AbstractC1267t.E((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                        return iE2 + iC2 + i10;
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        if (obj2 instanceof Q) {
                            iE2 = AbstractC1267t.A(((Q) obj2).f());
                        } else {
                            iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        }
                        return iE2 + iC2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 16:
                int iIntValue16 = ((Integer) obj).intValue();
                iE = AbstractC1267t.D((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                i10 = iE + iC4;
                iC2 = AbstractC1267t.C(2);
                g1Var = c1249j0.f18747b;
                if (g1Var == g1Var2) {
                    iC2 *= 2;
                }
                switch (iArr[g1Var.ordinal()]) {
                    case 1:
                        ((Double) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 2:
                        ((Float) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 3:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 4:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 5:
                        iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 6:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 7:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 8:
                        ((Boolean) obj2).getClass();
                        return iE2 + iC2 + i10;
                    case 9:
                        iE2 = ((J) ((AbstractC1230a) obj2)).c(null);
                        return iE2 + iC2 + i10;
                    case 10:
                        iC3 = ((J) ((AbstractC1230a) obj2)).c(null);
                        iD2 = AbstractC1267t.D(iC3);
                        iE2 = iD2 + iC3;
                        return iE2 + iC2 + i10;
                    case 11:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iE2 = AbstractC1267t.B((String) obj2);
                        }
                        return iE2 + iC2 + i10;
                    case 12:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iC3 = ((byte[]) obj2).length;
                            iD2 = AbstractC1267t.D(iC3);
                            iE2 = iD2 + iC3;
                        }
                        return iE2 + iC2 + i10;
                    case 13:
                        iE2 = AbstractC1267t.D(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 16:
                        int iIntValue17 = ((Integer) obj2).intValue();
                        iE2 = AbstractC1267t.D((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                        return iE2 + iC2 + i10;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iE2 = AbstractC1267t.E((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                        return iE2 + iC2 + i10;
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        if (obj2 instanceof Q) {
                            iE2 = AbstractC1267t.A(((Q) obj2).f());
                        } else {
                            iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        }
                        return iE2 + iC2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 17:
                long jLongValue17 = ((Long) obj).longValue();
                iE = AbstractC1267t.E((jLongValue17 << 1) ^ (jLongValue17 >> 63));
                i10 = iE + iC4;
                iC2 = AbstractC1267t.C(2);
                g1Var = c1249j0.f18747b;
                if (g1Var == g1Var2) {
                    iC2 *= 2;
                }
                switch (iArr[g1Var.ordinal()]) {
                    case 1:
                        ((Double) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 2:
                        ((Float) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 3:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 4:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 5:
                        iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 6:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 7:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 8:
                        ((Boolean) obj2).getClass();
                        return iE2 + iC2 + i10;
                    case 9:
                        iE2 = ((J) ((AbstractC1230a) obj2)).c(null);
                        return iE2 + iC2 + i10;
                    case 10:
                        iC3 = ((J) ((AbstractC1230a) obj2)).c(null);
                        iD2 = AbstractC1267t.D(iC3);
                        iE2 = iD2 + iC3;
                        return iE2 + iC2 + i10;
                    case 11:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iE2 = AbstractC1267t.B((String) obj2);
                        }
                        return iE2 + iC2 + i10;
                    case 12:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iC3 = ((byte[]) obj2).length;
                            iD2 = AbstractC1267t.D(iC3);
                            iE2 = iD2 + iC3;
                        }
                        return iE2 + iC2 + i10;
                    case 13:
                        iE2 = AbstractC1267t.D(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iE2 = AbstractC1267t.D((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                        return iE2 + iC2 + i10;
                    case 17:
                        long jLongValue18 = ((Long) obj2).longValue();
                        iE2 = AbstractC1267t.E((jLongValue18 >> 63) ^ (jLongValue18 << 1));
                        return iE2 + iC2 + i10;
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        if (obj2 instanceof Q) {
                            iE2 = AbstractC1267t.A(((Q) obj2).f());
                        } else {
                            iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        }
                        return iE2 + iC2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                iE = obj instanceof Q ? AbstractC1267t.A(((Q) obj).f()) : AbstractC1267t.A(((Integer) obj).intValue());
                i10 = iE + iC4;
                iC2 = AbstractC1267t.C(2);
                g1Var = c1249j0.f18747b;
                if (g1Var == g1Var2) {
                    iC2 *= 2;
                }
                switch (iArr[g1Var.ordinal()]) {
                    case 1:
                        ((Double) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 2:
                        ((Float) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 3:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 4:
                        iE2 = AbstractC1267t.E(((Long) obj2).longValue());
                        return iE2 + iC2 + i10;
                    case 5:
                        iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 6:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 7:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 8:
                        ((Boolean) obj2).getClass();
                        return iE2 + iC2 + i10;
                    case 9:
                        iE2 = ((J) ((AbstractC1230a) obj2)).c(null);
                        return iE2 + iC2 + i10;
                    case 10:
                        iC3 = ((J) ((AbstractC1230a) obj2)).c(null);
                        iD2 = AbstractC1267t.D(iC3);
                        iE2 = iD2 + iC3;
                        return iE2 + iC2 + i10;
                    case 11:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iE2 = AbstractC1267t.B((String) obj2);
                        }
                        return iE2 + iC2 + i10;
                    case 12:
                        if (obj2 instanceof AbstractC1252l) {
                            iE2 = AbstractC1267t.z((AbstractC1252l) obj2);
                        } else {
                            iC3 = ((byte[]) obj2).length;
                            iD2 = AbstractC1267t.D(iC3);
                            iE2 = iD2 + iC3;
                        }
                        return iE2 + iC2 + i10;
                    case 13:
                        iE2 = AbstractC1267t.D(((Integer) obj2).intValue());
                        return iE2 + iC2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iE2 = 4;
                        return iE2 + iC2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iE2 = 8;
                        return iE2 + iC2 + i10;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iE2 = AbstractC1267t.D((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                        return iE2 + iC2 + i10;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iE2 = AbstractC1267t.E((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                        return iE2 + iC2 + i10;
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        if (obj2 instanceof Q) {
                            iE2 = AbstractC1267t.A(((Q) obj2).f());
                        } else {
                            iE2 = AbstractC1267t.A(((Integer) obj2).intValue());
                        }
                        return iE2 + iC2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
