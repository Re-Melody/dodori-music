package p089i1;

import D0.InterfaceC0197x;
import Z8.c;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC0197x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f20434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f20435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20436c;

    public e(b bVar, c cVar) {
        this.f20434a = bVar;
        this.f20435b = cVar;
        this.f20436c = bVar.f20423b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return m.b(this.f20434a.f20423b, eVar.f20434a.f20423b) && this.f20435b == eVar.f20435b;
    }

    public final int hashCode() {
        return this.f20435b.hashCode() + (this.f20434a.f20423b.hashCode() * 31);
    }

    @Override // D0.InterfaceC0197x
    public final Object l() {
        return this.f20436c;
    }
}
