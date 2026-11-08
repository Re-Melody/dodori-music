package H8;

import com.google.protobuf.I;
import com.google.protobuf.InterfaceC1274w0;
import com.google.protobuf.J;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f6236d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1274w0 f6237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f6238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6239c;

    public b(J j10) {
        p229v9.a.k(j10, "defaultInstance cannot be null");
        this.f6238b = j10;
        this.f6237a = (InterfaceC1274w0) j10.h(I.GET_PARSER);
        this.f6239c = -1;
    }
}
