package com.google.android.gms.internal.p000authapi;

import B2.AbstractC0112b;

/* JADX INFO: loaded from: classes.dex */
public final class zbbd {
    public static int zba(int i10, int i11, String str) {
        String strZba;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strZba = zbbe.zba("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException(AbstractC0112b.k(new StringBuilder(String.valueOf(i11).length() + 15), "negative size: ", i11));
            }
            strZba = zbbe.zba("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strZba);
    }

    public static int zbb(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zbd(i10, i11, "index"));
        }
        return i10;
    }

    public static void zbc(int i10, int i11, int i12) {
        String strZbd;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strZbd = zbd(i10, i12, "start index");
            } else {
                strZbd = (i11 < 0 || i11 > i12) ? zbd(i11, i12, "end index") : zbbe.zba("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strZbd);
        }
    }

    private static String zbd(int i10, int i11, String str) {
        if (i10 < 0) {
            return zbbe.zba("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zbbe.zba("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(AbstractC0112b.k(new StringBuilder(String.valueOf(i11).length() + 15), "negative size: ", i11));
    }
}
