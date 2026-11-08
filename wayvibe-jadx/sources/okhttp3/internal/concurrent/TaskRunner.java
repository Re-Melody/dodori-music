package okhttp3.internal.concurrent;

import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.m;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.b;

/* JADX INFO: loaded from: classes2.dex */
public final class TaskRunner implements Lockable {
    public static final Logger k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final TaskRunner f24185l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealBackend f24186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f24187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f24190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f24193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f24194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TaskRunner$runnable$1 f24195j;

    public interface Backend {
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public static final class RealBackend implements Backend {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThreadPoolExecutor f24196a;

        public RealBackend(b bVar) {
            this.f24196a = new ThreadPoolExecutor(0, f.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), bVar);
        }
    }

    static {
        new Companion(0);
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        m.e(logger, "getLogger(...)");
        k = logger;
        String name = _UtilJvmKt.f24161b + " TaskRunner";
        m.f(name, "name");
        f24185l = new TaskRunner(new RealBackend(new b(name, true)));
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [okhttp3.internal.concurrent.TaskRunner$runnable$1] */
    public TaskRunner(RealBackend realBackend) {
        Logger logger = k;
        m.f(logger, "logger");
        this.f24186a = realBackend;
        this.f24187b = logger;
        this.f24188c = 10000;
        this.f24193h = new ArrayList();
        this.f24194i = new ArrayList();
        this.f24195j = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                Task taskB;
                long jNanoTime;
                Task taskB2;
                TaskRunner taskRunner = this.f24197a;
                synchronized (taskRunner) {
                    taskRunner.f24192g++;
                    taskB = taskRunner.b();
                }
                if (taskB == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                while (true) {
                    try {
                        threadCurrentThread.setName(taskB.f24173a);
                        Logger logger2 = this.f24197a.f24187b;
                        TaskQueue taskQueue = taskB.f24175c;
                        m.c(taskQueue);
                        boolean zIsLoggable = logger2.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            TaskRunner.RealBackend realBackend2 = taskQueue.f24177a.f24186a;
                            jNanoTime = System.nanoTime();
                            TaskLoggerKt.a(logger2, taskB, taskQueue, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jA = taskB.a();
                            if (zIsLoggable) {
                                TaskRunner.RealBackend realBackend3 = taskQueue.f24177a.f24186a;
                                TaskLoggerKt.a(logger2, taskB, taskQueue, "finished run in " + TaskLoggerKt.b(System.nanoTime() - jNanoTime));
                            }
                            TaskRunner taskRunner2 = this.f24197a;
                            synchronized (taskRunner2) {
                                TaskRunner.a(taskRunner2, taskB, jA, true);
                                taskB2 = taskRunner2.b();
                            }
                            if (taskB2 == null) {
                                threadCurrentThread.setName(name);
                                return;
                            }
                            taskB = taskB2;
                        } catch (Throwable th) {
                            if (zIsLoggable) {
                                TaskRunner.RealBackend realBackend4 = taskQueue.f24177a.f24186a;
                                TaskLoggerKt.a(logger2, taskB, taskQueue, "failed a run in " + TaskLoggerKt.b(System.nanoTime() - jNanoTime));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            TaskRunner taskRunner3 = this.f24197a;
                            synchronized (taskRunner3) {
                                TaskRunner.a(taskRunner3, taskB, -1L, false);
                                if (!(th2 instanceof InterruptedException)) {
                                    throw th2;
                                }
                                Thread.currentThread().interrupt();
                                threadCurrentThread.setName(name);
                                return;
                            }
                        } catch (Throwable th3) {
                            threadCurrentThread.setName(name);
                            throw th3;
                        }
                    }
                }
            }
        };
    }

    public static final void a(TaskRunner taskRunner, Task task, long j10, boolean z10) {
        taskRunner.getClass();
        TimeZone timeZone = _UtilJvmKt.f24160a;
        TaskQueue taskQueue = task.f24175c;
        m.c(taskQueue);
        if (taskQueue.f24180d != task) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z11 = taskQueue.f24182f;
        taskQueue.f24182f = false;
        taskQueue.f24180d = null;
        taskRunner.f24193h.remove(taskQueue);
        if (j10 != -1 && !z11 && !taskQueue.f24179c) {
            taskQueue.d(task, j10, true);
        }
        if (taskQueue.f24181e.isEmpty()) {
            return;
        }
        taskRunner.f24194i.add(taskQueue);
        if (z10) {
            return;
        }
        taskRunner.e();
    }

    public final Task b() {
        long j10;
        Task task;
        boolean z10;
        TimeZone timeZone = _UtilJvmKt.f24160a;
        while (true) {
            ArrayList arrayList = this.f24194i;
            if (arrayList.isEmpty()) {
                return null;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            Task task2 = null;
            while (true) {
                if (!it.hasNext()) {
                    j10 = jNanoTime;
                    task = null;
                    z10 = false;
                    break;
                }
                Task task3 = (Task) ((TaskQueue) it.next()).f24181e.get(0);
                j10 = jNanoTime;
                task = null;
                long jMax = Math.max(0L, task3.f24176d - j10);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (task2 != null) {
                        z10 = true;
                        break;
                    }
                    task2 = task3;
                }
                jNanoTime = j10;
            }
            ArrayList arrayList2 = this.f24193h;
            if (task2 != null) {
                TimeZone timeZone2 = _UtilJvmKt.f24160a;
                task2.f24176d = -1L;
                TaskQueue taskQueue = task2.f24175c;
                m.c(taskQueue);
                taskQueue.f24181e.remove(task2);
                arrayList.remove(taskQueue);
                taskQueue.f24180d = task2;
                arrayList2.add(taskQueue);
                if (z10 || (!this.f24189d && !arrayList.isEmpty())) {
                    e();
                }
                return task2;
            }
            if (this.f24189d) {
                if (jMin >= this.f24190e - j10) {
                    return task;
                }
                notify();
                return task;
            }
            this.f24189d = true;
            this.f24190e = j10 + jMin;
            try {
                try {
                    TimeZone timeZone3 = _UtilJvmKt.f24160a;
                    if (jMin > 0) {
                        long j11 = jMin / 1000000;
                        long j12 = jMin - (1000000 * j11);
                        if (j11 > 0 || jMin > 0) {
                            wait(j11, (int) j12);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = _UtilJvmKt.f24160a;
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((TaskQueue) arrayList2.get(size)).a();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        TaskQueue taskQueue2 = (TaskQueue) arrayList.get(size2);
                        taskQueue2.a();
                        if (taskQueue2.f24181e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
                this.f24189d = false;
            } catch (Throwable th) {
                this.f24189d = false;
                throw th;
            }
        }
    }

    public final void c(TaskQueue taskQueue) {
        m.f(taskQueue, "taskQueue");
        TimeZone timeZone = _UtilJvmKt.f24160a;
        if (taskQueue.f24180d == null) {
            boolean zIsEmpty = taskQueue.f24181e.isEmpty();
            ArrayList arrayList = this.f24194i;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                byte[] bArr = _UtilCommonKt.f24159a;
                m.f(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.f24189d) {
            notify();
        } else {
            e();
        }
    }

    public final TaskQueue d() {
        int i10;
        synchronized (this) {
            i10 = this.f24188c;
            this.f24188c = i10 + 1;
        }
        return new TaskQueue(this, p134m1.b.j(i10, "Q"));
    }

    public final void e() {
        TimeZone timeZone = _UtilJvmKt.f24160a;
        int i10 = this.f24191f;
        if (i10 > this.f24192g) {
            return;
        }
        this.f24191f = i10 + 1;
        RealBackend realBackend = this.f24186a;
        TaskRunner$runnable$1 runnable = this.f24195j;
        m.f(runnable, "runnable");
        realBackend.f24196a.execute(runnable);
    }
}
