package M2;

import A6.C;
import A6.E;
import A6.W;
import java.util.List;
import p255y2.C2336l;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f8146l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final E f8147m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(String str, long j10, long j11, String str2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j10, j11, false, W.f329e);
        C c3 = E.f299b;
    }

    public f(String str, f fVar, String str2, long j10, int i10, long j11, C2336l c2336l, String str3, String str4, long j12, long j13, boolean z10, List list) {
        super(str, fVar, j10, i10, j11, c2336l, str3, str4, j12, j13, z10);
        this.f8146l = str2;
        this.f8147m = E.r(list);
    }
}
