package com.google.android.gms.internal.p002firebaseauthapi;

import W6.h;
import Z6.AbstractC0998c;
import Z6.AbstractC1009n;
import Z6.w;
import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1146m;
import com.google.android.gms.common.api.internal.InterfaceC1147n;
import com.google.android.gms.common.internal.E;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p011a7.InterfaceC1025m;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzaex<ResultT, CallbackT> implements zzafi<ResultT> {
    protected final int zza;
    protected h zzc;
    protected AbstractC1009n zzd;
    protected CallbackT zze;
    protected InterfaceC1025m zzf;
    protected zzaey<ResultT> zzg;
    protected Executor zzi;
    protected zzahn zzj;
    protected zzahc zzk;
    protected zzagn zzl;
    protected zzahx zzm;
    protected AbstractC0998c zzn;
    protected String zzo;
    protected String zzp;
    protected zzaaj zzq;
    protected zzahk zzr;
    protected zzahj zzs;
    protected zzaij zzt;
    private boolean zzu;
    protected final zzaez zzb = new zzaez(this);
    protected final List<w> zzh = new ArrayList();

    public static class zza extends AbstractC1146m {
        private final List<w> zza;

        private zza(InterfaceC1147n interfaceC1147n, List<w> list) {
            super(interfaceC1147n);
            this.mLifecycleFragment.a("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<w> list) {
            InterfaceC1147n fragment = AbstractC1146m.getFragment(activity);
            if (((zza) fragment.b(zza.class, "PhoneAuthActivityStopCallback")) == null) {
                new zza(fragment, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC1146m
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzaex(int i10) {
        this.zza = i10;
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzu = true;
        this.zzg.zza(resultt, null);
    }

    public final zzaex<ResultT, CallbackT> zza(CallbackT callbackt) {
        E.i(callbackt, "external callback cannot be null");
        this.zze = callbackt;
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(InterfaceC1025m interfaceC1025m) {
        E.i(interfaceC1025m, "external failure callback cannot be null");
        this.zzf = interfaceC1025m;
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(h hVar) {
        E.i(hVar, "firebaseApp cannot be null");
        this.zzc = hVar;
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(AbstractC1009n abstractC1009n) {
        E.i(abstractC1009n, "firebaseUser cannot be null");
        this.zzd = abstractC1009n;
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(w wVar, Activity activity, Executor executor, String str) {
        w wVarZza = zzaft.zza(str, wVar, this);
        synchronized (this.zzh) {
            List<w> list = this.zzh;
            E.h(wVarZza);
            list.add(wVarZza);
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        E.h(executor);
        this.zzi = executor;
        return this;
    }

    public static /* synthetic */ void zza(zzaex zzaexVar) {
        zzaexVar.zzb();
        E.j("no success or failure set on method implementation", zzaexVar.zzu);
    }

    public static /* synthetic */ void zza(zzaex zzaexVar, Status status) {
        InterfaceC1025m interfaceC1025m = zzaexVar.zzf;
        if (interfaceC1025m != null) {
            interfaceC1025m.zza(status);
        }
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }
}
