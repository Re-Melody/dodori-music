package com.amazon.a.a.o.c;

import com.amazon.a.a.o.c;
import com.amazon.a.a.o.c.a.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f16461a = new c("Serializer");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class[] f16462b = {com.amazon.a.a.b.c.class, String.class, HashMap.class, LinkedHashMap.class};

    public static String a(Serializable serializable) throws Throwable {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        if (serializable == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                try {
                    objectOutputStream.writeObject(serializable);
                    String strA = com.amazon.c.a.a.c.a(byteArrayOutputStream.toByteArray());
                    com.amazon.a.a.o.a.a(objectOutputStream);
                    return strA;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream2 = objectOutputStream;
                    com.amazon.a.a.o.a.a(objectOutputStream2);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                if (c.f16457b) {
                    f16461a.b("Could not serialize object: " + serializable, e);
                }
                com.amazon.a.a.o.a.a(objectOutputStream);
                return null;
            }
        } catch (IOException e4) {
            e = e4;
            objectOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            com.amazon.a.a.o.a.a(objectOutputStream2);
            throw th;
        }
    }

    public static <T> T a(String str) throws Throwable {
        f fVar;
        f fVar2 = null;
        if (str != null && str.length() != 0) {
            try {
                try {
                    fVar = new f(new ByteArrayInputStream(com.amazon.c.a.a.c.c(str.getBytes())));
                    try {
                        try {
                            fVar.a(f16462b);
                            T t10 = (T) fVar.readObject();
                            com.amazon.a.a.o.a.a(fVar);
                            return t10;
                        } catch (Throwable th) {
                            th = th;
                            fVar2 = fVar;
                            com.amazon.a.a.o.a.a(fVar2);
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        if (c.f16457b) {
                            f16461a.b("Could not read object from string: ".concat(str), e);
                        }
                        com.amazon.a.a.o.a.a(fVar);
                        return null;
                    }
                } catch (Exception e4) {
                    e = e4;
                    fVar = null;
                } catch (Throwable th2) {
                    th = th2;
                    com.amazon.a.a.o.a.a(fVar2);
                    throw th;
                }
            } catch (IOException e7) {
                if (c.f16457b) {
                    f16461a.b("Could not decode string", e7);
                }
            }
        }
        return null;
    }
}
