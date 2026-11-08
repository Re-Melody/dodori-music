package org.maplibre.android.annotations;

import androidx.annotation.Keep;
import java.util.List;
import org.maplibre.android.geometry.LatLng;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class Polygon extends BasePointCollection {

    @Keep
    private int fillColor;

    @Keep
    private List<List<LatLng>> holes;

    @Keep
    private int strokeColor;
}
