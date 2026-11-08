package Z9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f14045a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f14046b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f14047c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f14048d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f14049e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f14050f = null;

    public final void a(r rVar) {
        rVar.f();
        rVar.c(this);
        r rVar2 = this.f14047c;
        if (rVar2 == null) {
            this.f14046b = rVar;
            this.f14047c = rVar;
        } else {
            rVar2.f14049e = rVar;
            rVar.f14048d = rVar2;
            this.f14047c = rVar;
        }
    }

    public final List b() {
        ArrayList arrayList = this.f14050f;
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public void c(r rVar) {
        this.f14045a = rVar;
    }

    public final void d(List list) {
        if (list.isEmpty()) {
            this.f14050f = null;
        } else {
            this.f14050f = new ArrayList(list);
        }
    }

    public String e() {
        return "";
    }

    public final void f() {
        r rVar = this.f14048d;
        if (rVar != null) {
            rVar.f14049e = this.f14049e;
        } else {
            r rVar2 = this.f14045a;
            if (rVar2 != null) {
                rVar2.f14046b = this.f14049e;
            }
        }
        r rVar3 = this.f14049e;
        if (rVar3 != null) {
            rVar3.f14048d = rVar;
        } else {
            r rVar4 = this.f14045a;
            if (rVar4 != null) {
                rVar4.f14047c = rVar;
            }
        }
        this.f14045a = null;
        this.f14049e = null;
        this.f14048d = null;
    }

    public final String toString() {
        return getClass().getSimpleName() + "{" + e() + "}";
    }
}
