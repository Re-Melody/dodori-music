package org.maplibre.geojson;

import E7.y;
import M7.b;
import M7.c;
import M7.d;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.geojson.exception.GeoJsonException;
import org.maplibre.geojson.shifter.CoordinateShifterManager;
import org.maplibre.geojson.utils.GeoJsonUtils;

/* JADX INFO: loaded from: classes2.dex */
@Keep
abstract class BaseCoordinatesTypeAdapter<T> extends y {
    public Point readPoint(b bVar) {
        List<Double> pointList = readPointList(bVar);
        if (pointList == null || pointList.size() <= 1) {
            throw new GeoJsonException(" Point coordinates should be non-null double array");
        }
        return new Point("Point", null, pointList);
    }

    public List<Double> readPointList(b bVar) {
        if (bVar.N() == c.NULL) {
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        bVar.b();
        while (bVar.A()) {
            arrayList.add(Double.valueOf(bVar.E()));
        }
        bVar.l();
        return arrayList.size() > 2 ? CoordinateShifterManager.getCoordinateShifter().shiftLonLatAlt(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue(), ((Double) arrayList.get(2)).doubleValue()) : CoordinateShifterManager.getCoordinateShifter().shiftLonLat(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue());
    }

    public void writePoint(d dVar, Point point) {
        if (point == null) {
            return;
        }
        writePointList(dVar, point.coordinates());
    }

    public void writePointList(d dVar, List<Double> list) {
        if (list == null) {
            return;
        }
        dVar.c();
        List<Double> listUnshiftPoint = CoordinateShifterManager.getCoordinateShifter().unshiftPoint(list);
        dVar.B(GeoJsonUtils.trim(listUnshiftPoint.get(0).doubleValue()));
        dVar.B(GeoJsonUtils.trim(listUnshiftPoint.get(1).doubleValue()));
        if (list.size() > 2) {
            dVar.E(listUnshiftPoint.get(2));
        }
        dVar.l();
    }
}
