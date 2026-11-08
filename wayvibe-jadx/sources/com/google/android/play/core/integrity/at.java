package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class at {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p248x6.i f18287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p248x6.i f18288b;

    public at(p248x6.i iVar, p248x6.i iVar2) {
        this.f18287a = iVar;
        this.f18288b = iVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, p248x6.d dVar) {
        Object objA = this.f18287a.a();
        objA.getClass();
        k kVar = (k) this.f18288b.a();
        kVar.getClass();
        activity.getClass();
        dVar.getClass();
        return new as((Context) objA, kVar, activity, taskCompletionSource, dVar);
    }
}
