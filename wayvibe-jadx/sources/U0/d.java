package U0;

import D7.W;
import T0.AbstractC0800c;
import T0.I;
import T0.InterfaceC0799b;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import p119k9.C2028n;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC0799b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f12044a = new d();

    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    @Override // T0.InterfaceC0799b
    public final Object awaitLoad(Context context, AbstractC0800c abstractC0800c, Q8.d dVar) {
        int i10;
        int i11;
        Looper looperMyLooper;
        Handler handler;
        if (!(abstractC0800c instanceof b)) {
            throw new IllegalArgumentException(("Only GoogleFontImpl supported (actual " + abstractC0800c + ')').toString());
        }
        b bVar = (b) abstractC0800c;
        StringBuilder sb = new StringBuilder("name=");
        sb.append(bVar.f12037a);
        sb.append("&weight=");
        I i12 = bVar.f12039c;
        sb.append(i12.f11463a);
        sb.append("&italic=");
        int i13 = bVar.f12040d;
        sb.append(i13 == 1 ? 1 : 0);
        sb.append("&besteffort=");
        sb.append(bVar.f12041e ? com.amazon.a.a.o.b.af : com.amazon.a.a.o.b.ag);
        String string = sb.toString();
        a aVar = bVar.f12038b;
        aVar.getClass();
        H1.c cVar = new H1.c(aVar.f12036c, aVar.f12034a, aVar.f12035b, string);
        boolean z10 = i13 == 1;
        boolean z11 = i12.compareTo(I.k) >= 0;
        if (!z10 || !z11) {
            if (z10) {
                i11 = 2;
            } else {
                i10 = z11 ? 1 : 0;
            }
            C2028n c2028n = new C2028n(1, W.K(dVar));
            c2028n.s();
            c cVar2 = new c(c2028n, abstractC0800c);
            looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            if (Build.VERSION.SDK_INT >= 28) {
                handler = e.f12045a.a(looperMyLooper);
            } else {
                handler = new Handler(looperMyLooper);
            }
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{cVar}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            p003a.a.L(context, Collections.unmodifiableList(arrayList), i10, false, 0, handler, cVar2);
            Object objR = c2028n.r();
            R8.a aVar2 = R8.a.COROUTINE_SUSPENDED;
            return objR;
        }
        i11 = 3;
        i10 = i11;
        C2028n c2028n2 = new C2028n(1, W.K(dVar));
        c2028n2.s();
        c cVar3 = new c(c2028n2, abstractC0800c);
        looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            handler = e.f12045a.a(looperMyLooper);
        } else {
            handler = new Handler(looperMyLooper);
        }
        ArrayList arrayList2 = new ArrayList(1);
        Object obj2 = new Object[]{cVar}[0];
        Objects.requireNonNull(obj2);
        arrayList2.add(obj2);
        p003a.a.L(context, Collections.unmodifiableList(arrayList2), i10, false, 0, handler, cVar3);
        Object objR2 = c2028n2.r();
        R8.a aVar3 = R8.a.COROUTINE_SUSPENDED;
        return objR2;
    }

    @Override // T0.InterfaceC0799b
    public final Typeface loadBlocking(Context context, AbstractC0800c abstractC0800c) {
        throw new IllegalStateException(("GoogleFont only support async loading: " + abstractC0800c).toString());
    }
}
