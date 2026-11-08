package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1235c0 extends AbstractC1239e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f18732c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(long j10, Object obj, int i10) {
        List listE;
        List list = (List) Y0.f18720c.k(j10, obj);
        if (list.isEmpty()) {
            if (list instanceof InterfaceC1233b0) {
                listE = new C1231a0(i10);
            } else {
                listE = ((list instanceof InterfaceC1276x0) && (list instanceof U)) ? ((U) list).e(i10) : new ArrayList(i10);
            }
            Y0.p(obj, j10, listE);
            return listE;
        }
        if (f18732c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            Y0.p(obj, j10, arrayList);
            return arrayList;
        }
        if (list instanceof T0) {
            C1231a0 c1231a0 = new C1231a0(list.size() + i10);
            c1231a0.addAll((T0) list);
            Y0.p(obj, j10, c1231a0);
            return c1231a0;
        }
        if ((list instanceof InterfaceC1276x0) && (list instanceof U)) {
            U u10 = (U) list;
            if (!((AbstractC1232b) u10).f18728a) {
                U uE = u10.e(list.size() + i10);
                Y0.p(obj, j10, uE);
                return uE;
            }
        }
        return list;
    }

    @Override // com.google.protobuf.AbstractC1239e0
    public final void a(long j10, Object obj) {
        Object objUnmodifiableList;
        List list = (List) Y0.f18720c.k(j10, obj);
        if (list instanceof InterfaceC1233b0) {
            objUnmodifiableList = ((InterfaceC1233b0) list).v();
        } else {
            if (f18732c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC1276x0) && (list instanceof U)) {
                AbstractC1232b abstractC1232b = (AbstractC1232b) ((U) list);
                boolean z10 = abstractC1232b.f18728a;
                if (z10 && z10) {
                    abstractC1232b.f18728a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        Y0.p(obj, j10, objUnmodifiableList);
    }

    @Override // com.google.protobuf.AbstractC1239e0
    public final void b(Object obj, long j10, Object obj2) {
        List list = (List) Y0.f18720c.k(j10, obj2);
        List listD = d(j10, obj, list.size());
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        Y0.p(obj, j10, list);
    }

    @Override // com.google.protobuf.AbstractC1239e0
    public final List c(long j10, Object obj) {
        return d(j10, obj, 10);
    }
}
