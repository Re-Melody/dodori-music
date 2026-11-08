package H7;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i extends M7.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g f6177t = new g();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object f6178u = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object[] f6179p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6180q;
    public String[] r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f6181s;

    @Override // M7.b
    public final boolean A() {
        M7.c cVarN = N();
        return (cVarN == M7.c.END_OBJECT || cVarN == M7.c.END_ARRAY || cVarN == M7.c.END_DOCUMENT) ? false : true;
    }

    @Override // M7.b
    public final boolean D() {
        V(M7.c.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) a0()).getAsBoolean();
        int i10 = this.f6180q;
        if (i10 > 0) {
            int[] iArr = this.f6181s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return asBoolean;
    }

    @Override // M7.b
    public final double E() throws M7.e {
        M7.c cVarN = N();
        M7.c cVar = M7.c.NUMBER;
        if (cVarN != cVar && cVarN != M7.c.STRING) {
            throw new IllegalStateException("Expected " + cVar + " but was " + cVarN + X());
        }
        double asDouble = ((JsonPrimitive) Z()).getAsDouble();
        if (!this.f8377b && (Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
            throw new M7.e("JSON forbids NaN and infinities: " + asDouble);
        }
        a0();
        int i10 = this.f6180q;
        if (i10 > 0) {
            int[] iArr = this.f6181s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return asDouble;
    }

    @Override // M7.b
    public final int F() {
        M7.c cVarN = N();
        M7.c cVar = M7.c.NUMBER;
        if (cVarN != cVar && cVarN != M7.c.STRING) {
            throw new IllegalStateException("Expected " + cVar + " but was " + cVarN + X());
        }
        int asInt = ((JsonPrimitive) Z()).getAsInt();
        a0();
        int i10 = this.f6180q;
        if (i10 > 0) {
            int[] iArr = this.f6181s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return asInt;
    }

    @Override // M7.b
    public final long G() {
        M7.c cVarN = N();
        M7.c cVar = M7.c.NUMBER;
        if (cVarN != cVar && cVarN != M7.c.STRING) {
            throw new IllegalStateException("Expected " + cVar + " but was " + cVarN + X());
        }
        long asLong = ((JsonPrimitive) Z()).getAsLong();
        a0();
        int i10 = this.f6180q;
        if (i10 > 0) {
            int[] iArr = this.f6181s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return asLong;
    }

    @Override // M7.b
    public final String H() {
        return Y(false);
    }

    @Override // M7.b
    public final void J() {
        V(M7.c.NULL);
        a0();
        int i10 = this.f6180q;
        if (i10 > 0) {
            int[] iArr = this.f6181s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // M7.b
    public final String L() {
        M7.c cVarN = N();
        M7.c cVar = M7.c.STRING;
        if (cVarN != cVar && cVarN != M7.c.NUMBER) {
            throw new IllegalStateException("Expected " + cVar + " but was " + cVarN + X());
        }
        String asString = ((JsonPrimitive) a0()).getAsString();
        int i10 = this.f6180q;
        if (i10 > 0) {
            int[] iArr = this.f6181s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return asString;
    }

    @Override // M7.b
    public final M7.c N() {
        if (this.f6180q == 0) {
            return M7.c.END_DOCUMENT;
        }
        Object objZ = Z();
        if (objZ instanceof Iterator) {
            boolean z10 = this.f6179p[this.f6180q - 2] instanceof JsonObject;
            Iterator it = (Iterator) objZ;
            if (!it.hasNext()) {
                return z10 ? M7.c.END_OBJECT : M7.c.END_ARRAY;
            }
            if (z10) {
                return M7.c.NAME;
            }
            b0(it.next());
            return N();
        }
        if (objZ instanceof JsonObject) {
            return M7.c.BEGIN_OBJECT;
        }
        if (objZ instanceof JsonArray) {
            return M7.c.BEGIN_ARRAY;
        }
        if (objZ instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) objZ;
            if (jsonPrimitive.isString()) {
                return M7.c.STRING;
            }
            if (jsonPrimitive.isBoolean()) {
                return M7.c.BOOLEAN;
            }
            if (jsonPrimitive.isNumber()) {
                return M7.c.NUMBER;
            }
            throw new AssertionError();
        }
        if (objZ instanceof E7.o) {
            return M7.c.NULL;
        }
        if (objZ == f6178u) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new M7.e("Custom JsonElement subclass " + objZ.getClass().getName() + " is not supported");
    }

    @Override // M7.b
    public final void T() {
        int i10 = h.f6176a[N().ordinal()];
        if (i10 == 1) {
            Y(true);
            return;
        }
        if (i10 == 2) {
            l();
            return;
        }
        if (i10 == 3) {
            q();
            return;
        }
        if (i10 != 4) {
            a0();
            int i11 = this.f6180q;
            if (i11 > 0) {
                int[] iArr = this.f6181s;
                int i12 = i11 - 1;
                iArr[i12] = iArr[i12] + 1;
            }
        }
    }

    public final void V(M7.c cVar) {
        if (N() == cVar) {
            return;
        }
        throw new IllegalStateException("Expected " + cVar + " but was " + N() + X());
    }

    public final String W(boolean z10) {
        StringBuilder sb = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f6180q;
            if (i10 >= i11) {
                return sb.toString();
            }
            Object[] objArr = this.f6179p;
            Object obj = objArr[i10];
            if (obj instanceof JsonArray) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.f6181s[i10];
                    if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb.append('[');
                    sb.append(i12);
                    sb.append(']');
                }
            } else if ((obj instanceof JsonObject) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb.append(com.amazon.a.a.o.c.a.b.f16463a);
                String str = this.r[i10];
                if (str != null) {
                    sb.append(str);
                }
            }
            i10++;
        }
    }

    public final String X() {
        return " at path " + W(false);
    }

    public final String Y(boolean z10) {
        V(M7.c.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) Z()).next();
        String str = (String) entry.getKey();
        this.r[this.f6180q - 1] = z10 ? "<skipped>" : str;
        b0(entry.getValue());
        return str;
    }

    public final Object Z() {
        return this.f6179p[this.f6180q - 1];
    }

    public final Object a0() {
        Object[] objArr = this.f6179p;
        int i10 = this.f6180q - 1;
        this.f6180q = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    @Override // M7.b
    public final void b() {
        V(M7.c.BEGIN_ARRAY);
        b0(((JsonArray) Z()).iterator());
        this.f6181s[this.f6180q - 1] = 0;
    }

    public final void b0(Object obj) {
        int i10 = this.f6180q;
        Object[] objArr = this.f6179p;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f6179p = Arrays.copyOf(objArr, i11);
            this.f6181s = Arrays.copyOf(this.f6181s, i11);
            this.r = (String[]) Arrays.copyOf(this.r, i11);
        }
        Object[] objArr2 = this.f6179p;
        int i12 = this.f6180q;
        this.f6180q = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // M7.b
    public final void c() {
        V(M7.c.BEGIN_OBJECT);
        b0(((JsonObject) Z()).entrySet().iterator());
    }

    @Override // M7.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6179p = new Object[]{f6178u};
        this.f6180q = 1;
    }

    @Override // M7.b
    public final void l() {
        V(M7.c.END_ARRAY);
        a0();
        a0();
        int i10 = this.f6180q;
        if (i10 > 0) {
            int[] iArr = this.f6181s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // M7.b
    public final void q() {
        V(M7.c.END_OBJECT);
        this.r[this.f6180q - 1] = null;
        a0();
        a0();
        int i10 = this.f6180q;
        if (i10 > 0) {
            int[] iArr = this.f6181s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // M7.b
    public final String toString() {
        return i.class.getSimpleName() + X();
    }

    @Override // M7.b
    public final String w() {
        return W(false);
    }

    @Override // M7.b
    public final String z() {
        return W(true);
    }
}
