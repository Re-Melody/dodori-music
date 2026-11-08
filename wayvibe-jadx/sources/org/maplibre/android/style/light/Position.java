package org.maplibre.android.style.light;

import androidx.annotation.Keep;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public class Position {

    @Keep
    private float azimuthalAngle;

    @Keep
    private float polarAngle;

    @Keep
    private float radialCoordinate;

    @Keep
    public static Position fromPosition(float f10, float f11, float f12) {
        Position position = new Position();
        position.radialCoordinate = f10;
        position.azimuthalAngle = f11;
        position.polarAngle = f12;
        return position;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Position position = (Position) obj;
            if (Float.compare(position.radialCoordinate, this.radialCoordinate) == 0 && Float.compare(position.azimuthalAngle, this.azimuthalAngle) == 0 && Float.compare(position.polarAngle, this.polarAngle) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        float f10 = this.radialCoordinate;
        int iFloatToIntBits = (f10 != 0.0f ? Float.floatToIntBits(f10) : 0) * 31;
        float f11 = this.azimuthalAngle;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31;
        float f12 = this.polarAngle;
        return iFloatToIntBits2 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Position{radialCoordinate=");
        sb.append(this.radialCoordinate);
        sb.append(", azimuthalAngle=");
        sb.append(this.azimuthalAngle);
        sb.append(", polarAngle=");
        return b.l(sb, this.polarAngle, '}');
    }
}
