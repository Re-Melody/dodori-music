package A6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class J extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC0077b f309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f313e;

    public J() {
        this.f309a = EnumC0077b.NOT_READY;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        EnumC0077b enumC0077b = this.f309a;
        EnumC0077b enumC0077b2 = EnumC0077b.FAILED;
        p229v9.a.p(enumC0077b != enumC0077b2);
        int i10 = AbstractC0076a.f338a[this.f309a.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                this.f309a = enumC0077b2;
                switch (this.f311c) {
                    case 0:
                        do {
                            Iterator it = this.f312d;
                            if (!it.hasNext()) {
                                this.f309a = EnumC0077b.DONE;
                                next = null;
                            } else {
                                next = it.next();
                            }
                            break;
                        } while (!((p267z6.k) this.f313e).apply(next));
                        break;
                    default:
                        do {
                            Iterator it2 = this.f312d;
                            if (!it2.hasNext()) {
                                this.f309a = EnumC0077b.DONE;
                                next = null;
                            } else {
                                next = it2.next();
                            }
                            break;
                        } while (!((e0) this.f313e).f368b.contains(next));
                        break;
                }
                this.f310b = next;
                if (this.f309a != EnumC0077b.DONE) {
                    this.f309a = EnumC0077b.READY;
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f309a = EnumC0077b.NOT_READY;
        Object obj = this.f310b;
        this.f310b = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public J(Iterator it, p267z6.k kVar) {
        this();
        this.f311c = 0;
        this.f312d = it;
        this.f313e = kVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public J(e0 e0Var) {
        this();
        this.f311c = 1;
        this.f313e = e0Var;
        this.f312d = e0Var.f367a.iterator();
    }
}
