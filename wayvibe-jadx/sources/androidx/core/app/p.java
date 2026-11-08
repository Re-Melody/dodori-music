package androidx.core.app;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class p extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JobInfo f14944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JobScheduler f14945e;

    public p(Context context, ComponentName componentName, int i10) {
        super(componentName);
        b(i10);
        this.f14944d = new JobInfo.Builder(i10, componentName).setOverrideDeadline(0L).build();
        this.f14945e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }

    @Override // androidx.core.app.q
    public final void a(Intent intent) {
        this.f14945e.enqueue(this.f14944d, X2.i.e(intent));
    }
}
