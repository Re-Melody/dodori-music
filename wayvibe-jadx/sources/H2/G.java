package H2;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioTrack f5783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0540j f5784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F f5785c = new AudioRouting.OnRoutingChangedListener() { // from class: H2.F
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            this.f5782a.b(audioRouting);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [H2.F] */
    public G(AudioTrack audioTrack, C0540j c0540j) {
        this.f5783a = audioTrack;
        this.f5784b = c0540j;
        audioTrack.addOnRoutingChangedListener(this.f5785c, new Handler(Looper.myLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AudioRouting audioRouting) {
        if (this.f5785c == null || audioRouting.getRoutedDevice() == null) {
            return;
        }
        this.f5784b.b(audioRouting.getRoutedDevice());
    }

    public void c() {
        F f10 = this.f5785c;
        f10.getClass();
        this.f5783a.removeOnRoutingChangedListener(f10);
        this.f5785c = null;
    }
}
