package Ja;

import B8.C0116c;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6744b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f6743a = i10;
        this.f6744b = obj;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        switch (this.f6743a) {
            case 0:
                ((b) this.f6744b).P(i10);
                break;
            case 1:
                ((b) this.f6744b).P(i10);
                break;
            default:
                C0116c c0116c = (C0116c) this.f6744b;
                if (i10 == -1) {
                    c0116c.a();
                }
                c0116c.k("onAudioFocusChanged", Integer.valueOf(i10));
                break;
        }
    }
}
