package G0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A0 implements M3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4940b;

    public /* synthetic */ A0(Object obj, int i10) {
        this.f4939a = i10;
        this.f4940b = obj;
    }

    @Override // M3.e
    public final Bundle a() {
        switch (this.f4939a) {
            case 0:
                Map mapD = ((p037d0.l) this.f4940b).d();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : ((LinkedHashMap) mapD).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            case 1:
                return androidx.lifecycle.Q.a((androidx.lifecycle.Q) this.f4940b);
            default:
                return p036d.n.c((p036d.n) this.f4940b);
        }
    }
}
