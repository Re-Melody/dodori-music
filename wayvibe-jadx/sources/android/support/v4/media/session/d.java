package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface d extends IInterface {
    void A(long j10);

    void D(float f10);

    boolean E(KeyEvent keyEvent);

    void H(RatingCompat ratingCompat, Bundle bundle);

    void J(MediaDescriptionCompat mediaDescriptionCompat, int i10);

    String L();

    void N(boolean z10);

    void Q(int i10);

    boolean R();

    void V(Bundle bundle, String str);

    void W(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    List X();

    void Y();

    void Z(Bundle bundle, String str);

    void a0(long j10);

    void b(b bVar);

    ParcelableVolumeInfo b0();

    Bundle c0();

    void d(RatingCompat ratingCompat);

    void e(Bundle bundle, String str);

    void f(Uri uri, Bundle bundle);

    String f0();

    void g(MediaDescriptionCompat mediaDescriptionCompat);

    void g0(Bundle bundle, String str);

    PlaybackStateCompat getPlaybackState();

    int getRepeatMode();

    int getShuffleMode();

    void j();

    long k();

    boolean l();

    void m(MediaDescriptionCompat mediaDescriptionCompat);

    PendingIntent n();

    void next();

    void o();

    void p(int i10, int i11);

    void pause();

    void play();

    void previous();

    CharSequence r();

    void s(Bundle bundle, String str);

    void setRepeatMode(int i10);

    void setShuffleMode(int i10);

    void stop();

    MediaMetadataCompat t();

    Bundle u();

    void v(b bVar);

    void w(int i10, int i11);

    void x();

    void y(Uri uri, Bundle bundle);
}
