package U1;

import P1.i;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static P1.e a(String str, String str2) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1567968963) {
                if (iHashCode != -154594663) {
                    if (iHashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        return new i(str2);
                    }
                } else if (str.equals("GET_INTERRUPTED")) {
                    return new P1.f(str2);
                }
            } else if (str.equals("GET_CANCELED_TAG")) {
                return new P1.c(str2);
            }
        }
        return new P1.d(str2);
    }

    public static void b(ResultReceiver resultReceiver, String str, String errMsg) {
        m.f(resultReceiver, "<this>");
        m.f(errMsg, "errMsg");
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", errMsg);
        resultReceiver.send(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, bundle);
    }

    public static void c(ResultReceiver resultReceiver, int i10, int i11, Intent intent) {
        m.f(resultReceiver, "<this>");
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i10);
        bundle.putParcelable("RESULT_DATA", intent);
        resultReceiver.send(i11, bundle);
    }
}
