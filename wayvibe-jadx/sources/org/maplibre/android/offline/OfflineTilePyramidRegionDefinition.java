package org.maplibre.android.offline;

import U.C0899m0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.m;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;

/* JADX INFO: loaded from: classes2.dex */
public final class OfflineTilePyramidRegionDefinition implements OfflineRegionDefinition {
    public static final Parcelable.Creator<?> CREATOR = new p146n3.b(25);

    @Keep
    private final LatLngBounds bounds;

    @Keep
    private boolean includeIdeographs;

    @Keep
    private double maxZoom;

    @Keep
    private double minZoom;

    @Keep
    private float pixelRatio;

    @Keep
    private String styleURL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public OfflineTilePyramidRegionDefinition(String str, LatLngBounds bounds, double d10, double d11, float f10) {
        this(str, bounds, d10, d11, f10, false);
        m.f(bounds, "bounds");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    public final LatLngBounds getBounds() {
        return this.bounds;
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    public final boolean getIncludeIdeographs() {
        return this.includeIdeographs;
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    public final double getMaxZoom() {
        return this.maxZoom;
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    public final double getMinZoom() {
        return this.minZoom;
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    public final float getPixelRatio() {
        return this.pixelRatio;
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    public final String getStyleURL() {
        return this.styleURL;
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    public final String getType() {
        return "tileregion";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        m.f(dest, "dest");
        dest.writeString(this.styleURL);
        LatLngBounds latLngBounds = this.bounds;
        if (latLngBounds != null) {
            dest.writeDouble(latLngBounds.latitudeNorth);
            dest.writeDouble(this.bounds.longitudeEast);
            dest.writeDouble(this.bounds.latitudeSouth);
            dest.writeDouble(this.bounds.longitudeWest);
        }
        dest.writeDouble(this.minZoom);
        dest.writeDouble(this.maxZoom);
        dest.writeFloat(this.pixelRatio);
        dest.writeByte(this.includeIdeographs ? (byte) 1 : (byte) 0);
    }

    @Keep
    public OfflineTilePyramidRegionDefinition(String str, LatLngBounds bounds, double d10, double d11, float f10, boolean z10) {
        m.f(bounds, "bounds");
        this.styleURL = str;
        this.bounds = bounds;
        this.minZoom = d10;
        this.maxZoom = d11;
        this.pixelRatio = f10;
        this.includeIdeographs = z10;
    }

    public OfflineTilePyramidRegionDefinition(Parcel parcel) {
        this.styleURL = parcel.readString();
        C0899m0 c0899m0 = new C0899m0(2);
        c0899m0.e(new LatLng(parcel.readDouble(), parcel.readDouble()));
        c0899m0.e(new LatLng(parcel.readDouble(), parcel.readDouble()));
        this.bounds = c0899m0.b();
        this.minZoom = parcel.readDouble();
        this.maxZoom = parcel.readDouble();
        this.pixelRatio = parcel.readFloat();
        this.includeIdeographs = parcel.readByte() != 0;
    }
}
