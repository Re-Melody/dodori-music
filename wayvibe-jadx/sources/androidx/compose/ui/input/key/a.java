package androidx.compose.ui.input.key;

import Z8.c;
import p067g0.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final r a(c cVar) {
        return new KeyInputElement(cVar, null);
    }

    public static final r b(r rVar, c cVar) {
        return rVar.then(new KeyInputElement(null, cVar));
    }
}
