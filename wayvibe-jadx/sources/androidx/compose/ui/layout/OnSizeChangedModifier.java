package androidx.compose.ui.layout;

import D0.T;
import F0.AbstractC0382a0;
import G0.K0;
import Z8.c;
import com.apple.android.music.playback.model.MediaPlayerException;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
final class OnSizeChangedModifier extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14836a;

    public OnSizeChangedModifier(c cVar) {
        this.f14836a = cVar;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        T t10 = new T();
        t10.f1758a = this.f14836a;
        t10.f1759b = p025b9.a.f(MediaPlayerException.ERROR_UNKNOWN, MediaPlayerException.ERROR_UNKNOWN);
        return t10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f14836a == ((OnSizeChangedModifier) obj).f14836a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14836a.hashCode();
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
        k10.f5040a = "onSizeChanged";
        k10.f5042c.c(this.f14836a, "onSizeChanged");
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        T t10 = (T) qVar;
        t10.f1758a = this.f14836a;
        t10.f1759b = p025b9.a.f(MediaPlayerException.ERROR_UNKNOWN, MediaPlayerException.ERROR_UNKNOWN);
    }
}
