package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class zznt {
    private static final Logger zza = Logger.getLogger(zznt.class.getName());
    private static final zznt zzb = new zznt();
    private ConcurrentMap<String, zzbl<?>> zzc = new ConcurrentHashMap();
    private ConcurrentMap<String, Boolean> zzd = new ConcurrentHashMap();

    private final synchronized zzbl<?> zzc(String str) {
        if (!this.zzc.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return this.zzc.get(str);
    }

    public final <P> zzbl<P> zza(String str, Class<P> cls) throws GeneralSecurityException {
        zzbl<P> zzblVar = (zzbl<P>) zzc(str);
        if (zzblVar.zza().equals(cls)) {
            return zzblVar;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzblVar.getClass());
        String strValueOf2 = String.valueOf(zzblVar.zza());
        StringBuilder sbQ = b.q("Primitive type ", name, " not supported by key manager of type ", strValueOf, ", which only supports: ");
        sbQ.append(strValueOf2);
        throw new GeneralSecurityException(sbQ.toString());
    }

    public final boolean zzb(String str) {
        return this.zzd.get(str).booleanValue();
    }

    public final zzbl<?> zza(String str) {
        return zzc(str);
    }

    public static zznt zza() {
        return zzb;
    }

    private final synchronized void zza(zzbl<?> zzblVar, boolean z10, boolean z11) {
        try {
            String strZzb = zzblVar.zzb();
            if (z11 && this.zzd.containsKey(strZzb) && !this.zzd.get(strZzb).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + strZzb);
            }
            zzbl<?> zzblVar2 = this.zzc.get(strZzb);
            if (zzblVar2 != null && !zzblVar2.getClass().equals(zzblVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type " + strZzb);
                throw new GeneralSecurityException("typeUrl (" + strZzb + ") is already registered with " + zzblVar2.getClass().getName() + ", cannot be re-registered with " + zzblVar.getClass().getName());
            }
            this.zzc.putIfAbsent(strZzb, zzblVar);
            this.zzd.put(strZzb, Boolean.valueOf(z11));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized <P> void zza(zzbl<P> zzblVar, boolean z10) {
        zza(zzblVar, zzix.zza.zza, z10);
    }

    public final synchronized <P> void zza(zzbl<P> zzblVar, zzix.zza zzaVar, boolean z10) {
        if (zzaVar.zza()) {
            zza((zzbl<?>) zzblVar, false, z10);
        } else {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
    }
}
