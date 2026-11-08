package za;

import B2.AbstractC0112b;
import V0.p;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends g implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f29959c;

    public d(HashMap map) {
        this.f29959c = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // za.f
    public final Object a() {
        HashMap map = new HashMap();
        HashMap map2 = this.f29959c;
        for (String str : map2.keySet()) {
            g gVar = (g) map2.get(str);
            if (gVar instanceof f) {
                map.put(str, ((f) gVar).a());
            } else {
                map.put(str, gVar.g());
            }
        }
        return map;
    }

    @Override // za.g
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass() && super.equals(obj)) {
            return this.f29959c.equals(((d) obj).f29959c);
        }
        return false;
    }

    @Override // za.g
    public final int hashCode() {
        return this.f29959c.hashCode() + (super.hashCode() * 31);
    }

    @Override // za.g
    public final String toString() {
        StringBuilder sbO = AbstractC0112b.o("{");
        HashMap map = this.f29959c;
        for (String str : map.keySet()) {
            p.x(sbO, "\"", str, "\": ");
            sbO.append(map.get(str));
            sbO.append(", ");
        }
        if (map.size() > 0) {
            sbO.delete(sbO.length() - 2, sbO.length());
        }
        sbO.append("}");
        return sbO.toString();
    }
}
