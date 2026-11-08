package p234w3;

import E2.h;
import N2.b;
import java.util.List;
import p208t8.c;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f27854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f27855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f27856g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f27857h;

    public /* synthetic */ d() {
        super(0, (byte) 0);
    }

    @Override // p234w3.e
    public final int f(long j10) {
        e eVar = this.f27854e;
        eVar.getClass();
        return eVar.f(j10 - this.f27855f);
    }

    @Override // p234w3.e
    public final long g(int i10) {
        e eVar = this.f27854e;
        eVar.getClass();
        return eVar.g(i10) + this.f27855f;
    }

    @Override // E2.h
    public final void i() {
        super.i();
        this.f27854e = null;
    }

    @Override // E2.h
    public final void j() {
        switch (this.f27856g) {
            case 0:
                ((b) this.f27857h).k(this);
                break;
            default:
                c cVar = (c) this.f27857h;
                cVar.getClass();
                p245x3.h hVar = (p245x3.h) cVar.f26958b;
                hVar.getClass();
                i();
                hVar.f28420b.add(this);
                break;
        }
    }

    @Override // p234w3.e
    public final List n(long j10) {
        e eVar = this.f27854e;
        eVar.getClass();
        return eVar.n(j10 - this.f27855f);
    }

    @Override // p234w3.e
    public final int r() {
        e eVar = this.f27854e;
        eVar.getClass();
        return eVar.r();
    }

    public d(b bVar) {
        super(0, (byte) 0);
        this.f27857h = bVar;
    }
}
