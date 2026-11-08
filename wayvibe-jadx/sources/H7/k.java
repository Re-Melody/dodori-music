package H7;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k extends M7.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j f6182o = new j();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final JsonPrimitive f6183p = new JsonPrimitive("closed");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f6184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f6185m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public JsonElement f6186n;

    public k() {
        super(f6182o);
        this.f6184l = new ArrayList();
        this.f6186n = E7.o.f3180a;
    }

    @Override // M7.d
    public final void B(double d10) {
        if (this.f8396e || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            K(new JsonPrimitive(Double.valueOf(d10)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
    }

    @Override // M7.d
    public final void C(long j10) {
        K(new JsonPrimitive(Long.valueOf(j10)));
    }

    @Override // M7.d
    public final void D(Boolean bool) {
        if (bool == null) {
            K(E7.o.f3180a);
        } else {
            K(new JsonPrimitive(bool));
        }
    }

    @Override // M7.d
    public final void E(Number number) {
        if (number == null) {
            K(E7.o.f3180a);
            return;
        }
        if (!this.f8396e) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        K(new JsonPrimitive(number));
    }

    @Override // M7.d
    public final void F(String str) {
        if (str == null) {
            K(E7.o.f3180a);
        } else {
            K(new JsonPrimitive(str));
        }
    }

    @Override // M7.d
    public final void G(boolean z10) {
        K(new JsonPrimitive(Boolean.valueOf(z10)));
    }

    public final JsonElement I() {
        ArrayList arrayList = this.f6184l;
        if (arrayList.isEmpty()) {
            return this.f6186n;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final JsonElement J() {
        return (JsonElement) p134m1.b.i(1, this.f6184l);
    }

    public final void K(JsonElement jsonElement) {
        if (this.f6185m != null) {
            if (!jsonElement.isJsonNull() || this.f8399h) {
                ((JsonObject) J()).add(this.f6185m, jsonElement);
            }
            this.f6185m = null;
            return;
        }
        if (this.f6184l.isEmpty()) {
            this.f6186n = jsonElement;
            return;
        }
        JsonElement jsonElementJ = J();
        if (!(jsonElementJ instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        ((JsonArray) jsonElementJ).add(jsonElement);
    }

    @Override // M7.d
    public final void c() {
        JsonArray jsonArray = new JsonArray();
        K(jsonArray);
        this.f6184l.add(jsonArray);
    }

    @Override // M7.d, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f6184l;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f6183p);
    }

    @Override // M7.d
    public final void e() {
        JsonObject jsonObject = new JsonObject();
        K(jsonObject);
        this.f6184l.add(jsonObject);
    }

    @Override // M7.d
    public final void l() {
        ArrayList arrayList = this.f6184l;
        if (arrayList.isEmpty() || this.f6185m != null) {
            throw new IllegalStateException();
        }
        if (!(J() instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // M7.d
    public final void q() {
        ArrayList arrayList = this.f6184l;
        if (arrayList.isEmpty() || this.f6185m != null) {
            throw new IllegalStateException();
        }
        if (!(J() instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // M7.d
    public final void v(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f6184l.isEmpty() || this.f6185m != null) {
            throw new IllegalStateException();
        }
        if (!(J() instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        this.f6185m = str;
    }

    @Override // M7.d
    public final M7.d x() {
        K(E7.o.f3180a);
        return this;
    }

    @Override // M7.d, java.io.Flushable
    public final void flush() {
    }
}
