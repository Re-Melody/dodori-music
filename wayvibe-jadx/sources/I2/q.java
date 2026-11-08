package I2;

import B2.C;
import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V2.e f6374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f6375b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public J2.c f6379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6382i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TreeMap f6378e = new TreeMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f6377d = C.n(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p102j3.b f6376c = new p102j3.b(1);

    public q(J2.c cVar, g gVar, V2.e eVar) {
        this.f6379f = cVar;
        this.f6375b = gVar;
        this.f6374a = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.f6382i) {
            if (message.what != 1) {
                return false;
            }
            o oVar = (o) message.obj;
            long j10 = oVar.f6367a;
            TreeMap treeMap = this.f6378e;
            long j11 = oVar.f6368b;
            Long l10 = (Long) treeMap.get(Long.valueOf(j11));
            if (l10 == null) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
                return true;
            }
            if (l10.longValue() > j10) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
            }
        }
        return true;
    }
}
