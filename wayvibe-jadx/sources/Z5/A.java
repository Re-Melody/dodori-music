package Z5;

import B2.AbstractC0112b;
import D7.p1;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import org.apache.tika.utils.XMLReaderUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H5.d f13817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H5.d f13818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H5.d f13819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H5.d f13820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final H5.d f13821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final H5.d f13822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final H5.d f13823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final H5.d f13824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final H5.d[] f13825i;

    static {
        H5.d dVar = new H5.d("name_ulr_private", 1L);
        H5.d dVar2 = new H5.d("name_sleep_segment_request", 1L);
        f13817a = dVar2;
        H5.d dVar3 = new H5.d("get_last_activity_feature_id", 1L);
        H5.d dVar4 = new H5.d("support_context_feature_id", 1L);
        H5.d dVar5 = new H5.d("get_current_location", 2L);
        f13818b = dVar5;
        H5.d dVar6 = new H5.d("get_last_location_with_request", 1L);
        f13819c = dVar6;
        H5.d dVar7 = new H5.d("set_mock_mode_with_callback", 1L);
        f13820d = dVar7;
        H5.d dVar8 = new H5.d("set_mock_location_with_callback", 1L);
        f13821e = dVar8;
        H5.d dVar9 = new H5.d("inject_location_with_callback", 1L);
        H5.d dVar10 = new H5.d("location_updates_with_callback", 1L);
        f13822f = dVar10;
        H5.d dVar11 = new H5.d("use_safe_parcelable_in_intents", 1L);
        H5.d dVar12 = new H5.d("flp_debug_updates", 1L);
        H5.d dVar13 = new H5.d("google_location_accuracy_enabled", 1L);
        f13823g = dVar13;
        H5.d dVar14 = new H5.d("geofences_with_callback", 1L);
        f13824h = dVar14;
        f13825i = new H5.d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, new H5.d("location_enabled", 1L)};
    }

    public static String a(int i10) {
        switch (i10) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return HybridPurchaseLogicBridge.RESULT_SUCCESS;
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return AbstractC0112b.k(new StringBuilder(String.valueOf(i10).length() + 21), "unknown status code: ", i10);
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
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return HybridPurchaseLogicBridge.RESULT_ERROR;
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static void b(int i10) {
        boolean z10 = true;
        if (i10 != 100 && i10 != 102 && i10 != 104) {
            if (i10 == 105) {
                i10 = 105;
            } else {
                z10 = false;
            }
        }
        com.google.android.gms.common.internal.E.b("priority %d must be a Priority.PRIORITY_* constant", z10, Integer.valueOf(i10));
    }

    public static String c(int i10) {
        if (i10 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i10 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i10 == 104) {
            return "LOW_POWER";
        }
        if (i10 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }

    public static String d(int i10) {
        if (i10 == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i10 == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i10 == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }
}
