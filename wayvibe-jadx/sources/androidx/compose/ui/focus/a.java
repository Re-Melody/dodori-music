package androidx.compose.ui.focus;

import Z8.c;
import p067g0.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final r a(p122l0.r rVar) {
        return new FocusRequesterElement(rVar);
    }

    public static final r b(r rVar, c cVar) {
        return rVar.then(new FocusChangedElement(cVar));
    }
}
