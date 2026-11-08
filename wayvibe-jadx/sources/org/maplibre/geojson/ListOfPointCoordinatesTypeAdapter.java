package org.maplibre.geojson;

import M7.b;
import M7.c;
import M7.d;
import androidx.annotation.Keep;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.maplibre.geojson.exception.GeoJsonException;

/* JADX INFO: loaded from: classes2.dex */
@Keep
class ListOfPointCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<List<Point>> {
    @Override // E7.y
    public List<Point> read(b bVar) {
        if (bVar.N() == c.NULL) {
            throw null;
        }
        if (bVar.N() != c.BEGIN_ARRAY) {
            throw new GeoJsonException("coordinates should be non-null array of array of double");
        }
        ArrayList arrayList = new ArrayList();
        bVar.b();
        while (bVar.N() == c.BEGIN_ARRAY) {
            arrayList.add(readPoint(bVar));
        }
        bVar.l();
        return arrayList;
    }

    @Override // E7.y
    public void write(d dVar, List<Point> list) throws IOException {
        if (list == null) {
            dVar.x();
            return;
        }
        dVar.c();
        Iterator<Point> it = list.iterator();
        while (it.hasNext()) {
            writePoint(dVar, it.next());
        }
        dVar.l();
    }
}
