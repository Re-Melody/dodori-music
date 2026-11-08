package p193s2;

import A9.C0108h;
import androidx.fragment.app.C1089k0;
import androidx.lifecycle.B;
import androidx.lifecycle.InterfaceC1125u;
import androidx.lifecycle.b0;
import androidx.lifecycle.e0;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.PrintWriter;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import p165p2.a;
import p165p2.c;
import p199t.H;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f26073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f26074b;

    public d(InterfaceC1125u interfaceC1125u, e0 store) {
        this.f26073a = interfaceC1125u;
        C1089k0 c1089k0 = c.f26070c;
        m.f(store, "store");
        a defaultCreationExtras = a.f25175b;
        m.f(defaultCreationExtras, "defaultCreationExtras");
        p150n8.a aVar = new p150n8.a(store, (b0) c1089k0, (c) defaultCreationExtras);
        e eVarA = z.a(c.class);
        String strB = eVarA.b();
        if (strB == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f26074b = (c) aVar.l0(eVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
    }

    public final void b(String str, PrintWriter printWriter) {
        c cVar = this.f26074b;
        if (cVar.f26071a.f26271c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i10 = 0;
        while (true) {
            H h10 = cVar.f26071a;
            if (i10 >= h10.f26271c) {
                return;
            }
            b bVar = (b) h10.f26270b[i10];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(cVar.f26071a.f26269a[i10]);
            printWriter.print(": ");
            printWriter.println(bVar.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(bVar.f26067l);
            F5.d dVar = bVar.f26067l;
            String str3 = str2 + "  ";
            dVar.getClass();
            printWriter.print(str3);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(dVar.f4530a);
            if (dVar.f4531b || dVar.f4534e) {
                printWriter.print(str3);
                printWriter.print("mStarted=");
                printWriter.print(dVar.f4531b);
                printWriter.print(" mContentChanged=");
                printWriter.print(dVar.f4534e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (dVar.f4532c || dVar.f4533d) {
                printWriter.print(str3);
                printWriter.print("mAbandoned=");
                printWriter.print(dVar.f4532c);
                printWriter.print(" mReset=");
                printWriter.println(dVar.f4533d);
            }
            if (dVar.f4536g != null) {
                printWriter.print(str3);
                printWriter.print("mTask=");
                printWriter.print(dVar.f4536g);
                printWriter.print(" waiting=");
                dVar.f4536g.getClass();
                printWriter.println(false);
            }
            if (dVar.f4537h != null) {
                printWriter.print(str3);
                printWriter.print("mCancellingTask=");
                printWriter.print(dVar.f4537h);
                printWriter.print(" waiting=");
                dVar.f4537h.getClass();
                printWriter.println(false);
            }
            if (bVar.f26069n != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(bVar.f26069n);
                C0108h c0108h = bVar.f26069n;
                c0108h.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(c0108h.f463b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            F5.d dVar2 = bVar.f26067l;
            Object obj = bVar.f15473e;
            Object obj2 = obj != B.k ? obj : null;
            dVar2.getClass();
            StringBuilder sb = new StringBuilder(64);
            if (obj2 == null) {
                sb.append("null");
            } else {
                Class<?> cls = obj2.getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}");
            }
            printWriter.println(sb.toString());
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(bVar.f15471c > 0);
            i10++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.f26073a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
