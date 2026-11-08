package android.support.v4.media.session;

import D7.W;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Binder implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f14382a;

    public g(U7.g gVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f14382a = new WeakReference(gVar);
    }

    @Override // android.support.v4.media.session.b
    public final void B(boolean z10) {
        U7.g gVar = (U7.g) this.f14382a.get();
        if (gVar != null) {
            gVar.a(11, Boolean.valueOf(z10), null);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void G(CharSequence charSequence) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void I() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void K(MediaMetadataCompat mediaMetadataCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void T(int i10) {
        U7.g gVar = (U7.g) this.f14382a.get();
        if (gVar != null) {
            gVar.a(12, Integer.valueOf(i10), null);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void a(int i10) {
        U7.g gVar = (U7.g) this.f14382a.get();
        if (gVar != null) {
            gVar.a(9, Integer.valueOf(i10), null);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void h0(PlaybackStateCompat playbackStateCompat) {
        U7.g gVar = (U7.g) this.f14382a.get();
        if (gVar != null) {
            gVar.a(2, playbackStateCompat, null);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void i(Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void j0(ParcelableVolumeInfo parcelableVolumeInfo) {
        throw new AssertionError();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.f14382a;
        switch (i10) {
            case 1:
                String string = parcel.readString();
                Bundle bundle = (Bundle) W.d(parcel, Bundle.CREATOR);
                U7.g gVar = (U7.g) weakReference.get();
                if (gVar != null) {
                    gVar.a(1, string, bundle);
                }
                return true;
            case 2:
                I();
                return true;
            case 3:
                h0((PlaybackStateCompat) W.d(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                K((MediaMetadataCompat) W.d(parcel, MediaMetadataCompat.CREATOR));
                return true;
            case 5:
                q(parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                return true;
            case 6:
                G((CharSequence) W.d(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                return true;
            case 7:
                i((Bundle) W.d(parcel, Bundle.CREATOR));
                return true;
            case 8:
                j0((ParcelableVolumeInfo) W.d(parcel, ParcelableVolumeInfo.CREATOR));
                return true;
            case 9:
                a(parcel.readInt());
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                B(parcel.readInt() != 0);
                return true;
            case 12:
                T(parcel.readInt());
                return true;
            case 13:
                U7.g gVar2 = (U7.g) weakReference.get();
                if (gVar2 != null) {
                    gVar2.a(13, null, null);
                    return true;
                }
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void q(List list) {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
