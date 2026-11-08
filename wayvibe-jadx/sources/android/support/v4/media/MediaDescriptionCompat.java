package android.support.v4.media;

import Z6.J;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.t;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new J(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f14316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f14317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f14318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f14319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f14320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f14321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f14322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaDescription f14323i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f14315a = str;
        this.f14316b = charSequence;
        this.f14317c = charSequence2;
        this.f14318d = charSequence3;
        this.f14319e = bitmap;
        this.f14320f = uri;
        this.f14321g = bundle;
        this.f14322h = uri2;
    }

    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle;
        if (obj == null) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        String strG = f.g(mediaDescription);
        CharSequence charSequenceI = f.i(mediaDescription);
        CharSequence charSequenceH = f.h(mediaDescription);
        CharSequence charSequenceC = f.c(mediaDescription);
        Bitmap bitmapE = f.e(mediaDescription);
        Uri uriF = f.f(mediaDescription);
        Bundle bundleD = f.d(mediaDescription);
        if (bundleD != null) {
            bundleD = t.u0(bundleD);
        }
        Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uriA == null) {
            bundle = bundleD;
        } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
            bundle = null;
        } else {
            bundleD.remove("android.support.v4.media.description.MEDIA_URI");
            bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleD;
        }
        if (uriA == null) {
            uriA = g.a(mediaDescription);
        }
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
        mediaDescriptionCompat.f14323i = mediaDescription;
        return mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MediaDescription g() {
        MediaDescription mediaDescription = this.f14323i;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builderB = f.b();
        f.n(builderB, this.f14315a);
        f.p(builderB, this.f14316b);
        f.o(builderB, this.f14317c);
        f.j(builderB, this.f14318d);
        f.l(builderB, this.f14319e);
        f.m(builderB, this.f14320f);
        f.k(builderB, this.f14321g);
        g.b(builderB, this.f14322h);
        MediaDescription mediaDescriptionA = f.a(builderB);
        this.f14323i = mediaDescriptionA;
        return mediaDescriptionA;
    }

    public final String toString() {
        return ((Object) this.f14316b) + ", " + ((Object) this.f14317c) + ", " + ((Object) this.f14318d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        g().writeToParcel(parcel, i10);
    }
}
