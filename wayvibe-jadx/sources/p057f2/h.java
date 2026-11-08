package p057f2;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC1044b;
import androidx.datastore.preferences.protobuf.AbstractC1063v;
import androidx.datastore.preferences.protobuf.AbstractC1066y;
import androidx.datastore.preferences.protobuf.C1049g;
import androidx.datastore.preferences.protobuf.C1064w;
import androidx.datastore.preferences.protobuf.E;
import androidx.datastore.preferences.protobuf.EnumC1065x;
import androidx.datastore.preferences.protobuf.InterfaceC1067z;
import androidx.datastore.preferences.protobuf.W;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.b0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC1066y {
    private static final h DEFAULT_INSTANCE;
    private static volatile W PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC1067z strings_ = a0.f15063d;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC1066y.j(h.class, hVar);
    }

    public static void l(h hVar, Iterable iterable) {
        InterfaceC1067z interfaceC1067z = hVar.strings_;
        if (!((AbstractC1044b) interfaceC1067z).f15066a) {
            a0 a0Var = (a0) interfaceC1067z;
            int i10 = a0Var.f15065c;
            hVar.strings_ = a0Var.d(i10 == 0 ? 10 : i10 * 2);
        }
        RandomAccess randomAccess = hVar.strings_;
        Charset charset = A.f15023a;
        iterable.getClass();
        if (iterable instanceof E) {
            List listG = ((E) iterable).g();
            if (randomAccess != null) {
                throw new ClassCastException();
            }
            ((a0) randomAccess).getClass();
            Iterator it = listG.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof C1049g) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                C1049g.i(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof X) {
            ((AbstractC1044b) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((a0) randomAccess).f15065c);
        }
        a0 a0Var2 = (a0) randomAccess;
        int i11 = a0Var2.f15065c;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (a0Var2.f15065c - i11) + " is null.";
                for (int i12 = a0Var2.f15065c - 1; i12 >= i11; i12--) {
                    a0Var2.remove(i12);
                }
                throw new NullPointerException(str);
            }
            a0Var2.add(obj);
        }
    }

    public static h m() {
        return DEFAULT_INSTANCE;
    }

    public static g o() {
        return (g) ((AbstractC1063v) DEFAULT_INSTANCE.c(EnumC1065x.NEW_BUILDER));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1066y
    public final Object c(EnumC1065x enumC1065x) {
        W c1064w;
        switch (c.f19742a[enumC1065x.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new g(DEFAULT_INSTANCE);
            case 3:
                return new b0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                W w10 = PARSER;
                if (w10 != null) {
                    return w10;
                }
                synchronized (h.class) {
                    try {
                        c1064w = PARSER;
                        if (c1064w == null) {
                            c1064w = new C1064w();
                            PARSER = c1064w;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c1064w;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final InterfaceC1067z n() {
        return this.strings_;
    }
}
