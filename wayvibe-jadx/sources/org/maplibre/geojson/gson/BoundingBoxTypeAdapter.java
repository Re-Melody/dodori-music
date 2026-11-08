package org.maplibre.geojson.gson;

import E7.y;
import M7.b;
import M7.d;
import androidx.annotation.Keep;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.geojson.BoundingBox;
import org.maplibre.geojson.Point;
import org.maplibre.geojson.exception.GeoJsonException;
import org.maplibre.geojson.shifter.CoordinateShifterManager;
import org.maplibre.geojson.utils.GeoJsonUtils;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class BoundingBoxTypeAdapter extends y {
    @Override // E7.y
    public BoundingBox read(b bVar) {
        ArrayList arrayList = new ArrayList();
        bVar.b();
        while (bVar.A()) {
            arrayList.add(Double.valueOf(bVar.E()));
        }
        bVar.l();
        if (arrayList.size() == 6) {
            return BoundingBox.fromLngLats(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue(), ((Double) arrayList.get(2)).doubleValue(), ((Double) arrayList.get(3)).doubleValue(), ((Double) arrayList.get(4)).doubleValue(), ((Double) arrayList.get(5)).doubleValue());
        }
        if (arrayList.size() == 4) {
            return BoundingBox.fromLngLats(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue(), ((Double) arrayList.get(2)).doubleValue(), ((Double) arrayList.get(3)).doubleValue());
        }
        throw new GeoJsonException("The value of the bbox member MUST be an array of length 2*n where n is the number of dimensions represented in the contained geometries,with all axes of the most southwesterly point followed  by all axes of the more northeasterly point. The axes order of a bbox follows the axes order of geometries.");
    }

    @Override // E7.y
    public void write(d dVar, BoundingBox boundingBox) throws IOException {
        if (boundingBox == null) {
            dVar.x();
            return;
        }
        dVar.c();
        Point pointSouthwest = boundingBox.southwest();
        List<Double> listUnshiftPoint = CoordinateShifterManager.getCoordinateShifter().unshiftPoint(pointSouthwest);
        dVar.B(GeoJsonUtils.trim(listUnshiftPoint.get(0).doubleValue()));
        dVar.B(GeoJsonUtils.trim(listUnshiftPoint.get(1).doubleValue()));
        if (pointSouthwest.hasAltitude()) {
            dVar.E(listUnshiftPoint.get(2));
        }
        Point pointNortheast = boundingBox.northeast();
        List<Double> listUnshiftPoint2 = CoordinateShifterManager.getCoordinateShifter().unshiftPoint(pointNortheast);
        dVar.B(GeoJsonUtils.trim(listUnshiftPoint2.get(0).doubleValue()));
        dVar.B(GeoJsonUtils.trim(listUnshiftPoint2.get(1).doubleValue()));
        if (pointNortheast.hasAltitude()) {
            dVar.E(listUnshiftPoint2.get(2));
        }
        dVar.l();
    }
}
