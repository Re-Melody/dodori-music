package A5;

import android.os.Bundle;
import com.google.android.gms.common.internal.E;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c implements com.google.android.gms.common.api.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f285b = new c(new Bundle());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f286a;

    public /* synthetic */ c(Bundle bundle) {
        this.f286a = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        Bundle bundle = ((c) obj).f286a;
        Bundle bundle2 = this.f286a;
        if (bundle2 == null || bundle == null) {
            return bundle2 == bundle;
        }
        if (bundle2.size() == bundle.size()) {
            Set<String> setKeySet = bundle2.keySet();
            if (setKeySet.containsAll(bundle.keySet())) {
                for (String str : setKeySet) {
                    if (!E.k(bundle2.get(str), bundle.get(str))) {
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f286a});
    }
}
