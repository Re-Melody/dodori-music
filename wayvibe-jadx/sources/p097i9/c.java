package p097i9;

import Z8.e;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import p085h9.h;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f20573c;

    public c(String input, int i10, e eVar) {
        m.f(input, "input");
        this.f20571a = input;
        this.f20572b = i10;
        this.f20573c = eVar;
    }

    @Override // p085h9.h
    public final Iterator iterator() {
        return new b(this);
    }
}
