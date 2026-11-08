package android.support.v4.media;

import Z6.J;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new J(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Parcelable f14333c;

    public RatingCompat(int i10, float f10) {
        this.f14331a = i10;
        this.f14332b = f10;
    }

    public static RatingCompat a(Parcelable parcelable) {
        RatingCompat ratingCompat;
        RatingCompat ratingCompat2 = null;
        if (parcelable != null) {
            Rating rating = (Rating) parcelable;
            int iB = h.b(rating);
            if (!h.e(rating)) {
                switch (iB) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat2 = new RatingCompat(iB, -1.0f);
                        break;
                }
            } else {
                switch (iB) {
                    case 1:
                        ratingCompat = new RatingCompat(1, h.d(rating) ? 1.0f : 0.0f);
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, h.f(rating) ? 1.0f : 0.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat2 = c(h.c(rating), iB);
                        break;
                    case 6:
                        ratingCompat2 = b(h.a(rating));
                        break;
                }
                ratingCompat2 = ratingCompat;
            }
            ratingCompat2.f14333c = parcelable;
        }
        return ratingCompat2;
    }

    public static RatingCompat b(float f10) {
        if (f10 >= 0.0f && f10 <= 100.0f) {
            return new RatingCompat(6, f10);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat c(float f10, int i10) {
        float f11;
        if (i10 == 3) {
            f11 = 3.0f;
        } else if (i10 == 4) {
            f11 = 4.0f;
        } else {
            if (i10 != 5) {
                Log.e("Rating", "Invalid rating style (" + i10 + ") for a star rating");
                return null;
            }
            f11 = 5.0f;
        }
        if (f10 >= 0.0f && f10 <= f11) {
            return new RatingCompat(i10, f10);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f14331a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f14331a);
        sb.append(" rating=");
        float f10 = this.f14332b;
        sb.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14331a);
        parcel.writeFloat(this.f14332b);
    }
}
