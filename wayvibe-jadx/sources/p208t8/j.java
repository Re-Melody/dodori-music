package p208t8;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import p161o8.w;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f26981d = new j();

    @Override // p161o8.w
    public final Object f(byte b10, ByteBuffer byteBuffer) {
        if (b10 != -127) {
            if (b10 != -126) {
                return super.f(b10, byteBuffer);
            }
            ArrayList arrayList = (ArrayList) e(byteBuffer);
            f fVar = new f();
            String str = (String) arrayList.get(0);
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            fVar.f26975a = str;
            e eVar = (e) arrayList.get(1);
            if (eVar == null) {
                throw new IllegalStateException("Nonnull field \"options\" is null.");
            }
            fVar.f26976b = eVar;
            fVar.f26977c = (Boolean) arrayList.get(2);
            Map map = (Map) arrayList.get(3);
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
            }
            fVar.f26978d = map;
            return fVar;
        }
        ArrayList arrayList2 = (ArrayList) e(byteBuffer);
        e eVar2 = new e();
        String str2 = (String) arrayList2.get(0);
        if (str2 == null) {
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }
        eVar2.f26962a = str2;
        String str3 = (String) arrayList2.get(1);
        if (str3 == null) {
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }
        eVar2.f26963b = str3;
        String str4 = (String) arrayList2.get(2);
        if (str4 == null) {
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }
        eVar2.f26964c = str4;
        String str5 = (String) arrayList2.get(3);
        if (str5 == null) {
            throw new IllegalStateException("Nonnull field \"projectId\" is null.");
        }
        eVar2.f26965d = str5;
        eVar2.f26966e = (String) arrayList2.get(4);
        eVar2.f26967f = (String) arrayList2.get(5);
        eVar2.f26968g = (String) arrayList2.get(6);
        eVar2.f26969h = (String) arrayList2.get(7);
        eVar2.f26970i = (String) arrayList2.get(8);
        eVar2.f26971j = (String) arrayList2.get(9);
        eVar2.k = (String) arrayList2.get(10);
        eVar2.f26972l = (String) arrayList2.get(11);
        eVar2.f26973m = (String) arrayList2.get(12);
        eVar2.f26974n = (String) arrayList2.get(13);
        return eVar2;
    }

    @Override // p161o8.w
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (!(obj instanceof e)) {
            if (!(obj instanceof f)) {
                super.k(byteArrayOutputStream, obj);
                return;
            }
            byteArrayOutputStream.write(130);
            f fVar = (f) obj;
            fVar.getClass();
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(fVar.f26975a);
            arrayList.add(fVar.f26976b);
            arrayList.add(fVar.f26977c);
            arrayList.add(fVar.f26978d);
            k(byteArrayOutputStream, arrayList);
            return;
        }
        byteArrayOutputStream.write(129);
        e eVar = (e) obj;
        eVar.getClass();
        ArrayList arrayList2 = new ArrayList(14);
        arrayList2.add(eVar.f26962a);
        arrayList2.add(eVar.f26963b);
        arrayList2.add(eVar.f26964c);
        arrayList2.add(eVar.f26965d);
        arrayList2.add(eVar.f26966e);
        arrayList2.add(eVar.f26967f);
        arrayList2.add(eVar.f26968g);
        arrayList2.add(eVar.f26969h);
        arrayList2.add(eVar.f26970i);
        arrayList2.add(eVar.f26971j);
        arrayList2.add(eVar.k);
        arrayList2.add(eVar.f26972l);
        arrayList2.add(eVar.f26973m);
        arrayList2.add(eVar.f26974n);
        k(byteArrayOutputStream, arrayList2);
    }
}
