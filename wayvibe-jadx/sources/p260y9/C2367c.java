package p260y9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;

/* JADX INFO: renamed from: y9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2367c extends AbstractC2378n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2366b f29271b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2367c(a element) {
        super(element);
        m.f(element, "element");
        g elementDesc = element.getDescriptor();
        m.f(elementDesc, "elementDesc");
        this.f29271b = new C2366b(elementDesc);
    }

    @Override // p260y9.AbstractC2365a
    public final Object a() {
        return new ArrayList();
    }

    @Override // p260y9.AbstractC2365a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        m.f(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // p260y9.AbstractC2365a
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        m.f(collection, "<this>");
        return collection.iterator();
    }

    @Override // p260y9.AbstractC2365a
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        m.f(collection, "<this>");
        return collection.size();
    }

    @Override // p260y9.AbstractC2365a
    public final Object g(Object obj) {
        m.f(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // p219u9.a
    public final g getDescriptor() {
        return this.f29271b;
    }

    @Override // p260y9.AbstractC2365a
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        m.f(arrayList, "<this>");
        return arrayList;
    }

    @Override // p260y9.AbstractC2378n
    public final void i(int i10, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        m.f(arrayList, "<this>");
        arrayList.add(i10, obj2);
    }
}
