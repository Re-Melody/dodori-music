package p085h9;

import Z8.c;
import java.util.Iterator;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f20350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f20352c;

    public f(h hVar, boolean z10, c predicate) {
        m.f(predicate, "predicate");
        this.f20350a = hVar;
        this.f20351b = z10;
        this.f20352c = predicate;
    }

    @Override // p085h9.h
    public final Iterator iterator() {
        return new e(this);
    }
}
