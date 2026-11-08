package M0;

import G0.V;
import M8.InterfaceC0643e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j implements v, Iterable, p013a9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8047a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8049c;

    public final Object a(u uVar) {
        Object obj = this.f8047a.get(uVar);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + uVar + " - consider getOrElse or getOrNull");
    }

    public final void c(u uVar, Object obj) {
        boolean z10 = obj instanceof a;
        LinkedHashMap linkedHashMap = this.f8047a;
        if (!z10 || !linkedHashMap.containsKey(uVar)) {
            linkedHashMap.put(uVar, obj);
            return;
        }
        Object obj2 = linkedHashMap.get(uVar);
        kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        a aVar = (a) obj2;
        a aVar2 = (a) obj;
        String str = aVar2.f8010a;
        if (str == null) {
            str = aVar.f8010a;
        }
        InterfaceC0643e interfaceC0643e = aVar2.f8011b;
        if (interfaceC0643e == null) {
            interfaceC0643e = aVar.f8011b;
        }
        linkedHashMap.put(uVar, new a(str, interfaceC0643e));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.b(this.f8047a, jVar.f8047a) && this.f8048b == jVar.f8048b && this.f8049c == jVar.f8049c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8049c) + p134m1.b.f(this.f8047a.hashCode() * 31, 31, this.f8048b);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f8047a.entrySet().iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f8048b) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f8049c) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f8047a.entrySet()) {
            u uVar = (u) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(uVar.f8108a);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return V.x(this) + "{ " + ((Object) sb) + " }";
    }
}
