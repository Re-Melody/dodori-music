package p059f4;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class j extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19827b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String message, int i10, String str) {
        super(message);
        m.f(message, "message");
        this.f19826a = i10;
        this.f19827b = str;
    }
}
