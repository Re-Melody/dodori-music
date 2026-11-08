package p148n5;

import W4.m;
import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f22962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f22963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f22964c;

    public f(Context context, e eVar) {
        m mVar = new m(context, 21);
        this.f22964c = new HashMap();
        this.f22962a = mVar;
        this.f22963b = eVar;
    }

    public final synchronized g a(String str) {
        if (this.f22964c.containsKey(str)) {
            return (g) this.f22964c.get(str);
        }
        CctBackendFactory cctBackendFactoryY = this.f22962a.y(str);
        if (cctBackendFactoryY == null) {
            return null;
        }
        e eVar = this.f22963b;
        g gVarCreate = cctBackendFactoryY.create(new b(eVar.f22959a, eVar.f22960b, eVar.f22961c, str));
        this.f22964c.put(str, gVarCreate);
        return gVarCreate;
    }
}
