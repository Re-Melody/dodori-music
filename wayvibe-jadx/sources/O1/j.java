package O1;

import G0.AbstractC0454b;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC0454b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, int i10, Bundle bundle) {
        super(bundle, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL");
        switch (i10) {
            case 1:
                super(bundle, "android.credentials.TYPE_PASSWORD_CREDENTIAL");
                if (str.length() <= 0) {
                    throw new IllegalArgumentException("password should not be empty");
                }
                return;
            case 2:
                super(bundle, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL");
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused) {
                    }
                }
                throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
            default:
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused2) {
                    }
                }
                throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");
        }
    }
}
