package p208t8;

import W6.k;
import android.content.Context;
import java.util.HashMap;
import p118k8.a;
import p118k8.b;

/* JADX INFO: loaded from: classes2.dex */
public class d implements b, i, h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f26959c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f26960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26961b = false;

    public static e c(k kVar) {
        String str = kVar.f12874a;
        String str2 = kVar.f12878e;
        if (str2 == null) {
            str2 = null;
        }
        String str3 = kVar.f12880g;
        if (str3 == null) {
            str3 = null;
        }
        e eVar = new e();
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }
        eVar.f26962a = str;
        String str4 = kVar.f12875b;
        if (str4 == null) {
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }
        eVar.f26963b = str4;
        if (str2 == null) {
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }
        eVar.f26964c = str2;
        if (str3 == null) {
            throw new IllegalStateException("Nonnull field \"projectId\" is null.");
        }
        eVar.f26965d = str3;
        eVar.f26966e = null;
        eVar.f26967f = kVar.f12876c;
        eVar.f26968g = kVar.f12879f;
        eVar.f26969h = null;
        eVar.f26970i = kVar.f12877d;
        eVar.f26971j = null;
        eVar.k = null;
        eVar.f26972l = null;
        eVar.f26973m = null;
        eVar.f26974n = null;
        return eVar;
    }

    @Override // p118k8.b
    public final void onAttachedToEngine(a aVar) {
        i.a(aVar.f21665c, this);
        h.b(aVar.f21665c, this);
        this.f26960a = aVar.f21663a;
    }

    @Override // p118k8.b
    public final void onDetachedFromEngine(a aVar) {
        this.f26960a = null;
        i.a(aVar.f21665c, null);
        h.b(aVar.f21665c, null);
    }
}
