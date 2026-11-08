package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import p248x6.B;

/* JADX INFO: loaded from: classes.dex */
final class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final p248x6.d f18263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p248x6.y f18264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final at f18266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f18267e;

    public aj(Context context, p248x6.y yVar, at atVar, k kVar) {
        this.f18265c = context.getPackageName();
        this.f18264b = yVar;
        this.f18266d = atVar;
        this.f18267e = kVar;
        p248x6.y yVar2 = p248x6.f.f28620a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled && p248x6.f.a(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                this.f18263a = new p248x6.d(context, yVar, "IntegrityService", ak.f18268a, new B() { // from class: com.google.android.play.core.integrity.ae
                    @Override // p248x6.B
                    public final Object a(IBinder iBinder) {
                        int i10 = p248x6.s.f28628g;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                        return iInterfaceQueryLocalInterface instanceof p248x6.t ? (p248x6.t) iInterfaceQueryLocalInterface : new p248x6.r(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
                    }
                });
                return;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Object[] objArr = new Object[0];
        yVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", p248x6.y.c(yVar.f28629a, "Phonesky is not installed.", objArr));
        }
        this.f18263a = null;
    }

    public static Bundle a(aj ajVar, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f18265c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p248x6.l(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(p240w9.i.b(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.f18263a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i10 = bundle.getInt("dialog.intent.type");
        this.f18264b.b("requestAndShowDialog(%s, %s)", this.f18265c, Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f18263a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i10), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f18263a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.f18264b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f18263a.c(new af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e2) {
            return Tasks.forException(new IntegrityServiceException(-13, e2));
        }
    }
}
