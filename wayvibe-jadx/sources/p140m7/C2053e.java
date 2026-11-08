package p140m7;

import android.text.TextUtils;
import com.amazon.a.a.o.b.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p170p7.n;

/* JADX INFO: renamed from: m7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2053e extends AbstractC2065q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC2052d f22452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f22453c;

    public C2053e(List list, EnumC2052d enumC2052d) {
        this.f22451a = new ArrayList(list);
        this.f22452b = enumC2052d;
    }

    @Override // p140m7.AbstractC2065q
    public final String a() {
        boolean z10;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f22451a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (e()) {
                    z10 = true;
                    break;
                }
            } else if (((AbstractC2065q) it.next()) instanceof C2053e) {
            }
            z10 = false;
            break;
        }
        if (z10) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                sb.append(((AbstractC2065q) it2.next()).a());
            }
            return sb.toString();
        }
        sb.append(this.f22452b.toString() + "(");
        sb.append(TextUtils.join(f.f16451a, arrayList));
        sb.append(")");
        return sb.toString();
    }

    @Override // p140m7.AbstractC2065q
    public final List b() {
        return Collections.unmodifiableList(this.f22451a);
    }

    @Override // p140m7.AbstractC2065q
    public final List c() {
        ArrayList arrayList = this.f22453c;
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        this.f22453c = new ArrayList();
        Iterator it = this.f22451a.iterator();
        while (it.hasNext()) {
            this.f22453c.addAll(((AbstractC2065q) it.next()).c());
        }
        return Collections.unmodifiableList(this.f22453c);
    }

    @Override // p140m7.AbstractC2065q
    public final boolean d(n nVar) {
        boolean zE = e();
        ArrayList arrayList = this.f22451a;
        if (zE) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((AbstractC2065q) it.next()).d(nVar)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((AbstractC2065q) it2.next()).d(nVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        return this.f22452b == EnumC2052d.AND;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2053e)) {
            return false;
        }
        C2053e c2053e = (C2053e) obj;
        return this.f22452b == c2053e.f22452b && this.f22451a.equals(c2053e.f22451a);
    }

    public final int hashCode() {
        return this.f22451a.hashCode() + ((this.f22452b.hashCode() + 1147) * 31);
    }

    public final String toString() {
        return a();
    }
}
