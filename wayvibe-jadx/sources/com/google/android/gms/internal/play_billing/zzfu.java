package com.google.android.gms.internal.play_billing;

import com.apple.android.music.playback.model.MediaPlayerException;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.play_billing.zzfq;
import com.google.android.gms.internal.play_billing.zzfu;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzfu<MessageType extends zzfu<MessageType, BuilderType>, BuilderType extends zzfq<MessageType, BuilderType>> extends zzeg<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzic zzc = zzic.zzc();

    public static void zzB(Class cls, zzfu zzfuVar) {
        zzfuVar.zzA();
        zzb.put(cls, zzfuVar);
    }

    private final int zza(zzhl zzhlVar) {
        return zzhi.zza().zzb(getClass()).zza(this);
    }

    private static zzfu zzb(zzfu zzfuVar, byte[] bArr, int i10, int i11, zzfh zzfhVar) throws zzgc {
        if (i11 == 0) {
            return zzfuVar;
        }
        zzfu zzfuVarZzs = zzfuVar.zzs();
        try {
            zzhl zzhlVarZzb = zzhi.zza().zzb(zzfuVarZzs.getClass());
            zzhlVarZzb.zzh(zzfuVarZzs, bArr, 0, i11, new zzej(zzfhVar));
            zzhlVarZzb.zzf(zzfuVarZzs);
            return zzfuVarZzs;
        } catch (zzgc e2) {
            throw e2;
        } catch (zzia e4) {
            throw e4.zza();
        } catch (IOException e7) {
            if (e7.getCause() instanceof zzgc) {
                throw ((zzgc) e7.getCause());
            }
            throw new zzgc(e7);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzc(zzfu zzfuVar, boolean z10) {
        byte bByteValue = ((Byte) zzfuVar.zzd(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zzhi.zza().zzb(zzfuVar.getClass()).zzk(zzfuVar);
        if (z10) {
            zzfuVar.zzd(2, true != zZzk ? null : zzfuVar, null);
        }
        return zZzk;
    }

    public static zzfu zzr(Class cls) {
        Map map = zzb;
        zzfu zzfuVar = (zzfu) map.get(cls);
        if (zzfuVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzfuVar = (zzfu) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzfuVar != null) {
            return zzfuVar;
        }
        zzfu zzfuVar2 = (zzfu) ((zzfu) zzii.zze(cls)).zzd(6, null, null);
        if (zzfuVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzfuVar2);
        return zzfuVar2;
    }

    public static zzfu zzt(zzfu zzfuVar, byte[] bArr) throws zzgc {
        int length = bArr.length;
        int i10 = zzfh.zzb;
        int i11 = zzei.zza;
        zzfu zzfuVarZzb = zzb(zzfuVar, bArr, 0, length, zzfh.zza);
        if (zzfuVarZzb == null || zzc(zzfuVarZzb, true)) {
            return zzfuVarZzb;
        }
        throw new zzia(zzfuVarZzb).zza();
    }

    public static zzfy zzu() {
        return zzfv.zzf();
    }

    public static zzfz zzv() {
        return zzhj.zze();
    }

    public static Object zzx(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzy(zzhb zzhbVar, String str, Object[] objArr) {
        return new zzhk(zzhbVar, str, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzhi.zza().zzb(getClass()).zzj(this, (zzfu) obj);
    }

    public final int hashCode() {
        if (zzF()) {
            return zzm();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iZzm = zzm();
        this.zza = iZzm;
        return iZzm;
    }

    public final String toString() {
        return zzhd.zza(this, super.toString());
    }

    public final void zzA() {
        this.zzd &= f.API_PRIORITY_OTHER;
    }

    public final void zzC(int i10) {
        this.zzd = (this.zzd & MediaPlayerException.ERROR_UNKNOWN) | f.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhb
    public final void zzD(zzfc zzfcVar) {
        zzhi.zza().zzb(getClass()).zzi(this, zzfd.zza(zzfcVar));
    }

    public final boolean zzF() {
        return (this.zzd & MediaPlayerException.ERROR_UNKNOWN) != 0;
    }

    public abstract Object zzd(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.play_billing.zzeg
    public final int zzi(zzhl zzhlVar) {
        if (zzF()) {
            int iZza = zzhlVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException(b.j(iZza, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & f.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZza2 = zzhlVar.zza(this);
        if (iZza2 < 0) {
            throw new IllegalStateException(b.j(iZza2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & MediaPlayerException.ERROR_UNKNOWN) | iZza2;
        return iZza2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhc
    public final /* synthetic */ zzhb zzl() {
        return (zzfu) zzd(6, null, null);
    }

    public final int zzm() {
        return zzhi.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhb
    public final int zzn() {
        if (zzF()) {
            int iZza = zza(null);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException(b.j(iZza, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & f.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZza2 = zza(null);
        if (iZza2 < 0) {
            throw new IllegalStateException(b.j(iZza2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & MediaPlayerException.ERROR_UNKNOWN) | iZza2;
        return iZza2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhc
    public final boolean zzo() {
        return zzc(this, true);
    }

    public final zzfq zzp() {
        return (zzfq) zzd(5, null, null);
    }

    public final zzfq zzq() {
        zzfq zzfqVar = (zzfq) zzd(5, null, null);
        zzfqVar.zzh(this);
        return zzfqVar;
    }

    public final zzfu zzs() {
        return (zzfu) zzd(4, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhb
    public final /* synthetic */ zzha zzw() {
        return (zzfq) zzd(5, null, null);
    }

    public final void zzz() {
        zzhi.zza().zzb(getClass()).zzf(this);
        zzA();
    }
}
