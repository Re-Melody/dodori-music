package M3;

import android.os.Bundle;
import androidx.lifecycle.C1115j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f8265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f8267e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p172q.f f8263a = new p172q.f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8268f = true;

    public final Bundle a(String key) {
        m.f(key, "key");
        if (!this.f8266d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f8265c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(key);
        Bundle bundle3 = this.f8265c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f8265c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f8265c = null;
        return bundle2;
    }

    public final e b() {
        String str;
        e eVar;
        Iterator it = this.f8263a.iterator();
        do {
            p172q.b bVar = (p172q.b) it;
            if (!bVar.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) bVar.next();
            m.e(components, "components");
            str = (String) components.getKey();
            eVar = (e) components.getValue();
        } while (!m.b(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return eVar;
    }

    public final void c(String str, e provider) {
        Object obj;
        m.f(provider, "provider");
        p172q.f fVar = this.f8263a;
        p172q.c cVarA = fVar.a(str);
        if (cVarA != null) {
            obj = cVarA.f25368b;
        } else {
            p172q.c cVar = new p172q.c(str, provider);
            fVar.f25377d++;
            p172q.c cVar2 = fVar.f25375b;
            if (cVar2 == null) {
                fVar.f25374a = cVar;
                fVar.f25375b = cVar;
            } else {
                cVar2.f25369c = cVar;
                cVar.f25370d = cVar2;
                fVar.f25375b = cVar;
            }
            obj = null;
        }
        if (((e) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f8268f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a aVar = this.f8267e;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f8267e = aVar;
        try {
            C1115j.class.getDeclaredConstructor(new Class[0]);
            a aVar2 = this.f8267e;
            if (aVar2 != null) {
                ((LinkedHashSet) aVar2.f8258b).add(C1115j.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C1115j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }
}
