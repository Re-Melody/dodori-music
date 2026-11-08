package com.google.android.gms.internal.p002firebaseauthapi;

import K5.a;
import Q5.c;
import V0.p;
import Z6.t;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.internal.p001authapiphone.zzab;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
final class zzafu {
    private static final a zza = new a("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final HashMap<String, zzagb> zzd = new HashMap<>();

    public zzafu(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(String str) {
        zzagb zzagbVar = this.zzd.get(str);
        if (zzagbVar == null) {
            return;
        }
        if (!zzagbVar.zzi) {
            zzd(str);
        }
        zzb(str);
    }

    public final String zzb() {
        try {
            String packageName = this.zzb.getPackageName();
            String strZza = zza(packageName, (Build.VERSION.SDK_INT < 28 ? c.a(this.zzb).f9063a.getPackageManager().getPackageInfo(packageName, 64).signatures : c.a(this.zzb).f9063a.getPackageManager().getPackageInfo(packageName, 134217728).signingInfo.getApkContentsSigners())[0].toCharsString());
            if (strZza != null) {
                return strZza;
            }
            zza.c("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.c("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(String str) {
        zzagb zzagbVar = this.zzd.get(str);
        if (zzagbVar == null || zzagbVar.zzh || zzae.zzc(zzagbVar.zzd)) {
            return;
        }
        zza.f("Timed out waiting for SMS.", new Object[0]);
        Iterator<zzaeg> it = zzagbVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(zzagbVar.zzd);
        }
        zzagbVar.zzi = true;
    }

    public final boolean zzc(String str) {
        return this.zzd.get(str) != null;
    }

    public final zzaeg zza(zzaeg zzaegVar, String str) {
        return new zzafz(this, zzaegVar, str);
    }

    public static String zza(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private static String zza(String str, String str2) {
        String strB = p.B(str, StringUtils.SPACE, str2);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(strB.getBytes(StandardCharsets.UTF_8));
            String strSubstring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            zza.a("Package: " + str + " -- Hash: " + strSubstring, new Object[0]);
            return strSubstring;
        } catch (NoSuchAlgorithmException e2) {
            zza.c(b.k("NoSuchAlgorithm: ", e2.getMessage()), new Object[0]);
            return null;
        }
    }

    public static /* synthetic */ void zzb(zzafu zzafuVar, String str) {
        zzagb zzagbVar = zzafuVar.zzd.get(str);
        if (zzagbVar == null || zzae.zzc(zzagbVar.zzd) || zzae.zzc(zzagbVar.zze) || zzagbVar.zzb.isEmpty()) {
            return;
        }
        Iterator<zzaeg> it = zzagbVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(t.y(zzagbVar.zzd, zzagbVar.zze));
        }
        zzagbVar.zzh = true;
    }

    public final void zzb(zzaeg zzaegVar, String str) {
        zzagb zzagbVar = this.zzd.get(str);
        if (zzagbVar == null) {
            return;
        }
        zzagbVar.zzb.add(zzaegVar);
        if (zzagbVar.zzg) {
            zzaegVar.zzb(zzagbVar.zzd);
        }
        if (zzagbVar.zzh) {
            zzaegVar.zza(t.y(zzagbVar.zzd, zzagbVar.zze));
        }
        if (zzagbVar.zzi) {
            zzaegVar.zza(zzagbVar.zzd);
        }
    }

    public final void zza(final String str, zzaeg zzaegVar, long j10, boolean z10) {
        this.zzd.put(str, new zzagb(j10, z10));
        zzb(zzaegVar, str);
        zzagb zzagbVar = this.zzd.get(str);
        if (zzagbVar.zza <= 0) {
            zza.f("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzagbVar.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzafx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze(str);
            }
        }, zzagbVar.zza, TimeUnit.SECONDS);
        if (!zzagbVar.zzc) {
            zza.f("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzafy zzafyVar = new zzafy(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        p254y1.a.registerReceiver(this.zzb.getApplicationContext(), zzafyVar, intentFilter, 2);
        new zzab(this.zzb).startSmsRetriever().addOnFailureListener(new zzafw(this));
    }

    public final void zzb(String str) {
        zzagb zzagbVar = this.zzd.get(str);
        if (zzagbVar == null) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = zzagbVar.zzf;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            zzagbVar.zzf.cancel(false);
        }
        zzagbVar.zzb.clear();
        this.zzd.remove(str);
    }
}
