package com.google.android.gms.internal.location;

import H5.d;
import Z5.C0988c;
import Z5.t;
import Z5.z;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.BinderC1155w;
import com.google.android.gms.common.api.internal.C1158z;
import com.google.android.gms.common.api.internal.InterfaceC1154v;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class zzaj extends n {
    static final h zza;
    public static final i zzb;

    static {
        h hVar = new h();
        zza = hVar;
        zzb = new i("ActivityRecognition.API", new zzag(), hVar);
    }

    public zzaj(Activity activity) {
        super(activity, activity, zzb, e.f17838g0, m.f17972c);
    }

    public final Task<Void> removeActivityTransitionUpdates(final PendingIntent pendingIntent) {
        C1158z c1158zA = A.a();
        c1158zA.f17962c = new InterfaceC1154v() { // from class: com.google.android.gms.internal.location.zzam
            @Override // com.google.android.gms.common.api.internal.InterfaceC1154v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                i iVar = zzaj.zzb;
                ((zzv) ((zzg) obj).getService()).zzk(pendingIntent, new BinderC1155w(new zzai((TaskCompletionSource) obj2)));
            }
        };
        c1158zA.f17960a = 2406;
        return doWrite(c1158zA.a());
    }

    public final Task<Void> removeActivityUpdates(final PendingIntent pendingIntent) {
        C1158z c1158zA = A.a();
        c1158zA.f17962c = new InterfaceC1154v() { // from class: com.google.android.gms.internal.location.zzak
            @Override // com.google.android.gms.common.api.internal.InterfaceC1154v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                i iVar = zzaj.zzb;
                ((zzg) obj).zzp(pendingIntent);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        };
        c1158zA.f17960a = 2402;
        return doWrite(c1158zA.a());
    }

    public final Task<Void> removeSleepSegmentUpdates(final PendingIntent pendingIntent) {
        C1158z c1158zA = A.a();
        c1158zA.f17962c = new InterfaceC1154v() { // from class: com.google.android.gms.internal.location.zzan
            @Override // com.google.android.gms.common.api.internal.InterfaceC1154v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                i iVar = zzaj.zzb;
                zzai zzaiVar = new zzai((TaskCompletionSource) obj2);
                PendingIntent pendingIntent2 = pendingIntent;
                E.i(pendingIntent2, "PendingIntent must be specified.");
                ((zzv) ((zzg) obj).getService()).zzn(pendingIntent2, new BinderC1155w(zzaiVar));
            }
        };
        c1158zA.f17960a = 2411;
        return doWrite(c1158zA.a());
    }

    public final Task<Void> requestActivityTransitionUpdates(final C0988c c0988c, final PendingIntent pendingIntent) {
        c0988c.f13833d = getContextAttributionTag();
        C1158z c1158zA = A.a();
        c1158zA.f17962c = new InterfaceC1154v() { // from class: com.google.android.gms.internal.location.zzal
            @Override // com.google.android.gms.common.api.internal.InterfaceC1154v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                i iVar = zzaj.zzb;
                zzai zzaiVar = new zzai((TaskCompletionSource) obj2);
                C0988c c0988c2 = c0988c;
                E.i(c0988c2, "activityTransitionRequest must be specified.");
                PendingIntent pendingIntent2 = pendingIntent;
                E.i(pendingIntent2, "PendingIntent must be specified.");
                ((zzv) ((zzg) obj).getService()).zzj(c0988c2, pendingIntent2, new BinderC1155w(zzaiVar));
            }
        };
        c1158zA.f17960a = 2405;
        return doWrite(c1158zA.a());
    }

    public final Task<Void> requestActivityUpdates(long j10, final PendingIntent pendingIntent) {
        E.a("intervalMillis can't be negative.", j10 >= 0);
        E.j("Must set intervalMillis.", j10 != Long.MIN_VALUE);
        final z zVar = new z(j10, true, null, null, null, false, null, 0L, null);
        zVar.f13906i = getContextAttributionTag();
        C1158z c1158zA = A.a();
        c1158zA.f17962c = new InterfaceC1154v() { // from class: com.google.android.gms.internal.location.zzap
            @Override // com.google.android.gms.common.api.internal.InterfaceC1154v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                i iVar = zzaj.zzb;
                zzai zzaiVar = new zzai((TaskCompletionSource) obj2);
                z zVar2 = zVar;
                E.i(zVar2, "ActivityRecognitionRequest can't be null.");
                PendingIntent pendingIntent2 = pendingIntent;
                E.i(pendingIntent2, "PendingIntent must be specified.");
                ((zzv) ((zzg) obj).getService()).zzi(zVar2, pendingIntent2, new BinderC1155w(zzaiVar));
            }
        };
        c1158zA.f17960a = 2401;
        return doWrite(c1158zA.a());
    }

    public final Task<Void> requestSleepSegmentUpdates(final PendingIntent pendingIntent, final t tVar) {
        E.i(pendingIntent, "PendingIntent must be specified.");
        C1158z c1158zA = A.a();
        c1158zA.f17962c = new InterfaceC1154v() { // from class: com.google.android.gms.internal.location.zzao
            @Override // com.google.android.gms.common.api.internal.InterfaceC1154v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((zzv) ((zzg) obj).getService()).zzm(pendingIntent, tVar, new zzah(this.zza, (TaskCompletionSource) obj2));
            }
        };
        c1158zA.f17963d = new d[]{Z5.A.f13817a};
        c1158zA.f17960a = 2410;
        return doRead(c1158zA.a());
    }

    public zzaj(Context context) {
        super(context, null, zzb, e.f17838g0, m.f17972c);
    }
}
