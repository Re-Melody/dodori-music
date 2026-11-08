package com.google.protobuf;

import B2.AbstractC0112b;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1252l implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1250k f18752b = new C1250k(V.f18704b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1246i f18753c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18754a = 0;

    static {
        f18753c = AbstractC1234c.a() ? new C1246i(1) : new C1246i(0);
    }

    public static AbstractC1252l h(Iterator it, int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(AbstractC0112b.d(i10, "length (", ") must be >= 1"));
        }
        if (i10 == 1) {
            return (AbstractC1252l) it.next();
        }
        int i11 = i10 >>> 1;
        AbstractC1252l abstractC1252lH = h(it, i11);
        AbstractC1252l abstractC1252lH2 = h(it, i10 - i11);
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - abstractC1252lH.size() < abstractC1252lH2.size()) {
            throw new IllegalArgumentException("ByteString would be too long: " + abstractC1252lH.size() + "+" + abstractC1252lH2.size());
        }
        if (abstractC1252lH2.size() == 0) {
            return abstractC1252lH;
        }
        if (abstractC1252lH.size() == 0) {
            return abstractC1252lH2;
        }
        int size = abstractC1252lH2.size() + abstractC1252lH.size();
        if (size < 128) {
            int size2 = abstractC1252lH.size();
            int size3 = abstractC1252lH2.size();
            int i12 = size2 + size3;
            byte[] bArr = new byte[i12];
            k(0, size2, abstractC1252lH.size());
            k(0, size2, i12);
            if (size2 > 0) {
                abstractC1252lH.n(0, bArr, 0, size2);
            }
            k(0, size3, abstractC1252lH2.size());
            k(size2, i12, i12);
            if (size3 > 0) {
                abstractC1252lH2.n(0, bArr, size2, size3);
            }
            return new C1250k(bArr);
        }
        if (abstractC1252lH instanceof D0) {
            D0 d10 = (D0) abstractC1252lH;
            AbstractC1252l abstractC1252l = d10.f18665f;
            int size4 = abstractC1252lH2.size() + abstractC1252l.size();
            AbstractC1252l abstractC1252l2 = d10.f18664e;
            if (size4 < 128) {
                int size5 = abstractC1252l.size();
                int size6 = abstractC1252lH2.size();
                int i13 = size5 + size6;
                byte[] bArr2 = new byte[i13];
                k(0, size5, abstractC1252l.size());
                k(0, size5, i13);
                if (size5 > 0) {
                    abstractC1252l.n(0, bArr2, 0, size5);
                }
                k(0, size6, abstractC1252lH2.size());
                k(size5, i13, i13);
                if (size6 > 0) {
                    abstractC1252lH2.n(0, bArr2, size5, size6);
                }
                return new D0(abstractC1252l2, new C1250k(bArr2));
            }
            if (abstractC1252l2.o() > abstractC1252l.o()) {
                if (d10.f18667h > abstractC1252lH2.o()) {
                    return new D0(abstractC1252l2, new D0(abstractC1252l, abstractC1252lH2));
                }
            }
        }
        if (size >= D0.B(Math.max(abstractC1252lH.o(), abstractC1252lH2.o()) + 1)) {
            return new D0(abstractC1252lH, abstractC1252lH2);
        }
        C1247i0 c1247i0 = new C1247i0(2);
        c1247i0.a(abstractC1252lH);
        c1247i0.a(abstractC1252lH2);
        ArrayDeque arrayDeque = (ArrayDeque) c1247i0.f18743a;
        AbstractC1252l d11 = (AbstractC1252l) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            d11 = new D0((AbstractC1252l) arrayDeque.pop(), d11);
        }
        return d11;
    }

    public static void j(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 >= 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC0112b.e("Index > length: ", i10, i11, ", "));
            }
            throw new ArrayIndexOutOfBoundsException(p134m1.b.j(i10, "Index < 0: "));
        }
    }

    public static int k(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0112b.d(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(AbstractC0112b.e("Beginning index larger than ending index: ", i10, i11, ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC0112b.e("End index: ", i11, i12, " >= "));
    }

    public static C1250k m(byte[] bArr, int i10, int i11) {
        byte[] bArrCopyOfRange;
        k(i10, i10 + i11, bArr.length);
        switch (f18753c.f18741a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                bArrCopyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, bArrCopyOfRange, 0, i11);
                break;
        }
        return new C1250k(bArrCopyOfRange);
    }

    public abstract void A(AbstractC1267t abstractC1267t);

    public abstract boolean equals(Object obj);

    public abstract ByteBuffer f();

    public final int hashCode() {
        int iT = this.f18754a;
        if (iT == 0) {
            int size = size();
            iT = t(size, 0, size);
            if (iT == 0) {
                iT = 1;
            }
            this.f18754a = iT;
        }
        return iT;
    }

    public abstract byte i(int i10);

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract void n(int i10, byte[] bArr, int i11, int i12);

    public abstract int o();

    public abstract byte p(int i10);

    public abstract boolean q();

    public abstract boolean r();

    public abstract AbstractC1260p s();

    public abstract int size();

    public abstract int t(int i10, int i11, int i12);

    public final String toString() {
        String strQ;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strQ = J0.q(this);
        } else {
            strQ = J0.q(x(0, 47)) + "...";
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return p134m1.b.m(sb, strQ, "\">");
    }

    public abstract int u(int i10, int i11, int i12);

    public abstract AbstractC1252l x(int i10, int i11);

    public final byte[] y() {
        int size = size();
        if (size == 0) {
            return V.f18704b;
        }
        byte[] bArr = new byte[size];
        n(0, bArr, 0, size);
        return bArr;
    }

    public abstract String z(Charset charset);
}
