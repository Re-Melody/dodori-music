package p066g;

import V0.p;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC1121p;
import androidx.lifecycle.EnumC1119n;
import androidx.lifecycle.EnumC1120o;
import androidx.lifecycle.InterfaceC1123s;
import androidx.lifecycle.InterfaceC1125u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import p076h.b;
import p085h9.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f19924a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f19925b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f19926c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f19927d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f19928e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f19929f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f19930g = new Bundle();

    public final boolean a(int i10, int i11, Intent intent) {
        String str = (String) this.f19924a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        f fVar = (f) this.f19928e.get(str);
        if ((fVar != null ? fVar.f19915a : null) != null) {
            ArrayList arrayList = this.f19927d;
            if (arrayList.contains(str)) {
                fVar.f19915a.onActivityResult(fVar.f19916b.parseResult(i11, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f19929f.remove(str);
        this.f19930g.putParcelable(str, new a(i11, intent));
        return true;
    }

    public abstract void b(int i10, b bVar, Object obj);

    public final i c(final String key, InterfaceC1125u lifecycleOwner, final b contract, final b callback) {
        m.f(key, "key");
        m.f(lifecycleOwner, "lifecycleOwner");
        m.f(contract, "contract");
        m.f(callback, "callback");
        AbstractC1121p lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState().a(EnumC1120o.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(key);
        LinkedHashMap linkedHashMap = this.f19926c;
        g gVar = (g) linkedHashMap.get(key);
        if (gVar == null) {
            gVar = new g(lifecycle);
        }
        InterfaceC1123s interfaceC1123s = new InterfaceC1123s() { // from class: g.e
            @Override // androidx.lifecycle.InterfaceC1123s
            public final void c(InterfaceC1125u interfaceC1125u, EnumC1119n enumC1119n) {
                j this$0 = this.f19911a;
                m.f(this$0, "this$0");
                String key2 = key;
                m.f(key2, "$key");
                b callback2 = callback;
                m.f(callback2, "$callback");
                b contract2 = contract;
                m.f(contract2, "$contract");
                EnumC1119n enumC1119n2 = EnumC1119n.ON_START;
                LinkedHashMap linkedHashMap2 = this$0.f19928e;
                if (enumC1119n2 != enumC1119n) {
                    if (EnumC1119n.ON_STOP == enumC1119n) {
                        linkedHashMap2.remove(key2);
                        return;
                    } else {
                        if (EnumC1119n.ON_DESTROY == enumC1119n) {
                            this$0.f(key2);
                            return;
                        }
                        return;
                    }
                }
                linkedHashMap2.put(key2, new f(contract2, callback2));
                LinkedHashMap linkedHashMap3 = this$0.f19929f;
                if (linkedHashMap3.containsKey(key2)) {
                    Object obj = linkedHashMap3.get(key2);
                    linkedHashMap3.remove(key2);
                    callback2.onActivityResult(obj);
                }
                Bundle bundle = this$0.f19930g;
                a aVar = (a) p206t6.b.E(bundle, key2, a.class);
                if (aVar != null) {
                    bundle.remove(key2);
                    callback2.onActivityResult(contract2.parseResult(aVar.f19909a, aVar.f19910b));
                }
            }
        };
        gVar.f19917a.addObserver(interfaceC1123s);
        gVar.f19918b.add(interfaceC1123s);
        linkedHashMap.put(key, gVar);
        return new i(this, key, contract, 0);
    }

    public final i d(String key, b bVar, b bVar2) {
        m.f(key, "key");
        e(key);
        this.f19928e.put(key, new f(bVar, bVar2));
        LinkedHashMap linkedHashMap = this.f19929f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            bVar2.onActivityResult(obj);
        }
        Bundle bundle = this.f19930g;
        a aVar = (a) p206t6.b.E(bundle, key, a.class);
        if (aVar != null) {
            bundle.remove(key);
            bVar2.onActivityResult(bVar.parseResult(aVar.f19909a, aVar.f19910b));
        }
        return new i(this, key, bVar, 1);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f19925b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : new a(new X8.j(h.f19919a, new p021b5.b(6)))) {
            int iIntValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.f19924a;
            if (!linkedHashMap2.containsKey(Integer.valueOf(iIntValue))) {
                int iIntValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue2), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String key) {
        Integer num;
        m.f(key, "key");
        if (!this.f19927d.contains(key) && (num = (Integer) this.f19925b.remove(key)) != null) {
            this.f19924a.remove(num);
        }
        this.f19928e.remove(key);
        LinkedHashMap linkedHashMap = this.f19929f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder sbU = p.u("Dropping pending result for request ", key, ": ");
            sbU.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", sbU.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f19930g;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((a) p206t6.b.E(bundle, key, a.class)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f19926c;
        g gVar = (g) linkedHashMap2.get(key);
        if (gVar != null) {
            ArrayList arrayList = gVar.f19918b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gVar.f19917a.removeObserver((InterfaceC1123s) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
