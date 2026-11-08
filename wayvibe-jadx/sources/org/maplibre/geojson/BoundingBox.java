package org.maplibre.geojson;

import E7.l;
import E7.m;
import E7.y;
import androidx.annotation.Keep;
import java.io.Serializable;
import org.maplibre.geojson.gson.BoundingBoxTypeAdapter;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class BoundingBox implements Serializable {
    private final Point northeast;
    private final Point southwest;

    public BoundingBox(Point point, Point point2) {
        if (point == null) {
            throw new NullPointerException("Null southwest");
        }
        this.southwest = point;
        if (point2 == null) {
            throw new NullPointerException("Null northeast");
        }
        this.northeast = point2;
    }

    @Deprecated
    public static BoundingBox fromCoordinates(double d10, double d11, double d12, double d13) {
        return fromLngLats(d10, d11, d12, d13);
    }

    public static BoundingBox fromJson(String str) {
        m mVar = new m();
        mVar.b(new BoundingBoxTypeAdapter());
        return (BoundingBox) mVar.a().b(BoundingBox.class, str);
    }

    public static BoundingBox fromLngLats(double d10, double d11, double d12, double d13) {
        return new BoundingBox(Point.fromLngLat(d10, d11), Point.fromLngLat(d12, d13));
    }

    public static BoundingBox fromPoints(Point point, Point point2) {
        return new BoundingBox(point, point2);
    }

    public static y typeAdapter(l lVar) {
        return new BoundingBoxTypeAdapter();
    }

    public final double east() {
        return northeast().longitude();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BoundingBox) {
            BoundingBox boundingBox = (BoundingBox) obj;
            if (this.southwest.equals(boundingBox.southwest()) && this.northeast.equals(boundingBox.northeast())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.southwest.hashCode() ^ 1000003) * 1000003) ^ this.northeast.hashCode();
    }

    public final double north() {
        return northeast().latitude();
    }

    public Point northeast() {
        return this.northeast;
    }

    public final double south() {
        return southwest().latitude();
    }

    public Point southwest() {
        return this.southwest;
    }

    public final String toJson() {
        m mVar = new m();
        mVar.b(new BoundingBoxTypeAdapter());
        return mVar.a().f(BoundingBox.class, this);
    }

    public String toString() {
        return "BoundingBox{southwest=" + this.southwest + ", northeast=" + this.northeast + "}";
    }

    public final double west() {
        return southwest().longitude();
    }

    @Deprecated
    public static BoundingBox fromCoordinates(double d10, double d11, double d12, double d13, double d14, double d15) {
        return fromLngLats(d10, d11, d12, d13, d14, d15);
    }

    public static BoundingBox fromLngLats(double d10, double d11, double d12, double d13, double d14, double d15) {
        return new BoundingBox(Point.fromLngLat(d10, d11, d12), Point.fromLngLat(d13, d14, d15));
    }
}
