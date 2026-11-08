package com.google.android.gms.internal.p002firebaseauthapi;

import I5.a;
import V0.p;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.E;
import org.json.JSONException;
import org.json.JSONObject;
import p011a7.M;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzait extends a implements zzaes {
    public static final Parcelable.Creator<zzait> CREATOR = new zzais();
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private boolean zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private boolean zzo;
    private String zzp;

    public zzait() {
        this.zzi = true;
        this.zzj = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = c.c0(20293, parcel);
        c.W(parcel, 2, this.zza, false);
        c.W(parcel, 3, this.zzb, false);
        c.W(parcel, 4, this.zzc, false);
        c.W(parcel, 5, this.zzd, false);
        c.W(parcel, 6, this.zze, false);
        c.W(parcel, 7, this.zzf, false);
        c.W(parcel, 8, this.zzg, false);
        c.W(parcel, 9, this.zzh, false);
        boolean z10 = this.zzi;
        c.b0(parcel, 10, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.zzj;
        c.b0(parcel, 11, 4);
        parcel.writeInt(z11 ? 1 : 0);
        c.W(parcel, 12, this.zzk, false);
        c.W(parcel, 13, this.zzl, false);
        c.W(parcel, 14, this.zzm, false);
        c.W(parcel, 15, this.zzn, false);
        boolean z12 = this.zzo;
        c.b0(parcel, 16, 4);
        parcel.writeInt(z12 ? 1 : 0);
        c.W(parcel, 17, this.zzp, false);
        c.d0(iC0, parcel);
    }

    public final zzait zza(boolean z10) {
        this.zzj = false;
        return this;
    }

    public final zzait zzb(boolean z10) {
        this.zzo = true;
        return this;
    }

    public final zzait zzc(boolean z10) {
        this.zzi = true;
        return this;
    }

    public final zzait zza(String str) {
        E.e(str);
        this.zzb = str;
        return this;
    }

    public final zzait zzb(String str) {
        this.zzn = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.zzj);
        jSONObject.put("returnSecureToken", this.zzi);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzg;
        if (str2 != null) {
            jSONObject.put("postBody", str2);
        }
        String str3 = this.zzn;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zzp;
        if (str4 != null) {
            jSONObject.put("pendingToken", str4);
        }
        if (!TextUtils.isEmpty(this.zzl)) {
            jSONObject.put("sessionId", this.zzl);
        }
        if (!TextUtils.isEmpty(this.zzm)) {
            jSONObject.put("requestUri", this.zzm);
        } else {
            String str5 = this.zza;
            if (str5 != null) {
                jSONObject.put("requestUri", str5);
            }
        }
        jSONObject.put("returnIdpCredential", this.zzo);
        return jSONObject.toString();
    }

    public zzait(M m8, String str) {
        E.h(m8);
        String str2 = m8.f14201a;
        E.e(str2);
        this.zzl = str2;
        E.e(str);
        this.zzm = str;
        String str3 = m8.f14203c;
        E.e(str3);
        this.zze = str3;
        this.zzi = true;
        this.zzg = "providerId=" + this.zze;
    }

    public zzait(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.zza = "http://localhost";
        this.zzc = str;
        this.zzd = str2;
        this.zzh = str5;
        this.zzk = str6;
        this.zzn = str7;
        this.zzp = str8;
        this.zzi = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.zzd) && TextUtils.isEmpty(this.zzk)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        E.e(str3);
        this.zze = str3;
        this.zzf = null;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.zzc)) {
            sb.append("id_token=");
            sb.append(this.zzc);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            sb.append("access_token=");
            sb.append(this.zzd);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.zzf)) {
            sb.append("identifier=");
            sb.append(this.zzf);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            sb.append("oauth_token_secret=");
            sb.append(this.zzh);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.zzk)) {
            sb.append("code=");
            sb.append(this.zzk);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(str9)) {
            p.x(sb, "nonce=", str9, "&");
        }
        sb.append("providerId=");
        sb.append(this.zze);
        this.zzg = sb.toString();
        this.zzj = true;
    }

    public zzait(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z10, boolean z11, String str9, String str10, String str11, String str12, boolean z12, String str13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = z10;
        this.zzj = z11;
        this.zzk = str9;
        this.zzl = str10;
        this.zzm = str11;
        this.zzn = str12;
        this.zzo = z12;
        this.zzp = str13;
    }
}
