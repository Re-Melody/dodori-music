package p161o8;

import java.util.concurrent.atomic.AtomicReference;
import p150n8.a;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f23820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f23822c;

    public j(f fVar, String str) {
        this(fVar, str, x.f23838b);
    }

    public final void a(i iVar) {
        a aVar;
        if (iVar == null) {
            aVar = null;
        } else {
            a aVar2 = new a();
            aVar2.f22981c = this;
            aVar2.f22980b = new AtomicReference(null);
            aVar2.f22979a = iVar;
            aVar = aVar2;
        }
        this.f23820a.a(this.f23821b, aVar);
    }

    public j(f fVar, String str, t tVar) {
        this.f23820a = fVar;
        this.f23821b = str;
        this.f23822c = tVar;
    }
}
