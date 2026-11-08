package com.google.android.gms.internal.auth;

import A5.b;
import android.content.Context;
import com.google.android.gms.common.api.InterfaceC1132b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1138e;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.u;

/* JADX INFO: loaded from: classes.dex */
abstract class zzbj extends AbstractC1138e {
    public zzbj(q qVar) {
        super(b.f284a, qVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ u createFailedResult(Status status) {
        return new zzbv(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1138e
    public final /* bridge */ /* synthetic */ void doExecute(InterfaceC1132b interfaceC1132b) {
        zzbe zzbeVar = (zzbe) interfaceC1132b;
        zza(zzbeVar.getContext(), (zzbh) zzbeVar.getService());
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.InterfaceC1139f
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((u) obj);
    }

    public abstract void zza(Context context, zzbh zzbhVar);
}
