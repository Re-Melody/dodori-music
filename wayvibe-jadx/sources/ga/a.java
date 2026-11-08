package ga;

import android.content.res.TypedArray;
import org.maplibre.android.geometry.LatLng;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f20132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LatLng f20133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f20134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f20135d;

    public a(TypedArray typedArray) {
        this.f20132a = -1.0d;
        this.f20134c = -1.0d;
        this.f20135d = -1.0d;
        if (typedArray != null) {
            this.f20132a = typedArray.getFloat(6, 0.0f);
            this.f20133b = new LatLng(typedArray.getFloat(9, 0.0f), typedArray.getFloat(10, 0.0f));
            this.f20134c = typedArray.getFloat(11, 0.0f);
            this.f20135d = typedArray.getFloat(12, 0.0f);
        }
    }
}
