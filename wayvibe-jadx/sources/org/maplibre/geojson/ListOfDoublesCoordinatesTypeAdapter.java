package org.maplibre.geojson;

import M7.b;
import M7.d;
import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
class ListOfDoublesCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<List<Double>> {
    @Override // E7.y
    public List<Double> read(b bVar) {
        return readPointList(bVar);
    }

    @Override // E7.y
    public void write(d dVar, List<Double> list) {
        writePointList(dVar, list);
    }
}
