package androidx.core.app;

import android.os.AsyncTask;

/* JADX INFO: renamed from: androidx.core.app.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC1039i extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f14930a;

    public AsyncTaskC1039i(r rVar) {
        this.f14930a = rVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        while (true) {
            r rVar = this.f14930a;
            m mVarDequeueWork = rVar.dequeueWork();
            if (mVarDequeueWork == null) {
                return null;
            }
            rVar.onHandleWork(mVarDequeueWork.getIntent());
            mVarDequeueWork.a();
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        this.f14930a.processorFinished();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.f14930a.processorFinished();
    }
}
