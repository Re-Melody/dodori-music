package p260y9;

import java.util.Iterator;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p251x9.c;
import p251x9.d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class U extends AbstractC2378n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f29259b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(a primitiveSerializer) {
        super(primitiveSerializer);
        m.f(primitiveSerializer, "primitiveSerializer");
        this.f29259b = new T(primitiveSerializer.getDescriptor());
    }

    @Override // p260y9.AbstractC2365a
    public final Object a() {
        return (S) g(j());
    }

    @Override // p260y9.AbstractC2365a
    public final int b(Object obj) {
        S s8 = (S) obj;
        m.f(s8, "<this>");
        return s8.d();
    }

    @Override // p260y9.AbstractC2365a
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // p260y9.AbstractC2365a, p219u9.a
    public final Object deserialize(c decoder) {
        m.f(decoder, "decoder");
        return e(decoder);
    }

    @Override // p219u9.a
    public final g getDescriptor() {
        return this.f29259b;
    }

    @Override // p260y9.AbstractC2365a
    public final Object h(Object obj) {
        S s8 = (S) obj;
        m.f(s8, "<this>");
        return s8.a();
    }

    @Override // p260y9.AbstractC2378n
    public final void i(int i10, Object obj, Object obj2) {
        m.f((S) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(b bVar, Object obj, int i10);

    @Override // p260y9.AbstractC2378n, p219u9.a
    public final void serialize(d encoder, Object obj) {
        m.f(encoder, "encoder");
        int iD = d(obj);
        T t10 = this.f29259b;
        b bVarO = encoder.o(t10, iD);
        k(bVarO, obj, iD);
        bVarO.c(t10);
    }
}
