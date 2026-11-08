package androidx.datastore.preferences.protobuf;

import com.google.protobuf.G0;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15097b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f15099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f15100e;

    public /* synthetic */ g0(AbstractMap abstractMap, int i10) {
        this.f15096a = i10;
        this.f15100e = abstractMap;
    }

    public final Iterator a() {
        switch (this.f15096a) {
            case 0:
                if (this.f15099d == null) {
                    this.f15099d = ((e0) this.f15100e).f15083b.entrySet().iterator();
                }
                break;
            default:
                if (this.f15099d == null) {
                    this.f15099d = ((G0) this.f15100e).f18678c.entrySet().iterator();
                }
                break;
        }
        return this.f15099d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f15096a) {
            case 0:
                int i10 = this.f15097b + 1;
                e0 e0Var = (e0) this.f15100e;
                if (i10 >= e0Var.f15082a.size()) {
                    return !e0Var.f15083b.isEmpty() && a().hasNext();
                }
                return true;
            default:
                int i11 = this.f15097b + 1;
                G0 g3 = (G0) this.f15100e;
                if (i11 >= g3.f18677b.size()) {
                    return !g3.f18678c.isEmpty() && a().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f15096a) {
            case 0:
                this.f15098c = true;
                int i10 = this.f15097b + 1;
                this.f15097b = i10;
                e0 e0Var = (e0) this.f15100e;
                return i10 < e0Var.f15082a.size() ? (Map.Entry) e0Var.f15082a.get(this.f15097b) : (Map.Entry) a().next();
            default:
                this.f15098c = true;
                int i11 = this.f15097b + 1;
                this.f15097b = i11;
                G0 g3 = (G0) this.f15100e;
                return i11 < g3.f18677b.size() ? (Map.Entry) g3.f18677b.get(this.f15097b) : (Map.Entry) a().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMap abstractMap = this.f15100e;
        switch (this.f15096a) {
            case 0:
                if (!this.f15098c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f15098c = false;
                int i10 = e0.f15081f;
                e0 e0Var = (e0) abstractMap;
                e0Var.b();
                if (this.f15097b >= e0Var.f15082a.size()) {
                    a().remove();
                    return;
                }
                int i11 = this.f15097b;
                this.f15097b = i11 - 1;
                e0Var.i(i11);
                return;
            default:
                if (!this.f15098c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f15098c = false;
                int i12 = G0.f18675g;
                G0 g3 = (G0) abstractMap;
                g3.b();
                if (this.f15097b >= g3.f18677b.size()) {
                    a().remove();
                    return;
                }
                int i13 = this.f15097b;
                this.f15097b = i13 - 1;
                g3.h(i13);
                return;
        }
    }
}
