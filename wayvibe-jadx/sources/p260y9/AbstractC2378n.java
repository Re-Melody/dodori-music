package p260y9;

import java.util.Iterator;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p251x9.d;

/* JADX INFO: renamed from: y9.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2378n extends AbstractC2365a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f29308a;

    public AbstractC2378n(a aVar) {
        this.f29308a = aVar;
    }

    @Override // p260y9.AbstractC2365a
    public void f(p251x9.a aVar, int i10, Object obj) {
        i(i10, obj, aVar.i(getDescriptor(), i10, this.f29308a, null));
    }

    public abstract void i(int i10, Object obj, Object obj2);

    @Override // p219u9.a
    public void serialize(d encoder, Object obj) {
        m.f(encoder, "encoder");
        int iD = d(obj);
        g descriptor = getDescriptor();
        b bVarO = encoder.o(descriptor, iD);
        Iterator itC = c(obj);
        for (int i10 = 0; i10 < iD; i10++) {
            bVarO.m(getDescriptor(), i10, this.f29308a, itC.next());
        }
        bVarO.c(descriptor);
    }
}
