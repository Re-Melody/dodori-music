package X8;

import java.io.File;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements p085h9.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13276a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13278c;

    public j(File start, k kVar) {
        kotlin.jvm.internal.m.f(start, "start");
        this.f13277b = start;
        this.f13278c = kVar;
    }

    @Override // p085h9.h
    public final Iterator iterator() {
        switch (this.f13276a) {
            case 0:
                return new h(this);
            default:
                return new p004a0.c(this);
        }
    }

    public j(Z8.a aVar, Z8.c cVar) {
        this.f13277b = aVar;
        this.f13278c = cVar;
    }
}
