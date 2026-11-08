package G0;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: G0.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0480j1 implements p085h9.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5241b;

    public /* synthetic */ C0480j1(Object obj, int i10) {
        this.f5240a = i10;
        this.f5241b = obj;
    }

    public void c(Object obj, String str) {
        ((ArrayList) this.f5241b).add(new C0477i1(str, obj));
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [S8.h, Z8.e] */
    @Override // p085h9.h
    public final Iterator iterator() {
        switch (this.f5240a) {
            case 0:
                return ((ArrayList) this.f5241b).iterator();
            case 1:
                return kotlin.jvm.internal.m.i((Object[]) this.f5241b);
            case 2:
                return ((Iterable) this.f5241b).iterator();
            case 3:
                return new X8.m(this);
            case 4:
                return R3.a.S((S8.h) this.f5241b);
            case 5:
                return (Iterator) this.f5241b;
            default:
                return new p097i9.d((String) this.f5241b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0480j1(Z8.e eVar) {
        this.f5240a = 4;
        this.f5241b = (S8.h) eVar;
    }

    public C0480j1() {
        this.f5240a = 0;
        this.f5241b = new ArrayList();
    }
}
