package com.google.android.recaptcha.internal;

import M8.l;
import N8.y;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzjb {
    public static final Map zza() {
        LinkedHashMap linkedHashMapI0 = y.i0(new l(-4, zzba.zzo), new l(-12, zzba.zzp), new l(-6, zzba.zzk), new l(-11, zzba.zzm), new l(-13, zzba.zzq), new l(-14, zzba.zzr), new l(-2, zzba.zzl), new l(-7, zzba.zzs), new l(-5, zzba.zzt), new l(-9, zzba.zzu), new l(-8, zzba.zzE), new l(-15, zzba.zzn), new l(-1, zzba.zzv), new l(-3, zzba.zzx), new l(-10, zzba.zzy));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            linkedHashMapI0.put(-16, zzba.zzw);
        }
        if (i10 >= 27) {
            linkedHashMapI0.put(1, zzba.zzA);
            linkedHashMapI0.put(2, zzba.zzB);
            linkedHashMapI0.put(0, zzba.zzC);
            linkedHashMapI0.put(3, zzba.zzD);
        }
        if (i10 >= 29) {
            linkedHashMapI0.put(4, zzba.zzz);
        }
        return linkedHashMapI0;
    }
}
