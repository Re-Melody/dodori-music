package p269z8;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import p161o8.w;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f29902d = new c();

    @Override // p161o8.w
    public final Object f(byte b10, ByteBuffer byteBuffer) {
        if (b10 != -127) {
            if (b10 != -126) {
                return super.f(b10, byteBuffer);
            }
            ArrayList arrayList = (ArrayList) e(byteBuffer);
            a aVar = new a();
            Boolean bool = (Boolean) arrayList.get(0);
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
            }
            aVar.f29900a = bool;
            return aVar;
        }
        ArrayList arrayList2 = (ArrayList) e(byteBuffer);
        e eVar = new e();
        Boolean bool2 = (Boolean) arrayList2.get(0);
        if (bool2 == null) {
            throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
        }
        eVar.f29905a = bool2;
        Boolean bool3 = (Boolean) arrayList2.get(1);
        if (bool3 == null) {
            throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
        }
        eVar.f29906b = bool3;
        Map map = (Map) arrayList2.get(2);
        if (map == null) {
            throw new IllegalStateException("Nonnull field \"headers\" is null.");
        }
        eVar.f29907c = map;
        return eVar;
    }

    @Override // p161o8.w
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof e) {
            byteArrayOutputStream.write(129);
            e eVar = (e) obj;
            eVar.getClass();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(eVar.f29905a);
            arrayList.add(eVar.f29906b);
            arrayList.add(eVar.f29907c);
            k(byteArrayOutputStream, arrayList);
            return;
        }
        if (!(obj instanceof a)) {
            super.k(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(130);
        a aVar = (a) obj;
        aVar.getClass();
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(aVar.f29900a);
        k(byteArrayOutputStream, arrayList2);
    }
}
