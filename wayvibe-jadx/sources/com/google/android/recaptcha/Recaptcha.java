package com.google.android.recaptcha;

import M8.InterfaceC0641c;
import Q5.b;
import Q8.d;
import R8.a;
import android.app.Application;
import com.apple.android.music.playback.model.MediaPlayerException;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzcq;
import com.google.android.recaptcha.internal.zzdc;

/* JADX INFO: loaded from: classes.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String str) {
        return zzcq.zze(application, str);
    }

    /* JADX INFO: renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m15getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j10, d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = 10000;
        }
        return recaptcha.m16getClientBWLJW6A(application, str, j10, dVar);
    }

    @InterfaceC0641c
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzcq.zzc(application, str, 10000L);
    }

    public final Object fetchClient(Application application, String str, d dVar) {
        return zzcq.zzd(application, str, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @InterfaceC0641c
    /* JADX INFO: renamed from: getClient-BWLJW6A, reason: not valid java name */
    public final Object m16getClientBWLJW6A(Application application, String str, long j10, d dVar) {
        Recaptcha$getClient$1 recaptcha$getClient$1;
        if (dVar instanceof Recaptcha$getClient$1) {
            recaptcha$getClient$1 = (Recaptcha$getClient$1) dVar;
            int i10 = recaptcha$getClient$1.zzc;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                recaptcha$getClient$1.zzc = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                recaptcha$getClient$1 = new Recaptcha$getClient$1(this, dVar);
            }
        } else {
            recaptcha$getClient$1 = new Recaptcha$getClient$1(this, dVar);
        }
        Object objZzb = recaptcha$getClient$1.zza;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = recaptcha$getClient$1.zzc;
        try {
            if (i11 == 0) {
                b.T(objZzb);
                recaptcha$getClient$1.zzc = 1;
                objZzb = zzcq.zzb(application, str, j10, recaptcha$getClient$1);
                if (objZzb == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.T(objZzb);
            }
            return (zzdc) objZzb;
        } catch (Throwable th) {
            return b.r(th);
        }
    }

    @InterfaceC0641c
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j10) {
        return zzcq.zzc(application, str, j10);
    }
}
