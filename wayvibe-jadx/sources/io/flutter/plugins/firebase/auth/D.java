package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC1967o f20801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public E f20802b;

    public static D a(ArrayList arrayList) {
        D d10 = new D();
        EnumC1967o enumC1967o = EnumC1967o.values()[((Integer) arrayList.get(0)).intValue()];
        if (enumC1967o == null) {
            throw new IllegalStateException("Nonnull field \"operation\" is null.");
        }
        d10.f20801a = enumC1967o;
        E e2 = (E) arrayList.get(1);
        if (e2 == null) {
            throw new IllegalStateException("Nonnull field \"data\" is null.");
        }
        d10.f20802b = e2;
        return d10;
    }
}
