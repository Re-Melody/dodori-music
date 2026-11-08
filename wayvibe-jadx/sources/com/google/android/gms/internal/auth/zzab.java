package com.google.android.gms.internal.auth;

import H5.d;
import K5.a;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.AbstractC1131a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.C1158z;
import com.google.android.gms.common.api.internal.InterfaceC1154v;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p257y5.b;

/* JADX INFO: loaded from: classes.dex */
final class zzab extends n implements zzg {
    private static final h zza;
    private static final AbstractC1131a zzb;
    private static final i zzc;
    private static final a zzd;
    private final Context zze;

    static {
        h hVar = new h();
        zza = hVar;
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzc = new i("GoogleAuthService.API", zzvVar, hVar);
        zzd = new a("Auth", "GoogleAuthServiceClient");
    }

    public zzab(Context context) {
        super(context, null, zzc, e.f17838g0, m.f17972c);
        this.zze = context;
    }

    public static void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.u() ? taskCompletionSource.trySetResult(obj) : taskCompletionSource.trySetException(E.l(status))) {
            return;
        }
        zzd.f("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zza(final zzbw zzbwVar) {
        C1158z c1158zA = A.a();
        c1158zA.f17963d = new d[]{p257y5.d.f29091c};
        c1158zA.f17962c = new InterfaceC1154v() { // from class: com.google.android.gms.internal.auth.zzt
            @Override // com.google.android.gms.common.api.internal.InterfaceC1154v
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzd(new zzx(zzabVar, (TaskCompletionSource) obj2), zzbwVar);
            }
        };
        c1158zA.f17960a = 1513;
        return doWrite(c1158zA.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzb(final b bVar) {
        E.i(bVar, "request cannot be null.");
        C1158z c1158zA = A.a();
        c1158zA.f17963d = new d[]{p257y5.d.f29090b};
        c1158zA.f17962c = new InterfaceC1154v() { // from class: com.google.android.gms.internal.auth.zzu
            @Override // com.google.android.gms.common.api.internal.InterfaceC1154v
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                b bVar2 = bVar;
                ((zzp) ((zzi) obj).getService()).zze(new zzz(zzabVar, (TaskCompletionSource) obj2), bVar2);
            }
        };
        c1158zA.f17960a = 1515;
        return doWrite(c1158zA.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzc(final Account account, final String str, final Bundle bundle) {
        E.i(account, "Account name cannot be null!");
        E.f(str, "Scope cannot be null!");
        C1158z c1158zA = A.a();
        c1158zA.f17963d = new d[]{p257y5.d.f29091c};
        c1158zA.f17962c = new InterfaceC1154v() { // from class: com.google.android.gms.internal.auth.zzs
            @Override // com.google.android.gms.common.api.internal.InterfaceC1154v
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzf(new zzw(zzabVar, (TaskCompletionSource) obj2), account, str, bundle);
            }
        };
        c1158zA.f17960a = 1512;
        return doWrite(c1158zA.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzd(final Account account) {
        E.i(account, "account cannot be null.");
        C1158z c1158zA = A.a();
        c1158zA.f17963d = new d[]{p257y5.d.f29090b};
        c1158zA.f17962c = new InterfaceC1154v() { // from class: com.google.android.gms.internal.auth.zzr
            @Override // com.google.android.gms.common.api.internal.InterfaceC1154v
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzg(new zzaa(zzabVar, (TaskCompletionSource) obj2), account);
            }
        };
        c1158zA.f17960a = 1517;
        return doWrite(c1158zA.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zze(final String str) {
        E.i(str, "Client package name cannot be null!");
        C1158z c1158zA = A.a();
        c1158zA.f17963d = new d[]{p257y5.d.f29090b};
        c1158zA.f17962c = new InterfaceC1154v() { // from class: com.google.android.gms.internal.auth.zzq
            @Override // com.google.android.gms.common.api.internal.InterfaceC1154v
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzabVar, (TaskCompletionSource) obj2), str);
            }
        };
        c1158zA.f17960a = 1514;
        return doWrite(c1158zA.a());
    }
}
