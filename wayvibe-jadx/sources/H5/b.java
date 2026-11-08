package H5;

import D7.p1;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.Arrays;
import org.apache.tika.utils.XMLReaderUtils;

/* JADX INFO: loaded from: classes.dex */
public final class b extends I5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f6030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f6032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f6027f = new b(0, null, null);
    public static final Parcelable.Creator<b> CREATOR = new B5.c(29);

    public b(int i10, int i11, PendingIntent pendingIntent, String str, Integer num) {
        this.f6028a = i10;
        this.f6029b = i11;
        this.f6030c = pendingIntent;
        this.f6031d = str;
        this.f6032e = num;
    }

    public static String e(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return HybridPurchaseLogicBridge.RESULT_SUCCESS;
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i10);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6029b == bVar.f6029b && E.k(this.f6030c, bVar.f6030c) && E.k(this.f6031d, bVar.f6031d) && E.k(this.f6032e, bVar.f6032e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6029b), this.f6030c, this.f6031d, this.f6032e});
    }

    public final String toString() {
        W9.j jVar = new W9.j(this);
        jVar.E(e(this.f6029b), "statusCode");
        jVar.E(this.f6030c, "resolution");
        jVar.E(this.f6031d, "message");
        jVar.E(this.f6032e, "clientMethodKey");
        return jVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.b0(parcel, 1, 4);
        parcel.writeInt(this.f6028a);
        p242x0.c.b0(parcel, 2, 4);
        parcel.writeInt(this.f6029b);
        p242x0.c.V(parcel, 3, this.f6030c, i10, false);
        p242x0.c.W(parcel, 4, this.f6031d, false);
        p242x0.c.T(parcel, 5, this.f6032e);
        p242x0.c.d0(iC0, parcel);
    }

    public b(int i10, String str, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, str, null);
    }
}
