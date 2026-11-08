package androidx.core.app;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JobWorkItem f14939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f14940b;

    public n(o oVar, JobWorkItem jobWorkItem) {
        this.f14940b = oVar;
        this.f14939a = jobWorkItem;
    }

    @Override // androidx.core.app.m
    public final void a() {
        synchronized (this.f14940b.f14942b) {
            try {
                JobParameters jobParameters = this.f14940b.f14943c;
                if (jobParameters != null) {
                    jobParameters.completeWork(this.f14939a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.core.app.m
    public final Intent getIntent() {
        return this.f14939a.getIntent();
    }
}
