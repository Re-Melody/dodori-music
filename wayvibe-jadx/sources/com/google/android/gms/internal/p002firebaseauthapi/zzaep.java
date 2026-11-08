package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public class zzaep {
    private zzaep() {
    }

    public static Object zza(String str, Type type) throws zzaci {
        if (type != String.class) {
            if (type == Void.class) {
                return null;
            }
            try {
                try {
                    return ((zzaer) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0])).zza(str);
                } catch (Exception e2) {
                    throw new zzaci(b.k("Json conversion failed! ", e2.getMessage()), e2);
                }
            } catch (Exception e4) {
                throw new zzaci("Instantiation of JsonResponse failed! ".concat(String.valueOf(type)), e4);
            }
        }
        try {
            zzagl zzaglVar = (zzagl) new zzagl().zza(str);
            if (zzaglVar.zzb()) {
                return zzaglVar.zza();
            }
            throw new zzaci("No error message: " + str);
        } catch (Exception e7) {
            throw new zzaci(b.k("Json conversion failed! ", e7.getMessage()), e7);
        }
    }
}
