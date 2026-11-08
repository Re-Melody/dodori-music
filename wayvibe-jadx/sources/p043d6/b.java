package p043d6;

import N8.u;
import O1.m;
import R3.a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f19288f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String serverClientId, String str, String str2) {
        super(a.m0(serverClientId, str, str2), a.m0(serverClientId, str, str2), true, u.f8652a, 2000);
        kotlin.jvm.internal.m.f(serverClientId, "serverClientId");
        this.f19286d = serverClientId;
        this.f19287e = str;
        this.f19288f = str2;
        if (serverClientId.length() <= 0) {
            throw new IllegalArgumentException("serverClientId should not be empty");
        }
    }
}
