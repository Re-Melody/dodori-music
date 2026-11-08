package com.revenuecat.purchases.ui.revenuecatui.icons;

import java.util.ArrayList;
import p143n0.C2096x;
import p143n0.e0;
import p200t0.C2238e;
import p200t0.C2239f;
import p200t0.C2243j;
import p200t0.G;
import p200t0.m;
import p200t0.n;
import p200t0.u;

/* JADX INFO: loaded from: classes2.dex */
public final class KeyboardArrowRightKt {
    private static C2239f _keyboardArrowRight;

    public static final C2239f getKeyboardArrowRight() {
        C2239f c2239f = _keyboardArrowRight;
        if (c2239f != null) {
            return c2239f;
        }
        C2238e c2238e = new C2238e("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i10 = G.f26395a;
        e0 e0Var = new e0(C2096x.f22792b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new n(8.59f, 16.59f));
        arrayList.add(new m(13.17f, 12.0f));
        arrayList.add(new m(8.59f, 7.41f));
        arrayList.add(new m(10.0f, 6.0f));
        arrayList.add(new u(6.0f, 6.0f));
        arrayList.add(new u(-6.0f, 6.0f));
        arrayList.add(new u(-1.41f, -1.41f));
        arrayList.add(C2243j.f26496c);
        C2238e.a(c2238e, arrayList, e0Var, 2);
        C2239f c2239fB = c2238e.b();
        _keyboardArrowRight = c2239fB;
        return c2239fB;
    }
}
