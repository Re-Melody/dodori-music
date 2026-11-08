package p109ja;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.v;
import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import kotlin.jvm.internal.m;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new v(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f21536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LatLng f21537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LatLng f21538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LatLng f21539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LatLngBounds f21540e;

    public d(Parcel parcel) {
        if (Build.VERSION.SDK_INT > 33) {
            this.f21536a = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader(), LatLng.class);
            this.f21537b = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader(), LatLng.class);
            this.f21538c = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader(), LatLng.class);
            this.f21539d = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader(), LatLng.class);
            Object parcelable = parcel.readParcelable(LatLngBounds.class.getClassLoader(), LatLngBounds.class);
            m.c(parcelable);
            this.f21540e = (LatLngBounds) parcelable;
            return;
        }
        this.f21536a = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.f21537b = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.f21538c = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.f21539d = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        Parcelable parcelable2 = parcel.readParcelable(LatLngBounds.class.getClassLoader());
        m.c(parcelable2);
        this.f21540e = (LatLngBounds) parcelable2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        d dVar = (d) obj;
        return m.b(this.f21536a, dVar.f21536a) && m.b(this.f21537b, dVar.f21537b) && m.b(this.f21538c, dVar.f21538c) && m.b(this.f21539d, dVar.f21539d) && m.b(this.f21540e, dVar.f21540e);
    }

    public final int hashCode() {
        LatLng latLng = this.f21536a;
        int iHashCode = (latLng != null ? latLng.hashCode() : 0) + 90;
        LatLng latLng2 = this.f21537b;
        int iHashCode2 = (((latLng2 != null ? latLng2.hashCode() : 0) + 90) * PipesIterator.DEFAULT_QUEUE_SIZE) + iHashCode;
        LatLng latLng3 = this.f21538c;
        int iHashCode3 = (((latLng3 != null ? latLng3.hashCode() : 0) + SensibleDefaults.X_OFFSET) * 1000000) + iHashCode2;
        LatLng latLng4 = this.f21539d;
        return (((latLng4 != null ? latLng4.hashCode() : 0) + SensibleDefaults.X_OFFSET) * 1000000000) + iHashCode3;
    }

    public final String toString() {
        return "[farLeft [" + this.f21536a + "], farRight [" + this.f21537b + "], nearLeft [" + this.f21538c + "], nearRight [" + this.f21539d + "], latLngBounds [" + this.f21540e + "]]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        m.f(out, "out");
        out.writeParcelable(this.f21536a, i10);
        out.writeParcelable(this.f21537b, i10);
        out.writeParcelable(this.f21538c, i10);
        out.writeParcelable(this.f21539d, i10);
        out.writeParcelable(this.f21540e, i10);
    }

    public d(LatLng farLeft, LatLng farRight, LatLng nearLeft, LatLng nearRight, LatLngBounds latLngBounds) {
        m.f(farLeft, "farLeft");
        m.f(farRight, "farRight");
        m.f(nearLeft, "nearLeft");
        m.f(nearRight, "nearRight");
        m.f(latLngBounds, "latLngBounds");
        this.f21536a = farLeft;
        this.f21537b = farRight;
        this.f21538c = nearLeft;
        this.f21539d = nearRight;
        this.f21540e = latLngBounds;
    }
}
