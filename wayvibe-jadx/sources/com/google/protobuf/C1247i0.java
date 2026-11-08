package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.protobuf.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1247i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f18742b = new F(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18743a;

    public C1247i0(AbstractC1267t abstractC1267t) {
        V.a(abstractC1267t, "output");
        this.f18743a = abstractC1267t;
        abstractC1267t.f18814c = this;
    }

    public void a(AbstractC1252l abstractC1252l) {
        if (!abstractC1252l.q()) {
            if (!(abstractC1252l instanceof D0)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + abstractC1252l.getClass());
            }
            D0 d10 = (D0) abstractC1252l;
            a(d10.f18664e);
            a(d10.f18665f);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(D0.f18662i, abstractC1252l.size());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iB = D0.B(iBinarySearch + 1);
        ArrayDeque arrayDeque = (ArrayDeque) this.f18743a;
        if (arrayDeque.isEmpty() || ((AbstractC1252l) arrayDeque.peek()).size() >= iB) {
            arrayDeque.push(abstractC1252l);
            return;
        }
        int iB2 = D0.B(iBinarySearch);
        AbstractC1252l d11 = (AbstractC1252l) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((AbstractC1252l) arrayDeque.peek()).size() < iB2) {
            d11 = new D0((AbstractC1252l) arrayDeque.pop(), d11);
        }
        D0 d12 = new D0(d11, abstractC1252l);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(D0.f18662i, d12.f18663d);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((AbstractC1252l) arrayDeque.peek()).size() >= D0.B(iBinarySearch2 + 1)) {
                break;
            } else {
                d12 = new D0((AbstractC1252l) arrayDeque.pop(), d12);
            }
        }
        arrayDeque.push(d12);
    }

    public void b(int i10, AbstractC1252l abstractC1252l) {
        ((AbstractC1267t) this.f18743a).J(i10, abstractC1252l);
    }

    public void c(int i10, Object obj, E0 e1) {
        AbstractC1267t abstractC1267t = (AbstractC1267t) this.f18743a;
        abstractC1267t.V(i10, 3);
        e1.d((AbstractC1230a) obj, abstractC1267t.f18814c);
        abstractC1267t.V(i10, 4);
    }

    public C1247i0(int i10) {
        InterfaceC1259o0 interfaceC1259o0;
        switch (i10) {
            case 2:
                this.f18743a = new ArrayDeque();
                break;
            default:
                try {
                    interfaceC1259o0 = (InterfaceC1259o0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                } catch (Exception unused) {
                    interfaceC1259o0 = f18742b;
                }
                InterfaceC1259o0[] interfaceC1259o0Arr = {F.f18668b, interfaceC1259o0};
                C1245h0 c1245h0 = new C1245h0();
                c1245h0.f18740a = interfaceC1259o0Arr;
                Charset charset = V.f18703a;
                this.f18743a = c1245h0;
                break;
        }
    }
}
