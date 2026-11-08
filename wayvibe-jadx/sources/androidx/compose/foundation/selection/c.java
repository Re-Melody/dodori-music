package androidx.compose.foundation.selection;

import B.m;
import M0.g;
import androidx.compose.material3.MinimumInteractiveModifier;
import p067g0.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final r a(MinimumInteractiveModifier minimumInteractiveModifier, boolean z10, m mVar, boolean z11, g gVar, Z8.c cVar) {
        return minimumInteractiveModifier.then(new ToggleableElement(z10, mVar, z11, gVar, cVar));
    }
}
