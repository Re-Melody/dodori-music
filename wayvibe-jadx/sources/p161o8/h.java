package p161o8;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p150n8.a;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f23818a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f23819b;

    public h(a aVar) {
        this.f23819b = aVar;
    }

    public final void a() {
        if (this.f23818a.getAndSet(true)) {
            return;
        }
        a aVar = this.f23819b;
        if (((AtomicReference) aVar.f22980b).get() != this) {
            return;
        }
        j jVar = (j) aVar.f22981c;
        jVar.f23820a.f(jVar.f23821b, null);
    }

    public final void b(Object obj, String str, String str2) {
        if (this.f23818a.get()) {
            return;
        }
        a aVar = this.f23819b;
        if (((AtomicReference) aVar.f22980b).get() != this) {
            return;
        }
        j jVar = (j) aVar.f22981c;
        jVar.f23820a.f(jVar.f23821b, jVar.f23822c.e(obj, str, str2));
    }

    public final void c(Object obj) {
        if (this.f23818a.get()) {
            return;
        }
        a aVar = this.f23819b;
        if (((AtomicReference) aVar.f22980b).get() != this) {
            return;
        }
        j jVar = (j) aVar.f22981c;
        jVar.f23820a.f(jVar.f23821b, jVar.f23822c.b(obj));
    }
}
