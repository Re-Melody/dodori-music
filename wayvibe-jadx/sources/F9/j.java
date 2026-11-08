package F9;

import E9.C0345f;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends C0345f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Socket f4642n;

    public j(Socket socket) {
        this.f4642n = socket;
    }

    @Override // E9.C0345f
    public final void j() {
        Socket socket = this.f4642n;
        try {
            socket.close();
        } catch (AssertionError e2) {
            if (!o.a(e2)) {
                throw e2;
            }
            o.f4674a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        } catch (Exception e4) {
            o.f4674a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e4);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
