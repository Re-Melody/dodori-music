package p161o8;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23828b;

    public o(String str, Object obj) {
        this.f23827a = str;
        this.f23828b = obj;
    }

    public final Object a(String str) {
        Object obj = this.f23828b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public final boolean b(String str) {
        Object obj = this.f23828b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has(str);
        }
        throw new ClassCastException();
    }
}
