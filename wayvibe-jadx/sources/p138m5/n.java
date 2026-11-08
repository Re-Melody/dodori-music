package p138m5;

import B2.AbstractC0112b;
import U.W0;
import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import p036d.o;
import p186r5.b;
import p196s5.g;
import p196s5.h;
import p225v5.a;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile j f22340e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f22341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f22342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f22343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f22344d;

    public n(a aVar, a aVar2, b bVar, g gVar, h hVar) {
        this.f22341a = aVar;
        this.f22342b = aVar2;
        this.f22343c = bVar;
        this.f22344d = gVar;
        hVar.getClass();
        hVar.f26145a.execute(new o(hVar, 14));
    }

    public static n a() {
        j jVar = f22340e;
        if (jVar != null) {
            return (n) jVar.f22335f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f22340e == null) {
            synchronized (n.class) {
                try {
                    if (f22340e == null) {
                        O2.h hVar = new O2.h();
                        context.getClass();
                        hVar.f9063a = context;
                        f22340e = hVar.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final W0 c(p115k5.a aVar) {
        byte[] bytes;
        Set setUnmodifiableSet = aVar != null ? Collections.unmodifiableSet(p115k5.a.f21644d) : Collections.singleton(new p104j5.b("proto"));
        W0 w0A = i.a();
        aVar.getClass();
        w0A.f11833c = "cct";
        String str = aVar.f21646a;
        String str2 = aVar.f21647b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = AbstractC0112b.g("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        w0A.f11832b = bytes;
        return new W0(setUnmodifiableSet, w0A.f(), this, 23);
    }
}
