package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.ConnectionListener;
import okhttp3.internal.connection.ConnectionListener$Companion$NONE$1;
import okhttp3.internal.connection.RealConnectionPool;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectionPool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealConnectionPool f23984a;

    public ConnectionPool() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        m.f(timeUnit, "timeUnit");
        TaskRunner taskRunner = TaskRunner.f24185l;
        ConnectionListener.f24224a.getClass();
        ConnectionListener$Companion$NONE$1 connectionListener = ConnectionListener.f24225b;
        m.f(taskRunner, "taskRunner");
        m.f(connectionListener, "connectionListener");
        this.f23984a = new RealConnectionPool(taskRunner, connectionListener);
    }
}
