package p207t7;

import J3.d;
import android.os.AsyncTask;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f26934a = TaskExecutors.MAIN_THREAD;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f26935b = new d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f26936c;

    static {
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        f26936c = new t();
    }
}
