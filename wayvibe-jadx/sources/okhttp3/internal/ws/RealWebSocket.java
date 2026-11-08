package okhttp3.internal.ws;

import D7.W;
import java.util.List;
import okhttp3.Protocol;
import okhttp3.WebSocket;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback, Lockable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f24598a;

    public static final class Close {
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Message {
    }

    public final class WriterTask extends Task {
        @Override // okhttp3.internal.concurrent.Task
        public final long a() {
            throw null;
        }
    }

    static {
        new Companion(0);
        f24598a = W.T(Protocol.HTTP_1_1);
    }
}
