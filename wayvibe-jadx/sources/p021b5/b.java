package p021b5;

import M8.D;
import Q8.g;
import Z8.c;
import com.apple.android.music.playback.controller.MediaPlayerController;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import d9.d;
import kotlin.jvm.internal.m;
import p119k9.AbstractC2040y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15766a;

    public /* synthetic */ b(int i10) {
        this.f15766a = i10;
    }

    @Override // Z8.c
    public final Object invoke(Object it) {
        switch (this.f15766a) {
            case 0:
                return D.f8402a;
            case 1:
                MediaPlayerController controller = (MediaPlayerController) it;
                m.f(controller, "controller");
                controller.pause();
                return D.f8402a;
            case 2:
                MediaPlayerController controller2 = (MediaPlayerController) it;
                m.f(controller2, "controller");
                controller2.play();
                return D.f8402a;
            case 3:
                MediaPlayerController controller3 = (MediaPlayerController) it;
                m.f(controller3, "controller");
                controller3.stop();
                return D.f8402a;
            case 4:
                MediaPlayerController controller4 = (MediaPlayerController) it;
                m.f(controller4, "controller");
                controller4.skipToNextItem();
                return D.f8402a;
            case 5:
                MediaPlayerController controller5 = (MediaPlayerController) it;
                m.f(controller5, "controller");
                controller5.skipToPreviousItem();
                return D.f8402a;
            case 6:
                m.f(it, "it");
                return Integer.valueOf(d.f19430b.g(2147418112) + ETagPayloadStore.CHUNK_CHARS);
            case 7:
                return Boolean.valueOf(it == null);
            default:
                g gVar = (g) it;
                if (gVar instanceof AbstractC2040y) {
                    return (AbstractC2040y) gVar;
                }
                return null;
        }
    }
}
