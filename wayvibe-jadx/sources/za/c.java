package za;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends b {
    @Override // za.b, za.g
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals((Object[]) this.f29958c, (Object[]) ((c) obj).f29958c);
    }

    @Override // za.b, za.g
    public final String toString() {
        Object[] objArr = (Object[]) this.f29958c;
        StringBuilder sb = new StringBuilder("[");
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj instanceof String) {
                sb.append("\"");
                sb.append(obj);
                sb.append("\"");
            } else {
                sb.append(obj);
            }
            if (i10 != objArr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
