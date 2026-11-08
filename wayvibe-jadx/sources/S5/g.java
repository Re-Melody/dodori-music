package S5;

import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes.dex */
public final class g extends zza {
    public final R5.a O(R5.b bVar, int i10) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, bVar);
        parcelZza.writeString("com.google.android.gms.providerinstaller.dynamite");
        parcelZza.writeInt(i10);
        Parcel parcelZzB = zzB(2, parcelZza);
        R5.a aVarO = R5.b.O(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarO;
    }

    public final R5.a d0(R5.b bVar, int i10) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, bVar);
        parcelZza.writeString("com.google.android.gms.providerinstaller.dynamite");
        parcelZza.writeInt(i10);
        Parcel parcelZzB = zzB(4, parcelZza);
        R5.a aVarO = R5.b.O(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarO;
    }

    public final R5.a k0(R5.b bVar, boolean z10, long j10) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, bVar);
        parcelZza.writeString("com.google.android.gms.providerinstaller.dynamite");
        parcelZza.writeInt(z10 ? 1 : 0);
        parcelZza.writeLong(j10);
        Parcel parcelZzB = zzB(7, parcelZza);
        R5.a aVarO = R5.b.O(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarO;
    }

    public final R5.a l0(R5.b bVar, int i10, R5.b bVar2) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, bVar);
        parcelZza.writeString("com.google.android.gms.providerinstaller.dynamite");
        parcelZza.writeInt(i10);
        zzc.zze(parcelZza, bVar2);
        Parcel parcelZzB = zzB(8, parcelZza);
        R5.a aVarO = R5.b.O(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarO;
    }
}
