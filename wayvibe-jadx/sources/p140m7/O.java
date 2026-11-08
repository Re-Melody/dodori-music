package p140m7;

import com.google.firebase.firestore.J;
import com.google.firebase.firestore.K;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p170p7.q;
import p179q7.m;
import s7.h;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadPoolExecutor f22424g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f22425a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public K f22429e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f22426b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f22427c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f22430f = new HashSet();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f22424g = threadPoolExecutor;
    }

    public O(h hVar) {
        this.f22425a = hVar;
    }

    public final m a(p170p7.h hVar) {
        q qVar = (q) this.f22426b.get(hVar);
        if (this.f22430f.contains(hVar) || qVar == null) {
            return m.f25700c;
        }
        return qVar.equals(q.f25278b) ? m.a(false) : new m(qVar, null);
    }

    public final m b(p170p7.h hVar) throws K {
        q qVar = (q) this.f22426b.get(hVar);
        if (this.f22430f.contains(hVar) || qVar == null) {
            return m.a(true);
        }
        if (qVar.equals(q.f25278b)) {
            throw new K("Can't update a document that doesn't exist.", J.INVALID_ARGUMENT);
        }
        return new m(qVar, null);
    }
}
