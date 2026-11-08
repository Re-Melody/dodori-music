package Z4;

import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzap;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zziy;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzjb;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjf;
import com.google.android.gms.internal.play_billing.zzkl;
import com.google.android.gms.internal.play_billing.zzkn;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13667b;

    public /* synthetic */ G(Object obj, int i10) {
        this.f13666a = i10;
        this.f13667b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x014d A[Catch: Exception -> 0x00b9, TryCatch #3 {Exception -> 0x00b9, blocks: (B:39:0x0099, B:41:0x00b1, B:47:0x00c5, B:54:0x00e7, B:58:0x00ee, B:60:0x00f2, B:63:0x00ff, B:65:0x0117, B:69:0x0128, B:70:0x0141, B:67:0x011f, B:71:0x0144, B:73:0x014d, B:74:0x0156, B:48:0x00dc, B:45:0x00bc), top: B:129:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x015b  */
    /* JADX WARN: Code duplicated, block: B:79:0x016b A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:77:0x0165, B:79:0x016b, B:83:0x017e, B:85:0x0189, B:88:0x0193, B:89:0x01a2, B:91:0x01b5, B:92:0x01bc), top: B:125:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x017b  */
    /* JADX WARN: Code duplicated, block: B:82:0x017d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0189 A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:77:0x0165, B:79:0x016b, B:83:0x017e, B:85:0x0189, B:88:0x0193, B:89:0x01a2, B:91:0x01b5, B:92:0x01bc), top: B:125:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01a2 A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:77:0x0165, B:79:0x016b, B:83:0x017e, B:85:0x0189, B:88:0x0193, B:89:0x01a2, B:91:0x01b5, B:92:0x01bc), top: B:125:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01b5 A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:77:0x0165, B:79:0x016b, B:83:0x017e, B:85:0x0189, B:88:0x0193, B:89:0x01a2, B:91:0x01b5, B:92:0x01bc), top: B:125:0x0165 }] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        zzap zzapVar;
        zzjd zzjdVar;
        Long lA;
        zzkl zzklVarZza;
        zzks zzksVarZza;
        int i10;
        boolean z10;
        switch (this.f13666a) {
            case 0:
                H h10 = (H) this.f13667b;
                C0970c c0970c = h10.f13672e;
                synchronized (c0970c.f13731a) {
                    try {
                        if (c0970c.f13732b != 3) {
                            boolean z11 = c0970c.f13732b == 1;
                            if (TextUtils.isEmpty(null)) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                zzc.zzc(bundle, c0970c.f13733c, c0970c.f13734d, c0970c.f13729F.longValue());
                            }
                            zzjd zzjdVar2 = zzjd.REASON_UNSPECIFIED;
                            synchronized (c0970c.f13731a) {
                                zzapVar = c0970c.f13739i;
                                break;
                            }
                            if (zzapVar == null) {
                                C0970c c0970c2 = h10.f13672e;
                                c0970c2.B(0);
                                int i11 = h10.f13671d;
                                zzjd zzjdVar3 = zzjd.SERVICE_RESET_TO_NULL;
                                C0976i c0976i = Q.f13704j;
                                c0970c2.A(i11, c0976i, zzjdVar3);
                                h10.c(c0976i);
                            } else {
                                C0970c c0970c3 = h10.f13672e;
                                String packageName = c0970c3.f13737g.getPackageName();
                                int iZzb = 3;
                                int i12 = 27;
                                while (true) {
                                    if (i12 >= 3) {
                                        try {
                                            zzc.zzn("BillingClient", "trying subs apiVersion: " + i12);
                                            iZzb = bundle == null ? zzapVar.zzb(i12, packageName, "subs") : zzapVar.zzc(i12, packageName, "subs", bundle);
                                            if (iZzb == 0) {
                                                zzc.zzn("BillingClient", "highestLevelSupportedForSubs: " + i12);
                                            } else {
                                                i12--;
                                            }
                                        } catch (Exception e2) {
                                            zzc.zzp("BillingClient", "Exception while checking if billing is supported; try to reconnect", e2);
                                            boolean z12 = e2 instanceof DeadObjectException;
                                            if (z12) {
                                                zzjdVar = zzjd.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION;
                                            } else if (e2 instanceof RemoteException) {
                                                zzjdVar = zzjd.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION;
                                            } else {
                                                zzjdVar = e2 instanceof SecurityException ? zzjd.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : zzjd.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
                                            }
                                            String strA = zzjdVar.equals(zzjd.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? O.a(e2) : null;
                                            h10.f13672e.B(0);
                                            h10.b(z12 ? Q.f13704j : Q.f13702h, zzjdVar, strA, z11);
                                            h10.c(z12 ? Q.f13704j : Q.f13702h);
                                        }
                                    } else {
                                        i12 = 0;
                                    }
                                }
                                c0970c3.f13741l = i12 >= 5;
                                c0970c3.k = i12 >= 3;
                                if (i12 < 3) {
                                    zzjdVar2 = zzjd.SUBSCRIPTIONS_NOT_SUPPORTED;
                                    zzc.zzn("BillingClient", "In-app billing API does not support subscription on this device.");
                                }
                                for (int i13 = 27; i13 >= 3; i13--) {
                                    zzc.zzn("BillingClient", "trying inapp apiVersion: " + i13);
                                    iZzb = bundle == null ? zzapVar.zzb(i13, packageName, "inapp") : zzapVar.zzc(i13, packageName, "inapp", bundle);
                                    if (iZzb == 0) {
                                        c0970c3.f13742m = i13;
                                        zzc.zzn("BillingClient", "mHighestLevelSupportedForInApp: " + i13);
                                        C0970c.q(c0970c3, c0970c3.f13742m);
                                        if (c0970c3.f13742m < 3) {
                                            zzjdVar2 = zzjd.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                                            zzc.zzo("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                        }
                                        C0970c.r(c0970c3, iZzb);
                                        if (iZzb != 0) {
                                            C0976i c0976i2 = Q.f13696b;
                                            h10.b(c0976i2, zzjdVar2, null, z11);
                                            h10.c(c0976i2);
                                        } else {
                                            try {
                                                lA = h10.a(z11);
                                                if (z11) {
                                                    zziy zziyVarZza = zzja.zza();
                                                    zziyVarZza.zze(6);
                                                    zzksVarZza = zzku.zza();
                                                    i10 = h10.f13671d;
                                                    if (i10 > 0) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    zzksVarZza.zza(z10);
                                                    zzksVarZza.zzb(i10);
                                                    zzksVarZza.zzd(0);
                                                    if (lA != null) {
                                                        zzksVarZza.zzc(lA.longValue());
                                                    }
                                                    C0970c c0970c4 = h10.f13672e;
                                                    zziyVarZza.zzd(zzksVarZza);
                                                    c0970c4.z((zzja) zziyVarZza.zzi());
                                                } else {
                                                    zzklVarZza = zzkn.zza();
                                                    zzjb zzjbVarZza = zzjf.zza();
                                                    zzjbVarZza.zzp(0);
                                                    zzjbVarZza.zzc(0);
                                                    zzklVarZza.zza(zzjbVarZza);
                                                    if (lA != null) {
                                                        zzklVarZza.zzb(lA.longValue());
                                                    }
                                                    h10.f13672e.f13738h.M((zzkn) zzklVarZza.zzi());
                                                }
                                            } catch (Throwable th) {
                                                zzc.zzp("BillingClient", "Unable to log.", th);
                                            }
                                            h10.c(Q.f13703i);
                                        }
                                    }
                                }
                                C0970c.q(c0970c3, c0970c3.f13742m);
                                if (c0970c3.f13742m < 3) {
                                    zzjdVar2 = zzjd.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                                    zzc.zzo("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                }
                                C0970c.r(c0970c3, iZzb);
                                if (iZzb != 0) {
                                    C0976i c0976i3 = Q.f13696b;
                                    h10.b(c0976i3, zzjdVar2, null, z11);
                                    h10.c(c0976i3);
                                } else {
                                    lA = h10.a(z11);
                                    if (z11) {
                                        zziy zziyVarZza2 = zzja.zza();
                                        zziyVarZza2.zze(6);
                                        zzksVarZza = zzku.zza();
                                        i10 = h10.f13671d;
                                        if (i10 > 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        zzksVarZza.zza(z10);
                                        zzksVarZza.zzb(i10);
                                        zzksVarZza.zzd(0);
                                        if (lA != null) {
                                            zzksVarZza.zzc(lA.longValue());
                                        }
                                        C0970c c0970c5 = h10.f13672e;
                                        zziyVarZza2.zzd(zzksVarZza);
                                        c0970c5.z((zzja) zziyVarZza2.zzi());
                                    } else {
                                        zzklVarZza = zzkn.zza();
                                        zzjb zzjbVarZza2 = zzjf.zza();
                                        zzjbVarZza2.zzp(0);
                                        zzjbVarZza2.zzc(0);
                                        zzklVarZza.zza(zzjbVarZza2);
                                        if (lA != null) {
                                            zzklVarZza.zzb(lA.longValue());
                                        }
                                        h10.f13672e.f13738h.M((zzkn) zzklVarZza.zzi());
                                    }
                                    h10.c(Q.f13703i);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return null;
            default:
                p202t2.a aVar = (p202t2.a) this.f13667b;
                aVar.f26693d.set(true);
                try {
                    Process.setThreadPriority(10);
                    aVar.f26694e.d();
                    Binder.flushPendingCommands();
                    aVar.a(null);
                    return null;
                } catch (Throwable th3) {
                    try {
                        aVar.f26692c.set(true);
                        throw th3;
                    } catch (Throwable th4) {
                        aVar.a(null);
                        throw th4;
                    }
                }
        }
    }
}
