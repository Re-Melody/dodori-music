package com.google.android.gms.internal.location;

import I5.a;
import M8.InterfaceC0641c;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.m;
import p097i9.r;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class zze extends a {
    private final int zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final List zzf;
    private final zze zzg;
    public static final zzd zza = new zzd(null);
    public static final Parcelable.Creator<zze> CREATOR = new zzf();

    static {
        Process.myUid();
        Process.myPid();
    }

    @InterfaceC0641c
    public zze(int i10, String packageName, String str, String str2, List list, zze zzeVar) {
        m.f(packageName, "packageName");
        if (zzeVar != null && zzeVar.zza()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.zzb = i10;
        this.zzc = packageName;
        this.zzd = str;
        if (str2 == null) {
            str2 = zzeVar != null ? zzeVar.zze : null;
        }
        this.zze = str2;
        if (list == null) {
            list = zzeVar != null ? zzeVar.zzf : null;
            if (list == null) {
                list = zzex.zzi();
                m.e(list, "of(...)");
            }
        }
        zzex zzexVarZzj = zzex.zzj(list);
        m.e(zzexVarZzj, "copyOf(...)");
        this.zzf = zzexVarZzj;
        this.zzg = zzeVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zze) {
            zze zzeVar = (zze) obj;
            if (this.zzb == zzeVar.zzb && m.b(this.zzc, zzeVar.zzc) && m.b(this.zzd, zzeVar.zzd) && m.b(this.zze, zzeVar.zze) && m.b(this.zzg, zzeVar.zzg) && m.b(this.zzf, zzeVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzg});
    }

    public final String toString() {
        int length = this.zzc.length() + 18;
        String str = this.zzd;
        StringBuilder sb = new StringBuilder(length + (str != null ? str.length() : 0));
        sb.append(this.zzb);
        sb.append("/");
        sb.append(this.zzc);
        String str2 = this.zzd;
        if (str2 != null) {
            sb.append("[");
            if (r.j0(str2, this.zzc, false)) {
                sb.append((CharSequence) str2, this.zzc.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        if (this.zze != null) {
            sb.append("/");
            String str3 = this.zze;
            sb.append(Integer.toHexString(str3 != null ? str3.hashCode() : 0));
        }
        String string = sb.toString();
        m.e(string, "toString(...)");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        m.f(dest, "dest");
        int i11 = this.zzb;
        int iC0 = c.c0(20293, dest);
        c.b0(dest, 1, 4);
        dest.writeInt(i11);
        c.W(dest, 3, this.zzc, false);
        c.W(dest, 4, this.zzd, false);
        c.W(dest, 6, this.zze, false);
        c.V(dest, 7, this.zzg, i10, false);
        c.Z(dest, 8, this.zzf, false);
        c.d0(iC0, dest);
    }

    public final boolean zza() {
        return this.zzg != null;
    }
}
