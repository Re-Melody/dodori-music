package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {
    void B(boolean z10);

    void G(CharSequence charSequence);

    void I();

    void K(MediaMetadataCompat mediaMetadataCompat);

    void T(int i10);

    void a(int i10);

    void h0(PlaybackStateCompat playbackStateCompat);

    void i(Bundle bundle);

    void j0(ParcelableVolumeInfo parcelableVolumeInfo);

    void q(List list);
}
