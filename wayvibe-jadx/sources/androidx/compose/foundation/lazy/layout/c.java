package androidx.compose.foundation.lazy.layout;

import F.M;
import p067g0.r;
import p075g9.h;
import p261z.EnumC2391a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final r a(r rVar, h hVar, M m8, EnumC2391a0 enumC2391a0, boolean z10) {
        return rVar.then(new LazyLayoutSemanticsModifier(hVar, m8, enumC2391a0, z10));
    }
}
