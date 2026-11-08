package okhttp3.internal.concurrent;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TaskQueue f24175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f24176d;

    public Task(String name, boolean z10) {
        m.f(name, "name");
        this.f24173a = name;
        this.f24174b = z10;
        this.f24176d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f24173a;
    }
}
