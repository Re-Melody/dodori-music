package H2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {
    public static void a(AudioTrack audioTrack, G2.m mVar) {
        G2.l lVar = mVar.f5425b;
        lVar.getClass();
        LogSessionId logSessionId = lVar.f5423a;
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId);
    }
}
