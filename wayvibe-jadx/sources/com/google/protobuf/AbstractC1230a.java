package com.google.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1230a {
    protected int memoizedHashCode;

    public static void b(List list, List list2) {
        Charset charset = V.f18703a;
        list.getClass();
        if (list instanceof InterfaceC1233b0) {
            List listG = ((InterfaceC1233b0) list).g();
            InterfaceC1233b0 interfaceC1233b0 = (InterfaceC1233b0) list2;
            int size = list2.size();
            for (Object obj : listG) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC1233b0.size() - size) + " is null.";
                    for (int size2 = interfaceC1233b0.size() - 1; size2 >= size; size2--) {
                        interfaceC1233b0.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC1252l) {
                    interfaceC1233b0.b((AbstractC1252l) obj);
                } else {
                    interfaceC1233b0.add((String) obj);
                }
            }
            return;
        }
        if (list instanceof InterfaceC1276x0) {
            list2.addAll(list);
            return;
        }
        if (list2 instanceof ArrayList) {
            ((ArrayList) list2).ensureCapacity(list.size() + list2.size());
        }
        int size3 = list2.size();
        for (Object obj2 : list) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list2.size() - size3) + " is null.";
                for (int size4 = list2.size() - 1; size4 >= size3; size4--) {
                    list2.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list2.add(obj2);
        }
    }

    public abstract int c(E0 e1);

    public final byte[] d() {
        try {
            int iC = ((J) this).c(null);
            byte[] bArr = new byte[iC];
            Logger logger = AbstractC1267t.f18812d;
            r rVar = new r(bArr, 0, iC);
            e(rVar);
            if (rVar.a0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e2);
        }
    }

    public abstract void e(AbstractC1267t abstractC1267t);
}
