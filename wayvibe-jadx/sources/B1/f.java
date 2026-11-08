package B1;

import android.graphics.fonts.Font;
import android.location.LocationRequest;
import android.media.metrics.NetworkEvent;
import android.media.metrics.TrackChangeEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ Font.Builder d(Font font) {
        return new Font.Builder(font);
    }

    public static /* bridge */ /* synthetic */ LocationRequest g(Object obj) {
        return (LocationRequest) obj;
    }

    public static /* synthetic */ NetworkEvent.Builder i() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder l(int i10) {
        return new TrackChangeEvent.Builder(i10);
    }
}
