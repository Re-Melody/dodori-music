package androidx.core.app;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;

/* JADX INFO: loaded from: classes.dex */
public final class o extends JobServiceEngine implements InterfaceC1040j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f14941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JobParameters f14943c;

    public o(r rVar) {
        super(rVar);
        this.f14942b = new Object();
        this.f14941a = rVar;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        this.f14943c = jobParameters;
        this.f14941a.ensureProcessorRunningLocked(false);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zDoStopCurrentWork = this.f14941a.doStopCurrentWork();
        synchronized (this.f14942b) {
            this.f14943c = null;
        }
        return zDoStopCurrentWork;
    }
}
