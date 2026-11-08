package okhttp3.internal.concurrent;

import V0.p;
import java.util.Arrays;
import java.util.logging.Logger;
import org.apache.tika.pipes.pipesiterator.PipesIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class TaskLoggerKt {
    public static final void a(Logger logger, Task task, TaskQueue taskQueue, String str) {
        logger.fine(taskQueue.f24178b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.f24173a);
    }

    public static final String b(long j10) {
        String strK;
        if (j10 <= -999500000) {
            strK = p.k((j10 - ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        } else if (j10 <= -999500) {
            strK = p.k((j10 - ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else if (j10 <= 0) {
            strK = p.k((j10 - ((long) 500)) / ((long) PipesIterator.DEFAULT_QUEUE_SIZE), " µs", new StringBuilder());
        } else if (j10 < 999500) {
            strK = p.k((j10 + ((long) 500)) / ((long) PipesIterator.DEFAULT_QUEUE_SIZE), " µs", new StringBuilder());
        } else if (j10 < 999500000) {
            strK = p.k((j10 + ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else {
            strK = p.k((j10 + ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strK}, 1));
    }
}
