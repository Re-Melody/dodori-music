package D2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import p255y2.InterfaceC2333i;

/* JADX INFO: loaded from: classes.dex */
public interface h extends InterfaceC2333i {
    void close();

    long l(k kVar);

    default Map n() {
        return Collections.EMPTY_MAP;
    }

    void r(B b10);

    Uri s();
}
