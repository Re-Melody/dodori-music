package F2;

import B2.AbstractC0111a;
import B2.AbstractC0112b;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import p255y2.C2329e;

/* JADX INFO: renamed from: F2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0411d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f4071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0410c f4072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C f4073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2329e f4074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f4077g = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f4078h;

    public C0411d(Context context, Handler handler, C c3) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f4071a = audioManager;
        this.f4073c = c3;
        this.f4072b = new C0410c(this, handler);
        this.f4075e = 0;
    }

    public final void a() {
        int i10 = this.f4075e;
        if (i10 == 1 || i10 == 0) {
            return;
        }
        int i11 = B2.C.f560a;
        AudioManager audioManager = this.f4071a;
        if (i11 < 26) {
            audioManager.abandonAudioFocus(this.f4072b);
            return;
        }
        AudioFocusRequest audioFocusRequest = this.f4078h;
        if (audioFocusRequest != null) {
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    public final void b(C2329e c2329e) {
        int i10;
        if (B2.C.a(this.f4074d, c2329e)) {
            return;
        }
        this.f4074d = c2329e;
        if (c2329e != null) {
            i10 = 3;
            int i11 = c2329e.f28872c;
            switch (i11) {
                case 0:
                    AbstractC0111a.x("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                    i10 = 1;
                    break;
                case 1:
                case 14:
                    i10 = 1;
                    break;
                case 2:
                case 4:
                    i10 = 2;
                    break;
                case 3:
                    i10 = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                    break;
                case 11:
                    if (c2329e.f28870a == 1) {
                        i10 = 2;
                    }
                    break;
                case 15:
                default:
                    AbstractC0112b.r(i11, "Unidentified audio usage: ", "AudioFocusManager");
                    i10 = 0;
                    break;
                case 16:
                    i10 = 4;
                    break;
            }
        } else {
            i10 = 0;
        }
        this.f4076f = i10;
        AbstractC0111a.c("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i10 == 1 || i10 == 0);
    }

    public final void c(int i10) {
        if (this.f4075e == i10) {
            return;
        }
        this.f4075e = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f4077g == f10) {
            return;
        }
        this.f4077g = f10;
        C c3 = this.f4073c;
        if (c3 != null) {
            F f11 = c3.f3862a;
            f11.G(1, Float.valueOf(f11.f3885S * f11.f3915x.f4077g), 2);
        }
    }

    public final int d(int i10, boolean z10) {
        int iRequestAudioFocus;
        AudioFocusRequest.Builder builderJ;
        int i11 = 0;
        z = false;
        boolean z11 = false;
        if (i10 == 1 || this.f4076f != 1) {
            a();
            c(0);
            return 1;
        }
        if (!z10) {
            int i12 = this.f4075e;
            if (i12 == 1) {
                return -1;
            }
            if (i12 == 3) {
                return 0;
            }
        } else if (this.f4075e != 2) {
            int i13 = B2.C.f560a;
            AudioManager audioManager = this.f4071a;
            C0410c c0410c = this.f4072b;
            if (i13 >= 26) {
                AudioFocusRequest audioFocusRequest = this.f4078h;
                if (audioFocusRequest == null) {
                    if (audioFocusRequest == null) {
                        E9.z.q();
                        builderJ = E9.z.e(this.f4076f);
                    } else {
                        E9.z.q();
                        builderJ = E9.z.j(this.f4078h);
                    }
                    C2329e c2329e = this.f4074d;
                    if (c2329e != null && c2329e.f28870a == 1) {
                        z11 = true;
                    }
                    c2329e.getClass();
                    this.f4078h = builderJ.setAudioAttributes((AudioAttributes) c2329e.a().f24715a).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(c0410c).build();
                }
                iRequestAudioFocus = audioManager.requestAudioFocus(this.f4078h);
            } else {
                C2329e c2329e2 = this.f4074d;
                c2329e2.getClass();
                int i14 = c2329e2.f28872c;
                if (i14 != 13) {
                    switch (i14) {
                        case 2:
                            break;
                        case 3:
                            i11 = 8;
                            break;
                        case 4:
                            i11 = 4;
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i11 = 5;
                            break;
                        case 6:
                            i11 = 2;
                            break;
                        default:
                            i11 = 3;
                            break;
                    }
                } else {
                    i11 = 1;
                }
                iRequestAudioFocus = audioManager.requestAudioFocus(c0410c, i11, this.f4076f);
            }
            if (iRequestAudioFocus == 1) {
                c(2);
                return 1;
            }
            c(1);
            return -1;
        }
        return 1;
    }
}
