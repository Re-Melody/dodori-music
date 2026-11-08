package p066g;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import p076h.b;

/* JADX INFO: loaded from: classes.dex */
public final class i extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f19921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f19923d;

    public /* synthetic */ i(j jVar, String str, b bVar, int i10) {
        this.f19920a = i10;
        this.f19921b = jVar;
        this.f19922c = str;
        this.f19923d = bVar;
    }

    @Override // p066g.d
    public final void a(Object obj) {
        switch (this.f19920a) {
            case 0:
                j jVar = this.f19921b;
                LinkedHashMap linkedHashMap = jVar.f19925b;
                String str = this.f19922c;
                Object obj2 = linkedHashMap.get(str);
                b bVar = this.f19923d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                ArrayList arrayList = jVar.f19927d;
                arrayList.add(str);
                try {
                    jVar.b(iIntValue, bVar, obj);
                    return;
                } catch (Exception e2) {
                    arrayList.remove(str);
                    throw e2;
                }
            default:
                j jVar2 = this.f19921b;
                LinkedHashMap linkedHashMap2 = jVar2.f19925b;
                String str2 = this.f19922c;
                Object obj3 = linkedHashMap2.get(str2);
                b bVar2 = this.f19923d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                ArrayList arrayList2 = jVar2.f19927d;
                arrayList2.add(str2);
                try {
                    jVar2.b(iIntValue2, bVar2, obj);
                    return;
                } catch (Exception e4) {
                    arrayList2.remove(str2);
                    throw e4;
                }
        }
    }

    public void b() {
        this.f19921b.f(this.f19922c);
    }
}
