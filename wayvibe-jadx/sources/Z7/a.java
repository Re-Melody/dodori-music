package Z7;

import U.P;
import android.content.Context;
import kotlin.jvm.internal.m;
import p045d8.AbstractActivityC1932d;
import p152o.h1;
import p161o8.f;
import p161o8.q;
import p161o8.s;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements p118k8.b, q, p130l8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f14014e = "flutter_background foreground service";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f14015f = "Keeps the flutter app running in the background";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f14016g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f14017h = "ic_launcher";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f14018i = "mipmap";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f14019j = true;
    public static boolean k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f14020l = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f14021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractActivityC1932d f14022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public P f14023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f14024d;

    @Override // p130l8.a
    public final void onAttachedToActivity(p130l8.b binding) {
        m.f(binding, "binding");
        AbstractActivityC1932d abstractActivityC1932d = (AbstractActivityC1932d) ((h1) binding).f23356a;
        m.e(abstractActivityC1932d, "getActivity(...)");
        this.f14022b = abstractActivityC1932d;
        Context applicationContext = abstractActivityC1932d.getApplicationContext();
        m.e(applicationContext, "getApplicationContext(...)");
        this.f14023c = new P(applicationContext);
    }

    @Override // p118k8.b
    public final void onAttachedToEngine(p118k8.a binding) {
        m.f(binding, "binding");
        Context context = binding.f21663a;
        m.e(context, "getApplicationContext(...)");
        f fVar = binding.f21665c;
        m.e(fVar, "getBinaryMessenger(...)");
        s sVar = new s(fVar, "flutter_background");
        this.f14021a = sVar;
        sVar.b(this);
        this.f14024d = context;
    }

    @Override // p130l8.a
    public final void onDetachedFromActivity() {
        P p10 = this.f14023c;
        if (p10 != null) {
            p10.h();
        }
        this.f14022b = null;
        this.f14023c = null;
    }

    @Override // p130l8.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // p118k8.b
    public final void onDetachedFromEngine(p118k8.a binding) {
        m.f(binding, "binding");
        s sVar = this.f14021a;
        m.c(sVar);
        sVar.b(null);
        this.f14021a = null;
        this.f14024d = null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017b, code lost:
    
        if (r0.k() != false) goto L84;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p161o8.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMethodCall(p161o8.o r21, p161o8.r r22) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z7.a.onMethodCall(o8.o, o8.r):void");
    }

    @Override // p130l8.a
    public final void onReattachedToActivityForConfigChanges(p130l8.b binding) {
        m.f(binding, "binding");
        onAttachedToActivity(binding);
    }
}
