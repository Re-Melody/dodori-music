package com.google.android.play.core.integrity;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class be extends p248x6.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f18302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f18303b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f18303b = bnVar;
        this.f18302a = context;
    }

    @Override // p248x6.z
    public final void b() {
        int i10;
        Context context = this.f18302a;
        TaskCompletionSource taskCompletionSource = this.f18303b.f18329d;
        p248x6.y yVar = p248x6.f.f28620a;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            i10 = (applicationInfo != null && applicationInfo.enabled && p248x6.f.a(packageInfo.signatures)) ? packageInfo.versionCode : 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        taskCompletionSource.trySetResult(Integer.valueOf(i10));
    }
}
