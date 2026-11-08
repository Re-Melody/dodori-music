package okhttp3.internal.http2;

import M8.D;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Z8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Http2Connection f24520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24522d;

    public /* synthetic */ d(Http2Connection http2Connection, int i10, Object obj, int i11) {
        this.f24519a = i11;
        this.f24520b = http2Connection;
        this.f24521c = i10;
        this.f24522d = obj;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f24519a) {
            case 0:
                Http2Connection http2Connection = this.f24520b;
                int i10 = this.f24521c;
                ((PushObserver.Companion.PushObserverCancel) http2Connection.k).getClass();
                try {
                    http2Connection.f24438w.v(i10, ErrorCode.CANCEL);
                    synchronized (http2Connection) {
                        http2Connection.f24440y.remove(Integer.valueOf(i10));
                    }
                } catch (IOException unused) {
                }
                return D.f8402a;
            case 1:
                Http2Connection http2Connection2 = this.f24520b;
                int i11 = this.f24521c;
                ((PushObserver.Companion.PushObserverCancel) http2Connection2.k).getClass();
                try {
                    http2Connection2.f24438w.v(i11, ErrorCode.CANCEL);
                    synchronized (http2Connection2) {
                        http2Connection2.f24440y.remove(Integer.valueOf(i11));
                    }
                } catch (IOException unused2) {
                }
                return D.f8402a;
            default:
                Http2Connection http2Connection3 = this.f24520b;
                int i12 = this.f24521c;
                ErrorCode statusCode = (ErrorCode) this.f24522d;
                Http2Connection.Companion companion = Http2Connection.f24417z;
                try {
                    http2Connection3.getClass();
                    m.f(statusCode, "statusCode");
                    http2Connection3.f24438w.v(i12, statusCode);
                    break;
                } catch (IOException e2) {
                    http2Connection3.getClass();
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    http2Connection3.b(errorCode, errorCode, e2);
                }
                return D.f8402a;
        }
    }

    public /* synthetic */ d(Http2Connection http2Connection, int i10, List list, boolean z10) {
        this.f24519a = 1;
        this.f24520b = http2Connection;
        this.f24521c = i10;
        this.f24522d = list;
    }
}
