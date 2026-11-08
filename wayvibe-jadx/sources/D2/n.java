package D2;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements p267z6.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1888a;

    @Override // p267z6.k
    public final boolean apply(Object obj) {
        switch (this.f1888a) {
            case 0:
                return ((Map.Entry) obj).getKey() != null;
            default:
                return ((String) obj) != null;
        }
    }
}
