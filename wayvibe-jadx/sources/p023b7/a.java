package p023b7;

import G2.c;
import U2.s;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p206t6.b;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f15772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f15773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f15775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f15776f;

    public a(String str, Set set, Set set2, int i10, d dVar, Set set3) {
        this.f15771a = str;
        this.f15772b = Collections.unmodifiableSet(set);
        this.f15773c = Collections.unmodifiableSet(set2);
        this.f15774d = i10;
        this.f15775e = dVar;
        this.f15776f = Collections.unmodifiableSet(set3);
    }

    public static s a(q qVar) {
        q[] qVarArr = new q[0];
        s sVar = new s();
        sVar.f12164b = null;
        HashSet hashSet = new HashSet();
        sVar.f12165c = hashSet;
        sVar.f12166d = new HashSet();
        sVar.f12163a = 0;
        sVar.f12168f = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            b.j(qVar2, "Null interface");
        }
        Collections.addAll((HashSet) sVar.f12165c, qVarArr);
        return sVar;
    }

    public static a b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            b.j(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, new c(obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f15772b.toArray()) + ">{0, type=" + this.f15774d + ", deps=" + Arrays.toString(this.f15773c.toArray()) + "}";
    }
}
