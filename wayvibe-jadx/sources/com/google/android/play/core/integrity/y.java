package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes.dex */
abstract class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f18372c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f18374e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p248x6.y f18370a = new p248x6.y("IntegrityDialogWrapper");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f18373d = new Object();

    public y(String str, long j10) {
        this.f18371b = str;
        this.f18372c = j10;
    }

    public final Task a(Activity activity, int i10) {
        synchronized (this.f18373d) {
            try {
                if (this.f18374e) {
                    return Tasks.forResult(0);
                }
                this.f18374e = true;
                p248x6.y yVar = this.f18370a;
                Object[] objArr = {Integer.valueOf(i10)};
                yVar.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", p248x6.y.c(yVar.f28629a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i10);
                bundle.putString("package.name", this.f18371b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f18372c);
                return b(activity, bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
