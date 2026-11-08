package p165p2;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {
    public /* synthetic */ d(int i10) {
        this(a.f25175b);
    }

    @Override // p165p2.c
    public final Object a(b key) {
        m.f(key, "key");
        return this.f25176a.get(key);
    }

    public d(c initialExtras) {
        m.f(initialExtras, "initialExtras");
        this.f25176a.putAll(initialExtras.f25176a);
    }
}
