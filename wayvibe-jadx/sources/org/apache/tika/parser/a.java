package org.apache.tika.parser;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import org.apache.tika.utils.ProcessUtils;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24607a;

    public /* synthetic */ a(int i10) {
        this.f24607a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24607a) {
            case 0:
                AbstractExternalProcessParser.lambda$static$0();
                break;
            case 1:
                ProcessUtils.lambda$static$0();
                break;
            default:
                int i10 = AlarmManagerSchedulerBroadcastReceiver.f17695a;
                break;
        }
    }
}
