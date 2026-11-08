package org.maplibre.geojson;

import M7.b;
import M7.d;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class PointAsCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<Point> {
    @Override // E7.y
    public Point read(b bVar) {
        return readPoint(bVar);
    }

    @Override // E7.y
    public void write(d dVar, Point point) {
        writePoint(dVar, point);
    }
}
