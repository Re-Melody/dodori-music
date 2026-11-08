package P7;

import java.util.HashMap;
import p150n8.o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f9756b;

    public /* synthetic */ f(o oVar, int i10) {
        this.f9755a = i10;
        this.f9756b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9755a) {
            case 0:
                this.f9756b.c();
                break;
            case 1:
                this.f9756b.b(null);
                break;
            case 2:
                this.f9756b.b(null);
                break;
            case 3:
                this.f9756b.b(new HashMap());
                break;
            case 4:
                this.f9756b.b(new HashMap());
                break;
            case 5:
                this.f9756b.b(new HashMap());
                break;
            case 6:
                this.f9756b.d(null, "apple_music_command_failed", "Apple Music is not responding. Please try again.");
                break;
            case 7:
                this.f9756b.d(null, "apple_music_track_unavailable", "This Apple Music track is unavailable.");
                break;
            case 8:
                this.f9756b.d(null, "apple_music_api_unavailable", "Apple Music could not load right now. Please try again.");
                break;
            case 9:
                this.f9756b.d(null, "apple_music_token_unavailable", "WayVibe couldn't get a MusicKit developer token. Check that the Apple Music token service is configured and reachable.");
                break;
            case 10:
                this.f9756b.b(null);
                break;
            case 11:
                this.f9756b.d(null, "apple_music_missing_start", "Apple Music could not find the selected starting track in the queue.");
                break;
            case 12:
                this.f9756b.b(null);
                break;
            case 13:
                this.f9756b.b(null);
                break;
            case 14:
                this.f9756b.d(null, "apple_music_playback_failed", "Apple Music playback could not start.");
                break;
            case 15:
                this.f9756b.d(null, "apple_music_auth_rejected", "Apple Music rejected WayVibe’s saved credentials. Reconnect Apple Music and try again.");
                break;
            case 16:
                this.f9756b.d(null, "apple_music_warmup_failed", "Apple Music is not ready yet.");
                break;
            case 17:
                this.f9756b.d(null, "apple_music_api_unavailable", "Apple Music could not load right now. Please try again.");
                break;
            default:
                this.f9756b.d(null, "decode_failed", "Audio could not be decoded");
                break;
        }
    }
}
