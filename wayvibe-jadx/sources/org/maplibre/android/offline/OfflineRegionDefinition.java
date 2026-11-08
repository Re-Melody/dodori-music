package org.maplibre.android.offline;

import android.os.Parcelable;
import androidx.annotation.Keep;
import org.maplibre.android.geometry.LatLngBounds;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public interface OfflineRegionDefinition extends Parcelable {
    LatLngBounds getBounds();

    boolean getIncludeIdeographs();

    double getMaxZoom();

    double getMinZoom();

    float getPixelRatio();

    String getStyleURL();

    String getType();
}
