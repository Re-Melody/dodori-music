package p009a5;

import M8.D;
import M8.n;
import M8.o;
import Z8.c;
import android.util.Log;
import com.apple.android.music.playback.controller.MediaPlayerController;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14156b;

    public /* synthetic */ j(int i10, long j10) {
        this.f14155a = i10;
        this.f14156b = j10;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f14155a) {
            case 0:
                if (((o) obj).f8416a instanceof n) {
                    Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + this.f14156b);
                }
                break;
            default:
                MediaPlayerController controller = (MediaPlayerController) obj;
                m.f(controller, "controller");
                controller.seekToPosition(this.f14156b);
                break;
        }
        return D.f8402a;
    }
}
