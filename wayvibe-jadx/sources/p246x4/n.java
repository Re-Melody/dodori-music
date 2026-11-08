package p246x4;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public final class n extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AudioTrack f28451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f28452b;

    public n(r rVar, AudioTrack audioTrack) {
        this.f28452b = rVar;
        this.f28451a = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        r rVar = this.f28452b;
        AudioTrack audioTrack = this.f28451a;
        try {
            audioTrack.flush();
            audioTrack.release();
        } finally {
            rVar.f28505f.open();
        }
    }
}
