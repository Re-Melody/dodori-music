package M7;

import H7.i;
import com.google.gson.JsonPrimitive;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f8375a;

    public static void a(b bVar) {
        if (bVar instanceof i) {
            i iVar = (i) bVar;
            iVar.V(c.NAME);
            Map.Entry entry = (Map.Entry) ((Iterator) iVar.Z()).next();
            iVar.b0(entry.getValue());
            iVar.b0(new JsonPrimitive((String) entry.getKey()));
            return;
        }
        int iG = bVar.f8383h;
        if (iG == 0) {
            iG = bVar.g();
        }
        if (iG == 13) {
            bVar.f8383h = 9;
            return;
        }
        if (iG == 12) {
            bVar.f8383h = 8;
        } else {
            if (iG == 14) {
                bVar.f8383h = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + bVar.N() + bVar.C());
        }
    }
}
