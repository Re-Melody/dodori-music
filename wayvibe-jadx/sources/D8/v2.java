package D8;

import B8.AbstractC0124k;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0124k[] f2824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f2825b = new AtomicBoolean(false);

    static {
        new v2(new AbstractC0124k[0]);
    }

    public v2(AbstractC0124k[] abstractC0124kArr) {
        this.f2824a = abstractC0124kArr;
    }

    public final void a(long j10) {
        for (AbstractC0124k abstractC0124k : this.f2824a) {
            abstractC0124k.g(j10);
        }
    }
}
