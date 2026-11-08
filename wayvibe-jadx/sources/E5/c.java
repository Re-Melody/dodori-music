package E5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c f3146b = new c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3147a;

    public /* synthetic */ c(int i10) {
        this.f3147a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3147a) {
            case 0:
                break;
        }
        return ((Scope) obj).f17828b.compareTo(((Scope) obj2).f17828b);
    }
}
