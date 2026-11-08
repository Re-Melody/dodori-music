package za;

import V0.p;

/* JADX INFO: loaded from: classes2.dex */
public class b extends g implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f29958c;

    public b(Object obj) {
        Object objValueOf;
        String str;
        if (obj instanceof String) {
            str = (String) obj;
            if (str.length() > 1 && str.charAt(0) == '\"' && str.charAt(str.length() - 1) == '\"') {
                objValueOf = str;
                objValueOf = str;
                objValueOf = str;
                objValueOf = p.i(1, 1, str);
            }
        } else if (obj instanceof Number) {
            objValueOf = obj;
            objValueOf = Float.valueOf(((Number) obj).floatValue());
        }
        objValueOf = obj;
        objValueOf = str;
        objValueOf = str;
        objValueOf = str;
        objValueOf = str;
        objValueOf = str;
        objValueOf = str;
        this.f29958c = objValueOf;
    }

    @Override // za.f
    public final Object a() {
        Object obj = this.f29958c;
        if (obj instanceof Aa.c) {
            throw new IllegalArgumentException("PropertyValue are not allowed as an expression literal, use value instead.");
        }
        return obj instanceof b ? ((b) obj).a() : obj;
    }

    @Override // za.g
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Object obj2 = ((b) obj).f29958c;
        Object obj3 = this.f29958c;
        if (obj3 != null) {
            return obj3.equals(obj2);
        }
        return obj2 == null;
    }

    @Override // za.g
    public final Object[] g() {
        return new Object[]{"literal", this.f29958c};
    }

    @Override // za.g
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Object obj = this.f29958c;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @Override // za.g
    public String toString() {
        Object obj = this.f29958c;
        if (!(obj instanceof String)) {
            return obj.toString();
        }
        return "\"" + obj + "\"";
    }
}
