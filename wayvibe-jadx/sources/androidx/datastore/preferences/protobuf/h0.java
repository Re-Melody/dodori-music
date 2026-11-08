package androidx.datastore.preferences.protobuf;

import com.google.protobuf.G0;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import p199t.C2228c;
import p199t.C2230e;

/* JADX INFO: loaded from: classes.dex */
public class h0 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f15109b;

    public /* synthetic */ h0(int i10, Map map) {
        this.f15108a = i10;
        this.f15109b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f15108a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((e0) this.f15109b).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((G0) this.f15109b).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f15108a) {
            case 0:
                ((e0) this.f15109b).clear();
                break;
            case 1:
                ((G0) this.f15109b).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f15108a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((e0) this.f15109b).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((G0) this.f15109b).get(entry2.getKey());
                Object value2 = entry2.getValue();
                return obj3 == value2 || (obj3 != null && obj3.equals(value2));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f15108a) {
            case 0:
                return new g0((e0) this.f15109b, 0);
            case 1:
                return new g0((G0) this.f15109b, 1);
            default:
                return new C2228c((C2230e) this.f15109b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f15108a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((e0) this.f15109b).remove(entry.getKey());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((G0) this.f15109b).remove(entry2.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f15108a) {
            case 0:
                return ((e0) this.f15109b).size();
            case 1:
                return ((G0) this.f15109b).size();
            default:
                return ((C2230e) this.f15109b).f26268c;
        }
    }
}
