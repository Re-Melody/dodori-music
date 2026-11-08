package B8;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class E {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f726d = Logger.getLogger(E.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final E f727e = new E();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentSkipListMap f728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f730c;

    public E() {
        new ConcurrentSkipListMap();
        this.f728a = new ConcurrentSkipListMap();
        this.f729b = new ConcurrentHashMap();
        this.f730c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }
}
