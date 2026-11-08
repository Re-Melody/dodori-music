package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p119k9.I;

/* JADX INFO: loaded from: classes.dex */
public final class zzas {
    public static final Task zza(I i10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        i10.invokeOnCompletion(new zzar(taskCompletionSource, i10));
        return taskCompletionSource.getTask();
    }
}
