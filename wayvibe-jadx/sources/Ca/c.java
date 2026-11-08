package Ca;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f1505a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f1506b = new ArrayList();

    public static void a(HashMap map, List list, p150n8.o oVar) {
        HashMap map2 = f1505a;
        map2.clear();
        ArrayList arrayList = f1506b;
        arrayList.clear();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((String) entry.getKey(), (String) entry.getValue());
            Log.d("MapLibreCustomHttpInterceptor", "Setting " + ((String) entry.getKey()) + " to " + ((String) entry.getValue()));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        try {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.f24086d.add(new b());
            ra.a.f26028c = new OkHttpClient(builder);
            oVar.b(null);
        } catch (Exception e2) {
            Log.e("MapLibreCustomHttpInterceptor", "Error creating HTTP client: " + e2.getMessage());
            throw new RuntimeException(e2);
        }
    }
}
