package com.apple.android.music.playback.f;

import X4.j;
import java.util.Arrays;
import java.util.List;
import p235w4.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static boolean a(n nVar, n nVar2) {
        if (nVar != null && (nVar2 != null || nVar2.getClass() == n.class)) {
            if (nVar.f27997b == nVar2.f27997b && nVar.f28005j == nVar2.f28005j && nVar.k == nVar2.k && nVar.f28006l == nVar2.f28006l && nVar.f28007m == nVar2.f28007m && nVar.f28008n == nVar2.f28008n && nVar.f28009o == nVar2.f28009o && nVar.r == nVar2.r && nVar.f28012s == nVar2.f28012s && nVar.f28013t == nVar2.f28013t && nVar.f28016w == nVar2.f28016w && nVar.f28017x == nVar2.f28017x && j.h(nVar.f27996a, nVar2.f27996a) && nVar.f28019z == nVar2.f28019z && j.h(nVar.f28000e, nVar2.f28000e) && j.h(nVar.f28001f, nVar2.f28001f) && j.h(nVar.f27998c, nVar2.f27998c) && j.h(nVar.f28004i, nVar2.f28004i) && j.h(nVar.f28011q, nVar2.f28011q) && Arrays.equals(nVar.f28010p, nVar2.f28010p)) {
                List list = nVar.f28003h;
                int size = list.size();
                List list2 = nVar2.f28003h;
                if (size == list2.size()) {
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!Arrays.equals((byte[]) list.get(i10), (byte[]) list2.get(i10))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
