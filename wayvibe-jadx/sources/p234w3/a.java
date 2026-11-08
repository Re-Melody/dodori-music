package p234w3;

import A6.E;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f27847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f27850d;

    public a(List list, long j10, long j11) {
        this.f27847a = E.r(list);
        this.f27848b = j10;
        this.f27849c = j11;
        long j12 = -9223372036854775807L;
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
            j12 = j10 + j11;
        }
        this.f27850d = j12;
    }
}
