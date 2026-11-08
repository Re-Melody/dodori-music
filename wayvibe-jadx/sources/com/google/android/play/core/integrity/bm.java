package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
abstract class bm extends p248x6.z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ bn f18325f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f18325f = bnVar;
    }

    @Override // p248x6.z
    public final void a(Exception exc) {
        if (!(exc instanceof p248x6.e)) {
            super.a(exc);
        } else if (bn.k(this.f18325f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
