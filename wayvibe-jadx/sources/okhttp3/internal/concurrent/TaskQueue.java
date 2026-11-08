package okhttp3.internal.concurrent;

import Z8.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.m;
import okhttp3.internal._UtilJvmKt;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class TaskQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskRunner f24177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Task f24180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f24181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24182f;

    public static final class AwaitIdleTask extends Task {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final CountDownLatch f24183e;

        public AwaitIdleTask() {
            super(b.m(new StringBuilder(), _UtilJvmKt.f24161b, " awaitIdle"), false);
            this.f24183e = new CountDownLatch(1);
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long a() {
            this.f24183e.countDown();
            return -1L;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String name) {
        m.f(taskRunner, "taskRunner");
        m.f(name, "name");
        this.f24177a = taskRunner;
        this.f24178b = name;
        this.f24181e = new ArrayList();
    }

    public static void b(TaskQueue taskQueue, final String name, final a block, int i10) {
        final boolean z10 = (i10 & 4) != 0;
        taskQueue.getClass();
        m.f(name, "name");
        m.f(block, "block");
        taskQueue.c(new Task(name, z10) { // from class: okhttp3.internal.concurrent.TaskQueue$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                block.invoke();
                return -1L;
            }
        }, 0L);
    }

    public final boolean a() {
        Task task = this.f24180d;
        if (task != null && task.f24174b) {
            this.f24182f = true;
        }
        ArrayList arrayList = this.f24181e;
        boolean z10 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((Task) arrayList.get(size)).f24174b) {
                Logger logger = this.f24177a.f24187b;
                Task task2 = (Task) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(logger, task2, this, "canceled");
                }
                arrayList.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void c(Task task, long j10) {
        m.f(task, "task");
        synchronized (this.f24177a) {
            if (!this.f24179c) {
                if (d(task, j10, false)) {
                    this.f24177a.c(this);
                }
            } else if (task.f24174b) {
                Logger logger = this.f24177a.f24187b;
                if (logger.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(logger, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.f24177a.f24187b;
                if (logger2.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(logger2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a A[LOOP:0: B:23:0x0066->B:28:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:34:0x0089 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007e A[EDGE_INSN: B:40:0x007e->B:30:0x007e BREAK  A[LOOP:0: B:23:0x0066->B:28:0x007a], SYNTHETIC] */
    public final boolean d(Task task, long j10, boolean z10) {
        Iterator it;
        int size;
        String strConcat;
        m.f(task, "task");
        TaskQueue taskQueue = task.f24175c;
        if (taskQueue != this) {
            if (taskQueue != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f24175c = this;
        }
        TaskRunner taskRunner = this.f24177a;
        TaskRunner.RealBackend realBackend = taskRunner.f24186a;
        long jNanoTime = System.nanoTime();
        long j11 = jNanoTime + j10;
        ArrayList arrayList = this.f24181e;
        int iIndexOf = arrayList.indexOf(task);
        Logger logger = taskRunner.f24187b;
        if (iIndexOf == -1) {
            task.f24176d = j11;
            if (logger.isLoggable(Level.FINE)) {
                if (z10) {
                    strConcat = "run again after ".concat(TaskLoggerKt.b(j11 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(TaskLoggerKt.b(j11 - jNanoTime));
                }
                TaskLoggerKt.a(logger, task, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((Task) it.next()).f24176d - jNanoTime > j10) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, task);
            if (size == 0) {
                return true;
            }
        } else if (task.f24176d > j11) {
            arrayList.remove(iIndexOf);
            task.f24176d = j11;
            if (logger.isLoggable(Level.FINE)) {
                if (z10) {
                    strConcat = "run again after ".concat(TaskLoggerKt.b(j11 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(TaskLoggerKt.b(j11 - jNanoTime));
                }
                TaskLoggerKt.a(logger, task, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((Task) it.next()).f24176d - jNanoTime > j10) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, task);
            if (size == 0) {
                return true;
            }
        } else if (logger.isLoggable(Level.FINE)) {
            TaskLoggerKt.a(logger, task, this, "already scheduled");
            return false;
        }
        return false;
    }

    public final void e() {
        TaskRunner taskRunner = this.f24177a;
        TimeZone timeZone = _UtilJvmKt.f24160a;
        synchronized (taskRunner) {
            this.f24179c = true;
            if (a()) {
                this.f24177a.c(this);
            }
        }
    }

    public final String toString() {
        return this.f24178b;
    }
}
