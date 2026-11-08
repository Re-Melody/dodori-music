package B2;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Message f637a;

    public final void a() {
        this.f637a = null;
        ArrayList arrayList = y.f638b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f637a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
