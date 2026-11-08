package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    final ArrayList<C1042l> mCompatQueue;
    q mCompatWorkEnqueuer;
    AsyncTaskC1039i mCurProcessor;
    InterfaceC1040j mJobImpl;
    static final Object sLock = new Object();
    static final HashMap<ComponentName, q> sClassWorkEnqueuer = new HashMap<>();
    boolean mInterruptIfStopped = false;
    boolean mStopped = false;
    boolean mDestroyed = false;

    public r() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
        } else {
            this.mCompatQueue = new ArrayList<>();
        }
    }

    public static void enqueueWork(Context context, Class<?> cls, int i10, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i10, intent);
    }

    public static q getWorkEnqueuer(Context context, ComponentName componentName, boolean z10, int i10) {
        q c1041k;
        HashMap<ComponentName, q> map = sClassWorkEnqueuer;
        q qVar = map.get(componentName);
        if (qVar != null) {
            return qVar;
        }
        if (Build.VERSION.SDK_INT < 26) {
            c1041k = new C1041k(context, componentName);
        } else {
            if (!z10) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            c1041k = new p(context, componentName, i10);
        }
        map.put(componentName, c1041k);
        return c1041k;
    }

    public m dequeueWork() {
        InterfaceC1040j interfaceC1040j = this.mJobImpl;
        if (interfaceC1040j == null) {
            synchronized (this.mCompatQueue) {
                try {
                    if (this.mCompatQueue.size() <= 0) {
                        return null;
                    }
                    return this.mCompatQueue.remove(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        o oVar = (o) interfaceC1040j;
        synchronized (oVar.f14942b) {
            try {
                JobParameters jobParameters = oVar.f14943c;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                if (jobWorkItemDequeueWork == null) {
                    return null;
                }
                jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(oVar.f14941a.getClassLoader());
                return new n(oVar, jobWorkItemDequeueWork);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean doStopCurrentWork() {
        AsyncTaskC1039i asyncTaskC1039i = this.mCurProcessor;
        if (asyncTaskC1039i != null) {
            asyncTaskC1039i.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void ensureProcessorRunningLocked(boolean z10) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new AsyncTaskC1039i(this);
            q qVar = this.mCompatWorkEnqueuer;
            if (qVar != null && z10) {
                qVar.d();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        InterfaceC1040j interfaceC1040j = this.mJobImpl;
        if (interfaceC1040j != null) {
            return ((o) interfaceC1040j).getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mJobImpl = new o(this);
            this.mCompatWorkEnqueuer = null;
        } else {
            this.mJobImpl = null;
            this.mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<C1042l> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.c();
            }
        }
    }

    public abstract void onHandleWork(Intent intent);

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.e();
        synchronized (this.mCompatQueue) {
            ArrayList<C1042l> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C1042l(this, intent, i11));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    public void processorFinished() {
        ArrayList<C1042l> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mCurProcessor = null;
                    ArrayList<C1042l> arrayList2 = this.mCompatQueue;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        ensureProcessorRunningLocked(false);
                    } else if (!this.mDestroyed) {
                        this.mCompatWorkEnqueuer.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z10) {
        this.mInterruptIfStopped = z10;
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i10, Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (sLock) {
            q workEnqueuer = getWorkEnqueuer(context, componentName, true, i10);
            workEnqueuer.b(i10);
            workEnqueuer.a(intent);
        }
    }
}
