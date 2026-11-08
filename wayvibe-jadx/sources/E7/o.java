package E7;

import com.google.gson.JsonElement;

/* JADX INFO: loaded from: classes.dex */
public final class o extends JsonElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f3180a = new o();

    @Override // com.google.gson.JsonElement
    public final JsonElement deepCopy() {
        return f3180a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof o;
    }

    public final int hashCode() {
        return o.class.hashCode();
    }
}
