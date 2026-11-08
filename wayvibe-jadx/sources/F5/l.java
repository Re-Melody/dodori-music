package F5;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.A;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.C1134a;
import com.google.android.gms.common.api.internal.C1157y;
import com.google.android.gms.common.api.internal.J;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class l extends zbb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevocationBoundService f4548a;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.f4548a = revocationBoundService;
    }

    public final void O() {
        int callingUid = Binder.getCallingUid();
        RevocationBoundService revocationBoundService = this.f4548a;
        O2.h hVarA = Q5.c.a(revocationBoundService);
        hVarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) hVarA.f9063a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(callingUid, "com.google.android.gms");
            try {
                PackageInfo packageInfo = revocationBoundService.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                H5.j jVarC = H5.j.c(revocationBoundService);
                jVarC.getClass();
                if (packageInfo != null) {
                    if (H5.j.e(packageInfo, false)) {
                        return;
                    }
                    if (H5.j.e(packageInfo, true)) {
                        Context context = jVarC.f6050a;
                        try {
                            if (!H5.i.f6046c) {
                                PackageInfo packageInfo2 = Q5.c.a(context).f9063a.getPackageManager().getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                                H5.j.c(context);
                                if (packageInfo2 == null || H5.j.e(packageInfo2, false) || !H5.j.e(packageInfo2, true)) {
                                    H5.i.f6045b = false;
                                } else {
                                    H5.i.f6045b = true;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e2) {
                            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
                        } finally {
                            H5.i.f6046c = true;
                        }
                        if (H5.i.f6045b || !"user".equals(Build.TYPE)) {
                            return;
                        } else {
                            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
            int callingUid2 = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(String.valueOf(callingUid2).length() + 41);
            sb.append("Calling UID ");
            sb.append(callingUid2);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        } catch (SecurityException unused2) {
        }
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) throws JSONException {
        BasePendingResult basePendingResultDoWrite;
        BasePendingResult basePendingResultDoWrite2;
        String strD;
        int i12 = 25;
        RevocationBoundService revocationBoundService = this.f4548a;
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            O();
            i.E(revocationBoundService).F();
            return true;
        }
        O();
        b bVarA = b.a(revocationBoundService);
        GoogleSignInAccount googleSignInAccountB = bVarA.b();
        GoogleSignInOptions googleSignInOptionsA = GoogleSignInOptions.k;
        if (googleSignInAccountB != null) {
            String strD2 = bVarA.d("defaultGoogleSignInAccount");
            if (TextUtils.isEmpty(strD2) || (strD = bVarA.d(b.f("googleSignInOptions", strD2))) == null) {
                googleSignInOptionsA = null;
            } else {
                try {
                    googleSignInOptionsA = GoogleSignInOptions.a(strD);
                } catch (JSONException unused) {
                    googleSignInOptionsA = null;
                }
            }
        }
        GoogleSignInOptions googleSignInOptions = googleSignInOptionsA;
        E.h(googleSignInOptions);
        E5.a aVar = new E5.a(revocationBoundService, null, A5.a.f283a, googleSignInOptions, new m(new C1134a(), Looper.getMainLooper()));
        if (googleSignInAccountB != null) {
            q qVarAsGoogleApiClient = aVar.asGoogleApiClient();
            Context applicationContext = aVar.getApplicationContext();
            boolean z10 = aVar.c() == 3;
            h.f4544a.a("Revoking access", new Object[0]);
            String strD3 = b.a(applicationContext).d("refreshToken");
            h.a(applicationContext);
            if (!z10) {
                basePendingResultDoWrite2 = ((J) qVarAsGoogleApiClient).f17874b.doWrite(new g(qVarAsGoogleApiClient, 1));
            } else if (strD3 == null) {
                K5.a aVar2 = c.f4527c;
                Status status = new Status(4, null, null, null);
                E.a("Status code must not be SUCCESS", !status.u());
                basePendingResultDoWrite2 = new A(status);
                basePendingResultDoWrite2.setResult(status);
            } else {
                c cVar = new c(strD3);
                new Thread(cVar).start();
                basePendingResultDoWrite2 = cVar.f4529b;
            }
            p050e5.f fVar = new p050e5.f(i12);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            basePendingResultDoWrite2.addStatusListener(new z(basePendingResultDoWrite2, taskCompletionSource, fVar));
            taskCompletionSource.getTask();
        } else {
            q qVarAsGoogleApiClient2 = aVar.asGoogleApiClient();
            Context applicationContext2 = aVar.getApplicationContext();
            boolean z11 = aVar.c() == 3;
            h.f4544a.a("Signing out", new Object[0]);
            h.a(applicationContext2);
            if (z11) {
                Status status2 = Status.f17829e;
                basePendingResultDoWrite = new C1157y(qVarAsGoogleApiClient2);
                basePendingResultDoWrite.setResult(status2);
            } else {
                basePendingResultDoWrite = ((J) qVarAsGoogleApiClient2).f17874b.doWrite(new g(qVarAsGoogleApiClient2, 0));
            }
            p050e5.f fVar2 = new p050e5.f(i12);
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            basePendingResultDoWrite.addStatusListener(new z(basePendingResultDoWrite, taskCompletionSource2, fVar2));
            taskCompletionSource2.getTask();
        }
        return true;
    }
}
