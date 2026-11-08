package okhttp3.internal.connection;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class RealConnectionPool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectionListener$Companion$NONE$1 f24295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TaskQueue f24297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RealConnectionPool$cleanupTask$1 f24298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentLinkedQueue f24299e;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner, ConnectionListener$Companion$NONE$1 connectionListener) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        m.f(taskRunner, "taskRunner");
        m.f(timeUnit, "timeUnit");
        m.f(connectionListener, "connectionListener");
        this.f24295a = connectionListener;
        this.f24296b = timeUnit.toNanos(5L);
        this.f24297c = taskRunner.d();
        final String strM = b.m(new StringBuilder(), _UtilJvmKt.f24161b, " ConnectionPool connection closer");
        this.f24298d = new Task(strM) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                RealConnection realConnection;
                RealConnectionPool realConnectionPool = this.f24300e;
                long jNanoTime = System.nanoTime();
                long j10 = (jNanoTime - realConnectionPool.f24296b) + 1;
                Iterator it = realConnectionPool.f24299e.iterator();
                m.e(it, "iterator(...)");
                long j11 = Long.MAX_VALUE;
                int i10 = 0;
                int i11 = 0;
                RealConnection realConnection2 = null;
                RealConnection realConnection3 = null;
                while (it.hasNext()) {
                    RealConnection realConnection4 = (RealConnection) it.next();
                    m.c(realConnection4);
                    synchronized (realConnection4) {
                        if (realConnectionPool.a(realConnection4, jNanoTime) > 0) {
                            i11++;
                        } else {
                            long j12 = j11;
                            long j13 = realConnection4.r;
                            if (j13 < j10) {
                                j10 = j13;
                                realConnection2 = realConnection4;
                            }
                            i10++;
                            if (j13 < j12) {
                                j11 = j13;
                                realConnection3 = realConnection4;
                            } else {
                                j11 = j12;
                            }
                        }
                    }
                }
                long j14 = j11;
                if (realConnection2 != null) {
                    realConnection = realConnection2;
                } else if (i10 > 5) {
                    realConnection = realConnection3;
                    j10 = j14;
                } else {
                    j10 = -1;
                    realConnection = null;
                }
                if (realConnection == null) {
                    if (realConnection3 != null) {
                        return (j14 + realConnectionPool.f24296b) - jNanoTime;
                    }
                    if (i11 > 0) {
                        return realConnectionPool.f24296b;
                    }
                    return -1L;
                }
                synchronized (realConnection) {
                    if (!realConnection.f24292q.isEmpty()) {
                        return 0L;
                    }
                    if (realConnection.r != j10) {
                        return 0L;
                    }
                    realConnection.k = true;
                    realConnectionPool.f24299e.remove(realConnection);
                    _UtilJvmKt.b(realConnection.f24281e);
                    realConnectionPool.f24295a.getClass();
                    if (!realConnectionPool.f24299e.isEmpty()) {
                        return 0L;
                    }
                    TaskQueue taskQueue = realConnectionPool.f24297c;
                    synchronized (taskQueue.f24177a) {
                        if (taskQueue.a()) {
                            taskQueue.f24177a.c(taskQueue);
                        }
                    }
                    return 0L;
                }
            }
        };
        this.f24299e = new ConcurrentLinkedQueue();
    }

    public final int a(RealConnection realConnection, long j10) {
        TimeZone timeZone = _UtilJvmKt.f24160a;
        ArrayList arrayList = realConnection.f24292q;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                String str = "A connection to " + realConnection.f24279c.f24147a.f23934h + " was leaked. Did you forget to close a response body?";
                Platform.f24547a.getClass();
                Platform.f24548b.k(((RealCall.CallReference) reference).f24276a, str);
                arrayList.remove(i10);
                if (arrayList.isEmpty()) {
                    realConnection.r = j10 - this.f24296b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
