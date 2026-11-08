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
class ListOfListOfPointCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<List<List<Point>>> {
    @Override // E7.y
    public List<List<Point>> read(b bVar) {
        if (bVar.N() == c.NULL) {
            throw null;
        }
        if (bVar.N() != c.BEGIN_ARRAY) {
            throw new GeoJsonException("coordinates should be array of array of array of double");
        }
        bVar.b();
        ArrayList arrayList = new ArrayList();
        while (bVar.N() == c.BEGIN_ARRAY) {
            bVar.b();
            ArrayList arrayList2 = new ArrayList();
            while (bVar.N() == c.BEGIN_ARRAY) {
                arrayList2.add(readPoint(bVar));
            }
            bVar.l();
            arrayList.add(arrayList2);
        }
        bVar.l();
        return arrayList;
    }

    @Override // E7.y
    public void write(d dVar, List<List<Point>> list) throws IOException {
        if (list == null) {
            dVar.x();
            return;
        }
        dVar.c();
        for (List<Point> list2 : list) {
            dVar.c();
            Iterator<Point> it = list2.iterator();
            while (it.hasNext()) {
                writePoint(dVar, it.next());
            }
            dVar.l();
        }
        dVar.l();
    }
}
