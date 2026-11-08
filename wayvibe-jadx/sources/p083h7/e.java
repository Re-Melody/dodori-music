package p083h7;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p062f7.b;
import p062f7.c;
import p062f7.d;
import p062f7.f;
import p062f7.g;

/* JADX INFO: loaded from: classes.dex */
public final class e implements p062f7.e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20331a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonWriter f20332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f20333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f20334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f20335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20336f;

    public e(BufferedWriter bufferedWriter, HashMap map, HashMap map2, a aVar, boolean z10) {
        this.f20332b = new JsonWriter(bufferedWriter);
        this.f20333c = map;
        this.f20334d = map2;
        this.f20335e = aVar;
        this.f20336f = z10;
    }

    @Override // p062f7.e
    public final p062f7.e a(c cVar, long j10) throws IOException {
        String str = cVar.f19846a;
        g();
        JsonWriter jsonWriter = this.f20332b;
        jsonWriter.name(str);
        g();
        jsonWriter.value(j10);
        return this;
    }

    @Override // p062f7.e
    public final p062f7.e b(c cVar, Object obj) throws IOException {
        f(obj, cVar.f19846a);
        return this;
    }

    @Override // p062f7.g
    public final g c(String str) throws IOException {
        g();
        this.f20332b.value(str);
        return this;
    }

    @Override // p062f7.g
    public final g d(boolean z10) throws IOException {
        g();
        this.f20332b.value(z10);
        return this;
    }

    public final e e(Object obj) throws IOException {
        JsonWriter jsonWriter = this.f20332b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    e(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        f(entry.getValue(), (String) key);
                    } catch (ClassCastException e2) {
                        throw new b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e2);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            d dVar = (d) this.f20333c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            f fVar = (f) this.f20334d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f20335e.a(obj, this);
                throw null;
            }
            String strName = ((Enum) obj).name();
            g();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            g();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i10 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i10 < length) {
                jsonWriter.value(iArr[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                long j10 = jArr[i10];
                g();
                jsonWriter.value(j10);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                jsonWriter.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                jsonWriter.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i10 < length5) {
                e(numberArr[i10]);
                i10++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i10 < length6) {
                e(objArr[i10]);
                i10++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e f(Object obj, String str) throws IOException {
        boolean z10 = this.f20336f;
        JsonWriter jsonWriter = this.f20332b;
        if (z10) {
            if (obj == null) {
                return this;
            }
            g();
            jsonWriter.name(str);
            e(obj);
            return this;
        }
        g();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        e(obj);
        return this;
    }

    public final void g() {
        if (!this.f20331a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
